/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana3;

import javax.swing.JOptionPane;

/**
 *
 * @author guillermo.delgado
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        int priNum = 0;
        int segNum = 1;

        while (priNum != segNum) {
            priNum = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el primer número: "));
            segNum = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el segundo número: "));

           
        }
        
        
    }
    
}
