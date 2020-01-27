import java.util.*;
class ArrayListDemo1 
{
	public static void main(String[] args) 
	{

		ArrayList al=new ArrayList();
		al.add("Raja");
		al.add(10);
		al.add(new StringBuffer("SB"));
		al.add(new Integer(100));
		al.add(-106);
		al.add(new Float(8.9f));
		al.add(true);
		System.out.println(al+"  "+al.size());
		al.add(-106);
		al.add(new Float(8.9f));
		al.add(true);
		al.add(null);
		System.out.println(al+"  "+al.size());
		al.add("Raja");
		al.add(10);
		al.add(new StringBuffer("SB"));
		al.add(new Integer(100));
		al.add(-106);
		al.add(new Float(8.9f));
		al.add(true);
		al.add(null);
		System.out.println(al+"  "+al.size());
		al.add(-106);
		al.add(new Float(8.9f));
		al.add(true);
		al.add(null);
		System.out.println(al+"  "+al.size());
	}
}
