module com.example.ms_3_of_cdbl {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ms_3_of_cdbl to javafx.fxml;
    exports com.example.ms_3_of_cdbl;

    opens SaminaToma to javafx.fxml;
    exports SaminaToma;

    opens Shawrob to javafx.fxml;
    exports Shawrob;

    opens MarsiadRahman to javafx.fxml;
    exports MarsiadRahman;

    opens RafadinIslam_2111525 to javafx.fxml;
    exports RafadinIslam_2111525;
}