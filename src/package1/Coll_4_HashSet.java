package package1;

import java.util.*;

public class Coll_4_HashSet {

	public static void main(String[] args) 
	{
	
		HashSet<TvShows> hs=new HashSet<TvShows>();
		
		TvShows tvs1=new TvShows("Prime", "Mirzapur");
		
		hs.add(new TvShows("Nflix", "GOT"));
		hs.add(new TvShows("CBS", "Tbbt"));// this is displayed 1st, does not maintain insertion order
		hs.add(new TvShows("CBS", "Tbbt")); // duplicates are allowed in such a way
		hs.add(tvs1);  
		hs.add(tvs1);   // even though added twice it gets added once
		
		
		Iterator<TvShows> hsItr1=hs.iterator();
		while(hsItr1.hasNext())
		{
			TvShows tvs=(TvShows)hsItr1.next();
			System.out.println("Channel : "+tvs.channel+"\t" +" Series : "+tvs.name +"\t"+"Hash Code Value : "+tvs.hashCode());
		}

		
		
		/*  just like other collections
		
	    System.out.println("\n");
		System.out.println("--------------------New list-------------------");
		
		hs.addAll(hs);
		hs.remove(tvs1);
		hs.removeAll(hs);
		hs.clear();   // removes all the elements in the list
		
		for(TvShows tvsItr2:hs)
		{
			System.out.println("Channel : "+tvsItr2.channel+"\t" +" Series : "+tvsItr2.name +"\t"+"Hash Code Value : "+tvsItr2.hashCode());
		}
		
		*/
		
	}

}


class TvShows
{
	String name;
	String channel;
	
	TvShows(String channel,String name)
	{
		this.channel=channel;
		this.name=name;
	}
	
}