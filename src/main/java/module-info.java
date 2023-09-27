module es.ieslosmontecillos.colorfulcircles {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.colorfulcircles to javafx.fxml;
    exports es.ieslosmontecillos.colorfulcircles;
}