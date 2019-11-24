import javax.swing.*;
import java.awt.*;
import java.lang.Math;

public class Food extends JComponent {

    int x; int y;

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Food(){

        this.x = (int)(Math.random() * 300) + 0;;
        this.y = (int)(Math.random() * 300) + 0;;

    }

    public void random(){
        y = (int)(Math.random() * 300) + 0;
        x = (int)(Math.random() * 300) + 0;
    }


    public Rectangle ribos(){

        return (new Rectangle(x,y,10,10));
    }

}
