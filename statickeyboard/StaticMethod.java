package statickeyboard;

public class StaticMethod
{
	int id;
	String Name;
	static String Collage="Government Collage";
	static void changes()
	{
		Collage=" Private Collage";
		
	}
	StaticMethod(int id,String Name)
	{
		this.id=id;
		this.Name=Name;
		
	}
	void Display()
	{
		System.out.println("Student ID");
		
	}
	public static void main(String[] args)
	{
		StaticMethod.changes();
		StaticMethod sb=new StaticMethod(88,"Magi");
		sb.Display();
		StaticMethod sb1=new StaticMethod(88,"Magima");
		sb1.Display();
		StaticMethod sb2=new StaticMethod(89,"Magichill");
		sb2.Display();
		
	}

}
