package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardFormController {
    public AnchorPane dashBordContext;

    public void openSecondPage(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)dashBordContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/SelectForm.fxml "))));
    }
}
