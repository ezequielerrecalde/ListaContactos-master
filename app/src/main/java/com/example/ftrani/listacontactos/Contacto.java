package com.example.ftrani.listacontactos;

/**
 * Created by ftrani on 27/7/17.
 */

public class Contacto {

    private int telefono;
    private String nombre;
    private String apellido;

    public int getTelefono() {
        return telefono;
    }

    public Contacto(int telefono, String nombre, String apellido) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
