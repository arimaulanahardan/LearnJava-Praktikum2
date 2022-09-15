/** 
 * @author Ari Maulana Hardan
 * NIM: 211511007
 * Soal 4 Gaji Agent
 */

package eksplor;
import java.util.Scanner;

public class Soal4 {
	public static void main (String[] args)
	{
		//deklarasi variabel
		Scanner input = new Scanner(System.in);
		int gaji_pokok = 500000;
		float bonus = 0.1f;
		int harga_item = 50000;
		int penjualan = 0;
		int gaji_akhir = 0;
		
		penjualan = input.nextInt();
		if (penjualan > 40)
			bonus = 0.25f;
		else if (penjualan > 80)
			bonus = 0.35f;
		else if (penjualan < 15)
		{
			gaji_pokok-=(((15-penjualan)*50000)*0.15);
			bonus=0f;
		}
		System.out.println(gaji_pokok + (int)(bonus*(penjualan*harga_item)));
	}
}