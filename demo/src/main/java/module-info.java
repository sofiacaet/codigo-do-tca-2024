module com.sofieana {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.sofieana to javafx.fxml;
    exports com.sofieana;
}
