package javaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class JavaListsDemo
{
	public static void main(String[] args)
	{
		LinkedList<String> ll;
		
		ll=linkedListMethod();
		arrayListMethod(ll);
		vectorList();
		

	}
	static LinkedList<String> linkedListMethod()
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Nagraj");
		ll.addFirst("Krishna");
		ll.add("Rithwik");
		ll.addLast("Ananya");
		ll.add("Nithiya");		
		System.out.println(ll);
		ListIterator<String> itr=ll.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Collections.sort(ll);
		System.out.println(ll);
		ll.remove(2);
		ll.remove("Rithwik");
		System.out.println(ll);
		ll.removeFirst();
		ll.add("Govind");
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		return (ll);
	}
	static void arrayListMethod(LinkedList<String> llist)
	{
		List<String> al=new ArrayList<String>();
		al.add("Nagaraj");		
		al.addAll(llist);
		al.add(2, "Ananya");
		System.out.println("The ArrayList: "+al);
		System.out.println("Print ArrayList iems One by One");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	
	}
	static void vectorList()
	{
		Vector<String> vl=new Vector<String>(2,3);
		vl.add("ABC");
		vl.add("DEF");
		System.out.println(vl.size());
		System.out.println(vl.capacity());
		vl.add("naga");
		System.out.println(vl.size());
		System.out.println(vl.capacity());
		vl.add("nithi");
		System.out.println(vl.size());
		System.out.println(vl);
		Enumeration<String> e=vl.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}
