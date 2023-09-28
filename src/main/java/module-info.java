module com.alura.converter {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.alura.converter to javafx.fxml;
    exports com.alura.converter;
}
