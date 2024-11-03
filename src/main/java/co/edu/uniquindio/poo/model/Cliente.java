package co.edu.uniquindio.poo.model;

public class Cliente {

    public String nombre, cedula, correo;

    
    //Costructor de la clase Cliente
    public Cliente(String nombre, String cedula, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
    }

    //Getters y setters de la clase Cliente
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //Método toString
    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", cedula=" + cedula + ", correo=" + correo + "]";
    }

}