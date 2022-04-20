package application;

public class Programa {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.print(" (" + (i + 1) + ",");
			for (int j = 0; j < 10; j++) {
				System.out.print(" " + (j + 1));
				if (j == 9) {
					System.out.println(")");
				}
			}
		}
	}
}
