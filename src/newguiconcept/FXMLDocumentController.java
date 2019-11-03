/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newguiconcept;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Tanner
 */
public class FXMLDocumentController implements Initializable {
    players playerOne = new players();
    @FXML
    private Label label;
    @FXML
    private Label foodLabel;
    @FXML
    private Label woodLabel;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!, Lets GO BOIS!");
    }
    
    @FXML
    private void forageButtonAction(ActionEvent event) {
        label.setText("You foraged for wood");
        System.out.println("You Forage for Wood");
        woodLabel.setText("Wood: " + playerOne.forageWood());
    }
    
    @FXML
    private void huntButtonAction(ActionEvent event) {
        label.setText("You trapped food");
        System.out.println("You found Food");
        foodLabel.setText("Food: " + playerOne.huntFood());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

