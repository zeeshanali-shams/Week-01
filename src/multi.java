
interface multiplication
{
	public int mult(int x,int y);
}

class mul implements multiplication
{
	int x,y;
	public int mult(int x,int y)
	{
		int z;
		z = x*y;
		return z;
	}
}

public class multi {
	public static void main(String args[])
	{
		mul m = new mul();
		int x = 10;
		int y = 20;
		System.out.println("	The product of both the numbers is "+m.mult(x, y));
	}

}
