package Logical_Program;

public class Remove_Multiple_Special_Character {
	public static void main(String[] args) {
		String s="vai@b$h%av";
		System.out.println(s.replaceAll("[^a-zA-Z]", ""));
	}

}
