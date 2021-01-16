package package1;

import java.util.*;

public class Coll_3_List {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//Creating a List of type String using ArrayList  
		List<String> list1=new ArrayList<String>(); 
		list1.add("Z");
		list1.add("A");
		list1.set(1, "L");  //replaces element at specific index, hence A is replaced by L
	
		
	   Collections.sort(list1);  // sorting the list
	   
	   System.out.println("Element at 0th position is : "+list1.get(0));
	   
	   System.out.println("Elements of List are : ");
	   for(String l:list1)
	   {
		   System.out.println(l);
		   
	   }
		                                    //size of the array
	   String[] arr1=list1.toArray(new String[list1.size()] );
	   
	   System.out.println("Elements of Array are : ");
	   for(String itr1:arr1)
	   {
		   System.out.println(itr1);
		   
	   }
	   
	   System.out.println("\n");
	   
//Through the ListIterator, we can iterate the list in forward and backward directions
	   
	   ListIterator<String> itr=list1.listIterator();    
       System.out.println("Traversing elements in forward direction");    
       while(itr.hasNext())
       {          
       System.out.println("Index : "+itr.nextIndex()+" & value : "+itr.next());    
       }   
       
       
       System.out.println("\n");
       System.out.println("Traversing elements in backward direction");    
       while(itr.hasPrevious())
       {      
       System.out.println("Index : "+itr.previousIndex()+" & value : "+itr.previous());    
       }    
		 
		//Creating a List of type Integer using LinkedList  
		List<Integer> list2=new LinkedList<Integer>();  
		
		
		// write the code according to ArrayList or LinkedList

	}

}
