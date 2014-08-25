package net.ftb.laf;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public final class Main
extends JFrame{
    static{
        try{
            UIManager.setLookAndFeel(FTBLookAndFeel.class.getName());
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }

    private Main(){
        this.setBackground(Color.black);
        this.setMinimumSize(new Dimension(830, 500));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setLayout(new BorderLayout());
    }

    public static void main(String... args){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new Main().setVisible(true);
            }
        });
    }
}