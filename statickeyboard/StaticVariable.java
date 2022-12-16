package statickeyboard;

public class StaticVariable
{
	int id;
	String name;
	static String college = "AVASC";
	StaticVariable(int id,String name)
	{
		this.id=id;
		this.name=name;			
	}
	void Display()
	{
		System.out.println("student id");
	}
		public static void main(String[] args)
		{
			StaticVariable sb = new StaticVariable(1,"Gopi");
			sb.Display();
			StaticVariable sb1 = new StaticVariable(2,"Dinesh");
			sb1.Display();
			StaticVariable sb2 = new StaticVariable(3,"child");
			sb2.Display();
		}		

}
