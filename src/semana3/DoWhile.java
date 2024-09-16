
package semana3;

import javax.swing.JOptionPane;

public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        int priNum = 0;
        int segNum = 0;
        
        do{
        priNum = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el primer número: "));
        segNum = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el segundo número: "));
    }
        while (priNum != segNum);
        
        
    }
    
}
