package whileLoop;

public class SkipNum6From1To10 {

	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			if(i==6) {
				i++;
				continue;}
			System.out.println(i);
			i++;
		}

	}

}
