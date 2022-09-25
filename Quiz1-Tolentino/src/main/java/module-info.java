module com.example.quiz1tolentino {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.quiz1tolentino to javafx.fxml;
    exports com.example.quiz1tolentino;
}