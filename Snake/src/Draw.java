import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.Rectangle;


public class Draw extends JPanel implements KeyListener {

    Snake snake = new Snake();
    Food food = new Food();
    boolean collision = false;
    JLabel label;
    int score = 0;

int a = 0;

    ActionListener timeris=new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            snake.motion();
            snake.boundaries();
            collision();
            if(collision){
                food.random();
                if(snake.aukstis>snake.plotis){

                    snake.aukstis += 5;
                }

                if(snake.aukstis<snake.plotis){

                    snake.plotis += 5;
                }
                score ++;


            }
            repaint();

        }
    };



    public void timer(){
        Timer timer=new Timer(100,timeris);
        timer.start();

    }

    public void collision(){

        Rectangle rectangle1 = snake.ribos();
        Rectangle rectangle2 = food.ribos();

        if(rectangle1.intersects(rectangle2))
            collision = true;
        else
            collision = false;

        }




    public Draw (){

        timer();
        setBackground(Color.green);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);


    }



    public void paint(Graphics g)
    {


        super.paintComponent(g);
      g.setColor(Color.red);
      g.fillRect(snake.getX(),snake.getY(),snake.getPlotis(),snake.getAukstis());
      g.setColor(Color.blue);
      g.fillOval(food.getX(),food.getY(),10,10);
        g.setFont(new Font("default", Font.BOLD, 16));
      g.setColor(Color.black);
        g.drawString("Score " + score, 300, 20);

        repaint();
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int a;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            snake.move(0);
            snake.change("right");

            if ( snake.aukstis > snake.plotis) {

                 a = snake.aukstis;
                snake.aukstis = snake.plotis;
                snake.plotis = a;

            }
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            snake.move(1);
            snake.change("down");

            if (snake.aukstis < snake.plotis) {

                a = snake.aukstis;
                snake.aukstis = snake.plotis;
                snake.plotis = a;
            }
        }


        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            snake.move(2);
            snake.change("left");

            if ( snake.aukstis > snake.plotis) {

                a = snake.aukstis;
                snake.aukstis = snake.plotis;
                snake.plotis = a;
            }

        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            snake.move(3);
            snake.change("up");

            if (snake.aukstis < snake.plotis) {

                a = snake.aukstis;
                snake.aukstis = snake.plotis;
                snake.plotis = a;

            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


}
