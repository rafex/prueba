package mx.rafex.utilidades;

public class CalculadoraImplementacion implements Calculadora {

    public int suma(final int valorUno, final int valorDos) {
        final int resultado = valorUno + valorDos;
        return resultado;
    }

    public int resta(final int valorUno, final int valorDos) {
        final int resultado = valorUno - valorDos;
        return resultado;
    }

    public int division(final int valorUno, final int valorDos) {
        int resultado = 0;
        resultado = valorUno / valorDos;
        return resultado;
    }

    public int potencia(final int numero, final int exponente) {
        int resultado;
        resultado = (int) Math.pow(numero, exponente);
        return resultado;
    }

    public int multiplicacion(final int valorUno, final int valorDos) {
        final int resultado = valorUno * valorDos;
        return resultado;
    }

    public int raizCuadrada(final int numero) {

        final int resultado = (int) Math.sqrt(numero);
        return resultado;
    }

    public void enviarSaludo(final String nombre) {
        System.out.println("Un saludos para: " + nombre);
    }
}
