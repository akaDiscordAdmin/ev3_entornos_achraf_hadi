package ejercicio_3;

public class ImpuestoISR extends Impuesto {
	
	/**
	 * Metodo que calcula el ISR
	 */
	public double calcular(double ingresos) {
		if (ingresos < 50000) {
			return ingresos * 0.20;
		} else {
			return ingresos * 0.30;
		}
	}

}
