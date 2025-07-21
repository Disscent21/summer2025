package week2;

import javax.swing.JFrame;

public class SimpleFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Chloe Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel gamePanel = new GamePanel();
        frame.add(gamePanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
