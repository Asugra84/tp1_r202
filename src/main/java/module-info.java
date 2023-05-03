module com.example.tp1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.tp1 to javafx.fxml;
    exports com.example.tp1;
}