package mx.rafex.utilidades;

public class CalculadoraImplementacion implements Calculadora {

	public int suma(final int valorUno, final int valorDos) {
<<<<<<< HEAD

		int Resultado = valorUno + valorDos;
		// TODO Auto-generated method stub

=======
		int Resultado = valorUno + valorDos;
>>>>>>> 3151c12e191d3b0a2538c1caee0884b9b318a16b
		return 0;
	}

	public int resta(final int valorUno, final int valorDos) {
		int Resultado = valorUno - valorDos;
		// TODO Auto-generated method stub
		return 0;

	}

	public int multiplicacion(final int valorUno, final int valorDos) {
		int Resultado = valorUno * valorDos;
		// TODO Auto-generated method stub
		return Resultado;

	}

	public int division(final int valorUno, final int valorDos) {

		// TODO Auto-generated method stub

		int Resultado = valorUno / valorDos;
		return 0;

	}

	public int raizCuadrada(final int numero) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int potencia(final int numero, final int exponente) {

		// TODO Auto-generated method stub

		int result;
		result = (int) Math.pow(numero, exponente);
		return 0;

	}

	public void enviarSaludo(final String nombre) {
		System.out.println("Un saludos para: " + nombre);
	}

}
