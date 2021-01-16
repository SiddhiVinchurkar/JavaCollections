package package1;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Coll_5_LinkedHashSet {

	public static void main(String[] args) 
	{
		LinkedHashSet<Book> lhs = new LinkedHashSet<Book>();
		
		Book b1=new Book(1, "Ikigai", 300);
		Book b2=new Book(2, "Leap", 100);
		Book b3=new Book(3, "Ikigai", 300);  // duplicate objects are allowed and insertion order is maintained
		Book b4=null;
		
		lhs.add(b1);
		lhs.add(b1); // this is not added as it prints unique elements only
		lhs.add(b2);
		lhs.add(b3);
		//lhs.add(b4);  //Null pointer exception
		
		Iterator<Book> bItr=lhs.iterator();
		
		while(bItr.hasNext())
		{
			Book btr=(Book)bItr.next();
			System.out.println(btr.id+"\t"+btr.Bname+"\t"+btr.price);
		}
		
		/*
		lhs.addAll(lhs);
		lhs.remove(b1);
		lhs.addAll(lhs);
		lhs.clear();
		*/
	}

	
}


class Book
{
	int id;
	String Bname;
	float price;
	
	Book(int id,String Bname,float price)
	{
		this.id=id;
		this.Bname=Bname;
		this.price=price;
	}
	
}