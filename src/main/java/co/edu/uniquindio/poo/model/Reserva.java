package co.edu.uniquindio.poo.model;

public class Reserva {
    public double tarifaBase, tarifaAdicional;
    public int numeroDias;
    public String ID;
    
    //Constructor de la clase Reserva
    public Reserva(double tarifaBase, double tarifaAdicional, int numeroDias, String ID) {
        this.tarifaBase = tarifaBase;
        this.tarifaAdicional = tarifaAdicional;
        this.numeroDias = numeroDias;
        this.ID = ID;
    }

    //Getters y setters de la clase Reserva
    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double getTarifaAdicional() {
        return tarifaAdicional;
    }

    public void setTarifaAdicional(double tarifaAdicional) {
        this.tarifaAdicional = tarifaAdicional;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    @Override
    public String toString() {
        return "Reserva [tarifaBase=" + tarifaBase + ", tarifaAdicional=" + tarifaAdicional + ", numeroDias="
                + numeroDias + ", ID=" + ID + "]";
    }

}
