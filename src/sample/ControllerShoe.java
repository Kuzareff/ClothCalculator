package sample;


import interfaces.*;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import java.io.IOException;
import javafx.util.Duration;



public class ControllerShoe implements SizaHaad, SizeEur, SizeUsa, SizeHeadCirc, ChildAge, LengthOfTheFoot {

    Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Ошибка! Введите занчение больше 5 см!", ButtonType.OK);
    Alert alert2 = new Alert(Alert.AlertType.INFORMATION, "Вы ввели слишком большое значение! Данная таблица показывает до 35 размера включительно! Пожалуйста, укажите другое занчение!", ButtonType.OK);

    @FXML
    private Button btn;

    @FXML
    void handle(ActionEvent event) throws IOException {

        float i = Float.parseFloat(intext.getText());

        if (i < 5) {
            alert.showAndWait();
        } else if (i < lf1 && i >= 5) {
            year.setText(ca1); ust.setText(su1); eut.setText(se1); euf.setOpacity(100); usf.setOpacity(100);

        } else if (i < lf2 && i >= lf1) {
            year.setText(ca2); ust.setText(su2); eut.setText(se2); euf.setOpacity(100); usf.setOpacity(100);

        } else if (i < lf3 && i >= lf2) {
            year.setText(ca3); ust.setText(su3); eut.setText(se3); euf.setOpacity(100); usf.setOpacity(100);

        } else if (i < lf4 && i >= lf3) {
            year.setText(ca4); ust.setText(su4); eut.setText(se4); euf.setOpacity(100); usf.setOpacity(100);

        } else if (i < lf5 && i >= lf4) {
            year.setText(ca5); ust.setText(su5); eut.setText(se5); euf.setOpacity(100); usf.setOpacity(100);

        } else if (i < lf6 && i >= lf5) {
            year.setText(ca6); ust.setText(su6); eut.setText(se6); euf.setOpacity(100); usf.setOpacity(100);

        } else if (i < lf7 && i >= lf6) {
            year.setText(ca7); ust.setText(su7); eut.setText(se7); euf.setOpacity(100); usf.setOpacity(100);

        } else if (i < lf8 && i >= lf7) {
            year.setText(ca8); ust.setText(su8); eut.setText(se8); euf.setOpacity(100); usf.setOpacity(100);

        } else if (i < lf9 && i >= lf8) {
            year.setText(ca9); ust.setText(su9); eut.setText(se9); euf.setOpacity(100); usf.setOpacity(100);

        } else if (i < lf10 && i >= lf9) {
            year.setText(ca10); ust.setText(su10); eut.setText(se10); euf.setOpacity(100); usf.setOpacity(100);

        } else if (i < lf11 && i >= lf10) {
            year.setText(ca11); ust.setText(su11); eut.setText(se11); euf.setOpacity(100); usf.setOpacity(100);

        } else if (i < lf12 && i >= lf11) {
            year.setText(ca12); ust.setText(su12); eut.setText(se12); euf.setOpacity(100); usf.setOpacity(100);

        } else if (i < lf13 && i >= lf12) {
            year.setText(ca13); ust.setText(su13); eut.setText(se13); euf.setOpacity(100); usf.setOpacity(100);

        } else if (i < lf14 && i >= lf13) {
            year.setText(ca14); ust.setText(su14); eut.setText(se14); euf.setOpacity(100); usf.setOpacity(100);

        } else if (i < lf15 && i >= lf14) {
            year.setText(ca15); ust.setText(su15); eut.setText(se15); euf.setOpacity(100); usf.setOpacity(100);

        } else if (i < lf16 && i >= lf15) {
            year.setText(ca16); ust.setText(su16); eut.setText(se16); euf.setOpacity(100); usf.setOpacity(100);

        } else if (i <= lf17 && i >= lf16) {
            year.setText(ca17); ust.setText(su17); eut.setText(se17); euf.setOpacity(100); usf.setOpacity(100);

        } else if (i >= lf17)
            alert2.showAndWait();

    }

    @FXML
    private ImageView shoe;


    @FXML
    private ImageView dress;


    @FXML
    void inMe(MouseEvent event) throws  IOException {
        FadeTransition ft = new FadeTransition(Duration.millis(250), dress);
        ft.setFromValue(0.3);
        ft.setToValue(1.0);
        ft.setCycleCount(1);
        ft.play();
    }

    @FXML
    void outMe(MouseEvent event) throws IOException {
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
        ControllerMain controllerMain2 = new ControllerMain();
        controllerMain2.doHat(event);
    }

    @FXML
    private ImageView euf;

    @FXML
    private ImageView usf;

    @FXML
    private TextField intext;

    @FXML
    private Text ust;

    @FXML
    private Text eut;

    @FXML
    private Text year;

}
