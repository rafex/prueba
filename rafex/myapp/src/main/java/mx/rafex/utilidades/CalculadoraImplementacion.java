package mx.rafex.utilidades;

public class CalculadoraImplementacion implements Calculadora {

	public int suma(final int valorUno, final int valorDos) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
<<<<<<< HEAD
		int Resultado = valorUno + valorDos;
=======
		// TODO Auto-generated method stub
>>>>>>> c7c8daa16547eb1240ca16b9cca20b72c48f4861
>>>>>>> 09991ea594e3b42f3e391637340f0293c9385231
		return 0;
	}

	public int resta(final int valorUno, final int valorDos) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		return 0;
	}

	public int multiplicacion(final int valorUno, final int valorDos) {
		int Resultado = valorUno * valorDos;
		System.out.println("el Valor de la muliplicacion es" + Resultado);
=======
<<<<<<< HEAD
		// TODO Auto-generated method stub
		return 0;
=======
		int Resultado = valorUno - valorDos;
		return Resultado
>>>>>>> c7c8daa16547eb1240ca16b9cca20b72c48f4861
	}

	public int multiplicacion(final int valorUno, final int valorDos) {
		// TODO Auto-generated method stub
>>>>>>> 09991ea594e3b42f3e391637340f0293c9385231
		return 0;
	}

	public int division(final int valorUno, final int valorDos) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		return 0;
=======
		int Resultado = 0;
		Resultado = valorUno / valorDos;
		return Resultado
>>>>>>> 09991ea594e3b42f3e391637340f0293c9385231
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
<<<<<<< HEAD
		// TODO Auto-generated method stub
		return 0;
=======
		int result;
		result = (int) Math.pow(numero, exponente);
		return result;
>>>>>>> c7c8daa16547eb1240ca16b9cca20b72c48f4861
>>>>>>> 09991ea594e3b42f3e391637340f0293c9385231
	}

	public void enviarSaludo(final String nombre) {
		System.out.println("Un saludos para: " + nombre);
	}

}
