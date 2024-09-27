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
    private Label lblSample;

    @FXML
    private TextField txtSample;

    public void btnSampleOnAction(ActionEvent actionEvent) {
        String text = txtSample.getText();

        System.out.println(text);
        System.out.println("clicked !");

        lblSample.setText(text);
    }
}
