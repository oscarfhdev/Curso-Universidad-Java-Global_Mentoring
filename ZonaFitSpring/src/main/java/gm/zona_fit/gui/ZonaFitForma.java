package gm.zona_fit.gui;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.ClienteServicio;
import gm.zona_fit.servicio.IClienteServicio;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;


@Component
public class ZonaFitForma extends JFrame {
    private JPanel panelPrincipal;
    private JTable clientesTabla;
    private JTextField nombreTexto;
    private JTextField apellidoTexto;
    private JTextField membresiaTexto;
    private JButton guardarButton;
    private JButton eliminarButton;
    private JButton limpiarButton;
    private DefaultTableModel tablaModeloCientes;
    IClienteServicio clienteServicio;
    private Integer idCliente;

    @Autowired
    public ZonaFitForma(ClienteServicio clienteServicio){
        this.clienteServicio = clienteServicio;
        iniciarForma();
        guardarButton.addActionListener(e -> guardarCliente());
        clientesTabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                cargarClienteSeleccionado();
            }
        });
        eliminarButton.addContainerListener(new ContainerAdapter() {
        });
        eliminarButton.addActionListener(e -> eliminarCliente());
        limpiarButton.addActionListener(e -> limpiarFormulario());
    }

    private void iniciarForma(){

        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLocationRelativeTo(null);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

        //this.tablaModeloCientes = new DefaultTableModel(0, 4);
        this.tablaModeloCientes = new DefaultTableModel(0,4){
            @Override
            // Sobreescribimos este método para denegar la edición directa de las celdas
            public boolean isCellEditable(int row, int colum){
                return false;
            }
        };

        String[] cabeceros = {"Id", "Nombre", "Apellido", "Membresía"};
        this.tablaModeloCientes.setColumnIdentifiers(cabeceros);
        this.clientesTabla = new JTable(tablaModeloCientes);

        // Restringimos la selección de la tabla a un solo registro
        this.clientesTabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Cargar listado de clientes
        listarClientes();
    }

    private void listarClientes(){
        this.tablaModeloCientes.setRowCount(0);
        var clientes = this.clienteServicio.listarClientes();
        clientes.forEach(cliente -> {
            Object[] renglonCliente = {cliente.getId(), cliente.getNombre(), cliente.getApellido(), cliente.getMembresia()};
            this.tablaModeloCientes.addRow(renglonCliente);
        });
    }

    private void guardarCliente(){
        if (nombreTexto.getText().equals("")){
            mostrarMensaje("Proporciona un nombre");
            nombreTexto.requestFocusInWindow();
            return;
        }
        if (membresiaTexto.getText().equals("")){
            mostrarMensaje("Proporciona una membresía");
            membresiaTexto.requestFocusInWindow();
            return;
        }

        // Recuperamos los valores del formulario
        var nombre = nombreTexto.getText();
        var apellido = apellidoTexto.getText();
        var membresia = Integer.parseInt(membresiaTexto.getText());
        var cliente = new Cliente(this.idCliente, nombre, apellido, membresia);
//        cliente.setId(this.idCliente);
//        cliente.setNombre(nombre);
//        cliente.setApellido(apellido);
//        cliente.setMembresia(membresia);
        clienteServicio.guardarCliente(cliente); // Método del servicio para guardar / modificar el cliente
        if(this.idCliente == null){
            mostrarMensaje("Se agregó el nuevo cliente");
        }
        else {
            mostrarMensaje("Se actualizaron los datos del cliente");
        }
        limpiarFormulario();
        listarClientes();
    }

    private void eliminarCliente(){
        if (idCliente == null){
            mostrarMensaje("No hay ningún cliente seleccionado para eliminar");
            return;
        }
        var clienteEliminar = clienteServicio.buscarClientePorId(this.idCliente);
        if (clienteEliminar == null){
            mostrarMensaje("No hay ningún cliente seleccionado");
        }
        else {
            clienteServicio.eliminarCliente(clienteEliminar);
            mostrarMensaje("Cliente eliminado correctamente");
        }
        limpiarFormulario();
        listarClientes();
    }

    private void cargarClienteSeleccionado(){
        var renglon = clientesTabla.getSelectedRow(); // Se guarda el número de fila que hemos seleccionado
        if(renglon != -1){ // -1 Quiere decir que no se seleccionó ningún registro
            var id = clientesTabla.getModel().getValueAt(renglon, 0).toString();
            this.idCliente = Integer.parseInt(id);
            var nombre = clientesTabla.getModel().getValueAt(renglon, 1).toString();
            this.nombreTexto.setText(nombre);
            var apellido = clientesTabla.getModel().getValueAt(renglon, 2).toString();
            this.apellidoTexto.setText(apellido);
            var membresia = clientesTabla.getModel().getValueAt(renglon, 3).toString();
            this.membresiaTexto.setText(membresia);
        }
    }

    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
    }

    private void limpiarFormulario(){
        nombreTexto.setText("");
        apellidoTexto.setText("");
        membresiaTexto.setText("");
        // Limpiamos el ID del cliente seleccionado
        this.idCliente = null;
        // Deseleccionamos el registro seleccionado en la tabla
        clientesTabla.getSelectionModel().clearSelection();
    }

}
