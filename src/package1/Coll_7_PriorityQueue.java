package package1;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Coll_7_PriorityQueue {

	public static void main(String[] args) 
	{
	
		PriorityQueue<BookPQ> bpq=new PriorityQueue<BookPQ>();

		BookPQ b1=new BookPQ(1, "Ikigai", 300);
		BookPQ b2=new BookPQ(2, "Leap", 100);
		BookPQ b3=new BookPQ(3, "Ikigai", 300);  // duplicate objects are allowed and insertion order is maintained

		bpq.add(b1);
		bpq.add(b1); // this is allowed, no restriction of unique elements 
		bpq.add(b2);
		bpq.add(b3);
		
		
		
		System.out.println("------------------------List of books--------------------");
		Iterator<BookPQ> bpqItr=bpq.iterator();
		while(bpqItr.hasNext())
		{
			BookPQ bqtr=(BookPQ)bpqItr.next();
			System.out.println(bqtr.id+"\t"+bqtr.Bname+"\t"+bqtr.price);
		}
		
		System.out.println("\n");
		
		BookPQ bqtr=(BookPQ)bpq.peek();
		
		System.out.println("Head element is : "+bqtr.id+"\t"+bqtr.Bname+"\t"+bqtr.price); 
		
		
		bpq.poll() ;   //removes head of the queue and returns null if queue is empty
		//bpq.remove(); //removes head of the queue , throws exception if list is empty
		//bpq.remove(b3);
		
		System.out.println("\n");
		
		System.out.println("------------------------New List of books--------------------");

		
		for(BookPQ bq:bpq)
		{
			System.out.println(bq.id+"\t"+bq.Bname+"\t"+bq.price);
		}
	}

}



class BookPQ implements Comparable<BookPQ>
{
	int id;
	String Bname;
	float price;
	
	BookPQ(int id,String Bname,float price)
	{
		this.id=id;
		this.Bname=Bname;
		this.price=price;
	}

	
	// even if the code is not written for this method, it prints all the elements
	// Sorting here is done on the basis on price
	@Override
	public int compareTo(BookPQ o) {
		if(this.price>o.price)     // comparing current object to passed object
		{
			return 1;
		}
		else if(this.price<o.price)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}



		
	
	
}