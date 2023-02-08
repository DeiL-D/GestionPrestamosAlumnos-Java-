package gestionPrestamos.menu;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import gestionPrestamos.dal.Alumno;
import gestionPrestamos.dal.Portatil;


/**
 * CLASE PARA MENUS TANTO DE PORTATIL COMO DE ALUMNOS, NO USO LA INTERFAZ DE MENU POR QUE NO SE NI PA QUE SIRVE ENCIAMA SE ME HA IDO LA LUZ 40 VECES :(
 * @author yeray
 *
 */

public class MenuServiceIMPL {
	@Autowired
	private ConsultasServiceIMPL consultasServiceIMPL;

	private Scanner sc = new Scanner(System.in);
	public void menuAlumnos() {
		int opcion;
		String dni_alumno, numero, nombre;
        int id_portatil, id_alumno;
       
		do {
			System.out.println("\n\n\n\n");
			System.out.println("Menu Alumnos");
			System.out.println("1. Lista de Alumnos");
			System.out.println("2. Insertar Alumno");
			System.out.println("3. Buscar Alumno Por Portatil");
			System.out.println("4. Eliminar Alumno");
			System.out.println("0. Salir");
			System.out.println("Selecciona una opcion:");
			opcion = sc.nextInt();
			
			switch (opcion) {
			
			case 1:
				try {
					List<Alumno> listaAlumnos = consultasServiceIMPL.ListaAlumno();
					System.out.println("Lista de Alumnos:");
					for (Alumno alumno : listaAlumnos) {
						System.out.println("\t" + alumno.getId_alumno() + " - " + alumno.getNombre());
					}
				} catch (Exception e) {
					System.out.println("[ERROR] - " + e.getMessage());
				}
				break;
				
			case 2:
				try {
					  System.out.print("Introduzca el DNI del alumno: ");
                      dni_alumno = sc.nextLine();
                      System.out.print("Introduzca el ID del portátil: ");
                      id_portatil = sc.nextInt();
                      sc.nextLine();
                      System.out.print("Introduzca el ID del alumno: ");
                      id_alumno = sc.nextInt();
                      sc.nextLine();
                      System.out.print("Introduzca el número: ");
                      numero = sc.nextLine();
                      System.out.print("Introduzca el nombre: ");
                      nombre = sc.nextLine();
					
					Alumno alumno = new Alumno();
					alumno.setNombre(nombre);
					alumno.setDni_alumno(dni_alumno);
					alumno.setId_alumno(id_alumno);
					alumno.setNumero(numero);
					alumno.setId_portatil(id_portatil);
					if (consultasServiceIMPL.insertaAlumno(alumno)) {
						System.out.println("Alumno insertado correctamente");
					} else {
						System.out.println("[ERROR] - Error al insertar el alumno");
					}
				} catch (Exception e) {
					System.out.println("[ERROR] - " + e.getMessage());
				}
				break;
			case 3:
				  try {
				    System.out.println("Introduce el id del portatil a consultar:");
				    int idPortatil = sc.nextInt();
				    Optional<Alumno> alumno = consultasServiceIMPL.selectPortatilOfAlumno(idPortatil);
				    if (alumno != null) {
				      System.out.println("Alumno encontrado: " + alumno.toString());
				    } else {
				      System.out.println("No se ha encontrado ningún alumno con el id de portatil: " + idPortatil);
				    }
				    break;
				  } catch (Exception e) {
				    System.out.println("[ERROR] - Error al buscar alumno por portatil: " + e);
				  }
				  break;
			case 4:
				try {
					System.out.println("Introduce el id del alumno a eliminar:");
					int idAlumno = sc.nextInt();
					consultasServiceIMPL.eliminarAlumno(idAlumno);
					System.out.println("Alumno con id " + idAlumno + " eliminado correctamente.");
					break;
					} catch (Exception e) {
					System.out.println("[ERROR] - Error al eliminar alumno: " + e);
					}
					break;
					case 6:
					System.out.println("Saliendo del programa...");
					sc.close();
					System.exit(0);
					break;
					default:
					System.out.println("Opción inválida. Inténtalo de nuevo.");
					break;
					
		}
	
		}
		while(opcion!=0);
	}
	public void menuportatil(){
		 
	        
		int opcion;
		String mm_uuid, marca, modelo;
        int id_portatil,id_alumno;
		do {
			System.out.println("\n\n\n\n");
			System.out.println("Menu Alumnos");
			System.out.println("1. Lista de Portatiles");
			System.out.println("2. Insertar Portatil");
			System.out.println("3. Buscar Portatil Por Alumno");
			System.out.println("4. Eliminar Portatil");
			System.out.println("0. Salir");
			System.out.println("Selecciona una opcion:");
			opcion = sc.nextInt();
			
			switch (opcion) {
			
			case 1:
				try {
					List<Portatil> listaPortatiles = consultasServiceIMPL.ListaPortatiles();
					System.out.println("Lista de Alumnos:");
					for (Portatil portatil : listaPortatiles) {
						System.out.println("\t" + portatil.getId_portatil() + " - " + portatil.getMarca() + " - " + portatil.getModelo());
					}
				} catch (Exception e) {
					System.out.println("[ERROR] - " + e.getMessage());
				}
				break;
				
			case 2:
				try {
					 System.out.println("Introduce el UUID del portatil: ");
				        mm_uuid = sc.nextLine();

				        System.out.println("Introduce el ID del portatil: ");
				        while (!sc.hasNextInt()) {
				            System.out.println("Error: introduzca un número entero para el ID del portatil.");
				            sc.next();
				        }
				        id_portatil = sc.nextInt();

				        System.out.println("Introduce la marca del portatil: ");
				        marca = sc.nextLine();

				        System.out.println("Introduce el modelo del portatil: ");
				        modelo = sc.nextLine();

				        System.out.println("Introduce el ID del alumno: ");
				        while (!sc.hasNextInt()) {
				            System.out.println("Error: introduzca un número entero para el ID del alumno.");
				            sc.next();
				        }
				        id_alumno = sc.nextInt();
					
					Portatil portatil = new Portatil();
					portatil.setMm_uuid(mm_uuid);
					portatil.setId_alumno(id_alumno);
					portatil.setId_portatil(id_portatil);
					portatil.setMarca(marca);
					portatil.setModelo(modelo);
					
					if (consultasServiceIMPL.insertaPortail(portatil)) {
						System.out.println("Portatil insertado correctamente");
					} else {
						System.out.println("[ERROR] - Error al insertar el Portatil");
					}
				} catch (Exception e) {
					System.out.println("[ERROR] - " + e.getMessage());
				}
				break;
			case 3:
				  try {
				    System.out.println("Introduce el id del Alumno del Portatil a consultar:");
				    int idAlumno = sc.nextInt();
				    Optional<Portatil> portatil = consultasServiceIMPL.selectAlumnoOfPortatil(idAlumno);
				    if (portatil != null) {
				      System.out.println("Alumno encontrado: " + portatil.toString());
				    } else {
				      System.out.println("No se ha encontrado ningún portatil con el id de Alumno: " + idAlumno);
				    }
				    break;
				  } catch (Exception e) {
				    System.out.println("[ERROR] - Error al buscar portatil por Alumno: " + e);
				  }
				  break;
			case 4:
				try {
					System.out.println("Introduce el id del portatil a eliminar:");
					int id_portatil1 = sc.nextInt();
					consultasServiceIMPL.eliminarAlumno(id_portatil1);
					System.out.println("portatil con id " + id_portatil1 + " eliminado correctamente.");
					break;
					} catch (Exception e) {
					System.out.println("[ERROR] - Error al eliminar portatil: " + e);
					}
					break;
					case 6:
					System.out.println("Saliendo del programa...");
					sc.close();
					System.exit(0);
					break;
					default:
					System.out.println("Opción inválida. Inténtalo de nuevo.");
					break;
					
		}
	
		}
		while(opcion!=0);
	
	}
}
