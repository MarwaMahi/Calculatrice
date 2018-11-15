/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author microo
 */
public class MenuController2 implements Initializable {
   @FXML  
public void calculatorSc (ActionEvent event) throws IOException{
  
      
    Parent root=FXMLLoader.load(getClass().getResource("calculatorSc.fxml"));
             Scene scene = new Scene(root);
             Stage stage =  (Stage)((Node)event.getSource()).getScene().getWindow();
             stage.setScene(scene);
         
             stage.show();
  } 

   @FXML  
public void calculatorSt (ActionEvent event) throws IOException{
  
      
    Parent root=FXMLLoader.load(getClass().getResource("calculatorSt.fxml"));
             Scene scene = new Scene(root);
             Stage stage =  (Stage)((Node)event.getSource()).getScene().getWindow();
             stage.setScene(scene);
         
             stage.show();
  }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
