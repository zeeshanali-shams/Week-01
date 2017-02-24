
interface lcm1
{
	public void lcm2(int p,int q);
	
}

class calc implements lcm1
{
	int p,q;
	public void lcm2(int p,int q)
	{
		if (p%q==0)
			System.out.println("	The lcm of the two number is"+p);
		else
			lcm2(q,p%q);
		
		
					
	}
}






public class lcm 
{	
	public static void main(String args[])
	{
		calc c = new calc();
		int p=256;
		int q=115;
		c.lcm2(p, q);
		
	}

}

