package package1;

import java.util.HashMap;
import java.util.Map;

public class Coll_9_HashMap {

	public static void main(String[] args) 
	{
	//	Map<Integer,String> mp=new Map<Integer,String>(); // not allowed as Map it is a interface
		Map<Integer,String> mp=new HashMap<Integer,String>();
		
		mp.put(new Integer(1), "Diwali");
		//mp.put(new Integer(1), "Holi");  // it prints only one value if duplicate keys are used
		mp.put(new Integer(2), "Holi");
		mp.put(new Integer(3), "Christmas");
		mp.put(new Integer(4), "Navratri");
		mp.put(new Integer(5), "Eid");
		mp.put(new Integer(6), "Not a festival");
		mp.put(null, "Null Value");   // null key is allowed	
		
		
		
		
	//	mp.put(new Integer(2), "Holii"); // replace value at key 2
		mp.replace(new Integer(2), "Holii");  // used for replace
	//	mp.replace(new Integer(2), "Holi", "Holii"); // used to replace from old value to new value 
	//	mp.replaceAll((k,v)->"Festivals are to be enjoyed");  // used to replace all values 
		
		mp.remove(new Integer(6));
		
		System.out.println("---------------List of Holidays-------------");
		
		//convert to set as map cannot be traversed
		for(Map.Entry<Integer, String> itr:mp.entrySet())
		{
			System.out.println(itr.getKey()+"\t"+itr.getValue());
		}
		

	}

}
