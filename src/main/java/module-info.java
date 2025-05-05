module org.example.testpexesostuff {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.testpexesostuff to javafx.fxml;
    exports org.example.testpexesostuff;
}