module co.edu.uniquindio.poo {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.poo.controllers to javafx.fxml;
    opens co.edu.uniquindio.poo.viewcontrollers to javafx.fxml;
    opens co.edu.uniquindio.poo.model to javafx.fxml;

    exports co.edu.uniquindio.poo.controllers;
    exports co.edu.uniquindio.poo.viewcontrollers;
    exports co.edu.uniquindio.poo.model;
}
