package interview;
import java.util.Scanner;
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,a[];
           Scanner s=new Scanner(System.in);
           System.out.println("Enter the size of array");
           size=s.nextInt();
           a=new int[size];
           
           for(int i=0;i<size;i++){
        	   System.out.println("Enter the element at position "+i);
        	   a[i]=s.nextInt();
           }
           
           System.out.println("Initial array is ");
          for(int i=0;i<size;i++){
        	  System.out.print(a[i]+" ");
          }           
          
       for(int i=1;i<size;i++){
    	   int value=a[i];
    	   int hole=i;
    	   
    	   while(hole>0 && a[hole-1]>value){
    		   a[hole]=a[hole-1];
    		   hole=hole-1;
    	   }
    	   a[hole]=value;
    	   
       }
          
          System.out.println("\nAfter sorting...");
          for(int i=0;i<size;i++){
        	  System.out.print(a[i]+" ");
          }
          
	}
	
	

}
