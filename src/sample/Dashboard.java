package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.File;
import java.io.IOException;

public class Dashboard {

    /**
     * Ovladac sceny Dashboard.fxml
     * Uvnitr tohodle ovladace jsou jenom dve metody navazany na dve tlacitka
     * tlacitko "create" (s textem vytvorit) vola metodu "createAccount", ta pouzije SceneSwitcher
     * a presmeruje te na scenu CreateAccount
     * Podobne funguje druhy tlacitko
     */
    @FXML
    private Button create;

    @FXML
    private Button show;

    public void createAccount(ActionEvent event) throws IOException {
        System.out.println("clicked create");
        SceneSwitcher ss = new SceneSwitcher();
        ss.switchScene(event,"CreateAccount");

    }

    public void showAccounts(ActionEvent event) throws IOException {
        System.out.println("clicked show");
        SceneSwitcher ss = new SceneSwitcher();
        ss.switchScene(event,"ShowAccounts");
    }
}
