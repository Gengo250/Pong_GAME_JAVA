package Pong_GAME_JAVA;

import java.awt.Color;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
  GamePanel panel = new GamePanel();
  GameFrame(){
    panel = new GamePanel();
    this.add(panel);
    this.setTitle("PONG GAME");
    this.setResizable(false );
    this.setBackground(Color.black);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);
  }
}
