
public class This {
	int a=50;
	public void test() {
		int a=60;
		System.out.println(this.a);
	
	}
	public static void main(String[] args) {
	 This s=new This();
	 s.test();
	}
	}


