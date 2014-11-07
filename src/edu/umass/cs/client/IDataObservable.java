package edu.umass.cs.client;

import edu.umass.cs.client.PickerActivity.STREAMS;
public interface IDataObservable{
	//informs the observable that a widget is listening on a particular stream
	void register(IDataObserverCache observer, STREAMS... streams);
	
	//informs the observable that the widget is no longer listening on a particular stream
	void detach(IDataObserverCache observer, STREAMS... streams);
	
	//accepts a data object for a particular stream, and then sends it to all
	//widgets currently listening on that stream
	void notifyWithData(STREAMS stream, Object data);
}