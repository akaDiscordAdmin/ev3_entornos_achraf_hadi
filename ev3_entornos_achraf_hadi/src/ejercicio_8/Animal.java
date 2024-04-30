package ejercicio_8;

	public class Animal implements Sonido {
		private String tipo;
	
		public Animal(String tipo) {
			this.tipo = tipo;
		}
		
		/*
		 * El switch que segun el tipo de animal devuelve uno u otro sonido
		 */
		public String hacerSonido() {
			switch (tipo) {
			case "Perro":
				return "Guau!";
			case "Gato":
				return "Miau!";
			case "Pajaro":
				return "Pío!";
			default:
				return "Sonido desconocido";
			}
		}
	}
