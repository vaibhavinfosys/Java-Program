package Constructor;

public class Gun3 {//BLC
	String gunName;//declaration
	int numberOfBullets;//declaration
	public Gun3(String gunName,int numberOfBullets) {
		this.gunName = gunName;
		this.numberOfBullets = numberOfBullets;
		}
	public void shoot() {
		for(int i = 1; i <= numberOfBullets; i++) {
			System.out.println("Fire/dishkew");
			
		}
	}
}
