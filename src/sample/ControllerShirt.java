package sample;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.io.IOException;

public class ControllerShirt {

    @FXML
    private ImageView shoe;

    @FXML
    void doShoe(MouseEvent event) throws IOException {
        ControllerMain mShoe = new ControllerMain();
        mShoe.doShoe(event);
    }

    @FXML
    private ImageView dress;

    @FXML
    void doDress(MouseEvent event) throws IOException {

    }

    @FXML
    private ImageView hat;

    @FXML
    void doHat(MouseEvent event) throws IOException {
        ControllerMain controllerMain2 = new ControllerMain();
        controllerMain2.doHat(event);
    }

    @FXML
    private Text hc;

    @FXML
    private Text m5;

    @FXML
    private Text m1;



}

