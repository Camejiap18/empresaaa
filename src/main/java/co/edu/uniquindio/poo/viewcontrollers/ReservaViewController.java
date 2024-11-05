package co.edu.uniquindio.poo.viewcontrollers;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.Collection;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empresa;
import co.edu.uniquindio.poo.model.Reserva;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.controllers.ReservaController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class ReservaViewController implements Initializable {

    @FXML
    private TextArea idReservaTextArea;

    @FXML
    private TextArea cantidadDiasTextArea;

    @FXML
    private Button agregarButton;

    @FXML
    private Button actualizarButton;

    @FXML
    private Button eliminarButton;

    @FXML
    private TableView<Reserva> reservasTable;

    @FXML
    private Label statusLabel;

    private ReservaController reservaController;

    public void setEmpresa(Empresa empresa) {
        this.reservaController = new ReservaController(empresa);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        agregarButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> agregarReserva());
        actualizarButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> actualizarReserva());
        eliminarButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> eliminarReserva());
        cargarReservas();
    }

    private void agregarReserva() {
        String idReserva = idReservaTextArea.getText();
        int cantidadDias = Integer.parseInt(cantidadDiasTextArea.getText());

        Cliente cliente = obtenerCliente();  // Implementar método para obtener el cliente
        Vehiculo vehiculo = obtenerVehiculo();  // Implementar método para obtener el vehículo

        Reserva reserva = new Reserva(idReserva, cliente, vehiculo, cantidadDias, LocalDate.now(), vehiculo.getClass().getSimpleName());
        String response = reservaController.agregarReserva(reserva);
        statusLabel.setText(response);
        cargarReservas();
    }

    private void actualizarReserva() {
        // Implementar lógica para actualizar una reserva
        cargarReservas();
    }

    private void eliminarReserva() {
        String idReserva = idReservaTextArea.getText();
        String response = reservaController.eliminarReserva(idReserva);
        statusLabel.setText(response);
        cargarReservas();
    }

    private void cargarReservas() {
        Collection<Reserva> reservas = reservaController.obtenerReservas();
        reservasTable.getItems().setAll(reservas);
    }

    private Cliente obtenerCliente() {
        // Implementar lógica para obtener el cliente (por ejemplo, desde un selector en la UI)
        return null;
    }

    private Vehiculo obtenerVehiculo() {
        // Implementar lógica para obtener el vehículo (por ejemplo, desde un selector en la UI)
        return null;
    }
}
