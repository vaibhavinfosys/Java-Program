
public class John {
	public static void main(String []Args){
		String s1="Iamveryluckytoworkwithyou";

		 char[] ch=s1.toCharArray();

		for(int i=0;i<=s1.length()-1;i++){
		for(int j=i+1;j<=s1.length()-1;j++){

		if(ch[i]==ch[j]){
		System.out.print(ch[j]+" ");
		break;
		}
		}
		}
		}


}
