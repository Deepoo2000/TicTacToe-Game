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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FirstView  {
    @FXML
    private Label CheckData;
    @FXML
    private TextField name1;

    @FXML
    private TextField name2;

    @FXML
    private Button startyourgame;



    @FXML
    public void StarYourGame() throws IOException {
        //TicTacToe t = new TicTacToe();
        if(!name1.getText().isEmpty() && !name2.getText().isEmpty()){
            CheckData.setText("Success!");
            try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
                Parent root = loader.load();
                try {
                    Game g = (Game) loader.getController();
                    g.setLabelText(name1.getText(),name2.getText());
                }
                catch (Exception e){
                    System.out.println("Errors");
                }
                Stage stage = new Stage();
                stage.setScene(new Scene(root,600,400));
                stage.setTitle("The Game!!!");
                stage.show();
            }
            catch (IOException o){
                o.printStackTrace();
            }
        }
        else {
            CheckData.setText("Enter Username and Password correctly");
        }
    }


    public void NameOne(ActionEvent actionEvent) {
    }

    public void NameTwo(ActionEvent actionEvent) {
    }


}
