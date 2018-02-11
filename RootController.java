import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class RootController implements Initializable {

    @FXML private CheckBox chk1;
    @FXML private CheckBox chk2;
    @FXML private ImageView checkImageView;
    @FXML private ToggleGroup group;
    @FXML private ImageView radioImageView;
    @FXML private Button btnExit;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                Image image = new Image(getClass().getResource(newValue.getUserData().toString()+".jpg").toString());
                radioImageView.setImage(image);
            }
        });

    }
    public void handleChkAction(ActionEvent e) {
        if(chk1.isSelected()) {
            checkImageView.setImage(new Image(
                    getClass().getResource("image1.jpeg").toString()));
        }
        else if(chk2.isSelected()) {
            checkImageView.setImage(new Image(
                    getClass().getResource("image2.jpeg").toString()
            ));
        }
    }
    public void handleBtnExitAction(ActionEvent e) {
        Platform.exit();
    }

}

