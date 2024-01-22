package hw1;

public class homework3 extends homework2 {
	
//	• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	public static void main(String[] args) {
		
	int second = 256559;
	int minute = 60;
	int hours = 60;
	int day = 24;
	
	int a = second/minute;
	int b = second/(minute * hours);
	int c = second/(minute * hours * day);
	
	System.out.println("分鐘:" + a );
	System.out.println("小時:" + b );
	System.out.println("天:" + c);
	
	}

}
