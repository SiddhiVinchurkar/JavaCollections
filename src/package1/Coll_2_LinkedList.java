package package1;

import java.util.*;


public class Coll_2_LinkedList {

	public static void main(String[] args)
	{
	
		
		
		LinkedList<Student> ll2=new LinkedList<Student>();
		ll2.add(new Student(1,"Jon"));
		ll2.add(new Student(3,"George"));
		
		Student stu1=new Student(2, "Mary");
		ll2.add(1,stu1);   // add at a specific location
		
		LinkedList<Student> ll1=new LinkedList<Student>();
		ll1.add(new Student(10,"Snow"));
		ll1.add(new Student(11,"Cooper"));
		
		ll2.addAll(ll1);  // add new list to current list
		//ll2.addAll(0, ll1);    // add new list to current list at a specific location
		ll2.addLast(new Student(100,"North") );  // add at last position
		ll2.addFirst(new Student(101,"South"));  // add at first position
		//ll2.remove();    // removes the head element
		//ll2.removeLast();    // removes the last element
		//ll2.remove(3);    // remove at specific index
		ll2.removeAll(ll1);  // remove the entire list
		
		System.out.println("For ascending press 1 else 2");
		Scanner sc=new Scanner(System.in); 
		//int input=Integer.parseInt(sc.next());  // if input is taken in string format
		int input=sc.nextInt();
		
		switch((input))
		{
		case 1 :System.out.println("Ascending order is : ");
		
		Iterator<Student> itr1=ll2.iterator();
	 	while(itr1.hasNext())
		{
			Student stuItr1=(Student)itr1.next();
			System.out.println("RolNum : "+stuItr1.rolnum+" & Name : "+stuItr1.name);
		}
			break;
			
		case 2:System.out.println("Descending order is : ");
		
		Iterator<Student> itr2=ll2.descendingIterator();   // to reverse the list
		while(itr2.hasNext())
		{
			Student stuItr2=(Student)itr2.next();
			System.out.println("RolNum : "+stuItr2.rolnum+" & Name : "+stuItr2.name);
		}
			break;
		}
		
		
		sc.close();

	}

}


class Student
{
	int rolnum;
	String name;
	
	Student(int rolnum,String name)
	{
		this.rolnum=rolnum;
		this.name=name;
	}
}