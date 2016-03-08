package com.hybris.lassy.lassyAttendsTheHackathon.Observation;

import java.util.HashMap;
import java.util.Set;

public class Observation implements IObservation {

	HashMap<String, String> hashMap = new HashMap<String, String>();
	
	public Observation( String...args ){
		for (int i=0;i<args.length;i+=2)
			set(args[i], args[i+1]);
	}
	
	public String get(String property) {	
		return hashMap.get(property);
	}

	public void set(String property, String value) {	
		hashMap.put(property, value);
	}

	public Set<String> getProps(){
		return hashMap.keySet();
	}
}
