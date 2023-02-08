package gestionPrestamos.dto;

import gestionPrestamos.dal.Alumno;
import gestionPrestamos.dal.Portatil;

public class ToDaoServicioIMPL implements ToDaoService {
	
	//CLASE PARA IMPLEMENTAR EL PASO DE DTO TO DAO
	public Alumno normalDaoToDtoAlumno(dtoAlumno dtoAlumno) {
		
		Alumno Alumno = new Alumno();
		if(dtoAlumno != null) {
	
			Alumno.setDni_alumno(dtoAlumno.getDni_alumno());
			Alumno.setNumero(dtoAlumno.getNumero());
			Alumno.setId_alumno(dtoAlumno.getId_alumno());
			Alumno.setId_portatil(dtoAlumno.getId_portatil());
			Alumno.setNombre(dtoAlumno.getNombre());
			
			
		}
		return Alumno;
	}
	
public Portatil normalDaoToDtoPortatil(dtoPortatil dtoPortatil) {
		
	Portatil Portatil = new Portatil();
		if(dtoPortatil != null) {
	
			Portatil.setModelo(dtoPortatil.getModelo());
			Portatil.setMm_uuid(dtoPortatil.getMm_uuid());
			Portatil.setId_alumno(dtoPortatil.getId_alumno());
			Portatil.setId_portatil(dtoPortatil.getId_portatil());
			Portatil.setMarca(dtoPortatil.getMarca());
			
			
		}
		return Portatil;
	}

@Override
public dtoAlumnoPortatil normalDaoToDtoPortatilAlumno(dtoAlumnoPortatil dtoAlumnoPortatil) {
	// TODO Auto-generated method stub
	return null;
}

}

