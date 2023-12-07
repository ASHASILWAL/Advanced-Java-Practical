package com.Chapter3JavaBeans;
import java.util.*;

public class EventEg {
	
	private List<MyListener> listeners = new ArrayList<>();
	
	public void addListener(MyListener listener)
	{
		listeners.add(listener);
	}
	
	public void removeListener(MyListener listener)
	{
		listeners.remove(listener);
	}
	
	public void fireMyEvent(MyEvent event)
	{
		for(MyListener listener : listeners)
		{
		listener.myEventOccured(event);
		}
	}
	
	public void doSomething()
	{
		MyEvent event = new MyEvent(this);
		fireMyEvent(event);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class MyListenerImpl implements MyListener
		{
			@Override
			public void myEventOccured(MyEvent event)
			{
				System.out.println("MyEvent  occured on "+ event.getSource());
			}
		
	}
		EventEg ev = new EventEg();
		ev.addListener(new MyListenerImpl());
		ev.doSomething();
	}	
	
	interface MyListener{
		void myEventOccured(MyEvent event);
	}
	
	class MyEvent{
		private EventEg source;
		
		public MyEvent(EventEg source)
		{
			this.source = source;
		}
		
		public EventEg getSource()
		{
			return source;
		}
	}
}

