package doWhileLoop;

public class DoWhileTask10 {

	public static void main(String[] args) {
		int i = 1, count = 0;
		do {
			if (i % 7 == 0) {
				System.out.println(i);
				count++;
			}
			i++;
		} while (count < 5);
	}

}
