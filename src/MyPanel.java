import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
public class MyPanel extends JPanel {
    public MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
        setPreferredSize(new Dimension(1560,700));
    }
    public Dimension getPrefferedSize() {
        return new Dimension(1560,700);
    }
    private int x = 100;
    private int y = 100;
    private int width = 50;
    private int height = 100;
    private int step = 30;
    private int delta = 3;

    private ArrayList<Rectangle> outlist = new ArrayList<Rectangle>();

    public void setSymbols(String parm){
        String[] arr = parm.replace(",", "").split(" ");
        outlist.clear();
        for (String cifra: arr){
            switch (cifra){
                case "SIGMA":
                    segment(1);
                    segment(5);
                    segment(8);
                    segment(9);
                    break;
                case "sigma":
                    segment(3);
                    segment(4);
                    segment(5);
                    segment(6);
                    segment(10);
                    break;
                case "LAMBDA":
                    segment(11);
                    segment(12);
                    break;
                case "lambda":
                    segment(13);
                    segment(14);
                    break;
                case "DELTA":
                    segment(5);
                    segment(11);
                    segment(12);
                    break;
                case "delta":
                    segment(3);
                    segment(4);
                    segment(5);
                    segment(6);
                    segment(15);
                    segment(16);
                    break;
                case "PSI":
                    segment(2);
                    segment(3);
                    segment(7);
                    segment(17);
                    break;
                case "psi":
                    segment(18);
                    segment(19);
                    segment(20);
                    segment(21);
                    break;
                case "OMEGA":
                    segment(1);
                    segment(2);
                    segment(4);
                    segment(6);
                    segment(7);
                    segment(22);
                    segment(23);
                    break;
                case "pi":
                    segment(3);
                    segment(24);
                    segment(25);
                    break;
            }
            x = x + step + width;
        }
    }
    public void segment(int number){
        switch (number) {
            case 1: outlist.add(new Rectangle(x + delta, y, x+ width - delta, y));
                break;
            case 3: outlist.add(new Rectangle(x + delta, y + height / 2, x + width - delta, y + height / 2));
                break;
            case 5: outlist.add(new Rectangle(x + delta, y + height, x + width - delta, y + height));
                break;
            case 2: outlist.add(new Rectangle(x + width, y + delta, x + width, y + (height / 2) - delta));
                break;
            case 4: outlist.add(new Rectangle(x + width, y + (height / 2) + delta, x + width, y + height - delta));
                break;
            case 6: outlist.add(new Rectangle(x, y + (height / 2) + delta, x, y + height - delta));
                break;
            case 7: outlist.add(new Rectangle(x, y + delta, x, y + (height / 2) - delta));
                break;

            case 8:
                outlist.add(new Rectangle(x, y, x + width - 7, y + height / 2));
                break;
            case 9:
                outlist.add(new Rectangle(x + width - 7, y + height / 2, x, y + height));
                break;
            case 10:
                outlist.add(new Rectangle(x + width + 5, y + height / 2, x + width, y + height / 2));
                break;
            case 11:
                outlist.add(new Rectangle(x, y + height, x + width / 2, y));
                break;
            case 12:
                outlist.add(new Rectangle(x + width / 2, y, x + width, y + height));
                break;
            case 13:
                outlist.add(new Rectangle(x + delta + 2, y + 2, x + width - delta - 2, y + height - 2));
                break;
            case 14:
                outlist.add(new Rectangle(x, y + height, x + width / 2, y + height / 2));
                break;
            case 15:
                outlist.add(new Rectangle(x + width / 2, y, x + width, y + height / 2));
                break;
            case 16:
                outlist.add(new Rectangle(x + width / 2, y, x + width, y));
                break;
            case 17:
                outlist.add(new Rectangle(x + (width / 2) + delta - 3, y, x + (width / 2) + delta - 3, y + height));
                break;
            case 18:
                outlist.add(new Rectangle(x + (width / 2) + delta - 3, y + (height / 2) - (height / 4), x + (width / 2) + delta - 3, y + height));
                break;
            case 19:
                outlist.add(new Rectangle(x, y + height / 2 + height / 4, x + width, y + height / 2 + height / 4));
                break;
            case 20:
                outlist.add(new Rectangle(x, y + height / 2 + height / 4, x, y + height / 2));
                break;
            case 21:
                outlist.add(new Rectangle(x + width, y + height / 2 + height / 4, x + width, y + height / 2));
                break;
            case 22:
                outlist.add(new Rectangle(x - 3, y + height, x + 3, y + height));
                break;
            case 23:
                outlist.add(new Rectangle(x + width - 3, y + height, x + width + 3, y + height));
                break;
            case 24:
                outlist.add(new Rectangle(x + width / 2 - 7, y + height, x + width / 2 - 3, y + height / 2));
                break;
            case 25:
                outlist.add(new Rectangle(x + width / 2 + 7, y + height, x + width / 2 + 3, y + height / 2));
                break;
        }
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(Rectangle rect: outlist) {
            g.drawLine(rect.x, rect.y, rect.width, rect.height);
        }
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setStep(int step) {
        this.step = step;
    }
}