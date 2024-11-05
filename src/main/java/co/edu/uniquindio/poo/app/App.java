package co.edu.uniquindio.poo.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.time.LocalDate;

import co.edu.uniquindio.poo.viewcontrollers.LoginViewController;
import co.edu.uniquindio.poo.viewcontrollers.ReservaViewController;
import co.edu.uniquindio.poo.viewcontrollers.VehiculoViewController;
import co.edu.uniquindio.poo.model.Auto;
import co.edu.uniquindio.poo.model.CajaDeCambios;
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empresa;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.Reserva;

public class App extends Application {

    private Stage primaryStage;
    private Empresa empresa = new Empresa("Alquileres Don Luis", "123456789");

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Página Principal");
        inicializarData();
        openLoginView();
    }

    public void openLoginView() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/uniquindio/poo/view/Login.fxml"));
            javafx.scene.layout.AnchorPane rootLayout = loader.load();
            LoginViewController controller = loader.getController();
            controller.setEmpresa(empresa);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openReservaView() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/uniquindio/poo/view/Reserva.fxml"));
            javafx.scene.layout.AnchorPane rootLayout = loader.load();
            ReservaViewController controller = loader.getController();
            controller.setEmpresa(empresa);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openVehiculoView() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/uniquindio/poo/view/Vehiculo.fxml"));
            javafx.scene.layout.AnchorPane rootLayout = loader.load();
            VehiculoViewController controller = loader.getController();
            controller.setEmpresa(empresa);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void inicializarData() {
        Cliente cliente1 = new Cliente("Paco", "1234", "pacoantonio@gmail.com", "32156");
        empresa.agregarCliente(cliente1);

        Moto moto1 = new Moto("3UJADNWJ", "Honda", "Odyssey", LocalDate.of(2024, 1, 1), CajaDeCambios.MANUAL, null);
        empresa.agregarVehiculo(moto1);

        Reserva reserva1 = new Reserva("001", cliente1, moto1, 13, LocalDate.now(), "Moto");
        empresa.agregarReserva(reserva1);

        Cliente cliente2 = new Cliente("Pedro", "54658", "pedritogamer@yahoo.com", "3215654564");
        empresa.agregarCliente(cliente2);

        Auto auto1 = new Auto("5465AWDA", "Renault", "Logan", LocalDate.of(2022, 1, 1), 4, null);
        empresa.agregarVehiculo(auto1);

        Camioneta camioneta1 = new Camioneta("EKDNAKW54", "Tesla", "Cybertruck", LocalDate.of(2023, 1, 1), 15, null);
        empresa.agregarVehiculo(camioneta1);

        Reserva reserva2 = new Reserva("002", cliente2, camioneta1, 6, LocalDate.now(), "Camioneta");
        empresa.agregarReserva(reserva2);
    }

    public static void main(String[] args) {
        launch();
    }
}
