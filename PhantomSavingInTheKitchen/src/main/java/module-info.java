module com.example.phantomsavinginthekitchen {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.phantomsavinginthekitchen to javafx.fxml;
    exports com.example.phantomsavinginthekitchen;
}