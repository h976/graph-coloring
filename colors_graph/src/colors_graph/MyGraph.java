package colors_graph;

import java.util.ArrayList;
import java.util.Scanner;

public class MyGraph {
	
	static void printSolution(ArrayList<Integer> color) 
	{ 
		System.out.println( "Solution Exists: Following are the assigned colors "); 
		for (int i = 0; i < color.size(); i++) 
			System.out.println(color.get(i)); 
	} 
	
 
	static boolean isSafe(ArrayList<boolean[]> arr, ArrayList<Integer> color) 
	{ 
		int t = arr.size();
		for (int i = 0; i < t; i++) 
			for (int j = i + 1; j < t; j++) 
				if ( 
						arr.get(i)[j] && color.get(j) == color.get(i)) 
					return false; 
		return true; 
	}  
	
	
	
	static boolean graphColoring(ArrayList<boolean[]> arr, int m, int index, ArrayList<Integer> color) 
		{ 
			if (index == arr.size()) { 
				if (isSafe(arr, color)) { 
					printSolution(color); 
					return true; 
				} 
				return false; 
			} 
			
			for (int j = 1; j <= m; j++) { 
				color.set(index,j); 
				if (graphColoring(arr, m, index + 1, color)) 
					return true; 			 
			} 

			return false; 
		} 

	
	

	@SuppressWarnings("null")
	public static void main(String[] args) {
			ArrayList<boolean[]> graph = new ArrayList<boolean[]>();
			int taille = 0;
			ArrayList<Integer> solutionColor = new ArrayList<Integer>();
			
		 	Scanner sc = new Scanner(System.in);
		 	System.out.println("Enter your graph size : ");
		 	taille = sc.nextInt();	        
	        
	        for(int i=0;i<taille;i++){
	        	boolean[] myBoolArray= new boolean[taille];
	        	for(int j=0;j<taille;j++){
	        	System.out.println("Enter a true or false value : ");
	        	myBoolArray[j] = sc.nextBoolean();
	        	}
	        	graph.add(myBoolArray);

	        	   }
	        for (int i = 0; i < taille; i++) {
	    		solutionColor.add(0);
	        }
	        
	    	int n = 0 ;
	    	while (!graphColoring( graph, n, 0, solutionColor)) {
	    			n++;
	    			}
	    			}

	        	}

	

