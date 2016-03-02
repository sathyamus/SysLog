
package com.javacodegeeks.examples.logbacksyslogexample.message.kiwi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.javacodegeeks.examples.logbacksyslogexample.message.IMessageTransmitter;

public class KiwiMessageTransmitterImpl implements IMessageTransmitter {

	private static final Logger	LOGGER	= LoggerFactory.getLogger( KiwiMessageTransmitterImpl.class );

	@Override
	public void send( final String message ) {
		LOGGER.info( "Hello! My message is : {}", message );
	}
}
