package gestionPrestamos.dal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/**
 * @author Yeray 
 * Prestamos: Entidad que refiera a la tabla de base de datosdlk_gestor_prestamos.
 * Registros de Alumnos.
 */

/*
 * IMPORTANTE: La base de datos y el esquema si hay que crearlo. La tabla se generará sola.
 */
@Entity
@Table(name="dlk_tch_alumnos",schema="dlk_gestor_prestamos")
public class Alumno {

		//ATRIBUTOS

		@Column (name="dni_alumno")
		private String dni_alumno;
		
		@Column (name="id_portatil")
		private int id_portatil;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id_alumno")
		private int id_alumno;
		
		@Column (name="numero")
		private String numero;
		
		@Column (name="nombre")
		private String nombre;
		@OneToOne
	    Portatil portatilDAO;
		//GETTERS & SETTERS

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getId_portatil() {
			return id_portatil;
		}

		public void setId_portatil(int id_portatil) {
			this.id_portatil = id_portatil;
		}

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

		//CONSTRUCTOR GENERAL
		
		public Alumno(String dni_alumno, int id_alumno, String numero,int id_portatil,String nombre) {
			super();
			this.dni_alumno = dni_alumno;
			this.id_alumno = id_alumno;
			this.numero = numero;
			this.id_portatil=id_portatil;
			this.nombre=nombre;
		}
		
		//CONSTRUCTOR VACIO
		
		public Alumno() {
		}
		
		//METODO PARA QUE SEAN LEGIBLE LOS CAMPOS
		
		@Override
		public String toString() {
			return "Alumno [dni_alumno=" + dni_alumno + ", id_alumno=" + id_alumno
					+ ", numero=" + numero + ", id_portatil="+ id_portatil+ ", nombre=" + nombre+"]";
		}
		
}
