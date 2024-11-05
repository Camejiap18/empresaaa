package co.edu.uniquindio.poo.model;
import java.time.LocalDate;

public class Auto extends Vehiculo{

    public int numeroPuertas;
    public Reserva reserva;


    //Constructor de la clase Auto
    public Auto(String matricula, String marca, String modelo, LocalDate anioFabricion, int numeroPuertas, Reserva reserva){
        super(matricula, marca, modelo, anioFabricion);
        this.numeroPuertas = numeroPuertas;
        this.reserva = reserva;
    }

    //Getters y setters de la clase Auto
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    //Método toString
    @Override
    public String toString() {
        return "Auto [numeroPuertas=" + numeroPuertas + ", reserva=" + reserva + "]";
    }

}