package gestionPrestamos.dto;

import gestionPrestamos.dal.Alumno;
import gestionPrestamos.dal.Portatil;

public interface ToDaoService {
	/**
	 * Paso de DTO a DAO alumno normal
	 * @param dtoAlumno dto de alumno normal
	 * @return
	 */
	public Alumno normalDaoToDtoAlumno(dtoAlumno dtoAlumno);
	
	/**
	 * Paso de DTO a DAO portatil normal
	 * @param dtoPortatil dto de portatil normal
	 * @return
	 */
	public Portatil normalDaoToDtoPortatil(dtoPortatil dtoPortatil);
	
	/**
	 * Paso de DTO a DAO AlumnoPortatil normal
	 * @param dtoAlumnoPortatil dto de AlumnoPortatil normal
	 * @return
	 */
	public dtoAlumnoPortatil normalDaoToDtoPortatilAlumno(dtoAlumnoPortatil dtoAlumnoPortatil);
	
}
