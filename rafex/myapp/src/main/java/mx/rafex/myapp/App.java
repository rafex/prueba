package mx.rafex.myapp;

import org.apache.commons.lang3.ArrayUtils;

import mx.rafex.utilidades.Calculadora;
import mx.rafex.utilidades.CalculadoraImplementacion;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(final String[] args) {

        if (ArrayUtils.isEmpty(args)) {
            System.out.println("Adios, no tengo argumentos...");
            System.exit(0);
        }

        final Calculadora objetoCalculadora = new CalculadoraImplementacion();

        int numeroUno, numeroDos;

        numeroUno = Integer.parseInt(args[0]);
        numeroDos = Integer.parseInt(args[1]);

        final String nombre = args[2];

        int resultado = objetoCalculadora.suma(numeroUno, numeroDos);

        System.out.println("El resultado de la suma es: " + resultado);

        resultado = objetoCalculadora.division(numeroUno, numeroDos);

        System.out.println("El resultado de la division es: " + resultado);

        resultado = objetoCalculadora.potencia(numeroUno, numeroDos);

        System.out.println("El resultado de la potencia es: " + resultado);

        resultado = objetoCalculadora.resta(numeroUno, numeroDos);

        System.out.println("El resultado de la resta es: " + resultado);

        resultado = objetoCalculadora.raizCuadrada(numeroUno);

        System.out.println("El resultado de la raiz cuadrada es: " + resultado);

        objetoCalculadora.enviarSaludo(nombre);

    }
}
