import javafx.geometry.VerticalDirection;

import javax.swing.*;
import java.awt.*;

public class principal extends JFrame {

    public principal() {
        super("parqueadero a $1200");

        Container contenedorPrincipal = this.getContentPane();

        contenedorPrincipal.setLayout(new GridBagLayout());
        contenedorPrincipal.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints restricciones = new GridBagConstraints();

        JLabel label1 =new JLabel("parqueadero");
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty = 0;
        restricciones.weightx=0;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.anchor = GridBagConstraints.NORTHWEST;
        contenedorPrincipal.add(label1, restricciones);

        for(int x=1;x<=18;x++)
        {
            JButton boton = new JButton(""+x);
            restricciones.gridx = x-1;
            restricciones.gridy = 1;
            restricciones.gridwidth = 1;
            restricciones.gridheight =1;
            restricciones.weighty = 1;
            restricciones.weightx= 1;
            restricciones.fill = GridBagConstraints.BOTH;
            restricciones.anchor = GridBagConstraints.NORTHWEST;
            contenedorPrincipal.add(boton,restricciones);
        }

        for(int x=0;x<18;x++)
        {
            JButton boton = new JButton(""+(x+19));
            restricciones.gridx = x;
            restricciones.gridy = 2;
            restricciones.gridwidth = 1;
            restricciones.gridheight =1;
            restricciones.weighty = 1;
            restricciones.weightx= 1;
            restricciones.fill = GridBagConstraints.BOTH;
            restricciones.anchor = GridBagConstraints.NORTHWEST;
            contenedorPrincipal.add(boton,restricciones);
        }

        for(int x=0;x<18;x++)
        {
            JButton boton = new JButton(""+(x+37));
            restricciones.gridx = x;
            restricciones.gridy = 3;
            restricciones.gridwidth = 1;
            restricciones.gridheight =1;
            restricciones.weighty = 1;
            restricciones.weightx= 1;
            restricciones.fill = GridBagConstraints.BOTH;
            restricciones.anchor = GridBagConstraints.NORTHWEST;
            contenedorPrincipal.add(boton,restricciones);
        }

        for(int x=0;x<18;x++)
        {
            JButton boton = new JButton(""+(x+55));
            restricciones.gridx = x;
            restricciones.gridy = 4;
            restricciones.gridwidth = 1;
            restricciones.gridheight =1;
            restricciones.weighty = 1;
            restricciones.weightx= 1;
            restricciones.fill = GridBagConstraints.BOTH;
            restricciones.anchor = GridBagConstraints.NORTHWEST;
            contenedorPrincipal.add(boton,restricciones);
        }

        for(int x=0;x<15;x++)
        {
            JButton boton = new JButton(""+(x+73));
            restricciones.gridx = x;
            restricciones.gridy = 5;
            restricciones.gridwidth = 1;
            restricciones.gridheight =1;
            restricciones.weighty = 1;
            restricciones.weightx= 1;
            restricciones.fill = GridBagConstraints.BOTH;
            restricciones.anchor = GridBagConstraints.NORTHWEST;
            contenedorPrincipal.add(boton,restricciones);
        }

        JLabel hora = new JLabel("hora actual");
        restricciones.gridx = 8;
        restricciones.gridy = 6;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty = 0;
        restricciones.weightx=0;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.anchor = GridBagConstraints.NORTHWEST;
        contenedorPrincipal.add(hora, restricciones);

        JTextArea areaHora = new JTextArea("");
        restricciones.gridx = 8;
        restricciones.gridy = 7;
        restricciones.gridwidth = 3;
        restricciones.gridheight = 1;
        restricciones.weighty = 1;
        restricciones.weightx=1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.anchor = GridBagConstraints.NORTHWEST;
        contenedorPrincipal.add(areaHora, restricciones);

        JButton avanzar = new JButton("avanzar");
        restricciones.gridx = 8;
        restricciones.gridy = 8;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weighty = 1;
        restricciones.weightx=1;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.anchor = GridBagConstraints.NORTH;
        contenedorPrincipal.add(avanzar, restricciones);

        JButton salir = new JButton("salir");
        restricciones.gridx = 6;
        restricciones.gridy = 8;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weighty = 1;
        restricciones.weightx=1;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.anchor = GridBagConstraints.NORTHEAST;
        contenedorPrincipal.add(salir, restricciones);

        JButton ingresar = new JButton("ingresar");
        restricciones.gridx = 4;
        restricciones.gridy = 8;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weighty = 1;
        restricciones.weightx=1;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.anchor = GridBagConstraints.NORTHEAST;
        contenedorPrincipal.add(ingresar, restricciones);

        JButton opcion1 = new JButton("opcion 1");
        restricciones.gridx = 10;
        restricciones.gridy = 8;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weighty = 1;
        restricciones.weightx=1;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.anchor = GridBagConstraints.NORTHWEST;
        contenedorPrincipal.add(opcion1, restricciones);

        JButton opcion2 = new JButton("opcion 2");
        restricciones.gridx = 12;
        restricciones.gridy = 8;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weighty = 1;
        restricciones.weightx=1;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.anchor = GridBagConstraints.NORTHWEST;
        contenedorPrincipal.add(opcion2, restricciones);

        JLabel informacion = new JLabel("informacion");
        restricciones.gridx = 0;
        restricciones.gridy = 10;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty = 0;
        restricciones.weightx=0;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.anchor = GridBagConstraints.NORTHWEST;
        contenedorPrincipal.add(informacion, restricciones);

        JLabel valor = new JLabel("valor en caja:");
        restricciones.gridx = 6;
        restricciones.gridy = 11;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weighty = 1;
        restricciones.weightx=1;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.anchor = GridBagConstraints.NORTHWEST;
        contenedorPrincipal.add(valor, restricciones);

        JTextArea areaValor = new JTextArea("");
        restricciones.gridx = 8;
        restricciones.gridy = 11;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weighty = 1;
        restricciones.weightx=1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.anchor = GridBagConstraints.NORTHEAST;
        contenedorPrincipal.add(areaValor, restricciones);
        restricciones.insets.set(15,0,0,0);

        JLabel puestos = new JLabel("puestos vacios:");
        restricciones.gridx = 6;
        restricciones.gridy = 12;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weighty = 1;
        restricciones.weightx=1;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.anchor = GridBagConstraints.NORTHWEST;
        contenedorPrincipal.add(puestos, restricciones);

        JTextArea areaPuestos = new JTextArea("");
        restricciones.gridx = 8;
        restricciones.gridy = 12;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weighty = 1;
        restricciones.weightx=1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.anchor = GridBagConstraints.NORTHEAST;
        contenedorPrincipal.add(areaPuestos, restricciones);



    }

    public static void main(String[]args){
        principal ventana = new principal();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setVisible(true);


    }
}
