package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminFormController {
    public JFXTextField txtPasswordS;
    public JFXTextField txtUsername;
    public AnchorPane adminFormContext;

    public void openAdminPage(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)adminFormContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminDashBoardForm.fxml "))));
    }


    public void backToSelectForm(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)adminFormContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/SelectForm.fxml"))));
    }
}
