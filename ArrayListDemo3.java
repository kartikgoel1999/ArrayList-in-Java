import java.util.*;
class ArrayListDemo3 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(12);
		al.add("Java");
		al.add("Hibernate");
		al.add(new StringBuffer("Core"));
		al.add(20);
		al.add(120);
		System.out.println(al);
		StringBuffer sb1=(StringBuffer)al.get(3);
		//System.out.println("get(3)::"+);
		al.set(3,89);
		System.out.println("After set ::"+al);
		StringBuffer sb2=(StringBuffer)al.get(3);
		al.remove(2);
		System.out.println(al);

		System.out.println("indexOf ::"+al.indexOf(89));
		al.add(12);
		System.out.println(al);
		System.out.println("lastindex ::"+al.lastIndexOf(12));


	}
}
