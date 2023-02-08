package gestionPrestamos.dto;

//dto para trabajar con los campos de portatil
public class dtoPortatil {

	 String modelo;
	 String marca;
	 String mm_uuid;
	 int id_portatil;
	 int id_alumno;
	 
	//GETTERS & SETTERS
	 
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMm_uuid() {
		return mm_uuid;
	}
	public void setMm_uuid(String mm_uuid) {
		this.mm_uuid = mm_uuid;
	}
	public int getId_portatil() {
		return id_portatil;
	}
	public void setId_portatil(int id_portatil) {
		this.id_portatil = id_portatil;
	}
	public int getId_alumno() {
		return id_alumno;
	}
	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}
	
	//CONSTRUCTOR GENERAL
	
	 public dtoPortatil(String modelo, String marca, String mm_uuid, int id_portatil, int id_alumno) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.mm_uuid = mm_uuid;
		this.id_portatil = id_portatil;
		this.id_alumno = id_alumno;
	}
	 
	 //CONSTRUCTOR VACIO
	 
	 public dtoPortatil() {
		super();
	}
	 
	 //TOSTRING
	 
	 @Override
	public String toString() {
		return "dtoPortatil [modelo=" + modelo + ", marca=" + marca + ", mm_uuid=" + mm_uuid + ", id_portatil="
				+ id_portatil + ", id_alumno=" + id_alumno + "]";
	}
	 
}
