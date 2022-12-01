import java.util.Arrays;

class C {
  public static void main(String[] args) {
    String str1 = "Race";
    String str2 = "Care";
    
    char[] first = str1.toCharArray();
    char[] second = str2.toCharArray();
           Arrays.sort(first);
          Arrays.sort(second);
          
          for(char sort:first) {
        	  System.out.print(sort);
          }
          System.out.println();
          for(char sort2:second) {
        	  System.out.print(sort2);
          }
          
          if(Arrays.equals(first,second)) {
        	  System.out.println("Given String is Anagram");
          }
          else {
        	  System.out.println("Given String is not anagram");
          }
         
}
}