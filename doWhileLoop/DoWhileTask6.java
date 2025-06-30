package doWhileLoop;

public class DoWhileTask6 {

	public static void main(String[] args) {
		int i = 1;
		do {
			if (i == 1)
				System.out.println(i + " is LOW");
			else if (i == 2 || i == 3)
				System.out.println(i + " is MEDIUM");
			else if (i == 4 || i == 5)
				System.out.println(i + " is HIGH");
			i++;
		} while (i <= 5);

	}

}
