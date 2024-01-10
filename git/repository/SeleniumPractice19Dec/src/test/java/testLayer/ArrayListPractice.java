package testLayer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		
		//Using Collections.SynchronizedList
		
	    List<Object> ar= Collections.synchronizedList(new ArrayList<Object>());
		
	    ar.add("day22");
	    ar.add(17);
		ar.add("Manishika");
		ar.add("04");
		ar.add("day");
		ar.add("day1");
		ar.add(01);
		ar.add("month");
		ar.add("day2");
		synchronized (ar) {
		Iterator<Object> it=ar.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		                    }
		                 }
		
		
		///Using copyOnWriteArrayList
		
		CopyOnWriteArrayList<String> namesArr=new CopyOnWriteArrayList<String>();
		namesArr.add("asd");
		namesArr.add("qwe");
		namesArr.add("ert");
		namesArr.add("ghj");
		
		
		
		Iterator<String> it=namesArr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		List<Integer> list= new ArrayList<Integer>(Arrays.asList(1,2,1,2,1,2,3,5,6,3,8,9,4,1,4));
		
		List<Object> nlist=list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(nlist);
	    }
	
	
	//
	
	

}
