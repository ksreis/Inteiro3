package View;

import Controller.Inteiro;

public class Principal {
	public static void main(String[] args) {
		Inteiro It = new Inteiro();
		
		int n = 9;
		
		int fibonacci = It.fibonacci(n);
		
		 System.out.println( fibonacci  );
    }
}


