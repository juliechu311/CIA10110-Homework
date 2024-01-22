package hw1;

public class TestNumbers {

	public static void main(String[] args) {

	

		for (int count = 0; count <= 100; count++) {
			if ( count % 4 == 0 )
			System.out.print(count + " ");
		}
		
		System.out.println( );
		
		for (int i = 0; i <= 100 ; i += 4) {
			System.out.print( i+ " ");
			
		}
	}
}
