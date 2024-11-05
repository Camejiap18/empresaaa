package co.edu.uniquindio.poo.model;

public class Cliente {

    public String usser, ID, mail, password;

    
    //Costructor de la clase Cliente
    public Cliente(String usser, String ID, String mail, String password) {
        this.usser = usser;
        this.ID = ID;
        this.mail = mail;
        this.password = password;
    }

    //Getters y setters
    public String getUsser() {
        return usser;
    }

    public void setUsser(String usser) {
        this.usser = usser;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Método toString
    @Override
    public String toString() {
        return "Cliente [usser=" + usser + ", ID=" + ID + ", mail=" + mail + ", password=" + password + "]";
    }
 
}