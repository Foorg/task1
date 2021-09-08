package aa;
import static java.lang.System.out;
import java.util.Scanner;
public class two {
		public static void main(String[] args) {
		    Scanner in=new Scanner(System.in);
			System.out.println("Ââåäèòå ðàçìåðíîñòü ìàññèâà: ");
			int n=in.nextInt();
			int[] a;
			a = new int[n];
			for (int i = 0; i < a.length; i++) {
			    a[i] = (int) Math.round((Math.random() * 30) - 15);
			}
			
			printMas(a);
			System.out.println();
			
			int v;
			for (int i = 0; i < n; i++)
		    {
		        if (a[i] <= 0)
		        {
		            for (int j = 0; j < i; j++)
		            {
		                if (a[j] > 0)
		                {
		                    v = a[i];
		                    a[i] = a[j];
		                    a[j] = v;
		                }
		            }
		        }
		    }
			
			printMas(a);
		}
		
		public static void printMas(int[] array) {
		      for (int i=0; i<=array.length-1; i++) {
		          {
		              out.print(array[i] + "\t");
		          }
		     }
	     }
	}

