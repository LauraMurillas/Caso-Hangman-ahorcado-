package myProject;

import javax.swing.*;
import java.awt.*;

public class PanelFrase extends JPanel {
    //Definir el tamaño al JPanel
    public static final int WIDTH = 370;
    public static final int HEIGTH = 200;

    //atributos de la clase
    private String clave, letrasMalas, errores;

    //constructor
    public PanelFrase(String clave){
        this.clave=clave;
        letrasMalas="";
        errores="";
        //definir el tamaño del JPanel
        setPreferredSize(new Dimension(WIDTH,HEIGTH));
    }

    //Metodo
    public void pintarTextoError(String clave, char letra, int error){
        this.clave=clave;
        letrasMalas+=" "+String.valueOf(letra);
        errores+=" "+String.valueOf(error);
        repaint();
    }

    //Metodo para pintar si es correcto
    public void setClave(String clave){
        this.clave=clave;
        repaint();
    }


    //Metodo Paint component del Panel Frases
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0,0,WIDTH,HEIGTH);

        //Dibuja el texto de la frase
        g.setFont(new Font(Font.DIALOG,Font.BOLD,17));
        g.setColor(Color.BLACK);
        g.drawString("Frase a adivinar:",4,20);

        //Dibuja el texto de la clave
        g.setFont(new Font(Font.DIALOG,Font.BOLD,17));
        g.setColor(Color.BLACK);
        g.drawString(clave,4,55);


        //Dibuja el texto de letras incorrectas
        g.setFont(new Font(Font.DIALOG,Font.BOLD,17));
        g.setColor(Color.BLACK);
        g.drawString("Letras Incorrectas:",4,77);

        g.setFont(new Font(Font.DIALOG,Font.BOLD,17));
        g.setColor(Color.MAGENTA);
        g.drawString(letrasMalas,4,101);



        //Dibuja el texto de errores
        g.setFont(new Font(Font.DIALOG,Font.BOLD,17));
        g.setColor(Color.BLACK);
        g.drawString("Errores:",4,120);

        g.setFont(new Font(Font.DIALOG,Font.BOLD,17));
        g.setColor(Color.MAGENTA);
        g.drawString(errores,72,120);


    }

    //El metodo que reinicia el panel cuando termina la ronda
    public void reset(String clave){
        this.clave=clave;
        letrasMalas=" ";
        errores=" ";
        repaint();
    }
}
