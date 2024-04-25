module base.sweng {
    requires javafx.controls;
    requires javafx.fxml;


    opens base.sweng to javafx.fxml;
    exports base.sweng;
}