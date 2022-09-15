/** 
 * @author Ari Maulana Hardan
 * NIM: 211511007
 * Soal 6 (Big Number)
 */

package eksplor;
import java.util.Scanner;
import java.math.*;

public class Soal6 {
	 public static void main(String[] args){
		 Scanner scan = new Scanner(System.in);
		 BigInteger a = new BigInteger(scan.nextLine());
		 BigInteger b = new BigInteger(scan.nextLine());
		 BigInteger tambah = a.add(b);   
		 BigInteger kali = a.multiply(b);   
		 
		 System.out.println(tambah+"\n"+kali);
	 }
}