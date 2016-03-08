package com.hybris.lassy.lassyAttendsTheHackathon.Observation;

import java.util.Set;

public interface IObservation {
	public String get(String property);
	public void set(String property, String value);
	public Set<String> getProps();
}
