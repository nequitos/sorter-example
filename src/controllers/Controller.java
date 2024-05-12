
package src.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    private Button btnStart;

    @FXML
    private Button btnStop;

    @FXML
    private Button btnGenerate;

    @FXML
    private Label lblArray;

    @FXML
    private void btnClickEvent(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == btnStart) {
            // Not implemented
        }
        else if (event.getSource() == btnStop) {
            // Not implemented
        }
        else if (event.getSource() == btnGenerate) {
            // Not implemented
        }
    }

    private void clickHandle(String fxml) throws IOException {
        // Not implemented
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
