import java.util.*;

class ArrayListDemo4 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		//Collections.synchronizedList(al);

		Collections.synchronizedList(al);
		System.out.println(al);
	}
}
/*
	Collections.synchronizedList(List lst);
	OR
	Collections.synchronizedList(List lst,Object obj);

*/
