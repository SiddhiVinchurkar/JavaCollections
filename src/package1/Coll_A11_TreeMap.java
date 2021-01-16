package package1;

import java.util.TreeMap;
import java.util.Map;

public class Coll_A11_TreeMap {

	public static void main(String[] args) 
	{
	
       Map<Integer,SongsTS> tm=new TreeMap<Integer,SongsTS>();
		
		tm.put(1, new SongsTS("cold/mess",500));
		tm.put(2, new SongsTS("death-bed",400));
		tm.put(3, new SongsTS("parody   ",100));
		
		SongsTS s1=new SongsTS("parody of happiness",300);
		SongsTS s2=new SongsTS("parody of happiness...",300);
		
		//tm.putAll(tm);
		//tm.replace(3,s1); 
		//tm.replace(3,s1,s2);
		//tm.replaceAll((k,v)->s2);
		
		//tm.put(null, s1);    // not allowed -> NullPointerException
		
		
		for(Map.Entry<Integer,SongsTS> itr:tm.entrySet())
		{
			System.out.println(itr.getKey()+"\t"+itr.getValue().Bname+"\t"+itr.getValue().price);
		}

	}

}


class SongsTS 
{
	String Bname;
	float price;
	
	SongsTS(String Bname,float price)
	{
		this.Bname=Bname;
		this.price=price;
	}
		
	}

