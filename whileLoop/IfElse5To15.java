package whileLoop;

public class IfElse5To15 {

	public static void main(String[] args) {
		int i = 5;
		while (i <= 15) {
			if (i < 10)
				System.out.println(i + " less than 10");
			else if (i == 10)
				System.out.println(i + " equal to 10");
			else
				System.out.println(i + " greater than 10");

			i++;

		}

	}

}
