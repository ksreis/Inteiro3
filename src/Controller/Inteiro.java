package Controller;

public class Inteiro {
		public Inteiro() {
			super();
}		
	public static int fibonacci(int n) {
	if(n < 2) {
		return 1;
	}
	return fibonacci(n - 1) + fibonacci(n - 2);
	}
}	