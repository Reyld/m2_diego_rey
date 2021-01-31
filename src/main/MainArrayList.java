package main;

import java.util.ArrayList;
import java.util.Scanner;

import clases.AppWeb;
import clases.AppMobile;
import clases.AppIoT;
import interfaces.AppWebServicesImplement;
import interfaces.AppMobileServiceImplement;
import interfaces.AppIoTServiceImplement;



public class MainArrayList {



	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Elija una opción: 1 - Crear aplicación web. 2 - Crear aplicación mobil. 3 - Crear aplicación IoT.");
		int opcion = teclado.nextInt();
		
		if (opcion == 1) {
			// Iniciamos el ArrayList
			ArrayList<AppWeb> webapps = new ArrayList<AppWeb>();
			
			System.out.println("Por favor, indique cuantas aplicaciones desea crear.");
			 int a = teclado.nextInt();													// Esta variable sirve para identificar el número de Apps que vamos a crear.
			AppWeb[] webs = new AppWeb[a];
			
			
			for (int i = 0; i < webs.length; i++) {
				
				// Obtenemos los datos
				System.out.println("FORMULARIO DE CREACIÓN DE LA APLICACIÓN WEB " + (i + 1));
				
				System.out.println("Introduzca nombre de la aplicación");
				String name = teclado.next();
				System.out.println("Introducir lenguaje de backend");
				String back = teclado.next();
				System.out.println("Introducir lenguaje de frontend");
				String front = teclado.next();
				System.out.println("Introducir lenguaje de programación");
				String lang = teclado.next();
				System.out.println("Introducir complejidad");
				double compl = teclado.nextDouble();
				System.out.println("Introducir numero de líeneas");
				int lines = teclado.nextInt();
				System.out.println("Indicar numero de testers");
				int tests = teclado.nextInt();
				System.out.println("Se han procesado correctamente los datos de la aplicación");
				// Almacenamos
				
				//webs[i] = new AppWeb(back, front, lang, compl, lines, tests);
				webapps.add(new AppWeb(name, back, front, lang, compl, lines, tests));

			}
			// Imprimimos
			
			for (int i = 0; i < webs.length; i++) {
				System.out.println("Las aplicaciones se han creado correctamente. Estos són los datos que han ingresado en la base de datos:");
				System.out.println(webapps);
				// System.out.println(webapps[i]);
			}
			
			
			
		}
		else if (opcion == 2) {
			ArrayList<AppMobile> mobileapps = new ArrayList<AppMobile>();
			System.out.println("Por favor, indique cuantas aplicaciones desea crear.");
			 int a = teclado.nextInt();
			
			AppMobile[] mobiles = new AppMobile[a];
			// String[] permisos2 = {};
			 String newperm = ("");
			
			for (int i = 0; i < mobiles.length; i++) {
				
				// Obtenemos los datos
					System.out.println("FORMULARIO DE CREACIÓN DE LA APLICACIÓN MOBIL " + (i + 1));
				
					System.out.println("Introduzca nombre de la aplicación");
					String name = teclado.next();
				
					System.out.println("¿Es hibrida?");
					boolean hyb = teclado.nextBoolean();
									
					// Te permite seleccionar el numero de permisos.
					System.out.println("¿Cuántos permisos tendrá la aplicación?");
					int p = teclado.nextInt();
					
					String[] permisos2 = new String[p];
								
					System.out.println("Introducir permisos necesarios");
								teclado.nextLine();
						for (int j = 0; j < p ; j++) {
								System.out.println("Asigne el permiso" + (j + 1));
								 newperm = teclado.nextLine();
								 
								 System.out.println(newperm);
								 
								 permisos2[j] = newperm;
								 // System.out.println(permisos2);
						}
					System.out.println("Introducir lenguaje de programación");
					String lang = teclado.next();
					System.out.println("¿Tiene persistencia?");
					boolean persis = teclado.nextBoolean();
					System.out.println("Introducir complejidad");
					double compl = teclado.nextDouble();
					System.out.println("Introducir numero de líeneas");
					int lines = teclado.nextInt();
					System.out.println("Indicar numero de testers");
					int tests = teclado.nextInt();
					System.out.println("Se han procesado correctamente los datos de la aplicación");
					// Almacenamos
					
					mobileapps.add(new AppMobile(name, hyb, permisos2, lang, persis, compl, lines, tests));
					//mobiles[i] = new AppMobile(hyb, permisos2, lang, persis, compl, lines, tests);
				}
			
				// Imprimimos
				for (int i = 0; i < mobiles.length; i++) {
					System.out.println("Las aplicaciones se han creado correctamente. Estos són los datos que han ingresado en la base de datos:");
					System.out.println(mobileapps);
					//System.out.println(mobiles[i]);
				}
			}
			else if (opcion == 3) {
				ArrayList<AppIoT> iotapps = new ArrayList<AppIoT>();
				System.out.println("Por favor, indique cuantas aplicaciones desea crear.");
				int a = teclado.nextInt();
				
				AppIoT[] iots = new AppIoT[a];
				for (int i = 0; i < iots.length; i++) {
					
					// Obtenemos los datos
					System.out.println("FORMULARIO DE CREACIÓN DE LA APLICACIÓN IoT " + (i + 1));
					
					System.out.println("Introduzca nombre de la aplicación");
					String name = teclado.next();
					System.out.println("¿Tiene interfaz grafica?");
					boolean graf = teclado.nextBoolean();
					System.out.println("¿Requiere acceso a internet?");
					boolean wifi = teclado.nextBoolean();
					System.out.println("Introducir lenguaje de programación");
					String lang = teclado.next();
					System.out.println("¿Tiene persistencia?");
					boolean persis = teclado.nextBoolean();
					System.out.println("Introducir complejidad");
					double compl = teclado.nextDouble();
					System.out.println("Introducir numero de líeneas");
					int lines = teclado.nextInt();
					System.out.println("Indicar numero de testers");
					int tests = teclado.nextInt();
					System.out.println("Se han procesado correctamente los datos de la aplicación");
					// Almacenamos
					iotapps.add(new AppIoT(name, graf, wifi, lang, persis, compl, lines, tests));
					//iots[i] = new AppIoT(graf, wifi, lang, persis, compl, lines, tests);
				}
			
					// Imprimimos
						System.out.println("Las aplicaciones se han creado correctamente. Estos són los datos que han ingresado en la base de datos:");
						System.out.println(iotapps);
						//System.out.println(iots[i]);
						
					} else {
				System.out.println("No se ha detectado la opcion deseada. El programa se cerrará.");
				
				// En planificación: El programa se cierra si no se introduce ningún valor.
				System.exit(0);
			}
		}
		catch (Exception e){
			System.out.println("Se ha detectado un error. El programa se cerrará.");
			
			// En planificación: El programa se cierra si no se introduce ningún valor.
			System.exit(0);
		}

		

	}

	/*
	private static String webapps(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	*/

}
