/**
 * 
 */
package com.snsystems;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * @author SN
 *
 */
public class SyslogBasicWriter {

	private InetAddress address;
	private int port = 514;
	private DatagramSocket ds;

	private int maxPackageSize = 1024;
	private String message = "Basic Syslog Writing";

	/**
	 * @param args
	 * @throws SocketException
	 */
	public static void main(String[] args) throws SocketException {

		SyslogBasicWriter writer = new SyslogBasicWriter();
		try {
			if (args.length > 2 && args.length < 4) {
				writer.address = InetAddress.getByName(args[0]);
				writer.port = Integer.valueOf(args[1]);
				writer.message = args[2];
			} else {
				writer.address = InetAddress.getByName("192.168.33.22");
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		writer.ds = new DatagramSocket();

		try {
			writer.write(writer.message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void write(final String string) throws IOException {

		if (this.ds != null && this.address != null) {
			System.out.println("Adress : " + this.address);
			System.out.println("Hostname : " + this.address.getHostName());
			System.out.println("Port : " + this.address.getHostName());
			System.out.println("Message : " + this.message);
			byte[] bytes = string.getBytes();

			int bytesLength = bytes.length;
			if (bytesLength >= maxPackageSize) {
				bytesLength = maxPackageSize;
			}
			DatagramPacket packet = new DatagramPacket(bytes, bytesLength,
					address, port);
			ds.send(packet);
		}

	}

}
