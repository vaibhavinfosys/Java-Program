
public class strar_Traingle {
	public static void main(String[] args) {
		
	      String s1="mahatma gandi";
	      
	      char[] duplicate = s1.toCharArray();
	      
	      System.out.print("Duplicate character in string is : ");
	      
	      for(int i=0;i<=s1.length()-1;i++) {
	    	  for(int j=i+1;j<=s1.length()-1;j++) {
	    		  
	    		  if(duplicate[i]==duplicate[j]) {
	    			  System.out.print(duplicate[j]+" ");
                    break;
	    		  }
	    		  
	    	  }
	    	  
	      }
	     
		
		}
	}



