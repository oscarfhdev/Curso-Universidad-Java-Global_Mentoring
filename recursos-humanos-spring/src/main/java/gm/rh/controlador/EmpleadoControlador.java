package gm.rh.controlador;

import gm.rh.excepcion.RecursoNoEncontradoExcepcion;
import gm.rh.modelo.Empleado;
import gm.rh.servicio.IEmpleadoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rh-app") // http://localhost:8080/rh-app/
@CrossOrigin(value = "http://localhost:3000")
public class EmpleadoControlador {
   private static final Logger logger = LoggerFactory.getLogger(EmpleadoControlador.class);

   @Autowired
   IEmpleadoServicio empleadoServicio;

   //http://localhost:8080/rh-app
   @GetMapping("/empleados")
   public List<Empleado> obtenerEmpleados(){
      var empleados = empleadoServicio.listarEmpleados();
      empleados.forEach(empleado -> logger.info(empleado.toString()));
      return empleados;
   }

   @PostMapping("/empleados")
   public Empleado agregarEmpleado(@RequestBody Empleado empleado){
      logger.info("Empleado a agregar: " + empleado);
      return empleadoServicio.guardarEmpleado(empleado);
   }

   @GetMapping("/empleados/{id}")
   public ResponseEntity<Empleado> buscarEmpleadoPodId(@PathVariable Integer id){
      Empleado empleado = empleadoServicio.buscarEmpleadoPorId(id);
      if (empleado == null){
         throw new RecursoNoEncontradoExcepcion("No se encontró el empleado con el id" + id);
      }
      return ResponseEntity.ok(empleado);

   }
}
