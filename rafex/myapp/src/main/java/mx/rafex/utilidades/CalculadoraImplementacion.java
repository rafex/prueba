package mx.rafex.utilidades;

public class CalculadoraImplementacion implements Calculadora {

	public int suma(final int valorUno, final int valorDos) {
<<<<<<< HEAD

		// TODO Auto-generated method stub
		int Resultado = valorUno + valorDos;
=======
		// TODO Auto-generated method stub
>>>>>>> ba4fddceed66f56a254d92ab10c9007b449067d4
		return 0;
	}

	public int resta(final int valorUno, final int valorDos) {
		int Resultado = valorUno - valorDos;
<<<<<<< HEAD
		// TODO Auto-generated method stub
		return 0;
=======
		return Resultado;
>>>>>>> ba4fddceed66f56a254d92ab10c9007b449067d4
	}

	public int multiplicacion(final int valorUno, final int valorDos) {
		int Resultado = valorUno * valorDos;
		// TODO Auto-generated method stub
		return 0;

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
<<<<<<< HEAD
		// TODO Auto-generated method stub

		int result;
		result = (int) Math.pow(numero, exponente);
		return 0;

=======
		int result;
		result = (int) Math.pow(numero, exponente);
		return result;
>>>>>>> ba4fddceed66f56a254d92ab10c9007b449067d4
	}

	public void enviarSaludo(final String nombre) {
		System.out.println("Un saludos para: " + nombre);
	}

}
