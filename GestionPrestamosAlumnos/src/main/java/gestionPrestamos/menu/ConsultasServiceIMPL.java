package gestionPrestamos.menu;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestionPrestamos.dal.Alumno;
import gestionPrestamos.dal.AlumnoRepositorio;
import gestionPrestamos.dal.Portatil;
import gestionPrestamos.dal.PortatilRepositorio;
//CLASE PARA IMPLEMENTAR LAS CONSULTAS
@Service
public class ConsultasServiceIMPL implements ConsultasService {

	@Autowired
	private AlumnoRepositorio psi;
	private PortatilRepositorio pasip;
	
	
	//metodos para Alumnos
	@Transactional
	public boolean insertaAlumno(Alumno Alumno) {
		
		try {
			
		psi.insertaAlumno(Alumno);
		
		}catch(Exception e) {
			System.out.println("[ERROR] - Error al insertar nuevo repostaje normal a guardar: " + e);
			return false;
		}
		return true;
		
	}
	
	@Transactional
	public List<Alumno> ListaAlumno() throws Exception {
		List<Alumno> listaAlumnos = psi.selectAllAlumnos();
		return listaAlumnos;
	}
	
	
	@Transactional
	public Optional<Alumno> selectPortatilOfAlumno(int id_portatil) throws Exception {
		
		Optional<Alumno> alumno = psi.selectPortatilOfAlumno(id_portatil);
		
		return alumno;
		
	}
	@Transactional
	public void eliminarAlumno(int id_Alumno) throws Exception {
		
		psi.eliminaAlumno(id_Alumno);
	}
	
	
	/*@Transactional
	public void updateAlumno(Alumno alumno) throws Exception {
		
		 psi.updateAlumno(alumno);
		 
	}*/
	
	//metodos para Portatil
	
	@Transactional
public boolean insertaPortail(Portatil portatil) {
		
		try {
			
		pasip.insertaPoratil(portatil);
		
		}catch(Exception e) {
			System.out.println("[ERROR] - Error al insertar nuevo repostaje normal a guardar: " + e);
			return false;
		}
		return true;
		
	}
	@Transactional
	public List<Portatil> ListaPortatiles() throws Exception {
		List<Portatil> listaPortatiles = pasip.selectAllPortatil();
		return listaPortatiles;
		}

		@Transactional
		public Optional<Portatil> selectAlumnoOfPortatil(int id_Alumno) throws Exception {

		
			Optional<Portatil> portatil = pasip.selectAlumnoOfPortatil(id_Alumno);
			
			return portatil;
			
		}
		@Transactional
		public void eliminaPortatil1(int id_portatil) throws Exception {
		pasip.eliminaPortatil(id_portatil);
		}

		@Transactional
		public void updatePortatil(Portatil portatil) throws Exception {

		
		 pasip.updatePoratil(portatil);
		 
		}

	
		

		
		


	

		@Override
		public void updateAlumno(Alumno alumno) {
			// TODO Auto-generated method stub
			
		}

		


		
}
