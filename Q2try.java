import java.util.Scanner;
public class Q2try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner input=new Scanner(System.in);
		
		System.out.println("----------------------------------------------------");
		System.out.println("      English to Ubbi Dubbi Translator Program");
		System.out.println("----------------------------------------------------");
		System.out.println();
		
		System.out.println("Please enter the English sentence "+ 
		                   "you want translated into Ubbi Dubbi");
		System.out.println("(Be sure to have 1 space between words and not have "+ 
		                   "any spaces at the front and end of the sentences)");
		String sentence=input.nextLine();
		int sLength=sentence.length();
		sentence=sentence+" ";
		
		
		System.out.println("Translated sentence:");
	
		
	    for(int index=0;index<=sLength-1;index++ )
		{
		   
		       int b=sentence.indexOf(" ");

			   String word=sentence.substring(0,b);
		       sentence=sentence.substring(b+1);//sentence after
		  
			  if (word.length()==1)
			  {
				  if(word.charAt(0)=='e')
					  System.out.print(word);
				  else
					  System.out.print("ub"+word);
			  }  
			  else if (word.length()==2)
			  {
				   System.out.print("ub"+word.charAt(0));
			   
				   if(word.charAt(1)=='e')
					   System.out.print('e');
				   else
					   System.out.print("ub"+word.charAt(1));  
			  }  
			   
			  else
			  {
				  int wLength=word.length();
				  for (int j=0;j<=wLength-1;j++)
				  {
					  char c=word.charAt(j); 
					  if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
					  {
						  if(j==wLength-1)
						  {
							  if(c!='e')
							  {
								  System.out.print("ub");
						      }
						  
						      System.out.print(c);
						  } 
						 
					     System.out.print("ub"+c+word.charAt(++j));
					   }
				       else
				    	  System.out.print(c); 	  
				  }
				  	  
				  if(index!=sLength-1)
			            System.out.print(" ");
			    }
			  
		   }
		
		 System.out.println();
		 
		 System.out.println("Have fun speaking it!!!");
		
		
		
	}
}
