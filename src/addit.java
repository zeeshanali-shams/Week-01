interface addition
{
	public int ad(int x,int y);
}

class add implements addition
{
	int x,y;
	public int ad(int x,int y)//The ad() is the method used for addition
	{
		int z;
		z=x+y;
		return z;
	}
}

public class addit {
	public static void main(String args[])
	{
		add a = new add();
		int x = 10;
		int y = 20;
		System.out.println("	The sum of the two number is "+a.ad(x, y));
		
	}
}


