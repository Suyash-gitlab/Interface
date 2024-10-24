package Inheritence;
import java.util.*;


class college
{
	void staff()
	{
		System.out.println("Total 36 Teacher in college");
	}
	
	void acc() 
	{
		System.out.println(" four acc of college");
	}
}
class student extends college
{
	void info()
	{
		System.out.println("100 students in college");
	}
}
public class Single_Inheritance 
{

	public static void main(String[] args) 
	{
		student c=new student();
		c.staff();
		c.acc();
		c.info();
		

	}

}
