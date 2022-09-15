/** 
 * @author Ari Maulana Hardan
 * NIM: 211511007
 * Soal 3 (Berhitung)
 */

package eksplor;

import java.util.Scanner;

public class Soal3 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			String s = input.nextLine();
			String[] splitted = s.split(" ",-1);
			int A = Integer.parseInt(splitted[0]);
			int B = Integer.parseInt(splitted[2]);
			if (A < 1 || B > 1000) {
				System.out.println("Melebihi Batas Input!");
			} else {
				
				switch(splitted[1]) {
					case "+":
						System.out.print(A+B);
						break;
						
					case "/":
						if (A % B != 0 ) {
							System.out.println("Hasil tidak habis bagi");
						} else {
							System.out.print(A/B);
						}
						break;
						
					case "%":
						System.out.print(A%B);
						break;
						
					case "-":
						System.out.print(A-B);
						break;
						
					case "*":
						System.out.print(A*B);
						break;
						
					default: System.out.println("Operator tidak dikenali");
				}
				break;
			}
		}
	}
}