package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import java.io.IOException;

/**
 * Ovladac sceny CreateAccount.fxml - koukni do tohodle souboru, je to svazany
 * na 8. radku argumentem "fx:controller="sample.CreateAccount"
 *
 *
 */

public class CreateAccount {

    @FXML
    private TextField first_name;  // Stejny jmeno jak ID v CreateAccount.fxml!!!! (a taky stejnej typ-TextField
    @FXML
    private TextField second_name;
    @FXML
    private TextField rc;
    @FXML
    private TextField idNum;
    @FXML
    private CheckBox checkBox;
    @FXML
    private TextField debt;
    @FXML
    private TextField percentage;

    @FXML
    private Button backButton;


    /**
     * Navigacni metoda, pouziva SceneSwitcher, je svazana na Go Back tlacitko
     * koukni do CreateAccount.fxml
     * najdi Button s id "backButton" a uvidis ze vola metodu "goBack"
     */
    public void goBack(ActionEvent event) throws IOException {
        System.out.println("clicked show");
        SceneSwitcher ss = new SceneSwitcher();
        ss.switchScene(event, "Dashboard");
    }

    /**
     * Cucne data z datovych Fieldu (first_name, second_name, ...)
     * Pokud je zaskrtnutej checkbox (--> radek 64 if checkBox.isSelected) tak ulozi i uver
     * Pouziva CLassu "FileAppender" pro vic info koukni tam
     * Nakonec vola "goBack"
     */
    public void saveAccount(ActionEvent event) throws IOException {
        int id = 1;
        // TODO: id generator
        if (!first_name.getText().equals("")
                && !second_name.getText().equals("")
                && !rc.getText().equals("")
                && !idNum.getText().equals("")) {

            if (checkBox.isSelected()) {

                FileAppender.append("Jméno:           " + first_name.getText() + "\n" +
                                    "Příjmění:        " + second_name.getText() + "\n" +
                                    "Rodné Číslo:  " + rc.getText() + "\n" +
                                    "Číslo OP:        " + idNum.getText() + "\n" +
                                    "Výše Úvěru:   " + debt.getText()+"\n"+
                                    "RPSN:             " + percentage.getText() + "\n\n");
            } else {
                FileAppender.append("Jméno:           " + first_name.getText() + "\n" +
                        "Příjmění:        " + second_name.getText() + "\n" +
                        "Rodné Číslo:  " + rc.getText() + "\n" +
                        "Číslo OP:        " + idNum.getText() + "\n" +
                        "Výše Úvěru:   " + "-"+"\n"+
                        "RPSN:             " + "-" + "\n\n");

            }
        }
        goBack(event);
    }
}
