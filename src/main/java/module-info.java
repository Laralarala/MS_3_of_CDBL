module com.example.ms_3_of_cdbl {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ms_3_of_cdbl to javafx.fxml;
    exports com.example.ms_3_of_cdbl;

    opens SaminaToma to javafx.fxml;
    exports SaminaToma;
}