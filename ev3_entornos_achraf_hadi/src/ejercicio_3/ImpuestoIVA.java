package ejercicio_3;

public class ImpuestoIVA extends Impuesto {
	
	/**
	 * Metodo que calcula el IVA
	 */
	public double calcular(double ingresos) {
		if (ingresos < 10000) {
			return ingresos * 0.10;
		} else if (ingresos >= 10000 && ingresos < 50000) {
			return ingresos * 0.15;
		} else {
			return ingresos * 0.20;
		}
	}
	
}
