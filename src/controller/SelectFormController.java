package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class SelectFormController {
    public AnchorPane selectFormContext;

    public void backToDashBoardForm(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) selectFormContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashBoardForm.fxml"))));
    }

    public void openReceptionistForm(ActionEvent actionEvent) throws IOException {
        loadUi("ReceptionistForm");

    }

    public void openAdminForm(ActionEvent actionEvent) throws IOException {
        loadUi("AdminForm");

    }

    void loadUi(String filName) throws IOException {
        URL resource = getClass().getResource("../view/" + filName + ".fxml");
        Parent load = FXMLLoader.load(resource);
        selectFormContext.getChildren().clear();
        selectFormContext.getChildren().add(load);
    }
}
