package clases;

public class AppWeb extends AppSoftware {
	private String nombre;
	private String res;
	private String backend = "el framework de backend es Y";
	private String frontend = "el framework de frontend es Z";
	

	// Constructores
	
	public AppWeb() {
		
	}
	
	
	
	public AppWeb(String backend, String frontend) {
		this.backend = backend;
		this.frontend = frontend;
	}


	
	
	public AppWeb(String nombre, String back, String front, String lang, double compl, int lines, int tests) {

		
		this.nombre = nombre;
		this.backend = back;
		this.frontend = front;
		setProgrammlang(lang);
		setComplex(compl);
		setCodelines(lines);
		setTestcases(tests);
	}



	@Override
	public String toString() {
		return "AppWeb [nombre: " + this.nombre + ", backend: " + this.backend + ", frontend: " + this.frontend + ", lenguaje de prgramación: " + getProgrammlang() + ", complejidad: "
				+ getComplex() + ", lineas de codigo: " + getCodelines() + ", testeos: " + getTestcases() + ", calidad: " + super.calcularCalidad(getComplex(), getCodelines(), getTestcases()) + "]";
	}
	
	
	
	

	@Override
	String technostack() {
		//return null;
		//setProgrammlang("El lenguaje de programación usado es X");
		// TODO Auto-generated method stub
		return res.concat(getProgrammlang() + " , " + backend + " y " + frontend + ".");
		// String concat = ("El lenguaje de programación usado es " + programmlang + ", el framework de backend es " + backend + " y el framework de backframe es " + frontend + ".");

		

	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}



	public void setBackend(String backend) {
		this.backend = backend;
		
	}



	public void setFrontend(String frontend) {
		this.frontend = frontend;
	}
	
	
	


	

}
