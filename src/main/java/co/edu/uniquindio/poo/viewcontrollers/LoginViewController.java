package co.edu.uniquindio.poo.viewcontrollers;

import java.net.URL;
import java.util.ResourceBundle;
import co.edu.uniquindio.poo.controllers.LoginController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empresa;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class LoginViewController implements Initializable {

    @FXML
    private TextArea usserTextArea;

    @FXML
    private TextArea idTextArea;

    @FXML
    private TextArea mailTextArea;

    @FXML
    private TextArea passwordTextArea;

    @FXML
    private Button loginButton;

    @FXML
    private Label statusLabel;

    private LoginController loginController;
    
    public void setEmpresa(Empresa empresa) {
        this.loginController = new LoginController(empresa);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loginButton.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> login());
    }

    private void login() {
        String usser = usserTextArea.getText();
        String id = idTextArea.getText();
        String mail = mailTextArea.getText();
        String password = passwordTextArea.getText();

        Cliente cliente = new Cliente(usser, id, mail, password);
        String response = loginController.agregarCliente(cliente);
        statusLabel.setText(response);
    }
}
