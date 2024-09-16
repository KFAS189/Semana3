/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana3;
import java.util.Scanner;

public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int num = 0;
		int sum = 0;
		int pos = 0;
		int neg = 0;
		Scanner input = new Scanner(System.in);
		
		for (int i = 1; i < 11; i++){ 
			System.out.print("Agregue un valor #"+i+":");
			num = input.nextInt();
			sum += num;
			
			if (sum < 0) {
				neg += 1;
			}
			if (sum > 0) {
				pos += 1;
			}
		} 
		System.out.println("la suma total es de " + sum ); 
		System.out.println("el total de negativos es de " + neg ); 
		System.out.println("el total de positivos es de " + pos ); 
    }
    
}
