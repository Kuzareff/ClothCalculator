package sample;

import interfaces.ChildAge;
import interfaces.SizaHaad;
import interfaces.SizeHeadCirc;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.io.IOException;

public class ControllerHat implements ChildAge, SizaHaad, SizeHeadCirc {

    Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Ошибка! Введите занчение больше 33 см!", ButtonType.OK);
    Alert alert2 = new Alert(Alert.AlertType.INFORMATION, "Вы ввели слишком большое значение! Данная таблица показывает до 54-56 размера включительно! Пожалуйста, укажите другое занчение!", ButtonType.OK);

    @FXML
    private Button btn;

    @FXML
    void handle(ActionEvent event) throws InterruptedException {
        float i = Float.parseFloat(intext.getText());

        if (i < 33) {
            alert.showAndWait();
        } else if (i < shc3 && i >= shc1) { //1
            year.setText(cah1); ust.setText(sh1);
        } else if (i < shc5 && i >= shc3) { //2
            year.setText(cah2); ust.setText(sh2);
        } else if (i < shc7 && i >= shc5) {//3
            year.setText(cah3); ust.setText(sh3);
        } else if (i < shc9 && i >= shc7) { //4
            year.setText(cah4); ust.setText(sh4);
        } else if (i < shc11 && i >= shc9) {//5
            year.setText(cah5); ust.setText(sh5);
        } else if (i < shc12 && i >= shc11) {//6
            year.setText(cah6); ust.setText(sh6);
        } else if (i < shc15 && i >= shc12) {//7
            year.setText(cah7); ust.setText(sh7);
        } else if (i < shc17 && i >= shc15) {//8
            year.setText(cah8); ust.setText(sh8);
        } else if (i < shc18 && i >= shc17) {//9
            year.setText(cah9); ust.setText(sh9);
        } else if (i <= shc19 && i >= shc18) {//10
            year.setText(cah10); ust.setText(sh10);
        } else if (i > shc19)
            alert2.showAndWait();
    }


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
        ControllerMain mShoe = new ControllerMain();
        mShoe.doShoe(event);
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
        ControllerMain mDress = new ControllerMain();
        mDress.doDress(event);
    }

    @FXML
    private ImageView hat;

    @FXML
    void doHat(MouseEvent event) throws IOException {

    }
    @FXML
    private Text bwc;

    @FXML
    private Text m5;

    @FXML
    private Text m1;

    @FXML
    private TextField intext;

    @FXML
    private Text year;

    @FXML
    private Text ust;

}
