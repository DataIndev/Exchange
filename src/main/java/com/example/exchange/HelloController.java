package com.example.exchange;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    public void onExitButtonClicked(MouseEvent event){
        Platform.exit();
        System.exit(0);


    }

}