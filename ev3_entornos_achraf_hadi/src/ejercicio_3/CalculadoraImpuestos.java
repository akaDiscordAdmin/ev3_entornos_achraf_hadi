package ejercicio_3;

public class CalculadoraImpuestos {

	public final static int IMPUESTO_IVA = 0;
	public final static int IMPUESTO_ISR = 1;
	public final static int IMPUESTO_IEPS = 2;
	
	/**
	 * Metodo que calcula los impuestos.
	 * @param ingresos dinero que se quiere calcular
	 * @param tipoImpuesto el tipo de impuesto que se quiere calcular
	 * @return la cantidad del impuesto
	 */
	public double calcularImpuestoTotal(double ingresos, int tipoImpuesto) {

		double impuesto = 0;

		if (tipoImpuesto == IMPUESTO_IVA) {
			impuesto = ImpuestoIVA(ingresos);
		} else if (tipoImpuesto == IMPUESTO_ISR) {
			impuesto = calcularISR(ingresos);
		} else if (tipoImpuesto == IMPUESTO_IEPS) {
			impuesto = ingresos * 0.5;
		} else {
			throw new IllegalArgumentException("Tipo de impuesto no válido: " + tipoImpuesto);
		}
		return impuesto;
	}
}
