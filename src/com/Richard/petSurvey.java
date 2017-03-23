package com.Richard;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by su7163if on 3/22/2017.
 */
public class petSurvey extends JFrame{
    private JPanel servey;
    private JCheckBox cbxDog;
    private JCheckBox cbxCat;
    private JCheckBox cbxFish;
    private JLabel lblResults;
    private JButton btnQuit;

    private boolean dog;
    private  boolean cat;
    private  boolean fish;

    protected petSurvey(){
        setContentPane(servey);
        pack();
        setVisible(true);
        setTitle("The pet servey!");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cbxDog.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                dog = cbxDog.isSelected();
                updateResults();
            }
        });
        cbxCat.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                cat = cbxCat.isSelected();
                updateResults();
            }
        });
        btnQuit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int quit = JOptionPane.showConfirmDialog(petSurvey.this, "Are you sure?", "quit", JOptionPane.OK_CANCEL_OPTION);
                if(quit == JOptionPane.OK_OPTION){
                    System.exit(0);
                }
            }
        });
        cbxFish.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                fish = cbxFish.isSelected();
                updateResults();
            }
        });

    }

    private void updateResults(){
        String hasdog = dog ? "One Dog" : "No Dog";
        String hasCat = cat ? "One cat" : "No cats";
        String hasFish = fish ? "One fish." : "No fish.";
        String results = "You have " + hasdog + " and " + hasCat + " and " + hasFish;
        lblResults.setText(results);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
