package doWhileLoop;

public class DoWhileTask4 {

	public static void main(String[] args) {
	long i=1;
	do {
		if(i%2==0)
			System.out.println(i+" is EVEN");
		else
			System.out.println(i+" id ODD");
		i++;
	}while(i<=10);
    
	}
}
