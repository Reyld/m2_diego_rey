package clases;

import java.util.Arrays;

public  class AppMobile extends AppSoftware {
	
	private String nombre;
	private String result;
	private boolean hybrid;
	private String permisos[] = {"Cámara", "Micrófono", "Geolocalización", "Acelerómetro", "Contactos"};
	
	
	// "El lenguaje de programación utilizado es " + programmlang + " utiliza tecnología híbrida."	// Este mensaje ha de aparecer si hybrid es true
	// "El lenguaje de programación utilizado es " + programmlang + " utiliza tecnología nativa."	// Este mensaje ha de aparecer si hybrid es false

	// Constructor 
	
	public AppMobile() {
		
	}
	
	
	public AppMobile(String[] permisos) {
		
		this.setPermisos(permisos);
		// TODO Auto-generated constructor stub
	}
	

	// Main Array Constructor

	public AppMobile(String nombre, boolean hyb, String[] permisos2, String lang, boolean persis, double compl, int lines, int tests) {
		this.nombre = nombre;
		this.hybrid = hyb;
		//permisos2 = Arrays.toString(permisos);
		this.permisos = permisos2;
		//this.setPermisos(permisos2);
		//permisos2;
		setProgrammlang(lang);
		setPersist(persis);
		setComplex(compl);
		setCodelines(lines);
		setTestcases(tests);

	}


	@Override
	String technostack() {
		setProgrammlang("X");
		hybrid = true;
		if (hybrid) {
			result = ("El lenguaje de programación utilizado es " + getProgrammlang() + " utiliza tecnología híbrida.");
		}
		else {
			result = ("El lenguaje de programación utilizado es " + getProgrammlang() + " utiliza tecnología nativa.");
		}
		return result;		
	}


	
	



	@Override
	public String toString() {
		
	
		return "AppMobile [nombre de la app: " + this.nombre + "hibrido: " + hybrid + ", permisos: " + Arrays.toString(permisos)
				+ ", lenguaje de prgramación: " + getProgrammlang() + ", persistencia: " + isPersist() + ", complejidad: "
				+ getComplex() + ", lineas de codigo: " + getCodelines() + ", testeos: " + getTestcases() + ", calidad: " + super.calcularCalidad(getComplex(), getCodelines(), getTestcases()) + "]";
				
	}



	public String[] getPermisos() {
		return permisos;
	}



	public void setPermisos(String permisos[]) {
		this.permisos = permisos;
	}
	
}
