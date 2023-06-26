package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RoomsAdminFormController {
    public JFXTextField txtRoomNo;
    public JFXTextField txtRoomType;
    public JFXTextField txtRoomAvailability;
    public AnchorPane RoomPackageAdminContext;

    public void AddRoomPackages(ActionEvent actionEvent) {
    }

    public void backToAdminDashBoard(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) RoomPackageAdminContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminDashBoardForm.fxml"))));
    }
}
