package Basics;

public class Q1Person {
private String name;
private int age;
public Q1Person(String name,int age)
{
	this.name=name;
	this.age=age;
}
public String getname() {
	return name;
}
public int getage() {
	return age;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1Person Person = new Q1Person("RAKESH",25);
		System.out.println("Name:"+Person.getname());
		System.out.println("Age:"+Person.getage());
		
	}

}
