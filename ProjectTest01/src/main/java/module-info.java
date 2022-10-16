module com.mycompany.projecttest01 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.projecttest01 to javafx.fxml;
    exports com.mycompany.projecttest01;
}
