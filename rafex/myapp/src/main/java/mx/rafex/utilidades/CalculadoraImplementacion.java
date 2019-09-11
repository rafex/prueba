package mx.rafex.utilidades;

public class CalculadoraImplementacion implements Calculadora {

	public int suma(final int valorUno, final int valorDos) {
<<<<<<< HEAD
		int resultado = valorUno + valorDos;
=======
		// TODO Auto-generated method stub
>>>>>>> c7c8daa16547eb1240ca16b9cca20b72c48f4861
		return 0;
	}

	public int resta(final int valorUno, final int valorDos) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		return 0;
=======
		int Resultado = valorUno - valorDos;
		return Resultado;
<<<<<<< HEAD
>>>>>>> f3e0977eba659e606dd0a611ffcda93f551d0f90
=======
>>>>>>> c7c8daa16547eb1240ca16b9cca20b72c48f4861
>>>>>>> 09991ea594e3b42f3e391637340f0293c9385231
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
<<<<<<< HEAD
		// TODO Auto-generated method stub
		return 0;
=======
		int result;
		result = (int) Math.pow(numero, exponente);
		return result;
<<<<<<< HEAD
>>>>>>> f3e0977eba659e606dd0a611ffcda93f551d0f90
=======
>>>>>>> c7c8daa16547eb1240ca16b9cca20b72c48f4861
>>>>>>> 09991ea594e3b42f3e391637340f0293c9385231
	}

	public void enviarSaludo(final String nombre) {
		System.out.println("Un saludos para: " + nombre);
	}

}
