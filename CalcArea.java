class Triangle{
	float base,height;
	Triangle()
	{
		base=2.4f;
		height=1.7f;
	}
	Triangle(float  b,float h)
	{
		base=b;
		height=h;
	}
	float area()
	{  
		return((0.5f)*base*height);
	}
}

class CalcArea{
	public static void main(String args[]){
		Triangle t1=new Triangle();
        System.out.println("Area of Triangle is >>  " +t1.area());
		Triangle t2=new Triangle(3.5f,6.2f);
	    System.out.println("Area of Triangle is >> "+t2.area());
	}
}