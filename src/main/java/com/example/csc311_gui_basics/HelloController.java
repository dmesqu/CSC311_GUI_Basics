package com.example.csc311_gui_basics;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class HelloController {

    @FXML
    private Button btn1;

    @FXML
    private ImageView iv1;

    @FXML
    private PasswordField pf1;

    @FXML
    protected void goku() {
        if (pf1.getText().equals("goku")) {
            Image image = new Image("https://static1.srcdn.com/wordpress/wp-content/uploads/2022/10/Goku-in-DBZ.jpg");
            iv1.setFitWidth(200);
            iv1.setFitHeight(100);
            iv1.setPreserveRatio(true);
            iv1.setSmooth(true);
            iv1.setImage(image);
        }
    }

}