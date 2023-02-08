package gestionPrestamos.dto;



public class dtoAlumnoPortatil {
	
	    //PROPIEDADES
	
		 String dni_alumno;
		 int id_alumno;
		 String numero;
		 String modelo;
		 String marca;
		 String mm_uuid;
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
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		 
		//CONSTRUCTOR GENERAL
		
		public dtoAlumnoPortatil(String dni_alumno, int id_alumno, String numero, String modelo, String marca,
				String mm_uuid, int id_portatil, String nombre) {
			super();
			this.dni_alumno = dni_alumno;
			this.id_alumno = id_alumno;
			this.numero = numero;
			this.modelo = modelo;
			this.marca = marca;
			this.mm_uuid = mm_uuid;
			this.id_portatil = id_portatil;
			this.nombre = nombre;
		}
	
		//CONSTRUCTOR VACIO
		public dtoAlumnoPortatil() {
			super();
		}
		
		//TOSTRING
		
		@Override
		public String toString() {
			return "dtoAlumnoPortatil [dni_alumno=" + dni_alumno + ", id_alumno=" + id_alumno + ", numero=" + numero
					+ ", modelo=" + modelo + ", marca=" + marca + ", mm_uuid=" + mm_uuid + ", id_portatil="
					+ id_portatil + ", nombre=" + nombre + "]";
		}
		
}
