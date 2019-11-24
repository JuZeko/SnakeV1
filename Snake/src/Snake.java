import javax.swing.*;
import java.awt.*;

public class Snake extends JComponent {

    int x, y;
    int xS = 1;
    int yS = 0;
    int plotis = 40;
    int aukstis = 20;

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Snake() {
        x = 40;
        y = 40;
    }


    void motion() {
        x += xS;
        y += yS;
    }

    public void boundaries() {
        if (x + xS > 380) {
            xS = -8;
        }
        if (x + xS < 0) {
            xS = 8;
        }
        if (y + yS < 0) {
            yS = 8;
        }
        if (y + xS > 340) {
            yS = -8;
        }
    }


    @Override
    public int getX() {
        return x;
    }


    public void setPlotis(int x) {
        this.plotis = x;
    }

    public int getAukstis() {
        return aukstis;
    }
    public int getPlotis() {
        return plotis;
    }




    public void setX() {
        this.x = x;
    }

    public void setXD() {
        this.y = y;
    }


    public void move(int x) {
        int a = 0;
        switch (x) {
            case 0:
                xS = 8;
                yS = 0;

                break;
            case 1:
                xS = 0;
                yS = 8;

                break;
            case 2:
                xS = -8;
                yS = 0;

                break;
            case 3:
                xS = 0;
                yS = -8;

                break;
            default:
                // code block
        }
    }


    public Rectangle ribos() {

        return (new Rectangle(x, y, plotis, aukstis));
    }

    public void change(String x) {

        int a ;

        if (x == "right" && aukstis > plotis) {


            a = aukstis;
            aukstis = plotis;
            plotis = a;
            }

        if (x == "left" && aukstis > plotis) {


            a = aukstis;
            aukstis = plotis;
            plotis = a;

        }

        if (x == "up" && aukstis > plotis) {


            a = aukstis;
            aukstis = plotis;
            plotis = a;

        }

        if (x == "down" && aukstis > plotis) {


            a = aukstis;
            aukstis = plotis;
            plotis = a;

        }


        }

    private void setAukstis(int aukstis) {
        this.aukstis = aukstis;
    }


}





