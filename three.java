//эта не работает, но € пыталась
package aa;
import java.util.Scanner;
public class three {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("¬ведите значение полуоси a: ");
		int a = in.nextInt();
		System.out.print("¬ведите значение полуоси b: ");
		int b = in.nextInt();
		
		System.out.print("¬ведите координаты центра х: ");
		int Xc = in.nextInt();
		System.out.print("¬ведите координаты центра у: ");
		int Yc = in.nextInt();
		
		System.out.println("¬ведите размерность массива: ");
		int n=in.nextInt();
		int[] mas;
		mas = new int[n];
		for (int i = 0; i < mas.length; i++) {
		   mas[i] = (int) Math.round((Math.random() * 10) - 5);
		}
		
		for (int i = 0; i<=2*n-1; i+=2) {
			if (mas[i] <= Xc + sqrt((1-((mas[i+1])^2)/b^2)*a^2)){
				for (int j = 1; j<2*n; j+=2) {
					if (mas[j] <= Yc + sqrt((1-((mas[j])^2)/a^2)*b^2)){
						System.out.println(i);
					}
				}
			}
		}
	}

	private static int sqrt(int i) {
		return 0;
	}
}

