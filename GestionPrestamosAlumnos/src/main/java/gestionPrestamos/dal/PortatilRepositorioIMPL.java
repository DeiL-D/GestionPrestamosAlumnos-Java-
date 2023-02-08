package gestionPrestamos.dal;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

@Repository
public class PortatilRepositorioIMPL implements PortatilRepositorio {
	@PersistenceContext
	private EntityManager em;

	


	/*public void update(Portatil Portatil) throws Exception{
		// TODO Auto-generated method stub
		
	}*/
	/*

	Método para seleccionar todos los Portátiles en la base de datos.
	Utiliza el método createQuery de EntityManager para crear una consulta JPA y devolver todos los Portátiles.
	*/
	public List<Portatil> selectAllPortatil() throws Exception {
	String jpql = "SELECT p FROM Portatil p"; // Consulta JPA para seleccionar todos los Portátiles
	TypedQuery<Portatil> query = em.createQuery(jpql, Portatil.class); // Creación de la consulta con EntityManager
	return query.getResultList(); // Devuelve la lista de resultados
	}
	/*

	Método para eliminar un Portátil en la base de datos.
	Encuentra el Portátil a través del id y lo elimina con el método remove de EntityManager.
	Cierra la conexión con la base de datos al final.
	*/
	public void eliminaPortatil(int id_portatil) throws Exception{
	Portatil portatil = em.find(Portatil.class, id_portatil); // Encuentra el Portátil a través del id
	em.remove(portatil); // Elimina el Portátil
	em.clear();
	em.close(); // Cierra la conexión con la base de datos
	}
	/*

	Método para insertar un Portátil en la base de datos.
	Persiste el Portátil en la base de datos con el método persist de EntityManager.
	Cierra la conexión con la base de datos al final.
	*/
	public void insertaPoratil(Portatil Portatil) throws Exception{
	em.persist(Portatil); // Persiste el Portátil en la base de datos
	em.clear();
	em.close(); // Cierra la conexión con la base de datos
	}
	/*

	Método para seleccionar el Alumno que tiene un determinado Portátil.
	Crea una consulta JPA para seleccionar el Alumno a través del id del Portátil.
	Devuelve el primer resultado encontrado como un objeto Optional.
	*/
	public Optional<Portatil> selectAlumnoOfPortatil(int id_Alumno) {
	String jpql = "SELECT a FROM Alumno a WHERE a.portatil.id = :id_portatil"; // Consulta JPA para seleccionar el Alumno por id de Portátil
	TypedQuery<Portatil> query = em.createQuery(jpql, Portatil.class); // Creación de la consulta con EntityManager
	query.setParameter("id_portatil", id_Alumno); // Establece el parámetro id_portatil en la consulta
	return query.getResultList().stream().findFirst(); // Devuelve el primer resultado encontrado como un objeto Optional
	}

	

	
//Unimplemented
	@Override
	public void updatePoratil(Portatil Portatil) throws Exception {
		// TODO Auto-generated method stub
		
	}

	

	
}
