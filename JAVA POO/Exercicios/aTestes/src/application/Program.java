package application;

public class Program {

	public static void main(String[] args) {
		
		String[] vetor = new String[] {"Maria","Bob","Alex","Maria","Bob","Alex","Maria","Bob","Alex"};
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
			
		}
		System.out.println("");
		for (int i = 0; i < 5; i++) {
			System.out.println(vetor[i]);
			
		}
		
		for (String obj : vetor) {
			
		}
	}

}
