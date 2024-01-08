module binarymaplesolution.navalgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens binarymaplesolution.navalgame to javafx.fxml;
    exports binarymaplesolution.navalgame;
}