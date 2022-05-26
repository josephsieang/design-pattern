import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.BorderLayout;

public class FlyWeightTest extends JFrame {
  JButton startDrawing;

  int windowWidth = 1750;
  int windowHeight = 150;

  Color[] shapeColor = { Color.orange, Color.red, Color.yellow, Color.blue, Color.pink, Color.cyan, Color.magenta,
      Color.black, Color.gray };

  public static void main(String[] args) {
    new FlyWeightTest();
  }

  public FlyWeightTest() {
    this.setSize(this.windowWidth, this.windowHeight);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Flyweight Test");

    JPanel contentPanel = new JPanel();
    contentPanel.setLayout(new BorderLayout());

    final JPanel drawingPanel = new JPanel();

    this.startDrawing = new JButton("Draw Rect");

    contentPanel.add(drawingPanel, BorderLayout.CENTER);
    contentPanel.add(startDrawing, BorderLayout.SOUTH);

    this.startDrawing.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        Graphics g = drawingPanel.getGraphics();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; ++i) {
          // Rect rect = new Rect(getRandColor(), getRandX(), getRandY(), getRandX(),
          // getRandY());
          // rect.draw(g);
          Rect rect = RectFactory.getRect(getRandColor());
          rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());
        }

        long endTime = System.currentTimeMillis();

        System.out.println("That took" + (endTime - startTime) + " ms");
      }
    });

    this.add(contentPanel);
    this.setVisible(true);
  }

  private Color getRandColor() {
    Random randomGenerator = new Random();
    int randNumber = randomGenerator.nextInt(9);
    return this.shapeColor[randNumber];
  }

  private int getRandX() {
    return (int) (Math.random() * this.windowWidth);
  }

  private int getRandY() {
    return (int) (Math.random() * this.windowHeight);
  }
}
