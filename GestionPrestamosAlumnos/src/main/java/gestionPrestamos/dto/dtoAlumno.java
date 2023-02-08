package gestionPrestamos.dto;



//clase dto para trabajar con los campos de Alumnos
public class dtoAlumno {
	
	//PROPIEDADES
	 String dni_alumno;
	 int id_alumno;
	 String numero;
	 int id_portatil;
	 String nombre;

	//GETTERS & SETTERS
	public String getDni_alumno() {
		return dni_alumno;
	}
	public void setDni_alumno(String dni_alumno) {
		this.dni_alumno = dni_alumno;
	}
	public int getId_alumno() {
		return id_alumno;
	}
	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getId_portatil() {
		return id_portatil;
	}
	public void setId_portatil(int id_portatil) {
		this.id_portatil = id_portatil;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	 

	
	//CONSTRUCTOR GENERAL
	
	public dtoAlumno(String dni_alumno, int id_alumno, String numero, int id_portatil, String nombre) {
		super();
		this.dni_alumno = dni_alumno;
		this.id_alumno = id_alumno;
		this.numero = numero;
		this.id_portatil = id_portatil;
		this.nombre = nombre;
	}
	
	//CONSTRUCTOR VACIO
	
	public dtoAlumno() {
		super();
	}
	
	
	//TOSTRING
	
	 @Override
	public String toString() {
		return "dtoAlumno [dni_alumno=" + dni_alumno + ", id_alumno=" + id_alumno + ", numero=" + numero
				+ ", id_portatil=" + id_portatil + ", nombre=" + nombre + "]";
	}
}
