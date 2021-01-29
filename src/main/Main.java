package main;

import clases.AppWeb;
import clases.AppMobile;
import clases.AppIoT;
import interfaces.AppWebServicesImplement;
import interfaces.AppMobileServiceImplement;
import interfaces.AppIoTServiceImplement;


public class Main {

	

	public static void main(String[] args) {

		/*
		 *  Creador de objetos
		 */
		// 1 - App Web
		
		AppWebServicesImplement servwebapp = new AppWebServicesImplement();
		
		// 2 - App Mobile
		
		AppMobileServiceImplement servmobileapp = new AppMobileServiceImplement();

		
		
		// 3 - App IoT
		
		AppIoTServiceImplement serviotapp = new AppIoTServiceImplement();

		
		
		/*
		 * Uso del metodo creador de App
		 */
		
		// 1 - Web App
		AppWeb appweb1 = servwebapp.createApp();
		AppWeb appweb2 = servwebapp.createApp();

		
		// 2 - App Mobile
		AppMobile appmobile1 = servmobileapp.createApp();
		AppMobile appmobile2 = servmobileapp.createApp();

		
		// 3 - App IoT
		AppIoT appiot1 = serviotapp.createApp();
		AppIoT appiot2 = serviotapp.createApp();

		
		
		/*
		 * Imprimir objeto por consola
		 */
		
		System.out.println("App Web");
		System.out.println(appweb1.toString());
		System.out.println("---------------------------------------");
		System.out.println(appweb2.toString());
		System.out.println("---------------------------------------");
		System.out.println("App Mobil");
		System.out.println(appmobile1.toString());
		System.out.println("---------------------------------------");
		System.out.println(appmobile2.toString());
		System.out.println("---------------------------------------");
		System.out.println("App IoT");
		System.out.println(appiot1.toString());
		System.out.println("---------------------------------------");
		System.out.println(appiot2.toString());
		System.out.println("---------------------------------------");
	}

}
