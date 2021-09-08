//Java
package aa;
import static java.lang.System.out;
public class four {
	public static void main(String args[]) {
		int mas[]= { -1, 1, 3, 34, 67, 0, 6, 87,9, 11, -6, -54, 543};
		printMas(mas);
		int k = 0;
		for (int i = mas.length - 1; i > 0; i--) {
		for (int j = 0; j < i; j++) 
		{
			if (mas[j] > mas[j + 1]) 
				{
				int tmp = mas[j];
				mas[j] = mas[j + 1];
				mas[j + 1] = tmp;
				k++;
				}
			}
		}

		out.println();
		out.println( "количество перестановок " +k );
		printMas(mas);
	}
		public static void printMas(int[] array) 
		{
			for (int i=0; i<=array.length-1; i++) 
			{
				out.print(array[i]+"\t");
			}
		}
}

