package package1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Coll_A10_LinkedHashMap {

	public static void main(String[] args) 
	{

		Map<Integer,SongsLHM> lhm=new LinkedHashMap<Integer,SongsLHM>();
		
		lhm.put(1, new SongsLHM("cold/mess",500));
		lhm.put(2, new SongsLHM("death-bed",400));
		lhm.put(3, new SongsLHM("parody   ",100));
		
		SongsLHM s1=new SongsLHM("parody of happiness",300);
		SongsLHM s2=new SongsLHM("parody of happiness...",300);
		
		//lhm.putAll(lhm);
		lhm.replace(3,s1); 
		lhm.replace(3,s1,s2);
		//lhm.replaceAll((k,v)->s2);
		
		
		for(Map.Entry<Integer,SongsLHM> itr:lhm.entrySet())
		{
			System.out.println(itr.getKey()+"\t"+itr.getValue().Bname+"\t"+itr.getValue().price);
		}
	}

}


class SongsLHM 
{
	String Bname;
	float price;
	
	SongsLHM(String Bname,float price)
	{
		this.Bname=Bname;
		this.price=price;
	}

	
	
	

		
	}

