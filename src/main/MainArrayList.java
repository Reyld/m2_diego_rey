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
			System.out.println("Elija una opcion: 1 - Crear aplicacion web. 2 - Crear aplicacion mobil. 3 - Crear aplicacion IoT.");
		int opcion = teclado.nextInt();
		if (opcion == 1) {
			AppWeb[] webs = new AppWeb[2];
			
			// Iniciamos el ArrayList
			ArrayList<AppWeb> webapps = new ArrayList<AppWeb>();
			for (int i = 0; i < webs.length; i++) {
				
				// Obtenemos los datos
				System.out.println("Introducir lenguaje de backend");
				String back = teclado.next();
				System.out.println("Introducir lenguaje de frontend");
				String front = teclado.next();
				System.out.println("Introducir lenguaje de programacion");
				String lang = teclado.next();
				System.out.println("Introducir complejidad");
				double compl = teclado.nextDouble();
				System.out.println("Introducir numero de lieneas");
				int lines = teclado.nextInt();
				System.out.println("Indicar numero de testers");
				int tests = teclado.nextInt();
				System.out.println("Se han procesado correctamente los datos de la aplicación");
				// Almacenamos
				
				//webs[i] = new AppWeb(back, front, lang, compl, lines, tests);
				webapps.add(new AppWeb(back, front, lang, compl, lines, tests));

			}
			// Imprimimos
			
			for (int i = 0; i < webs.length; i++) {
				
				System.out.println(webapps);
				// System.out.println(webapps[i]);
			}
			
			
			
		}
		else if (opcion == 2) {
			ArrayList<AppMobile> mobileapps = new ArrayList<AppMobile>();
			AppMobile[] mobiles = new AppMobile[2];
			// String[] permisos2 = {};
			 String newperm = ("");
			
			for (int i = 0; i < mobiles.length; i++) {
				// Obtenemos los datos
				
					System.out.println("¿Es hibrida?");
					boolean hyb = teclado.nextBoolean();
									
					// Te permite seleccionar el numero de permisos.
					System.out.println("¿Cuántos permisos tendrá la aplicación?");
					int p = teclado.nextInt();
					
					String[] permisos2 = new String[p];
								
					System.out.println("Introducir permisos necesarios");
								teclado.nextLine();
						for (int j = 0; j < p ; j++) {
	
								 newperm = teclado.nextLine();
								 System.out.println(j);
								 System.out.println(newperm);
								 
								 permisos2[j] = newperm;
								 System.out.println(permisos2);
						}
					System.out.println("Introducir lenguaje de programacion");
					String lang = teclado.next();
					System.out.println("¿Tiene persistencia?");
					boolean persis = teclado.nextBoolean();
					System.out.println("Introducir complejidad");
					double compl = teclado.nextDouble();
					System.out.println("Introducir numero de lieneas");
					int lines = teclado.nextInt();
					System.out.println("Indicar numero de testers");
					int tests = teclado.nextInt();
					System.out.println("Se han procesado correctamente los datos de la aplicación");
					// Almacenamos
					
					mobileapps.add(new AppMobile(hyb, permisos2, lang, persis, compl, lines, tests));
					//mobiles[i] = new AppMobile(hyb, permisos2, lang, persis, compl, lines, tests);
				}
			
				// Imprimimos
				for (int i = 0; i < mobiles.length; i++) {
					System.out.println(mobileapps);
					//System.out.println(mobiles[i]);
				}
			}
			else if (opcion == 3) {
				ArrayList<AppIoT> iotapps = new ArrayList<AppIoT>();
				AppIoT[] iots = new AppIoT[2];
				for (int i = 0; i < iots.length; i++) {
					// Obtenemos los datos
					System.out.println("¿Tiene interfaz grafica?");
					boolean graf = teclado.nextBoolean();
					System.out.println("¿Requiere acceso a internet?");
					boolean wifi = teclado.nextBoolean();
					System.out.println("Introducir lenguaje de programacion");
					String lang = teclado.next();
					System.out.println("¿Tiene persistencia?");
					boolean persis = teclado.nextBoolean();
					System.out.println("Introducir complejidad");
					double compl = teclado.nextDouble();
					System.out.println("Introducir numero de lieneas");
					int lines = teclado.nextInt();
					System.out.println("Indicar numero de testers");
					int tests = teclado.nextInt();
					System.out.println("Se han procesado correctamente los datos de la aplicación");
					// Almacenamos
					iotapps.add(new AppIoT(graf, wifi, lang, persis, compl, lines, tests));
					//iots[i] = new AppIoT(graf, wifi, lang, persis, compl, lines, tests);
				}
			
					// Imprimimos
					for (int i = 0; i < iots.length; i++) {
						System.out.println(iotapps);
						//System.out.println(iots[i]);
						}
					} else {
				System.out.println("No se ha detectado la opcion deseada.");
				
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

	private static String webapps(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
