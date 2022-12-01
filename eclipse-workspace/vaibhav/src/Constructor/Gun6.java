package Constructor;

public class Gun6 {//BLC
	String gunName;//declaration
	int numberOfBullets;//declaration
	public Gun6(String gunName,int numberOfBullets) {
		this.gunName = gunName;
		this.numberOfBullets = numberOfBullets;
		}
	public void shoot() {
		for(int i = 1; i <= numberOfBullets; i++) {
			System.out.println("Fire/dishkew");
			
		}
	}
}
