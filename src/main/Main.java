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
		appweb1.setNombre("SuperGuayApp");
		appweb1.setBackend(("Eclipse"));
		appweb1.setFrontend(("JavaScript"));
		appweb1.setProgrammlang("Java");
		appweb1.setComplex(70);
		appweb1.setCodelines(150000);
		appweb1.setTestcases(1);
		
		
		AppWeb appweb2 = servwebapp.createApp();
		appweb2.setNombre("RadarPecesAmarillos");
		appweb2.setBackend(("JavaScript"));
		appweb2.setFrontend(("JavaScript"));
		appweb2.setProgrammlang("C++");
		appweb2.setComplex(20);
		appweb2.setCodelines(3000);
		appweb2.setTestcases(3500);

		
		// 2 - App Mobile
		AppMobile appmobile1 = servmobileapp.createApp();
		appmobile1.setNombre("Esquimal Detector");
		appmobile1.setHybrid(false);
		appmobile1.setPermisos("microfono","linterna","gerolocalización", "archivos", "camara");
		appmobile1.setPersist(false);
		appmobile1.setProgrammlang("C++");
		appmobile1.setComplex(20);
		appmobile1.setCodelines(3000);
		appmobile1.setTestcases(3500);
		
		AppMobile appmobile2 = servmobileapp.createApp();
		appmobile2.setNombre("PhotoBook+");
		appmobile2.setHybrid(true);
		appmobile2.setPermisos("contactos","camara","archivos", "geolocalización", "microfono");
		appmobile2.setPersist(true);
		appmobile2.setProgrammlang("JavaScript");
		appmobile2.setComplex(90);
		appmobile2.setCodelines(750000);
		appmobile2.setTestcases(6);

		
		// 3 - App IoT
		AppIoT appiot1 = serviotapp.createApp();
		appiot1.setNombre("Drawing Offline");
		appiot1.setGraph(true);
		appiot1.setWifi(false);
		appiot1.setProgrammlang("JavaScript");
		appiot1.setComplex(75);
		appiot1.setCodelines(150);
		appiot1.setTestcases(12);
		
		
		AppIoT appiot2 = serviotapp.createApp();
		appiot2.setNombre("Wifi Detector");
		appiot2.setGraph(false);
		appiot2.setWifi(true);
		appiot2.setProgrammlang("JavaScript");
		appiot2.setComplex(8);
		appiot2.setCodelines(67500);
		appiot2.setTestcases(9);
		
		
		/*
		 * Imprimir objeto por consola
		 */
		
		System.out.println("App Web");
		System.out.println("---------------------------------------");
		System.out.println(appweb1.toString());
		System.out.println("---------------------------------------");
		System.out.println(appweb2.toString());
		System.out.println("---------------------------------------");
		System.out.println("App Mobil");
		System.out.println("---------------------------------------");
		System.out.println(appmobile1.toString());
		System.out.println("---------------------------------------");
		System.out.println(appmobile2.toString());
		System.out.println("---------------------------------------");
		System.out.println("App IoT");
		System.out.println("---------------------------------------");
		System.out.println(appiot1.toString());
		System.out.println("---------------------------------------");
		System.out.println(appiot2.toString());
		System.out.println("---------------------------------------");
	}

}
