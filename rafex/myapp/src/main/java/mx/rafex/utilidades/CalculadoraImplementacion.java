package mx.rafex.utilidades;

public class CalculadoraImplementacion implements Calculadora {

	public int suma(final int valorUno, final int valorDos) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int resta(final int valorUno, final int valorDos) {
		int Resultado = valorUno - valorDos;
		return Resultado;
	}

	public int multiplicacion(final int valorUno, final int valorDos) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int division(final int valorUno, final int valorDos) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int raizCuadrada(final int numero) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int potencia(final int numero, final int exponente) {
		int result;
		result = (int) Math.pow(numero, exponente);
		return result;
	}

	public void enviarSaludo(final String nombre) {
		System.out.println("Un saludos para: " + nombre);
	}

}
