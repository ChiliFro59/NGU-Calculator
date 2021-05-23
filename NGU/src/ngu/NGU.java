/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngu;


import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

/**
 *
 * @author pekin
 */
public class NGU extends Application
{
    
    @Override
     public void start( Stage stage ) throws Exception
    {
        stage.setTitle("NGU Experiment Calculator");
        //parent pages for each tab
        Parent experimentCalc = FXMLLoader.load(getClass().getResource("/experimentCalc/experimentCalc.fxml"));

        VBox layoutNGU = new VBox();
        HBox buttonLayout = new HBox(2);

        layoutNGU.setId("bodybg");

        //initial page loading
        layoutNGU.getChildren().addAll(experimentCalc);
        layoutNGU.getStylesheets().addAll(this.getClass().getResource("/experimentCalc/experimentCalc.css").
          toExternalForm());
        
        //display main page
        Scene mainPage = new Scene(layoutNGU);


        stage.setResizable(false);
        stage.setScene(mainPage);
        stage.show();

    }

    public static void main( String[] args ) throws IOException
    {        

        launch(args);
    }
    
}
