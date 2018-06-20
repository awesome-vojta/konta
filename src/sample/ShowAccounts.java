package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowAccounts {

    @FXML
    public TextArea textArea;
    @FXML
    public Button backButton;

    /**
     * Pokazdy kdyz JavaFX zmeni okynko, vola metoda initialize
     * Ne vzdycky ji musis pouzit, je ale uzitecna kdyz potrebujes inicializovat, prednastavit
     * Nejakej prvek v uzivatelskym rozhrani
     * Tady je to konkretne to okynko kde se zobrazujou ucty (textArea)
     */
    public void initialize() throws FileNotFoundException {
        textArea.setText(FileScanner.getText()); // Pouzivame FileScanner abychom zjistili obsah souboru
    }

    /**
     * Navigacni metoda
     */
    public void goBack(ActionEvent event) throws IOException {
        System.out.println("clicked show");
        SceneSwitcher ss = new SceneSwitcher();
        ss.switchScene(event, "Dashboard");
    }
}
