package gm.tareas.repositorio;

import gm.tareas.modelo.Tarea;

import java.util.List;

public interface ITareaServicio {
    List<Tarea> listarTareas();
    Tarea buscarTareaPorId(Integer idTarea);
    void guardarTarea(Tarea tarea);
    public void eliminarTarea(Tarea tarea);
}
