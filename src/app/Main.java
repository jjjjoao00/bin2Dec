package app;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int a,b,c,d,e,f,g,h;

		
		System.out.println("Digite 1 ou 0: ");
		a = sc.nextInt();
		
		System.out.println("Digite 1 ou 0: ");
		b = sc.nextInt();
		
		System.out.println("Digite 1 ou 0: ");
		c = sc.nextInt();
		
		System.out.println("Digite 1 ou 0: ");
		d = sc.nextInt();
		
		System.out.println("Digite 1 ou 0: ");
		e = sc.nextInt();
		
		System.out.println("Digite 1 ou 0: ");
		f = sc.nextInt();
		
		System.out.println("Digite 1 ou 0: ");
		g = sc.nextInt();
		
		System.out.println("Digite 1 ou 0: ");
		h = sc.nextInt();
		
		//implementação da logica
		
		if (a == 0 || a == 1 || b == 0 || b == 1  || c == 0 || c == 1  || d == 0 || d == 1
				|| e == 0 || e == 1 || f == 0 || f == 1  || g == 0 || g == 1  || h == 0 || h == 1) {
			
			
			
			int h2 = 1;
			int g2 = h2 * 2;
			int f2 = g2 * 2;
			int e2 = f2 * 2;
			int d2 = e2 * 2;
			int c2 = d2 * 2;
			int b2 = c2 * 2;
			int a2 = b2 * 2;
			
			int dec = (a * a2) + (b * b2) + (c * c2) + (d * d2) + (e * e2) + (f * f2) + 
					(g * g2) + (h * h2);
			
			System.out.println(dec);
			
		}else System.out.println("Sequência de numeros inválidos");
		
		
		
		
		
		
		
		

	}

}
