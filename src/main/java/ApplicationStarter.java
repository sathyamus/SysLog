



public class ApplicationStarter {

	/**
	 * Main method
	 */
	public static void main( final String[] args ) {

		final IMessageTransmitter kiwiMessageTransmitter = new KiwiMessageTransmitterImpl();
		kiwiMessageTransmitter.send( "Sathya - Sending from Windows - Kiwi" );

		final IMessageTransmitter rsyslogMessageTransmitter = new RsyslogMessageTransmitterImpl();
		rsyslogMessageTransmitter.send( "Sathya - Sending from Windows - to Syslog server" );
	}
}
