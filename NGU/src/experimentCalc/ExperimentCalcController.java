/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experimentCalc;


import java.net.URL;

import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author pekin
 */
public class ExperimentCalcController implements Initializable
{
    @FXML
    private Button btnReset;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnCalc;
    @FXML
    private TextField txtUnobtainium;
    @FXML
    private TextField txtPhleb;
    @FXML
    private TextField txtQuantum;
    @FXML
    private TextField txtIDK;
    @FXML
    private TextField txtSurprise;
    @FXML
    private TextField txtScienceHour;
    @FXML
    private TextField txtScienceCost;
    @FXML
    private TextField txtElementium;
    @FXML
    private TextField txtElementiumHour;
    private int unobtainium;
    private int phleb;
    private int quantum;
    private int IDK;
    private int surprise;
    private int addTotal;
    private double scienceHour;
    private double scienceCost;
    private int elementiumHour;
    private int elementium;
    private double totalTime;
    @FXML
    private TextField txtTotalTime;
    @FXML
    private TextField txtScienceHourOne;
    @FXML
    private TextField txtElementiumSix;
    @FXML
    private TextField txtElementiumFive;
    @FXML
    private TextField txtElementiumFour;
    @FXML
    private TextField txtElementiumThree;
    @FXML
    private TextField txtElementiumTwo;
    @FXML
    private TextField txtElementiumOne;
    @FXML
    private TextField txtScienceHourSix;
    @FXML
    private TextField txtScienceHourFive;
    @FXML
    private TextField txtScienceHourFour;
    @FXML
    private TextField txtScienceHourThree;
    @FXML
    private TextField txtScienceHourTwo;
    private int history = 0;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize( URL url, ResourceBundle rb )
    {

    }

    @FXML
    private void HandleReset()
    {
        txtUnobtainium.setText("0");
        txtPhleb.setText("0");
        txtQuantum.setText("0");
        txtIDK.setText("0");
        txtSurprise.setText("0");
    }

    @FXML
    private void HandleCalculate()
    {
        boolean cleared = true;
        try
        {
            scienceHour = Double.parseDouble(txtScienceHour.getText());
        }
        catch ( java.lang.NumberFormatException e )
        {
            txtScienceHour.setText("Error");
            cleared = false;
        }
        try
        {
            scienceCost = Double.parseDouble(txtScienceCost.getText());
        }
        catch ( java.lang.NumberFormatException e )
        {
            txtScienceCost.setText("Error");
            cleared = false;
        }
        try
        {
            elementium = Integer.parseInt(txtElementium.getText());
        }
        catch ( java.lang.NumberFormatException e )
        {
            txtElementium.setText("Error");
            cleared = false;
        }

        if ( cleared )
        {
            elementiumHour = ( int ) ( elementium / ( scienceCost / scienceHour ) );
            txtElementiumHour.setText(String.valueOf(elementiumHour));
            totalTime = ( scienceCost / scienceHour );
            txtTotalTime.setText(String.valueOf(String.format("%.3g%n", totalTime)));
            SetHistory();
        }

    }

    private void SetHistory()
    {
        switch ( history )
        {
            case 0:
                txtScienceHourOne.setText(txtScienceCost.getText());
                txtElementiumOne.setText(String.valueOf(elementiumHour));
                history++;
                break;
            case 1:
                txtScienceHourTwo.setText(txtScienceCost.getText());
                txtElementiumTwo.setText(String.valueOf(elementiumHour));
                history++;
                break;
            case 2:
                txtScienceHourThree.setText(txtScienceCost.getText());
                txtElementiumThree.setText(String.valueOf(elementiumHour));
                history++;
                break;
            case 3:
                txtScienceHourFour.setText(txtScienceCost.getText());
                txtElementiumFour.setText(String.valueOf(elementiumHour));
                history++;
                break;
            case 4:
                txtScienceHourFive.setText(txtScienceCost.getText());
                txtElementiumFive.setText(String.valueOf(elementiumHour));
                history++;
                break;
            case 5:
                txtScienceHourSix.setText(txtScienceCost.getText());
                txtElementiumSix.setText(String.valueOf(elementiumHour));
                history = 0;
                break;
        }
    }

    @FXML
    private void HandleAdd()
    {
        boolean cleared = true;
        try
        {
            unobtainium = Integer.parseInt(txtUnobtainium.getText());
        }
        catch ( java.lang.NumberFormatException e )
        {
            txtUnobtainium.setText("Error");
            cleared = false;
        }
        try
        {
            phleb = Integer.parseInt(txtPhleb.getText());
        }
        catch ( java.lang.NumberFormatException e )
        {
            txtPhleb.setText("Error");
            cleared = false;
        }
        try
        {
            quantum = Integer.parseInt(txtQuantum.getText());
        }
        catch ( java.lang.NumberFormatException e )
        {
            txtQuantum.setText("Error");
            cleared = false;
        }
        try
        {
            IDK = Integer.parseInt(txtIDK.getText());
        }
        catch ( java.lang.NumberFormatException e )
        {
            txtIDK.setText("Error");
            cleared = false;
        }
        try
        {
            surprise = Integer.parseInt(txtSurprise.getText());
        }
        catch ( java.lang.NumberFormatException e )
        {
            txtSurprise.setText("Error");
            cleared = false;
        }

        if ( cleared )
        {
            addTotal = unobtainium + phleb + quantum + IDK + surprise;
            txtElementium.setText(String.valueOf(addTotal));
        }

    }

    @FXML
    private void HandleClearHistory( ActionEvent event )
    {
        txtScienceHourOne.setText("");
        txtScienceHourTwo.setText("");
        txtScienceHourThree.setText("");
        txtScienceHourFour.setText("");
        txtScienceHourFive.setText("");
        txtScienceHourSix.setText("");
        txtElementiumOne.setText("");
        txtElementiumTwo.setText("");
        txtElementiumThree.setText("");
        txtElementiumFour.setText("");
        txtElementiumFive.setText("");
        txtElementiumSix.setText("");
        history = 0;
    }
}
