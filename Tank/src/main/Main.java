package main;

import javax.swing.JFrame;

public class Main {


    public static void main(String[] args) {
    JFrame Frame = new JFrame();
    Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Frame.setResizable(false);
    Frame.setTitle("Tanks!");

    GamePanel gamePanel = new GamePanel();
    Frame.add(gamePanel);

    Frame.pack();

    Frame.setLocationRelativeTo(null);
    Frame.setVisible(true);

    gamePanel.startGameThread();

    }
}