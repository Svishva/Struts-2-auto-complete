package com.domain.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

import com.opensymphony.xwork2.Action;

public class AutoComplete implements Action {

	// Received via Ajax request
	private String term;
	// Returned as responce
	private ArrayList<String> list;

	@Override
	public String execute() throws Exception {
		
		try {
			System.out.println("Parameter from ajax request : - " + term);

			
			TreeMap<String, Object> myMap = new TreeMap<String, Object>();
	       /* myMap.put( "111-hello", null );
	        myMap.put( "111-world", null );
	        myMap.put( "111-test", null );
	        myMap.put( "111-java", null );

	        myMap.put( "123-one", null );
	        myMap.put( "123-two", null );
	        myMap.put( "123--three", null );
	        myMap.put( "123--four", null );

	        myMap.put( "125-hello", null );
	        myMap.put( "125--world", null );*/
			
			
			
				myMap.put( "hello", null );
		        myMap.put( "world", null );
		        myMap.put( "test", null );
		        myMap.put( "java", null );

		        myMap.put( "one", null );
		        myMap.put( "two", null );
		        myMap.put( "three", null );
		        myMap.put( "four", null );

	        
	        SortedMap<String, Object> sorted = getByPrefix( myMap, term );
	        if(sorted != null){
	        	ArrayList<String> val = new ArrayList<>(sorted.keySet());
	        	System.out.println("VAL = \t" + val);
	        	   setList(val);
	        	
	        }
			
			/*temp.add("kanna");
			temp.add("vasudeva");
			temp.add("2");
			temp.add("3");
			temp.add("4");
			temp.add("5");
			temp.add("6");
			temp.add("7");*/

			//setList(temp);
		} catch (Exception e) {

			e.printStackTrace();
		}

		return SUCCESS;
	}

	
	private static SortedMap<String, Object> getByPrefix(
            NavigableMap<String, Object> myMap,
            String prefix ) {
		prefix=prefix.toLowerCase();
        return myMap.subMap( prefix, prefix + Character.MAX_VALUE );
    }
	
	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

}
