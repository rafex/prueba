package mx.rafex.utilidades;

public interface Calculadora {

    int suma(int valorUno, int valorDos);

    int resta(int valorUno, int valorDos);

    int multiplicacion(int valorUno, int valorDos);

    int division(int valorUno, int valorDos);

    int raizCuadrada(int numero);

    int potencia(int numero, int exponente);

    void enviarSaludo(String nombre);

}
