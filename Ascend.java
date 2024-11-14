// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int)(Math.random()*lim);
		int b = (int)(Math.random()*lim);
		int c = (int)(Math.random()*lim);
		System.out.println(a + " " + b + " " + c);
		if (a<b)
			if (a<c)
				System.out.println(a + " " + Math.min(b,c) + " " + Math.max(b,c));
			else
				System.out.println(c + " " + a + " " + b);		
		else if (b<c)
			System.out.println(b + " " + Math.min(a,c) + " " + Math.max(a,c));
		else
			System.out.println(c + " " + b + " " + a);		
	}
		
}
