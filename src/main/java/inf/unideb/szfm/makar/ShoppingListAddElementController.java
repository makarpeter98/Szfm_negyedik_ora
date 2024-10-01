package inf.unideb.szfm.makar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ShoppingListAddElementController {
    @FXML
    public TextField AddElementTextField;

    @FXML
    public void onAddElementButtonClick(ActionEvent actionEvent) {
        String inputElement = AddElementTextField.getText();

        if(inputElement != null && inputElement.length() > 0)
        {
            App.ShoppingList.add(inputElement);
        }
        AddElementTextField.setText("");
    }


    @FXML
    public void onShowListButtonClick(ActionEvent actionEvent) throws IOException {
        App.setRoot("ShoppingListView");
    }
}
