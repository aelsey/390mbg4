package edu.umass.cs.client;

import java.util.List;

import edu.umass.cs.client.PickerActivity.STREAMS;

public interface IDataObserverCache{
	//receives data for a particular stream from the observable this is registered to
	void receive(STREAMS stream, Object data);
	
	//stores the data object for a stream in a particular way, depending on the widget type
	void cacheData(STREAMS stream, Object data);
	
	List<STREAMS> getStreams();
	//returns getstreams
	List<STREAMS> addStream(STREAMS stream);
	//returns getstreams
	List<STREAMS> removeStream(STREAMS stream);
}