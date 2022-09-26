package maxmin;
import java.util.Scanner;
import java.util.Scanner;

public class maxmin {

	public static void main(String[] args) {
		int n1,n2,n3,n4,buyuk1=0,buyuk2=0,enkucuk=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Birinci sayıyı giriniz:");
		n1=scanner.nextInt();
		System.out.println("İkinci sayıyı giriniz:");
		n2=scanner.nextInt();
		System.out.println("Üçüncü sayıyı giriniz:");
		n3=scanner.nextInt();
		System.out.println("Dördüncü sayıyı giriniz:");
		n4=scanner.nextInt();
		
		if(n1>n2) {
			buyuk1=n1;	
			if(n3>n4) {
				buyuk2=n3;
				if(n2<n4) {enkucuk=n2;}
				else {enkucuk=n4;}
			}
			else if(n3<n4)
			{
				buyuk2=n4;
				if(n2<n3) {enkucuk=n2;}
				else {enkucuk=n3;}
			}
			
			if(buyuk1>buyuk2)
			{
				System.out.println("En büyük sayi : "+buyuk1);
				
				System.out.println("En küçük sayi : "+enkucuk);
			}
			
		}
		else if(n1<n2) {
			buyuk1=n2;
			if(n3>n4) {
				buyuk2=n3;
				if(n1<n4) {enkucuk=n1;}
				else {enkucuk=n4;}
			}
			else if(n3<n4)
			{
				buyuk2=n4;
				if(n1<n3) {enkucuk=n1;}
				else {enkucuk=n3;}
			}
			if(buyuk1<buyuk2)
			{
					System.out.println("En büyük sayi : "+buyuk2);
					System.out.println("En küçük sayi : "+enkucuk);
			}
		}
		
		
		
	}
	}


