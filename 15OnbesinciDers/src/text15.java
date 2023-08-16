import java.util.Iterator;
import java.util.Scanner;

public class text15 {

	public static void main(String[] args) {
		System.out.println("Tek mi Çift mi Bulma Uygulamasý");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dizinin eleman sayýsýný giriniz:");
		int diziLength = scanner.nextInt();
		
		int [] sayilar = new int[diziLength];
		
		for(int i=0; i<diziLength; i++) {
			
			System.out.print("DÝZÝNÝN " + i + ". indexini giriniz:");
			sayilar[i] = scanner.nextInt();
		}
		for (int i : sayilar) {
			tekMiCiftMi(i);
		}

	}
	public static void tekMiCiftMi(int sayi) {
		if (sayi%2==0) {
			System.out.println(sayi + " SAYISI ÇÝFTTÝR");
		}else {
			System.out.println(sayi + " SAYISI TEKTÝR");
		}
	}

}
