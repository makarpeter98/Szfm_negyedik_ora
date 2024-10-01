package inf.unideb.szfm.makar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class ShoppingListRemoveElementController {
    @FXML
    public void onDeleteElementButtonClick(ActionEvent actionEvent) {

    }
    @FXML
    public void onShowListViewButtonClick(ActionEvent actionEvent) throws IOException {
        App.setRoot("ShoppingListView");
    }
}
