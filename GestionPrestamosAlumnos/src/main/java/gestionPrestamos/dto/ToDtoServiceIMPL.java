package gestionPrestamos.dto;

import gestionPrestamos.dal.Alumno;
import gestionPrestamos.dal.Portatil;
//CLASE PARA IMPLEMENTAR EL PASO DE DAO TO DTO
public class ToDtoServiceIMPL implements ToDtoService {

	dtoAlumno dtoAlum;
	dtoPortatil dtoPortatil;
	@Override
	public dtoAlumno ToAlumnoDto(Alumno dalAlum) {
		
		dtoAlum.setDni_alumno(dalAlum.getDni_alumno());
		dtoAlum.setId_alumno(dalAlum.getId_alumno());
		dtoAlum.setId_portatil(dalAlum.getId_portatil());
		dtoAlum.setNombre(dalAlum.getNombre());
		dtoAlum.setNumero(dalAlum.getNumero());
		
		
		return dtoAlum;
	}

	@Override
	public dtoPortatil ToPortatilDto(Portatil dalPortatil) {
		dtoPortatil.setId_alumno(dalPortatil.getId_alumno());
		dtoPortatil.setId_portatil(dalPortatil.getId_portatil());
		dtoPortatil.setMarca(dalPortatil.getMarca());
		dtoPortatil.setMm_uuid(dalPortatil.getMm_uuid());
		dtoPortatil.setModelo(dalPortatil.getModelo());
		return dtoPortatil;
	}

	@Override
	public dtoPortatil ToAlumnoPortatilDto() {
		// TODO Auto-generated method stub
		return null;
	}



}
