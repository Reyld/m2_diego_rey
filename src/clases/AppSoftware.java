package clases;



public abstract class AppSoftware {
	
	
	// Atributos
	private String programmlang = ""; 			// Lenguaje de programación
	private boolean persist = false;			// ¿Se almacena información?
	private double complex = 0.00;				// Complejidad
	private int codelines;						// Nº líneas de código
	private int testcases;						// Nº casos de test
	
	
	
	/*
	
		// Constructores
		public AppSoftware() {
			
		}
	
		public AppSoftware(String programmlang, boolean persist, double complex, int codelines, int testcases) {
			// super();
			this.programmlang = programmlang;
			this.persist = persist;
			this.complex = complex;
			this.codelines = codelines;
			this.testcases = testcases;
		}
		*/
	
		// Get Set
		public String getProgrammlang() {
			return programmlang;
		}


		public void setProgrammlang(String programmlang) {
			this.programmlang = programmlang;
		}


		public boolean isPersist() {
			return persist;
		}


		public void setPersist(boolean persist) {
			this.persist = persist;
		}


		public double getComplex() {
			return complex;
		}


		public void setComplex(double complex) {
			this.complex = complex;
		}


		public int getCodelines() {
			return codelines;
		}


		public void setCodelines(int codelines) {
			this.codelines = codelines;
		}


		public int getTestcases() {
			return testcases;
		}


		public void setTestcases(int testcases) {
			this.testcases = testcases;
		}

		
		// Metodos
		// Mediante una serie de calculos que envuelven la complejidad, las líneas de código y los tests, tendremos una aproximación de la calidad
		
		
		double calcularCalidad (double complex, int codelines, int testcases) {
		
			this.complex = complex;
			this.codelines = codelines;
			this.testcases = testcases;

			double quality = 100.00;
					
			// Variable que disminuirá en función del código en sí. Nos dará la calidad.
			if (complex > 10 && complex < 21) {
				quality -= 10.00;
			}
			else if (complex > 20 && complex < 50) {
				quality -= 30.00;
			}
			else if(complex >= 50) {
				quality -= 50.00;
			}
			else {}
			if(codelines > 50000 && testcases < 3000) {
				quality -= 20.00;
			}
			
			// System.out.println(quality);
			return quality;
		}
		
		
		// Stack tecnologico
		abstract String technostack();


		@Override
		public String toString() {
			return "AppSoftware [programmlang=" + programmlang + ", persist=" + persist + ", complex=" + complex
					+ ", codelines=" + codelines + ", testcases=" + testcases + "]";
		}
		
}
