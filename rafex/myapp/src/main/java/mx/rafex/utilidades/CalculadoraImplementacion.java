package mx.rafex.utilidades;

public class CalculadoraImplementacion implements Calculadora {

	public int suma(final int valorUno, final int valorDos) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int resta(final int valorUno, final int valorDos) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		return 0;
=======
		int Resultado = valorUno - valorDos;
		return Resultado;
>>>>>>> f3e0977eba659e606dd0a611ffcda93f551d0f90
	}

	public int multiplicacion(final int valorUno, final int valorDos) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int division(final int valorUno, final int valorDos) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		return 0;
	}

	public int raizCuadrada(final int numero) {

		float resultado = (float) Math.sqrt(9);
		System.out.println("La raiz cuadrada es " + resultado);

		return numero;
	}

	public int potencia(final int numero, final int exponente) {
		// TODO Auto-generated method stub
		return 0;
=======
		int Resultado = 0;
		Resultado = valorUno / valorDos;
		return Resultado;
	}

	public int raizCuadrada(final int numero) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int potencia(final int numero, final int exponente) {
		int result;
		result = (int) Math.pow(numero, exponente);
		return result;
>>>>>>> f3e0977eba659e606dd0a611ffcda93f551d0f90
	}

	public void enviarSaludo(final String nombre) {
		System.out.println("Un saludos para: " + nombre);
	}

}
