package org.smslib.examples;

import org.smslib.callback.IServiceStatusCallback;
import org.smslib.callback.events.ServiceStatusCallbackEvent;
import org.smslib.helper.Log;

public class ServiceStatusCallback implements IServiceStatusCallback
{
	@Override
	public boolean process(ServiceStatusCallbackEvent event)
	{
		Log.getInstance().getLog().info("[ServiceStatusCallback] " + event.getOldStatus() + " -> " + event.getNewStatus());
		return true;
	}
}
