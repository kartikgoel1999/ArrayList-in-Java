import java.util.*;
class ArrayListDemo2 
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
		System.out.println("Size :: "+al.size());
		System.out.println("isEmpty :: "+al.isEmpty());
		System.out.println("contains :: "+al.contains(120));
		System.out.println("contains :: "+al.contains(1200));
		Object[] obj=al.toArray();
		System.out.println("Length of Array :: "+obj.length+"  "+obj[4]);
		System.out.println("remove :: "+al.remove("Java"));
		System.out.println(al);
		ArrayList al1=new ArrayList();
		al1.add("CSS");
		al1.add("HTML");
		al1.add(11);
		al1.add(111);
		System.out.println(al1);
		al.addAll(al1);
		System.out.println(al);
		ArrayList al2=new ArrayList();
		al2.add("C");
		al2.add("C++");
		al2.add(22);
		al2.add(222);
		System.out.println(al2);
		al.add(al2);
		System.out.println(al);
		System.out.println("equals :: "+al1.equals(al2));
		System.out.println("containsAll :: "+al.containsAll(al1));
		al.retainAll(al1);
		System.out.println("After retainAll :: "+al);
		System.out.println(al.hashCode());
		/*al.removeAll(al2);
		System.out.println(al);

		al.remove(al2);
		System.out.println(al);

		al.removeAll(al1);
		System.out.println(al);*/
	}
}
