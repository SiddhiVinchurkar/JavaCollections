package package1;
import java.util.*;


public class Coll_1_ArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Employee> list2=new ArrayList<Employee>();
		
		 System.out.println("--------Is ArrayList Empty-------> "+list2.isEmpty());    
		
		list2.add(new Employee(1, "Ram"));
		list2.add(new Employee(2, "Radha"));
		Employee emp=new Employee(3, "Arjun");
		list2.add(emp);
		
		list2.add(1,new Employee(4,"Shravani"));  // add at a specific index 
		
		Collection<Employee> list1=new ArrayList<Employee>();
		list1.add(new Employee(10, "Accenture"));
		list1.add(new Employee(9, "TCS"));
		list1.add(new Employee(8, "Wipro"));
		
		list2.addAll(list1);    // adding one list to another.The list should be of same type
		list2.addAll(0,list1);   // adding one list to another at a specific index
		
	
		
		Iterator<Employee> itr1=list2.iterator();
			
		while(itr1.hasNext())
		{
			Employee empItr1=(Employee)itr1.next();
			System.out.println(empItr1.id+"    "+empItr1.name);
		}
		
		System.out.println("------------------Removing now-------------------");
		
		//list2.remove(0);
	    list2.removeAll(list1); 
	   // list2.clear();      // clears the entire list 
	    
	   	
		for(Employee itr2:list2)   // traversing through for each
		{
			System.out.println(itr2.id+"    "+itr2.name);
		}
	
		 System.out.println("--------Is ArrayList Empty-------> "+list2.isEmpty());   

	}

}


class Employee
{
	int id;
	String name;
	
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	
}