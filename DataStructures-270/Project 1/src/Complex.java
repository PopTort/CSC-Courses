

public class Complex {
	
	private int real;
	private int imaginary;
	private static double i = Math.pow(1,1/2);
	
	Complex(){
	
		real = 0;
		imaginary = 0;
	
	}
	
	Complex(int x, int y){
		
		this.real = x;
		this.imaginary = y;
	
	}
	
	public static Complex add (Complex x, Complex y) {
		Complex sum = new Complex(0,0);
		
		sum.real = x.real + y.real;
		sum.imaginary = x.imaginary + y.imaginary;
		
		return sum;
	}

	public static Complex subtract (Complex x, Complex y) { 
		Complex diff = new Complex (0,0);
		
		diff.real = y.real - x.real;
		diff.imaginary = y.imaginary - x.imaginary;
		
		return diff;
	}
	
	public void display () {
		System.out.println("("+real+","+imaginary+"i)");
		
	}

	public static void main(String[] args) {
		Complex c1=new Complex(5, 8);
		Complex c2=new Complex(2, -9);
		System.out.println("The two numbers:");
		c1.display();
		c2.display();
		
		Complex temp1 = add(c1,c2);
		System.out.println("Sum: (" + temp1.real + " + " + temp1.imaginary + "i) = ["+ (temp1.real + temp1.imaginary + i)+ "]");
		Complex temp2 = subtract(c1,c2);
		System.out.println("Difference: (" + temp2.imaginary + " - " + temp2.real + "i) = ["+ (temp2.real - temp2.imaginary + i)+ "]");

		
	}

}