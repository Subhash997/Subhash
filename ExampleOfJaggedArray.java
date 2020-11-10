package arraylist;

	  public class ExampleOfJaggedArray
	  {  
	     public static void main(String[] args)
	     {
	         // Creation of Array
	         int[][] number;
	         String[][] names;
	         
	         // Construction of Array
	         number = new int[2][3];
	         names = new String[3][3];
	         
	         // initilization of Array
	         for(int i = 0; i < 2; i++)
	         {
	             for(int j = 0; j < 3; j++) 
	             {
	                 number[i][j] = i+j;
	                 names[i][j] = "Hello"+i+j;
	             }
	         }
	         
	         // Accessing of Array
	         for(int i = 0; i < 2; i++)
	         {
	             for(int j = 0; j < 3; j++) 
	             {
	                 System.out.println(number[i][j]);
	                 System.out.println(names[i][j]);
	             }
	         }
	     }  
	 }  

