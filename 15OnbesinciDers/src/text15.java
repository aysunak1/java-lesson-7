import java.util.Iterator;
import java.util.Scanner;

public class text15 {

	public static void main(String[] args) {
		System.out.println("Tek mi �ift mi Bulma Uygulamas�");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dizinin eleman say�s�n� giriniz:");
		int diziLength = scanner.nextInt();
		
		int [] sayilar = new int[diziLength];
		
		for(int i=0; i<diziLength; i++) {
			
			System.out.print("D�Z�N�N " + i + ". indexini giriniz:");
			sayilar[i] = scanner.nextInt();
		}
		for (int i : sayilar) {
			tekMiCiftMi(i);
		}

	}
	public static void tekMiCiftMi(int sayi) {
		if (sayi%2==0) {
			System.out.println(sayi + " SAYISI ��FTT�R");
		}else {
			System.out.println(sayi + " SAYISI TEKT�R");
		}
	}

}
