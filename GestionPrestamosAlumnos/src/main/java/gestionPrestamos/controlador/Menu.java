package gestionPrestamos.controlador;
import java.util.Scanner;
/**
 * @author yeray
 */
import gestionPrestamos.menu.*;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuServiceIMPL menuService = new MenuServiceIMPL();
		 Scanner sc = new Scanner(System.in);
		    int opcion;
		    do {
		      System.out.println("Selecciona una opción:");
		      System.out.println("1. Menú de servicios para alumnos");
		      System.out.println("2. Menú de servicios para portátiles");
		      System.out.println("0. Salir");
		      opcion = sc.nextInt();
		      switch (opcion) {
		        case 1:
		          menuService.menuAlumnos();
		          break;
		        case 2:
		          menuService.menuportatil();
		          break;
		        case 0:
		          System.out.println("Gracias por utilizar nuestro servicio");
		          break;
		        default:
		          System.out.println("Opción no válida, por favor intente de nuevo");
		          break;
		      }
		    } while (opcion != 0);
	}

}
