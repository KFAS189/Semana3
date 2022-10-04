
package semana3;

import javax.swing.JOptionPane;

public class Semana3 {

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
