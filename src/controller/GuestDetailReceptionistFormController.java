package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.Guest;

import java.io.IOException;

public class GuestDetailReceptionistFormController {
    public ImageView GuestDetailContext;
    public TableColumn colName;
    public TableColumn colId;
    public TableColumn colRoomType;
    public TableColumn colCheckIn;
    public TableColumn colCheckOut;
    public JFXTextField txtName;
    public JFXTextField TxtCheckIn;
    public JFXTextField txtRoomType;
    public JFXTextField txtId;
    public JFXTextField TxtCheckOut;
    public JFXButton btnSaveAndUpdate;

    public void backToReceptionistDashBoardForm(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) GuestDetailContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionistDashBoardForm.fxml"))));
    }

   /* public void saveGuestDetail(ActionEvent actionEvent) {
        if (btnSaveAndUpdate.getText().equalsIgnoreCase("Save")) {
            // save
            Guest guest = new Guest(txtId.getText(), txtName.getText(), txtRoomType.getText(), TxtCheckOut.getText(),TxtCheckIn.getText());
            /// txtId.clear();
            if (isExists(Guest)) {
                if (studentList.add(student)) {
                    // alert-> save
                    loadAllStudents();
                    new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();
                } else {
                    //alert -> try again
                    new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
                }
            } else {
                new Alert(Alert.AlertType.WARNING, "Already Exists..", ButtonType.CLOSE).show();
            }
        } else {
            // update
        }

    }*/
}
