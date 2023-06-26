package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class  ReceptionistFormController {
    public JFXTextField txtUsername;
    public JFXTextField txtPassword;
    public AnchorPane ReceptionistFormContext;

    public void openReceptionistPage(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)ReceptionistFormContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionistDashBoardForm.fxml"))));
    }

    public void backToSelectForm(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)ReceptionistFormContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/SelectForm.fxml"))));

    }
}
