package gestionPrestamos.dal;

import java.util.List;
import java.util.Optional;


public interface PortatilRepositorio {

	
	

	// Metodo para insertar un nuevo portatil
	public void insertaPoratil(Portatil Portatil) throws Exception;
	// Metodo para seleccionar un portatil asociado a un alumno en particular
	public Optional<Portatil> selectAlumnoOfPortatil(int id_alumno) throws Exception;
	// Metodo para eliminar un portatil
	public void eliminaPortatil(int id_portatil) throws Exception;
	
	// Metodo para actualizar la información de un portatil
	public void updatePoratil(Portatil Portatil) throws Exception;
	// Metodo para seleccionar todos los portatiles registrados en la base de datos
	public List<Portatil> selectAllPortatil()throws Exception;
}
