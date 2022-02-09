package com.company;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.awt.*;

public class Students {
    private GridPane StartView;
    Button exitBtn = new Button("exit");
    Button FindStudentBtn = new Button("Find Student");
    Label WhatStudent = new Label("Select Student");
    TextArea StudentText = new TextArea();
    ComboBox<String> StartStudentComB=new ComboBox<>();


    public Students() {
        CreateAndConfig();
    }
        private void CreateAndConfig(){
        StartView =new GridPane();
        StartView.setMinSize(300,200);
        StartView.setPadding(new Insets(10,10,10,10));
        StartView.setVgap(5);
        StartView.setHgap(1);

        StartView.add(StartStudentComB,15,1);
        StartView.add(WhatStudent,1,1);
        StartView.add(StudentText,20,10);
        StartView.add(exitBtn,20,15);
        StartView.add(FindStudentBtn,15,6);

    }
    public Parent asParent(){
        return StartView;
    }
}
