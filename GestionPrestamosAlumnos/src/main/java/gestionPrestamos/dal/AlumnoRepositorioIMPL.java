package gestionPrestamos.dal;

import java.util.List;
import java.util.Optional;

import javax.persistence.TypedQuery;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

/**
 * Implementación de la interfaz AlumnoRepositorio.
 */
@Repository
public class AlumnoRepositorioIMPL  implements AlumnoRepositorio {
	/**
	 * Instancia de EntityManager para gestionar la persistencia de los alumnos.
	 */
	@PersistenceContext
	private EntityManager em;
	
	/**
	 * Método que inserta un alumno en la base de datos.
	 * @param Alumno el objeto alumno a insertar.
	 * @throws Exception en caso de error al insertar el alumno.
	 */
	public void insertaAlumno(Alumno Alumno) throws Exception{
		em.persist(Alumno);	
		em.clear();
		em.close();
	}

	/**
	 * Método que actualiza un alumno en la base de datos.
	 * @param Alumno el objeto alumno a actualizar.
	 * @throws Exception en caso de error al actualizar el alumno.
	 */
	public void updateAlumno(Alumno Alumno) throws Exception{
		em.merge(Alumno);
		em.clear();
		em.close();
	}

	/**
	 * Método que elimina un alumno de la base de datos.
	 * @param id_alumno el identificador del alumno a eliminar.
	 * @throws Exception en caso de error al eliminar el alumno.
	 */
	public void eliminaAlumno(int id_alumno) throws Exception{
		Alumno miAlumno = em.find(Alumno.class, id_alumno);
		em.remove(miAlumno);
		em.clear();
		em.close();	
	}

	/**
	 * Método que obtiene todos los alumnos de la base de datos.
	 * @return una lista con todos los alumnos de la base de datos.
	 */
	public List<Alumno> selectAllAlumnos() {
	    String jpql = "SELECT a FROM Alumno a";
	    TypedQuery<Alumno> query = em.createQuery(jpql, Alumno.class);
	    return query.getResultList();
	}
	/**
	 * metodo que permite obetener un alumno por el portatil que tiene asignar
	 */
	public Optional<Alumno> selectPortatilOfAlumno(int id_portatil) {
	    String jpql = "SELECT a FROM Alumno a WHERE a.id_portatil = :id_portatil";
	    TypedQuery<Alumno> query = em.createQuery(jpql, Alumno.class);
	    query.setParameter("id_portatil", id_portatil);
	    return query.getResultList().stream().findFirst();
	}

	

	

	
	/*
	public void eliminaAlumno(int id_alumno) {
	    String jpql = "DELETE FROM Alumno a WHERE a.id_alumno = :id_alumno";
	    Query query = em.createQuery(jpql);
	    query.setParameter("id_alumno", id_alumno);
	    int numeroEliminados = query.executeUpdate();
	    System.out.println("[INFO] - Número de alumnos eliminados: " + numeroEliminados);
	}*/ //metodo diferente
} 
	


	

