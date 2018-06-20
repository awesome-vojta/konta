package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneSwitcher {

    /**
     * Tadle metoda hodne zavisi na strukture projektu
     * Kdyz se dukladne podivas, uvnitr Stringu "page" jde nazev sceny
     * potom pred nej pridame kde se nachazi -> /sample/
     * potom k tomu prilepime nazev sceny    -> /sample/CreateAccount
     * potom pridame priponu sceny .fxml     -> /sample/CreateAccount.fxml
     */
    public void switchScene(ActionEvent event, String page) throws IOException {
        Parent newScene = FXMLLoader.load(getClass().getResource("/sample/" +page+".fxml"));
        Scene scene = new Scene(newScene);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}