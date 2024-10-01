package inf.unideb.szfm.makar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

/**
 * JavaFX App
 */
public class App extends Application {

    public static ArrayList<String> ShoppingList;

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {

        ShoppingList = new ArrayList<String>();
        ShoppingList.add("Alma");
        ShoppingList.add("Banánt");
        ShoppingList.add("Skoda");
        ShoppingList.add("");

        scene = new Scene(loadFXML("ShoppingListView"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}