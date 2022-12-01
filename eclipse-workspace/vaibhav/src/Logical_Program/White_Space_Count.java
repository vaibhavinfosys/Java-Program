package Logical_Program;

public class White_Space_Count {
	public static void main(String[] args) {
		String s="V E L O C I T Y";
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
		 char actChar = s.charAt(i);
			   if(actChar==' ') {
				   count++;
			   }
		}
		System.out.println(count);
		

}
	}


