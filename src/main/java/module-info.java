module com.example.dailycoding {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dailycoding to javafx.fxml;
    exports com.example.dailycoding;
}