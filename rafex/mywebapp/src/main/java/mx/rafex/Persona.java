package mx.rafex;

import java.io.Serializable;

public class Persona implements Serializable {

    private static final long serialVersionUID = 7893533112005302192L;

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Integer edad;

    public Persona() {

    }

    public Persona(final String nombre, final String apellidoPaterno, final String apellidoMaterno,
            final Integer edad) {
        super();
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }

    public void setApellidoPaterno(final String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }

    public void setApellidoMaterno(final String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(final Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Personas [nombre=" + this.nombre + ", apellidoPaterno=" + this.apellidoPaterno + ", apellidoMaterno="
                + this.apellidoMaterno + ", edad=" + this.edad + "]";
    }

}
