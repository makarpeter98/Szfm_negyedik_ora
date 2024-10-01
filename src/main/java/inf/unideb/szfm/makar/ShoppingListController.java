package inf.unideb.szfm.makar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.io.IOException;

public class ShoppingListController {

    @FXML
    ListView ShoppingListView;

    @FXML
    public void onAddElementButtonClick(ActionEvent actionEvent) throws IOException {
        App.setRoot("ShoppingListAddELementView");
    }

    @FXML
    public void onDeleteElementButtonClick(ActionEvent actionEvent) {
    }

    @FXML
    public void onOrderButtonClick(ActionEvent actionEvent) {
        System.out.println("Elemek rendezése");
    }

    public void initialize()
    {
        System.out.println("Példa");

        //String element = App.ShoppingList

        for(String element : App.ShoppingList)
        {
            if(element != null)
            {
                ShoppingListView.getItems().add(element);
            }

        }

    }
}
