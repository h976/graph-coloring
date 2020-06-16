//COLORING//
package testGlouton;

import java.util.ArrayList;
import java.util.Scanner;

public class Coloring {

	public static void main(String[] args) {
		ArrayList<boolean[]> inGraph = new ArrayList<boolean[]>();
		int taille = 0;
		
		Scanner sc = new Scanner(System.in);
	 	System.out.println("Enter your graph size : ");
	 	taille = sc.nextInt();	 
	 	
	 	for(int i=0;i<taille;i++){
        	boolean[] inBoolArray= new boolean[taille];
        	for(int j=0;j<taille;j++){
        	System.out.println("Enter a true or false value : ");
        	inBoolArray[j] = sc.nextBoolean();
        	}
        	inGraph.add(inBoolArray);

        	   }
	 	
	 	TestGlouton g = new TestGlouton(inGraph);
	 	g.greedyColoring();

	}

}
# graph-coloring
# graph-coloring
# graph-coloring GLOUTON.java NAIVE.java
