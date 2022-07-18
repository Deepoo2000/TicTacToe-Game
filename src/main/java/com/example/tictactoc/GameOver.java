package com.example.tictactoc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GameOver {
    @FXML
    private Label winner;
    public void setLabelWinner(String text){
        winner.setText(text);
    }
}
