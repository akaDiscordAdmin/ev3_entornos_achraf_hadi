package ejercicio_3;

public abstract class Impuesto {
	
	/**
	 * Metodo que servirá para calcular los impuestos
	 * @param ingresos el dinero dobre el que se van a calcular
	 * @return el dinero que se ha de pagar
	 */
	public abstract double calcular(double ingresos);
}
