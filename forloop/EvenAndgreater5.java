package forloop;

public class EvenAndgreater5 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				if(i>5)
					System.out.println(i);
			}
		}
	}

}
