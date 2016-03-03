


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KiwiMessageTransmitterImpl implements IMessageTransmitter {

	private static final Logger	LOGGER	= LoggerFactory.getLogger( KiwiMessageTransmitterImpl.class );

	@Override
	public void send( final String message ) {
		LOGGER.info( "Hello! My message is : {}", message );
	}
}
