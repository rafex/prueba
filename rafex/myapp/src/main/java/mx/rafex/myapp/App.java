package mx.rafex.myapp;

import mx.rafex.utilidades.Calculadora;
import mx.rafex.utilidades.CalculadoraImplementacion;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(final String[] args) {

        final Calculadora objetoCalculadora = new CalculadoraImplementacion();

        objetoCalculadora.enviarSaludo("Pedro!!");

    }
}
