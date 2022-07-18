package com.example.tictactoc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

import static com.sun.javafx.scene.control.skin.Utils.getResource;

public class TicTacToe extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent fxmlLoader =  FXMLLoader.load(getClass().getResource("FirstView.fxml"));
        stage.setTitle("TicTacToe!");
        stage.setScene(new Scene(fxmlLoader, 600, 400));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}