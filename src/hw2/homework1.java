package hw2;

public class homework1 {

//	 請建立一個TestNineNine.java程式，可輸出九九乘法表
//	 • 一：使用for迴圈 + while迴圈
//	 • 二：使用for迴圈 + do while迴圈
//	 • 三：使用while迴圈 + do while迴圈	

	public static void main(String[] args) {

		int i, j;
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= 9; j++)// 重跑之後j又是新的1
				System.out.print(i + "*" + j + "=" + i * j + "\t");// \t是tab
			System.out.println();// 換下一行
		}

		System.out.println("=============================");

		for (int a = 1; a <= 9; a++) {
			int b = 0;
			while (b <= 8) {
				b++;
				System.out.print(a + "*" + b + "=" + a * b + "\t");

			}
			System.out.println();
		}

		System.out.println("==============================");

		for (int c = 1; c <= 9; c++) {
			int d = 0;
			do {
				d++;
				System.out.print(c + "*" + d + "=" + c * d + "\t");
			} while (d <= 8);
			System.out.println();
		}

		System.out.println("==============================");

		int e = 0;
		while (e++ <= 8) {
			int f = 0;
			do {
				f++;
				System.out.print(e + "*" + f + "=" + e * f + "\t");
			} while (f <= 8);
			System.out.println();
		}
//		請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)	

		int g = 1000;
		int sum = 0;
		for (int h = 1; h <= g; h++) {
			if (h % 2 == 0) {
				sum += h;
			}
		}
		System.out.println(sum);

//		• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)	

		int l = 1;
		for (int m = 1; m <= 10; m++) {
			l *= m;
		}
		System.out.println(l);

//		• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)

		int l1 = 1;
		int m1 = 1;
		while (m1 <= 10) {
			l1 *= m1;
			m1++;
		}
		System.out.println(l1);

//		• 請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100

		for (int m2 = 1; m2 <= 10; m2++) {
			int sum2 = m2 * m2;
			System.out.println(sum2 + " ");
		}

//		阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？

		// 避開4、14、24、34、40~44
		// 輸出1~39
		// 計算有幾個可以使用的數字

		for (int m3 = 1; m3 <= 39; m3++) {
			
			String text = Integer.toString(m3);
			if(text.contains("4")) {
				continue;
			}
			System.out.print(text+",");
		}

//		• 請設計一隻Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1

		for (int bb = 10; bb > 0; bb--) {
			for (int aa = 1; aa <= bb; aa++) {
				System.out.print(aa + " ");
			}
			System.out.print("\n");
		}

//		請設計一隻Java程式，輸出結果為以下：
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF	

		for (int a = 0; a <= 5; a++) {
			for(int b = 0; b < a + 1; b++) {
				char text = 'A';
				System.out.print((char)(text + a));	
			}
			System.out.print("\n");	
		}

	}
}
