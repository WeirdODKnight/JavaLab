package com.craft.knowledges.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list=new ArrayList();//Creating arraylist
		
		list.add("messi");//Adding object in arraylist
		list.add(3);
		list.add(0);
		list.add("ronaldo");
		list.add("rooney");
		list.add("neymar");
	//	list.add(0, "hazard");
		//list.set(2, "Three");
		//list.remove(0);
	//	list.remove(3);
        //  list.remove((Integer) 3);
		//list.remove(Integer.valueOf(3));
		//Traversing list through Iterator
		
		Iterator itr=list.iterator();
		System.out.println(list);
		System.out.println(list.size());
//		while(itr.hasNext())
//		{
//		System.out.println(itr.next());
//		System.out.println(list.get(3));
//		}
		
	}

}
