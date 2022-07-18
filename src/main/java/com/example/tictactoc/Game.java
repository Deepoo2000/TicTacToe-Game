package com.example.tictactoc;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
public class Game {
    @FXML
    private Button Button1;

    @FXML
    private Button Button2;

    @FXML
    private Button Button3;

    @FXML
    private Button Button4;

    @FXML
    private Button Button5;

    @FXML
    private Button Button6;

    @FXML
    private Button Button7;

    @FXML
    private Button Button8;

    @FXML
    private Button Button9;
    @FXML
    private Label Lone;

    @FXML
    private Label Ltwo;

    private static int TurnOn = 0;
    private static Boolean one = true,two=true,three=true,four=true,five=true;
    private static Boolean six = true, seven=true,eight=true,nine=true;
    @FXML
    public void ButtonOne(ActionEvent event ) {
          if(one){
              if(TurnOn % 2 == 0){
                  Button1.setText("X");
              }
              else {
                  Button1.setText("O");
              }
              TurnOn++;
              Check();
              one = false;
          }
    }

    @FXML
    public void ButtonTwo(ActionEvent event) {
        if(two){
            if(TurnOn % 2 == 0){
                Button2.setText("X");
            }
            else {
                Button2.setText("O");
            }
            TurnOn++;
            Check();
            two = false;
        }
    }

    @FXML
    public void ButtonThree(ActionEvent event) {
        if(three){
            if(TurnOn % 2 == 0){
                Button3.setText("X");
            }
            else {
                Button3.setText("O");
            }
            TurnOn++;
            Check();
            three =false;
        }
    }

    @FXML
    public void ButtonFour(ActionEvent event) {
        if(four){
            if(TurnOn % 2 == 0){
                Button4.setText("X");
            }
            else {
                Button4.setText("O");
            }
            TurnOn++;
            Check();
            four = false;
        }
    }

    @FXML
    public void ButtonFive(ActionEvent event) {
        if(five){
            if(TurnOn % 2 == 0){
                Button5.setText("X");
            }
            else {
                Button5.setText("O");
            }
            TurnOn++;
            Check();
            five = false;
        }
    }

    @FXML
    public void ButtonSix(ActionEvent event) {
        if(six){
            if(TurnOn % 2 == 0){
                Button6.setText("X");
            }
            else {
                Button6.setText("O");
            }
            TurnOn++;
            Check();
            six = false;
        }
    }

    @FXML
    public void ButtonSeven(ActionEvent event) {
        if(seven){
            if(TurnOn % 2 == 0){
                Button7.setText("X");
            }
            else {
                Button7.setText("O");
            }
            TurnOn++;
            Check();
            seven = false;
        }
    }

    @FXML
    public void ButtonEight(ActionEvent event) {
        if(eight){
            if(TurnOn % 2 == 0){
                Button8.setText("X");
            }
            else {
                Button8.setText("O");
            }
            TurnOn++;
            Check();
            eight = false;
        }
    }

    @FXML
    public void ButtonNine(ActionEvent event) {
        if(nine){
            if(TurnOn % 2 == 0){
                Button9.setText("X");
            }
            else {
                Button9.setText("O");
            }
            TurnOn++;
            Check();
            nine = false;
        }
    }


    public void setLabelText(String text1, String text2) {
        Lone.setText(text1);
        Ltwo.setText(text2);

    }


    public void Check() {
        //O
        if (Button1.getText() == "O" && Button2.getText() == "O" && Button3.getText() == "O") {
              Winner("O");
        }
        if (Button4.getText() == "O" && Button5.getText() == "O" && Button6.getText() == "O") {
            Winner("O");
        }
        if (Button7.getText() == "O" && Button8.getText() == "O" && Button9.getText() == "O") {
            Winner("O");
        }
        if (Button1.getText() == "O" && Button4.getText() == "O" && Button7.getText() == "O") {
            Winner("O");
        }
        if (Button2.getText() == "O" && Button5.getText() == "O" && Button8.getText() == "O") {
            Winner("O");
        }
        if (Button3.getText() == "O" && Button6.getText() == "O" && Button9.getText() == "O") {
            Winner("O");
        }
        if (Button1.getText() == "O" && Button5.getText() == "O" && Button9.getText() == "O") {
            Winner("O");
        }
        if (Button3.getText() == "O" && Button5.getText() == "O" && Button7.getText() == "O") {
            Winner("O");
        }
        //X
        if (Button1.getText() == "X" && Button2.getText() == "X" && Button3.getText() == "X") {
            Winner("X");
        }
        if (Button4.getText() == "X" && Button5.getText() == "X" && Button6.getText() == "X") {
            Winner("X");
        }
        if (Button7.getText() == "X" && Button8.getText() == "X" && Button9.getText() == "X") {
            Winner("X");
        }
        if (Button1.getText() == "X" && Button4.getText() == "X" && Button7.getText() == "X") {
            Winner("X");
        }
        if (Button2.getText() == "X" && Button5.getText() == "X" && Button8.getText() == "X") {
            Winner("X");
        }
        if (Button3.getText() == "X" && Button6.getText() == "X" && Button9.getText() == "X") {
            Winner("X");
        }
        if (Button1.getText() == "X" && Button5.getText() == "X" && Button9.getText() == "X") {
            Winner("X");
        }
        if (Button3.getText() == "X" && Button5.getText() == "X" && Button7.getText() == "X") {
            Winner("X");
        }
    }
    public void Winner(String win){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("GameOver.fxml"));
            Parent root = loader.load();
            try {
                GameOver g = (GameOver) loader.getController();
                g.setLabelWinner(win);
            }
            catch (Exception e){
                System.out.println("Errors");
            }
            Stage stage = new Stage();
            stage.setScene(new Scene(root,300,150));
            stage.setTitle("The Game Is Over!!!");
            stage.show();
        }
        catch (IOException o){
            o.printStackTrace();
        }
    }
}
