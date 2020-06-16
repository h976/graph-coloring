//TEST GLOUTON//
package testGlouton;

import java.io.*; 
import java.util.*; 


public class TestGlouton {

	private int V;  
	private ArrayList<boolean[]> graph = new ArrayList<boolean[]>();

	 
	TestGlouton(ArrayList<boolean[]> graph) 
	{ 
		this.graph = graph;
		V = graph.size();  
	} 

	void greedyColoring() 
	{ 
		int result[] = new int[V]; 
		boolean available[] = new boolean[V];
		boolean[] myBoolArray;


		for(int i=0; i<V; i++) {
			result[i] = -1;
		}

		result[0] = 0; 

		for(int i=0; i<V; i++) {
			available[i] = true;
		}

	
		for (int u = 1; u < V; u++) 
		{ 
			myBoolArray = graph.get(u);
			
			for(int i=0; i<V; i++) {
				if (myBoolArray[i] && result[i] != -1) 
					available[result[i]] = false; 
			}
				
		
			 
			int cr; 
			for (cr = 0; cr < V; cr++){ 
				if (available[cr]) 
					break; 
			} 

			result[u] = cr; 

			for(int i=0; i<V; i++) {
				available[i] = true;
			}
		} 

		// print the result 
		for (int u = 0; u < V; u++) 
			System.out.println("Vertex " + u + " ---> Color "
								+ result[u]); 
	} 

}
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
