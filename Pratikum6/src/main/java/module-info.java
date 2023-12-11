module com.example.pratikum6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pratikum6 to javafx.fxml;
    exports com.example.pratikum6;
}