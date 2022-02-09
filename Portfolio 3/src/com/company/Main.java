package com.company;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.w3c.dom.ls.LSOutput;

import java.sql.Connection;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        String url ="jdbc:sqlite:C:/sqlite/mydatabase.db";
        Students view = new Students();
        primaryStage.setTitle("Student Finder");
        primaryStage.setScene(new Scene(view.asParent(), 600, 475));
        primaryStage.show();


    }


}

