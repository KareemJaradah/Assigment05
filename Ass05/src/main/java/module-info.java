module com.example.ass05 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ass05 to javafx.fxml;
    exports com.example.ass05;
}