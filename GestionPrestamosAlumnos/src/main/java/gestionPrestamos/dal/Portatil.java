package gestionPrestamos.dal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Calendar;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * @author Yeray 
 * Prestamos: Entidad que refiera a la tabla de base de datos dlk_portatil_prestamos.
 * Registros de Portatiles.
 */

/*
 * IMPORTANTE: La base de datos y el esquema si hay que crearlo. La tabla se generará sola.
 */
@Entity
@Table(name = "dlk_tch_portatil", schema = "dlk_portatil_prestamos")
public class Portatil {

	//ATRIBUTOS

	@Column (name="mm_uuid")
	private String mm_uuid;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_portatil")
	private int id_portatil;
	@Column(name="marca")
	private String marca;
	@Column(name="modelo")
	private String modelo;
	@Column(name="id_alumno")
	private int id_alumno;
	@OneToOne
	Portatil portatilDAO;
	//CONSTRUCTOR GENERAL


	public Portatil(String mm_uuid, int id_portatil, String marca, String modelo, int id_alumno) {
		super();
		this.mm_uuid = mm_uuid;
		this.id_portatil = id_portatil;
		this.marca = marca;
		this.modelo = modelo;
		this.id_alumno = id_alumno;
	}
	
	//CONSTRUCTOR VACIO
	
	public Portatil() {
		super();
	}
	
	//GETTERS AND SETTERS
	
	public int getId_alumno() {
		return id_alumno;
	}

	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
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
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//METODO PARA QUE SEAN LEGIBLE LOS CAMPOS
	
	@Override
	public String toString() {
		return "Portatil [mm_uuid=" + mm_uuid + ", id_portatil=" + id_portatil + ", marca=" + marca + ", modelo="
				+ modelo + ", id_alumno="+id_alumno+ "]";
	}
}
