package Proekt1;
import java.util.Scanner;
public class iterator2 {

	public static void main(String[] args) {
	Scanner input= new Scanner (System.in);
	System.out.println("Da se ispecatat clenovite na nizata koi ne se delivi so 3");
	System.out.println("Vnesi broj na clenovi vo niza");
	int n = input.nextInt ();
			
			int niza[] = new int[n];
			System.out.println ("Vnesi gi clenovite vo nizata");
			for (int i=0; i < niza.length; i++) {
				System.out.print(i + "==>");
				niza [i]= input.nextInt(); // vcitaj niza [i] - i-ti clen vo niza
			}
			for (int i = 0; i < niza.length; i++) {
				if (niza[i]  % 3 !=0 )
					System.out.println ("niza ["+ i +") = " +niza [i]) ;
				

	}
	}
} 
