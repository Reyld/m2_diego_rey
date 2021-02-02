package clases;

public class AppIoT extends AppSoftware {

	String nombre;
	boolean graph; 	// ¿Tiene interfaz gráfica?
	boolean wifi;	// ¿Tiene WiFi?
	
	public AppIoT(boolean graph, boolean wifi) {
		this.graph = graph;
		this.wifi = wifi;
	}
	
	
		
	public AppIoT() {
		
		for (EProtocols tipoprotocolo : EProtocols.values()) {
			System.out.println(tipoprotocolo);
		}
		
		
		
		
	
		// TODO Auto-generated constructor stub
	}




	public AppIoT(String nombre, boolean graf, boolean wifi, String lang, boolean persis, double compl, int lines, int tests) {
		this.nombre = nombre;
		this.graph = graf;
		this.wifi = wifi;
		setProgrammlang(lang);
		setPersist(persis);
		setComplex(compl);
		setCodelines(lines);
		setTestcases(tests);
	}



	@Override
	String technostack() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String toString() {
		return "AppIoT [nombre de la app: " + this.nombre + ", graph: " + this.graph + ", wifi: " + this.wifi + ", lenguaje de prgramación: " + getProgrammlang() + ", persistencia: " + isPersist() + ", complejidad: "
				+ 	+ getComplex() + ", lineas de codigo: " + getCodelines() + ", testeos: " + getTestcases() + ", calidad: " + super.calcularCalidad(getComplex(), getCodelines(), getTestcases()) + "]";
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}



	public void setGraph(boolean graph) {
		this.graph = graph;
		
	}



	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		
	}
	
	
	

}
