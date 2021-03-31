package sample;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class ControllerMain {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private ImageView shoe;

    @FXML
    void inMeS(MouseEvent event) throws  IOException {
        FadeTransition ft = new FadeTransition(Duration.millis(250), shoe);
        ft.setFromValue(0.3);
        ft.setToValue(1.0);
        ft.setCycleCount(1);
        ft.play();
    }

    @FXML
    void outMeS(MouseEvent event) throws IOException {
        FadeTransition ft = new FadeTransition(Duration.millis(250), shoe);
        ft.setFromValue(1.0);
        ft.setToValue(0.3);
        ft.setCycleCount(1);
        ft.play();
    }

    @FXML
    void doShoe(MouseEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("SceneShoe.fxml"));
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.getScene().getStylesheets().add("style/styleS.css");
    }

    @FXML
    private ImageView dress;
    @FXML
    void inMeD(MouseEvent event) throws  IOException {
        FadeTransition ft = new FadeTransition(Duration.millis(250), dress);
        ft.setFromValue(0.3);
        ft.setToValue(1.0);
        ft.setCycleCount(1);
        ft.play();
    }

    @FXML
    void outMeD(MouseEvent event) throws IOException {
        FadeTransition ft = new FadeTransition(Duration.millis(250), dress);
        ft.setFromValue(1.0);
        ft.setToValue(0.3);
        ft.setCycleCount(1);
        ft.play();
    }


    @FXML
    void doDress(MouseEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("SceneShirt.fxml"));
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.getScene().getStylesheets().add("style/styleShirt.css");
    }

    @FXML
    private ImageView hat;

    @FXML
    void inMeH(MouseEvent event) throws  IOException {
        FadeTransition ft = new FadeTransition(Duration.millis(250), hat);
        ft.setFromValue(0.3);
        ft.setToValue(1.0);
        ft.setCycleCount(1);
        ft.play();
    }

    @FXML
    void outMeH(MouseEvent event) throws IOException {
        FadeTransition ft = new FadeTransition(Duration.millis(250), hat);
        ft.setFromValue(1.0);
        ft.setToValue(0.3);
        ft.setCycleCount(1);
        ft.play();
    }

    @FXML
    void doHat(MouseEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("SceneHat.fxml"));
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.getScene().getStylesheets().add("style/styleH.css");
    }

    @FXML
    private Text bwc;

    @FXML
    private Text m5;

    @FXML
    private Text m1;

    @FXML
    private Text m2;

    @FXML
    private Text m3;

    @FXML
    private Text m4;



}
