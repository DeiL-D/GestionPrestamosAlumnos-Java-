package gestionPrestamos.dal;

import java.util.List;
import java.util.Optional;

public interface AlumnoRepositorio {
	

	// Interfaz para definir los métodos necesarios para la gestión de alumnos
	// en el repositorio de datos

	// Método para insertar un nuevo alumno
	public void insertaAlumno(Alumno alumno) throws Exception;

	// Método para seleccionar un portátil a partir del ID del portátil
	public Optional<Alumno> selectPortatilOfAlumno(int id_portatil) throws Exception;

	// Método para seleccionar todos los alumnos
	public List<Alumno> selectAllAlumnos() throws Exception;

	// Método para actualizar un alumno existente
	public void updateAlumno(Alumno alumno) throws Exception;

	// Método para eliminar un alumno existente
	public void eliminaAlumno(int id_alumno) throws Exception;
	
}
