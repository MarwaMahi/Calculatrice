/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import java.awt.Menu;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author microo
 */
public class CalculatorController implements Initializable {
    
   
    @FXML
    private AnchorPane idAnchor;

    @FXML
    private JFXHamburger idHamb;

    @FXML
    private JFXDrawer idDraw;
    @FXML
    private JFXButton b0;
    @FXML
    private JFXButton b1;
    @FXML
    private JFXButton b2;
    @FXML
    private JFXButton b3;
    @FXML
    private JFXButton b4;
    @FXML
    private JFXButton b5;
    @FXML
    private JFXButton b6;
    @FXML
    private JFXButton b7;
    @FXML
    private JFXButton b8;
    @FXML
    private JFXButton b9;
    @FXML
    private JFXButton bplus;
    @FXML
    private JFXButton bsous;
    @FXML
    private JFXButton bprod;
    @FXML
    private JFXButton bdiv;
    @FXML
    private JFXButton begal;
     @FXML
    private JFXButton bc;
      @FXML
    private JFXButton bp;
  
    @FXML
    private JFXTextField txF;
    calculatorModel m = new calculatorModel();
    
        @FXML
    public void  getB0(ActionEvent event) throws IOException{
        txF.setText(txF.getText()+b0.getText());
    }
    @FXML
    public void  getB1(ActionEvent event) throws IOException{
        txF.setText(txF.getText()+b1.getText());
    }
    @FXML
     public void  getB2(ActionEvent event) throws IOException{
        txF.setText(txF.getText()+b2.getText());
    }
     @FXML
      public void  getB3(ActionEvent event) throws IOException{
        txF.setText(txF.getText()+b3.getText());
    }
           @FXML
    public void  getB4(ActionEvent event) throws IOException{
        txF.setText(txF.getText()+b4.getText());
    }
    @FXML
     public void  getB5(ActionEvent event) throws IOException{
        txF.setText(txF.getText()+b5.getText());
    }
     @FXML
      public void  getB6(ActionEvent event) throws IOException{
        txF.setText(txF.getText()+b6.getText());
    }
           @FXML
    public void  getB7(ActionEvent event) throws IOException{
        txF.setText(txF.getText()+b7.getText());
    }
    @FXML
     public void  getB8(ActionEvent event) throws IOException{
        txF.setText(txF.getText()+b8.getText());
    }
     @FXML
      public void  getB9(ActionEvent event) throws IOException{
        txF.setText(txF.getText()+b9.getText());
    }
        @FXML
      public void  getBplus(ActionEvent event) throws IOException{
        txF.setText(txF.getText()+bplus.getText());
    }
           @FXML
      public void  getBsous(ActionEvent event) throws IOException{
        txF.setText(txF.getText()+bsous.getText());
    }
           @FXML
      public void  getBprod(ActionEvent event) throws IOException{
        txF.setText(txF.getText()+bprod.getText());
    }
              @FXML
      public void  getBdiv(ActionEvent event) throws IOException{
        txF.setText(txF.getText()+bdiv.getText());
    }
                @FXML
      public void  getvergule(ActionEvent event) throws IOException{
        txF.setText(txF.getText()+bp.getText());
    }
                @FXML
      public void supp(ActionEvent event) throws IOException{
          String txt=txF.getText();
        txt=txF.getText().substring(0, txF.getText().length() - 1);
        txF.setText(txt);
    }
                    @FXML
      public void vider(ActionEvent event) throws IOException{
          txF.setText("");
      }  
                @FXML
      public void egal(ActionEvent event) throws IOException{
         Double x=m.eval(txF.getText());
         txF.setText(Double.toString(x));
    }
                    @FXML
      public void carre(ActionEvent event) throws IOException{
          Double x = m.carree(txF.getText());
          txF.setText(Double.toString(x));
    }
                        @FXML
      public void r(ActionEvent event) throws IOException{
           Double x = m.racine(txF.getText());
          txF.setText(Double.toString(x));  
    }
                            @FXML
      public void i(ActionEvent event) throws IOException{
          Double x = m.inverse(txF.getText());
          txF.setText(Double.toString(x));  
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try{
        VBox box = FXMLLoader.load(getClass().getResource("Menu_1.fxml"));
        idDraw.setSidePane(box);
       HamburgerBackArrowBasicTransition burger = new HamburgerBackArrowBasicTransition(idHamb);
       burger.setRate(-1);
       idHamb.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
           @Override
           public void handle(MouseEvent e) {
               burger.setRate( burger.getRate()* -1);
               burger.play();
              
               if(idDraw.isShown()){
                   idDraw.close();
               }else {
                 idDraw.open();  
               }
           }
       });
        } catch (IOException ex) {
            Logger.getLogger(CalculatorController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    
    
}
