
public class Part2 {
	public static void main (String [] args) {
		int x = 0;
		
		do {
			if ((x%2)==0) {
				System.out.println(Math.pow(x, 2));
			}
			x++;
		} while (x <= 10);
	}
}
