package doWhileLoop;

public class DoWhileTask7 {

	public static void main(String[] args) {
		int i = 1;
		do {
			if (i % 2 != 0)
				if (i > 6)
					System.out.println(i);
			i++;
		} while (i <= 10);
	}

}
