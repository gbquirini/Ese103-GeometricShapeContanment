package geometrichapes;

public class Triangle
{
	private double xv;
	private double yv;
	private double l;
	
	public Triangle(double xv, double yv, double l)
	{
		super();
		this.xv = xv;
		this.yv = yv;
		if(this.l<=0)
			throw new IllegalArgumentException("il lato non può essere minore o uguale a 0");
		this.l = l;
	}

	public double getXv()
	{
		return xv;
	}

	public void setXv(double xv)
	{
		this.xv = xv;
	}

	public double getYv()
	{
		return yv;
	}

	public void setYv(double yv)
	{
		this.yv = yv;
	}

	public double getL()
	{
		return l;
	}

	public void setL(double l)
	{
		if(this.l<=0)
			throw new IllegalArgumentException("il lato non può essere minore o uguale a 0");
		this.l = l;
	}
	
	
	
}
