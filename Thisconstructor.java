class A
{
A()
{
this(10);
System.out.println("no parameterized constructor");
}
A(int a)
{
this(10,'c');
System.out.println("iam parametrized constructor");
}
A(int a,char b)
{
System.out.println("iam parameterized constructor");
}

public static void main(String[] args)
{
new A();
}
}