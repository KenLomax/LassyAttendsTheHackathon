package com.hybris.lassy.lassyAttendsTheHackathon.behaviours;

import java.util.Collection;
import com.hybris.lassy.lassyAttendsTheHackathon.Observation.IObservation;

public interface IConsumer{
	Collection<IObservation> getObservations();	
}
