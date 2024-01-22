package hw1;

public class homework6 extends homework5 {
	
//	• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//	5 + 5
//	5 + ‘5’
//	5 + “5”
//	並請用註解各別說明答案的產生原因

    public static void main(String[] args) {
    	
    	System.out.println( 5 + 5 ); //數值與數值相加 = 10
    	System.out.println( 5 + '5' );//'5'在編碼表裡面為53,因此 = 58
    	System.out.println( 5 + "5"); //數值5與字串"5"相加,轉為字串 =55
    	
    }

}
