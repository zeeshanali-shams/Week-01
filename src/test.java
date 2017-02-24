
interface methods
{
		void swappping(swap p);//unary method
		void display(int x,int y);//binary method
		void tri(int e,int f,int g);//ternary method
}

class swap implements methods//class swap uses the method swapping defined in the interface methods

{
	public int b;
	public int a;

	public void  swapping(swap p)
	{
		int temp;
		temp = p.a;
		p.a = p.b;
		p.b = temp;
	}

	

	public void display(int x, int y) {
			
	}

	public void tri(int e, int f, int g) {
		
	}



	public void swappping(swap p) {
		// TODO Auto-generated method stub
		
	}



		
}	

class print implements methods//class print uses methods display and tri from the interface methods
{
	public int c;
	public int d;
	public int e,f,g;
	
	public void display(int c,int d)
	{
		System.out.println("	The value of a is "+c);
		System.out.println("	The value of b is "+d);
	}

	public void swappping(swap p) {
		
		
	}

	public void tri(int e, int f, int g) 
	{
		System.out.println("	The sides of the triangle are "+e+", "+f+" and "+g);
	}
}






public class test {
	

	
	public static void main(String args[])
	{
		
		swap s = new swap();
		s.a = 10;
		s.b = 20;
		System.out.println("	Before the swap the values of a and b are "+s.a+" and "+s.b+" respectively");
		s.swapping(s);//calling the unary method
		System.out.println("	After the swap the values of a and b are "+s.a+" and "+s.b+" respectively");
		print m = new print();
		int c = 30;
		int d = 40;
		m.display(c,d);//calling the binary method
		print t = new print();
		int e = 3;
		int f = 4;
		int g = 5;
		t.tri(e,f,g);//calling the ternary method
	
	
	}
}



