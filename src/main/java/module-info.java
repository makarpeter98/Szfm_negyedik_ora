module inf.unideb.szfm.makar {
    requires javafx.controls;
    requires javafx.fxml;

    opens inf.unideb.szfm.makar to javafx.fxml;
    exports inf.unideb.szfm.makar;
}