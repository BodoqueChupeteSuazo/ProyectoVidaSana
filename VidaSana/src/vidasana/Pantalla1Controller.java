/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidasana;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author esteb
 */
public class Pantalla1Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    public void iniciosesion (){
    try {
           FXMLLoader fxmlLoader = new FXMLLoader();
           fxmlLoader.setLocation(getClass().getResource("pantalla2.fxml"));
           Scene scene = new Scene(fxmlLoader.load(), 600, 400);
           Stage stage = new Stage();
           stage.setTitle("pantalla");
           stage.setScene(scene);
           stage.show();
       } catch (IOException e) {
           Logger logger = Logger.getLogger(getClass().getName());
           logger.log(Level.SEVERE, "Failed to create new Window.", e);
           
       }
    }
     @FXML
    public void crear(){
        try {
           FXMLLoader fxmlLoader = new FXMLLoader();
           fxmlLoader.setLocation(getClass().getResource("pantalla3.fxml"));
           Scene scene = new Scene(fxmlLoader.load(), 600, 400);
           Stage stage = new Stage();
           stage.setTitle("crear");
           stage.setScene(scene);
           stage.show();
       } catch (IOException e) {
           Logger logger = Logger.getLogger(getClass().getName());
           logger.log(Level.SEVERE, "Failed to create new Window.", e);
           
       }
    }
        @FXML
        public void contraseña(){
        try {
           FXMLLoader fxmlLoader = new FXMLLoader();
           fxmlLoader.setLocation(getClass().getResource("pantalla4.fxml"));
           Scene scene = new Scene(fxmlLoader.load(), 600, 400);
           Stage stage = new Stage();
           stage.setTitle("Recuperar Contraseña");
           stage.setScene(scene);
           stage.show();
       } catch (IOException e) {
           Logger logger = Logger.getLogger(getClass().getName());
           logger.log(Level.SEVERE, "Failed to create new Window.", e);
           
       }
                
        
    }
}
