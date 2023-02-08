package gestionPrestamos.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import gestionPrestamos.dal.*;

@Component
public interface ConsultasService  {

	//INTERFACE PARA LAS CONSULTAS

	public boolean insertaAlumno(Alumno Alumno)throws Exception;
	public boolean insertaPortail(Portatil portatil)throws Exception;
	

	public Optional<Alumno> selectPortatilOfAlumno(int id_portatil) throws Exception;
	public Optional<Portatil> selectAlumnoOfPortatil(int id_alumno) throws Exception;
	

	public void eliminarAlumno(int id_alumno) throws Exception;
	public void eliminaPortatil1(int id_portatil)throws Exception;
	
	
	public void updateAlumno(Alumno alumno)throws Exception;
	public void updatePortatil(Portatil portatil) throws Exception;
	
}
