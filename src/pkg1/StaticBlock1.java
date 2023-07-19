package pkg1;

public class StaticBlock1 
{
static
{
	System.out.println("running Static block");
}
{
	System.out.println("running non-static block");
}
public static void main(String[] args) 
{
	StaticBlock1 sb=new StaticBlock1();
	System.out.println("running main methods");
}
}
