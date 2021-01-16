package package1;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class Coll_8_Dequeue {

	public static void main(String[] args) 
	{
	
		PriorityQueue<BookDQ> bdq=new PriorityQueue<BookDQ>();

		BookDQ b1=new BookDQ(1, "Ikigai", 300);
		BookDQ b2=new BookDQ(2, "Leap", 100);
		BookDQ b3=new BookDQ(3, "Why we sleep", 500);
		BookDQ b4=new BookDQ(4, "Stay Connected", 400);
		
		
		bdq.add(b1);
		bdq.add(b2);
		bdq.add(b3);
		bdq.offer(b4);  // adds element
		
		
		System.out.println("------------------------List of books--------------------");
		Iterator<BookDQ> bdqItr=bdq.iterator();
		while(bdqItr.hasNext())
		{
			BookDQ bqtr=(BookDQ)bdqItr.next();
			System.out.println(bqtr.id+"\t"+bqtr.Bname+"\t"+bqtr.price);
		}
		
		System.out.println("\n");
		
		BookDQ bqtr=(BookDQ)bdq.peek();
		
		System.out.println("Head element is : "+bqtr.id+"\t"+bqtr.Bname+"\t"+bqtr.price); 
		
		
		bdq.poll() ;   //removes head of the queue and returns null if queue is empty
		//bpq.remove(); //removes head of the queue , throws exception if list is empty
		//bpq.remove(b3);
		
		System.out.println("\n");
		
		System.out.println("------------------------New List of books--------------------");

		
		for(BookDQ bq:bdq)
		{
			System.out.println(bq.id+"\t"+bq.Bname+"\t"+bq.price);
		}
	

	}

}



class BookDQ implements Comparable<BookDQ>
{
	int id;
	String Bname;
	float price;
	
	BookDQ(int id,String Bname,float price)
	{
		this.id=id;
		this.Bname=Bname;
		this.price=price;
	}

	// even if the code is not written for this method, it prints all the elements
	// Sorting here is done on the basis on id
	
	@Override
	public int compareTo(BookDQ o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

		
	}



		
	
	
