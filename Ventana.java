/**
 *
 * @author Armando Sanchez Suarez 
 * Fecha: 15/09/2016 
 * Descripcion: Realizar una ventana con dos etiquetas, dos campos de texto y un boton.
 */

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana {

    public void InicioVentana() {
        //Hacemos la ventana
        JFrame ventana = new JFrame("DAD AC nº1");
        ventana.setVisible(true);
        ventana.setSize(800, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Constantes de Desarrollador, Terminar el Programa al salir
        ventana.getContentPane().setLayout(new BorderLayout()); //Recordar que tiene reglas diferentes a las normales
        
        //Declaramos los contenidos 
        JLabel etiqueta_arriba = new JLabel("Bienvenido al Programa y eso");
        JLabel etiqueta_abajo = new JLabel("Propiedad de ORACLE(Tm), todos los derechos reservados");
        JButton boton = new JButton("Púlsame");
        JTextField TextoIzq = new JTextField("Escribe aqui una cosa a la izquierda");
        JTextField TextoDer = new JTextField("Escribe aqui una cosa a la derecha");
        //REALIZAR VARIABLES DESDE ANTES SIEMPRE, IMPORTANTE.

        ventana.getContentPane().add(etiqueta_arriba, BorderLayout.NORTH);
        ventana.getContentPane().add(etiqueta_abajo, BorderLayout.SOUTH);
        ventana.getContentPane().add(boton, BorderLayout.CENTER); 
        ventana.getContentPane().add(TextoIzq, BorderLayout.WEST); 
        ventana.getContentPane().add(TextoDer, BorderLayout.EAST); 

        ventana.pack();
    }
}
