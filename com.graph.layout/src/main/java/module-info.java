module com.graph.algorithms {

    requires javafx.controls;
    requires javafx.fxml;
    requires antlr4.runtime;
    opens com.graph.layout to javafx.fxml;
    exports com.graph.layout;

}
