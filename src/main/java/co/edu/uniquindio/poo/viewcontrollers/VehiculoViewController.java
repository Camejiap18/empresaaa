package co.edu.uniquindio.poo.viewcontrollers;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.Collection;

import co.edu.uniquindio.poo.model.Auto;
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.CajaDeCambios;
import co.edu.uniquindio.poo.model.Empresa;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.controllers.VehiculoController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class VehiculoViewController implements Initializable {

    @FXML
    private TextField matriculaField;

    @FXML
    private TextField marcaField;

    @FXML
    private TextField modeloField;

    @FXML
    private TextField anioFabricacionField;

    @FXML
    private TextField numeroPuertasField;

    @FXML
    private TextField capacidadDeCargaField;

    @FXML
    private ComboBox<CajaDeCambios> cajaDeCambiosComboBox;

    @FXML
    private Button agregarAutoButton;

    @FXML
    private Button actualizarAutoButton;

    @FXML
    private Button eliminarAutoButton;

    @FXML
    private Button agregarCamionetaButton;

    @FXML
    private Button actualizarCamionetaButton;

    @FXML
    private Button eliminarCamionetaButton;

    @FXML
    private Button agregarMotoButton;

    @FXML
    private Button actualizarMotoButton;

    @FXML
    private Button eliminarMotoButton;

    @FXML
    private TableView<Vehiculo> vehiculosTable;

    private VehiculoController vehiculoController;

    public void setEmpresa(Empresa empresa) {
        this.vehiculoController = new VehiculoController(empresa);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        agregarAutoButton.setOnMouseClicked(event -> agregarAuto());
        actualizarAutoButton.setOnMouseClicked(event -> actualizarAuto());
        eliminarAutoButton.setOnMouseClicked(event -> eliminarAuto());

        agregarCamionetaButton.setOnMouseClicked(event -> agregarCamioneta());
        actualizarCamionetaButton.setOnMouseClicked(event -> actualizarCamioneta());
        eliminarCamionetaButton.setOnMouseClicked(event -> eliminarCamioneta());

        agregarMotoButton.setOnMouseClicked(event -> agregarMoto());
        actualizarMotoButton.setOnMouseClicked(event -> actualizarMoto());
        eliminarMotoButton.setOnMouseClicked(event -> eliminarMoto());

        cajaDeCambiosComboBox.getItems().addAll(CajaDeCambios.values());
        cargarVehiculos();
    }

    private void agregarAuto() {
        String matricula = matriculaField.getText();
        String marca = marcaField.getText();
        String modelo = modeloField.getText();
        LocalDate anioFabricacion = LocalDate.parse(anioFabricacionField.getText());
        int numeroPuertas = Integer.parseInt(numeroPuertasField.getText());

        Auto auto = new Auto(matricula, marca, modelo, anioFabricacion, numeroPuertas, null);
        vehiculoController.agregarVehiculo(auto);
        cargarVehiculos();
    }

    private void actualizarAuto() {
        // Implementar lógica para actualizar un auto
        cargarVehiculos();
    }

    private void eliminarAuto() {
        String matricula = matriculaField.getText();
        vehiculoController.eliminarVehiculo(matricula);
        cargarVehiculos();
    }

    private void agregarCamioneta() {
        String matricula = matriculaField.getText();
        String marca = marcaField.getText();
        String modelo = modeloField.getText();
        LocalDate anioFabricacion = LocalDate.parse(anioFabricacionField.getText());
        double capacidadDeCarga = Double.parseDouble(capacidadDeCargaField.getText());

        Camioneta camioneta = new Camioneta(matricula, marca, modelo, anioFabricacion, capacidadDeCarga, null);
        vehiculoController.agregarVehiculo(camioneta);
        cargarVehiculos();
    }

    private void actualizarCamioneta() {
        // Implementar lógica para actualizar una camioneta
        cargarVehiculos();
    }

    private void eliminarCamioneta() {
        String matricula = matriculaField.getText();
        vehiculoController.eliminarVehiculo(matricula);
        cargarVehiculos();
    }

    private void agregarMoto() {
        String matricula = matriculaField.getText();
        String marca = marcaField.getText();
        String modelo = modeloField.getText();
        LocalDate anioFabricacion = LocalDate.parse(anioFabricacionField.getText());
        CajaDeCambios cajaDeCambios = cajaDeCambiosComboBox.getValue();

        Moto moto = new Moto(matricula, marca, modelo, anioFabricacion, cajaDeCambios, null);
        vehiculoController.agregarVehiculo(moto);
        cargarVehiculos();
    }

    private void actualizarMoto() {
        // Implementar lógica para actualizar una moto
        cargarVehiculos();
    }

    private void eliminarMoto() {
        String matricula = matriculaField.getText();
        vehiculoController.eliminarVehiculo(matricula);
        cargarVehiculos();
    }

    private void cargarVehiculos() {
        Collection<Vehiculo> vehiculos = vehiculoController.obtenerListaVehiculos();
        vehiculosTable.getItems().setAll(vehiculos);
    }
}
