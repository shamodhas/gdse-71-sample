package lk.ijse.gdse.hellofx.controller;

/**
 * --------------------------------------------
 * Author: R.I.B. Shamodha Sahan Rathnamalala
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 9/27/2024 12:36 PM
 * Project: hellofx
 * --------------------------------------------
 **/


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloFxController {

    @FXML
    private TextField txtSample;

    @FXML
    private Button btnSample;

    @FXML
    private Label lblSample;

    @FXML
    void btnSampleOnAction(ActionEvent event) {
        String text = txtSample.getText();

        System.out.println(text);

        lblSample.setText(text);
    }

}
