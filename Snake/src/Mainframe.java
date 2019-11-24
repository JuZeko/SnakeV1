import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class Mainframe extends JFrame {


    public Mainframe(){

        super("Snake");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(400,400);
        setVisible(true);
        //this.getContentPane().add(new Draw());
        JLabel label = new JLabel("Score: 0",JLabel.RIGHT);
        label.setPreferredSize(new Dimension(250, 250));
        label.setVerticalAlignment(JLabel.TOP);
        label.setVisible(true);
        JPanel draw =  new Draw();

        this.getContentPane().add(draw);



      //  this.getContentPane().add(new Draw());
       // this.add(new Draw());
        setBackground(Color.green);


    }

}
