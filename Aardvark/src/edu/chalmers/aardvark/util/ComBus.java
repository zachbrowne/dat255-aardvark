package edu.chalmers.aardvark.util;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;

import edu.chalmers.aardvark.AardvarkApp;

public class ComBus {
	private static List<EventListener> listeners = new ArrayList<EventListener>();
	
	public static void subscribe(EventListener listener) {
		listeners.add(listener);
	}
	
	public static void unsubscribe(EventListener listener) {
		listeners.remove(listener);
	}
	
	public static void notifyListeners(String stateChange, Object object) {
		for (EventListener l : listeners) {
			if (l instanceof Activity) {
				Activity target = (Activity)l;
				final EventListener fL = l;
				final String fStateChange = stateChange;
				final Object fObject = object;
				target.runOnUiThread(new Runnable() {
					public void run() {
						fL.notifyEvent(fStateChange, fObject);
					}
				});
			} else {
				l.notifyEvent(stateChange, object);
			}
		}
	}
}
