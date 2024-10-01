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
        App.setRoot("ShoppingListAddElementView");
    }

    @FXML
    public void onDeleteElementButtonClick(ActionEvent actionEvent) throws IOException {
        App.setRoot("ShoppingListRemoveElementView");
    }

    @FXML
    public void onOrderButtonClick(ActionEvent actionEvent) {
        System.out.println("Elemek rendezése");
        ShoppingListView.getItems().clear();

        //rendezés

        App.ShoppingList.sort(String::compareToIgnoreCase);

        for (String element : App.ShoppingList)
        {
            ShoppingListView.getItems().add(element);
        }

        ShoppingListView.refresh();

    }

    public void initialize()
    {
        System.out.println("Példa");

        //String element = App.ShoppingList

        for(String element : App.ShoppingList)
        {
            if(element != null | element.length() > 0)
            {
                ShoppingListView.getItems().add(element);
            }

        }

    }
}
