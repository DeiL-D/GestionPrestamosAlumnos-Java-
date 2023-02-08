package gestionPrestamos.dto;

import gestionPrestamos.dal.Alumno;
import gestionPrestamos.dal.Portatil;

public interface ToDtoService {
	/**
	 * Paso de DAO a DTO Alumno normal
	 * @param Alumno de dto Alumno normal
	 * @return
	 */
	public dtoAlumno ToAlumnoDto (Alumno dalAlum);
	/**
	 * Paso de DAO a DTO portatil normal
	 * @param Portatil de dto portatil normal
	 * @return
	 */
	public dtoPortatil ToPortatilDto (Portatil dalPortatil);
	
	
	public dtoPortatil ToAlumnoPortatilDto ();

}
