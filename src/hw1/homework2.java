package hw1;

public class homework2 extends homework1 {

//	• 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
	public static void main(String[] args) {

		int eggs = 200;
		int dozen = 12;
		System.out.println("共" + (eggs / dozen) + "打");

	}
}
