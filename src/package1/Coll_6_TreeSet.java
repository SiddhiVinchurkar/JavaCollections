package package1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Coll_6_TreeSet {

	public static void main(String[] args) 
	{
		Set<Books> ts=new TreeSet<Books>();
		
		Books b1=new Books(1, "Ikigai", 300);
		Books b2=new Books(2, "Leap", 100);
		Books b3=new Books(3, "Ikigai", 300);  // duplicate objects are allowed and insertion order is maintained

		Books b4=null;

		ts.add(b1);
		ts.add(b1); // this is not added as it prints unique elements only
		ts.add(b2);
		ts.add(b3);
	//	ts.add(b4);     // as null elements are not allowed this gives a null pointer exception
		
		Iterator<Books> bsItr=ts.iterator();
		while(bsItr.hasNext())
		{
			Books bstr=(Books)bsItr.next();
			System.out.println(bstr.id+"\t"+bstr.Bname+"\t"+bstr.price);
		}
		
		/*
		ts.addAll(ts);
		ts.remove(b1);
		ts.addAll(ts);
		ts.clear();
		*/

	
	
	}

	
	
	
}


//implements Comparable is mandatory otherwise ClassCastException is thrown          	
//All elements inserted into a sorted set must implement the Comparable interface (or be accepted by the specified comparator
class Books implements Comparable<Books>
{
	int id;
	String Bname;
	float price;
	
	Books(int id,String Bname,float price)
	{
		this.id=id;
		this.Bname=Bname;
		this.price=price;
	}

// if the code is not written for this method, it only prints the 1st element
	@Override
	public int compareTo(Books b)
	{
		if(id>b.id)
		{	
			return 1;	
		}
		else if (id<b.id)
		{	
			return -1;	
		}
		else
		{
			return 0;
		}
		
	}
	
}