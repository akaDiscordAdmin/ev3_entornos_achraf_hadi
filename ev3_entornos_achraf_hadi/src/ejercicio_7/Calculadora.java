package ejercicio_7;

/**
 * La clase Calculadora con los metodos con sus atributos renombrados
 */
public class Calculadora {
	
    public int sumar(int sumando1, int sumando2) {
        return sumando1 + sumando2;
    }

    public int restar(int minuendo, int sustraendo) {
        return minuendo - sustraendo;
    }

    public int multiplicar(int multiplicando, int multiplicador) {
        return multiplicando * multiplicador;
    }

    public int dividir(int dividendo, int divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception ("Error: No se puede dividir por cero."); 
        }
        return dividendo / divisor;
    }

    public double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
    
    public double calcularVolumenCilindro(double radio, double altura) {
        return calcularAreaCirculo(radio) * altura;
    }
}
