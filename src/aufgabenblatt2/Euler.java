package aufgabenblatt2;

import java.lang.Math;
import org.junit.*;
public class Euler {

	public static void main(String[] args) {
		System.out.println( myexp(3,20) );
		//System.out.println( factorial(1));
		
		for (int j=1;j<18;j++){			//ab n=18 ist das ergebnis bis auf die 15. Stelle genau
			System.out.println( myexp(1,j) );
		}
	}

	
	public static double myexp(int x,int n){
		double exp=1;
		//int n = 65;				//ab einem n > 65 wird das Ergebnis NaN! ich denke das liegt  
		int po=x;					//unter anderem daran das dann auch die Fakultät 
		for (int i=1; i<=n;i++){	//von >65 bestimmt werden muss, welche extrem hoch ist
			if (i>1) {
				po=po*x;
			}
			exp=exp + po/factorial(i);
									//alternative mit Math.pow
			//exp=exp + (Math.pow(x, i))/factorial(i);
		}
		
		return exp;
	}
	
private static double factorial(int basis) {
		
		long factorial=1;
		for(int i =1;i<=basis;i++){
			factorial=factorial*i;
		}
		//System.out.println(factorial);
		return factorial;
	}
	
}