package binarymaplesolution.navalgame;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LobbyController implements Initializable {
    @FXML AnchorPane rootPane ;
    @FXML ImageView imageView ;
    @FXML ImageView french ;
    @FXML ImageView english ;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    @FXML protected void setFrenchDoClick() {
        ColorAdjust colorAdjust = new ColorAdjust() ;
        colorAdjust.setSaturation(-1.0);
        french.setEffect(colorAdjust) ;
        ColorAdjust next = new ColorAdjust() ;
        next.setSaturation(0);
        english.setEffect(next) ;
    }
    @FXML protected void setEnglishDoClick() {
        ColorAdjust colorAdjust = new ColorAdjust() ;
        colorAdjust.setSaturation(-1.0);
        english.setEffect(colorAdjust) ;
        ColorAdjust next = new ColorAdjust() ;
        next.setSaturation(0);
        french.setEffect(next) ;
    }
}