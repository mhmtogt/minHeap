import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String sayilar;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayilari Giriniz");
		sayilar = scanner.nextLine();                    // burada diziye girişleri yapıyoruz
		String[] sayi = sayilar.split(",");

		int[] dizi = new int[sayi.length];
		for (int i = 0; i < sayi.length; i++) {                   // zamanım az kaldı diğğerlerini yazamadım 
			dizi[i] = Integer.parseInt(sayi[i]);
		}
		int sayac=0;
		
		for (int j = 0; j < dizi.length; j++) {
			for (int i = 0; i < dizi.length; i++) {
				int a = i / 3;
				if (dizi[a] > dizi[i]) {
					System.out.println("a" + dizi[a]);
					System.out.println(dizi[i]);       
					int tmp = dizi[a];
					dizi[a] = dizi[i];
					dizi[i] = tmp;
					sayac++;
				}
			}
		}
		if(sayac!=0) {
			System.out.println("Dizi üclü Min heap degildi,Dizinin yeni hali");
		}else {
			System.out.println("Dizi üclü min heapdir değiştirme yapilmadi. ");
		}

		System.out.println("************");
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + "--");
		}
	}

}