package myProject;

import javax.swing.*;
import java.awt.*;

public class PanelHangman extends JPanel {
    //Definir el tamaño al JPanel
    public static final int WIDTH = 250;
    public static final int HEIGTH = 200;

    //atributos
    private int step;

    //constructor
    public PanelHangman(){
        step=0;
        setPreferredSize(new Dimension(WIDTH,HEIGTH));
    }

    //Metodo
    public void drawBody(int step){
        this.step=step;
        repaint();
    }

    //Metodo que reinicia el panel cuando termina el juego
    public void reset(){
        step=0;
        repaint();
    }

    //Metodo PaintComponent

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Este es el fondo
        g.setColor(Color.WHITE);
        g.fillRect(0,0,WIDTH,HEIGTH);

        //Este es el dibujado dependiendo del paso en el que se encuentre
        switch (step){
            //Caso 0 dibuja el verdugo
            case 0: g.setColor(Color.BLUE);
                    g.fillRect(30,10,5,170);
                    g.fillRect(30,10,100,5);
                    g.fillRect(15,180, 37,5);
                    break;
            //Pinta la cabeza
            case 1: g.setColor(Color.BLUE);
                    g.fillRect(30,10,5,170);
                    g.fillRect(30,10,100,5);
                    g.fillRect(15,180, 37,5);
                    g.setColor(Color.BLACK);

                    g.fillOval(107,35,40,40);
                    break;
            //Pinta el cuerpo
            case 2: g.setColor(Color.BLUE);
                    g.fillRect(30,10,5,170);
                    g.fillRect(30,10,100,5);
                    g.fillRect(17,180, 37,5);
                    g.setColor(Color.BLACK);
                    g.fillOval(107,35,40,40);

                    g.fillRect(125,70,4,70);
                    break;
            //Pinta brazo derecho
            case 3: g.setColor(Color.BLUE);
                    g.fillRect(30,10,5,170);
                    g.fillRect(30,10,100,5);
                    g.fillRect(17,180, 37,5);
                    g.setColor(Color.BLACK);
                    g.fillOval(107,35,40,40);
                    g.fillRect(125,70,4,70);

                    g.drawLine(127,80,164,94);
                    g.drawLine(128,80,164,94);
                    g.drawLine(129,80,164,94);
                    break;
            //Pinta MANO derecha
            case 4: g.setColor(Color.BLUE);
                    g.fillRect(30,10,5,170);
                    g.fillRect(30,10,100,5);
                    g.fillRect(17,180, 37,5);
                    g.setColor(Color.BLACK);
                    g.fillOval(107,35,40,40);
                    g.fillRect(125,70,4,70);
                    g.drawLine(127,80,164,94);
                    g.drawLine(128,80,164,94);
                    g.drawLine(129,80,164,94);

                    g.drawLine(164,94,175,87);
                    break;
            //Pinta el brazo izquierdo
            case 5: g.setColor(Color.BLUE);
                    g.fillRect(30,10,5,170);
                    g.fillRect(30,10,100,5);
                    g.fillRect(17,180, 37,5);
                    g.setColor(Color.BLACK);
                    g.fillOval(107,35,40,40);
                    g.fillRect(125,70,4,70);
                    g.drawLine(127,80,164,94);
                    g.drawLine(128,80,164,94);
                    g.drawLine(129,80,164,94);
                    g.drawLine(164,94,175,87);

                    g.drawLine(127,80,90,94);
                    g.drawLine(128,80,90,94);
                    g.drawLine(129,80,90,94);
                    break;
            //Pinto la mano izquierda
            case 6: g.setColor(Color.BLUE);
                    g.fillRect(30,10,5,170);
                    g.fillRect(30,10,100,5);
                    g.fillRect(17,180, 37,5);
                    g.setColor(Color.BLACK);
                    g.fillOval(107,35,40,40);
                    g.fillRect(125,70,4,70);
                    g.drawLine(127,80,164,94);
                    g.drawLine(128,80,164,94);
                    g.drawLine(129,80,164,94);
                    g.drawLine(164,94,175,87);
                    g.drawLine(127,80,90,94);
                    g.drawLine(128,80,90,94);
                    g.drawLine(129,80,90,94);

                    g.drawLine(90,94,79,87);
                    break;
            //Pinta la pierna derecha
            case 7: g.setColor(Color.BLUE);
                    g.fillRect(30,10,5,170);
                    g.fillRect(30,10,100,5);
                    g.fillRect(17,180, 37,5);
                    g.setColor(Color.BLACK);
                    g.fillOval(107,35,40,40);
                    g.fillRect(125,70,4,70);
                    g.drawLine(127,80,164,94);
                    g.drawLine(128,80,164,94);
                    g.drawLine(129,80,164,94);
                    g.drawLine(164,94,175,87);
                    g.drawLine(127,80,90,94);
                    g.drawLine(128,80,90,94);
                    g.drawLine(129,80,90,94);
                    g.drawLine(90,94,79,87);

                    g.drawLine(127,140,164,154);
                    g.drawLine(128,140,164,154);
                    g.drawLine(129,140,164,154);
                    break;
            //Pinta la pierna izquierda
            case 8: g.setColor(Color.BLUE);
                    g.fillRect(30,10,5,170);
                    g.fillRect(30,10,100,5);
                    g.fillRect(17,180, 37,5);
                    g.setColor(Color.BLACK);
                    g.fillOval(107,35,40,40);
                    g.fillRect(125,70,4,70);
                    g.drawLine(127,80,164,94);
                    g.drawLine(128,80,164,94);
                    g.drawLine(129,80,164,94);
                    g.drawLine(164,94,175,87);
                    g.drawLine(127,80,90,94);
                    g.drawLine(128,80,90,94);
                    g.drawLine(129,80,90,94);
                    g.drawLine(90,94,79,87);
                    g.drawLine(127,140,164,154);
                    g.drawLine(128,140,164,154);
                    g.drawLine(129,140,164,154);

                    g.drawLine(127,140,90,154);
                    g.drawLine(126,140,90,154);
                    g.drawLine(125,140,90,154);
                    break;
            //Pinta el pie izquierdo
            case 9: g.setColor(Color.BLUE);
                    g.fillRect(30,10,5,170);
                    g.fillRect(30,10,100,5);
                    g.fillRect(17,180, 37,5);
                    g.setColor(Color.BLACK);
                    g.fillOval(107,35,40,40);
                    g.fillRect(125,70,4,70);
                    g.drawLine(127,80,164,94);
                    g.drawLine(128,80,164,94);
                    g.drawLine(129,80,164,94);
                    g.drawLine(164,94,175,87);
                    g.drawLine(127,80,90,94);
                    g.drawLine(128,80,90,94);
                    g.drawLine(129,80,90,94);
                    g.drawLine(90,94,79,87);
                    g.drawLine(127,140,164,154);
                    g.drawLine(128,140,164,154);
                    g.drawLine(129,140,164,154);
                    g.drawLine(127,140,90,154);
                    g.drawLine(126,140,90,154);
                    g.drawLine(125,140,90,154);

                    g.drawLine(164,154,174,154);
                    g.drawLine(90,154,80,154);
                break;
            //Pinta el pie derecho y el ahorcado
            case 10: g.setColor(Color.BLUE);
                    g.fillRect(30,10,5,170);
                    g.fillRect(30,10,100,5);
                    g.fillRect(17,180, 37,5);
                    g.setColor(Color.BLACK);
                    g.fillOval(107,35,40,40);
                    g.fillRect(125,70,4,70);
                    g.drawLine(127,80,164,94);
                    g.drawLine(128,80,164,94);
                    g.drawLine(129,80,164,94);
                    g.drawLine(164,94,175,87);
                    g.drawLine(127,80,90,94);
                    g.drawLine(128,80,90,94);
                    g.drawLine(129,80,90,94);
                    g.drawLine(90,94,79,87);
                    g.drawLine(127,140,164,154);
                    g.drawLine(128,140,164,154);
                    g.drawLine(129,140,164,154);
                    g.drawLine(127,140,90,154);
                    g.drawLine(126,140,90,154);
                    g.drawLine(125,140,90,154);
                    g.drawLine(164,154,174,154);
                    g.drawLine(90,154,80,154);

                    g.setColor(Color.PINK);
                    g.fillRect(125,15,3,25);
                    g.fillOval(107,35,40,40);
                    g.setColor(Color.BLACK);
                    g.drawString("X",119,60);
                    g.drawString("X",131,60);
                    break;
        }

    }
}
