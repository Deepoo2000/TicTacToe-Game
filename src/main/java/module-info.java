module com.example.tictactoc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tictactoc to javafx.fxml;
    exports com.example.tictactoc;
}