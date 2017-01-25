package org.vigen.oganesyan.java;

import javax.print.DocFlavor;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Objects;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


import static java.lang.String.*;

/**
 * Created by ТыжАдмин on 01.11.2016.
 */
public class Wind extends JFrame {

    public Wind() {


        Font font = new Font("Comic Sans MS", Font.BOLD, 12);
        Font font2 = new Font("ALGERIAN", Font.BOLD, 20);
        Font font3 = new Font("Berlin Sans FB", Font.BOLD, 15);
        Font font4 = new Font("Berlin Sans FB", Font.BOLD, 18);
        Font font5 = new Font("Tahoma", Font.BOLD, 12);
        setTitle(" AI UK ");
        setBackground(Color.orange);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(999, 700, 1600, 950);
        setLayout(null);
        JButton WORK_ON_TEXT = new JButton("Обработать текст ");
        WORK_ON_TEXT.setBounds(512, 89, 190, 55);
        WORK_ON_TEXT.setFont(font);
        WORK_ON_TEXT.setBackground(Color.CYAN);

        add(WORK_ON_TEXT);
        JLabel NUMBER_OF_WORDS = new JLabel("The number of words : ");
        NUMBER_OF_WORDS.setFont(font3);
        NUMBER_OF_WORDS.setBounds(800, 110, 290, 150);
        add(NUMBER_OF_WORDS);

        JTextField textField = new JTextField();
        textField.setBounds(900, 193, 60, 50);
        add(textField);
        JTextArea ENGLISH_TEXT = new JTextArea();
        ENGLISH_TEXT.setBounds(32, 167, 700, 550);
        ENGLISH_TEXT.setLineWrap(true);
        ENGLISH_TEXT.setWrapStyleWord(true);
        ENGLISH_TEXT.setFont(font2);
        add(ENGLISH_TEXT);

        JTextField PRESENT_PERFECT_FIELD = new JTextField();
        PRESENT_PERFECT_FIELD.setBounds(900,463,60,50);
        add(PRESENT_PERFECT_FIELD);
        WORK_ON_TEXT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = ENGLISH_TEXT.getText();
                String[] ARRAY = s.split(" +");
                int t = ARRAY.length;
                textField.setText(String.valueOf(t));
            }
        });
        WORK_ON_TEXT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String d = ENGLISH_TEXT.getText();
                String [] array = d.split(" +");
                int a = array.length;
                for (int i = 0; i <a; i++) {


                }
            }
        });
     JLabel V1 = new JLabel("V1 : ");
        V1.setFont(font4);
        V1.setBounds(900,190,290,150);
        add(V1);
        JTextField VERB1 = new JTextField();
        VERB1.setBounds(900,280,210,120);
        add(VERB1);
        JLabel ing = new JLabel("Ing : ");
        ing.setFont(font4);
        ing.setBounds(900,320,290,150);
        add(ing);
        JLabel s = new JLabel("S : ");
        ing.setFont(font4);
        ing.setBounds(900,350,290,150);
        add(ing);



        setVisible(true);


    }
}