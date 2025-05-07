package ar.edu.unlp.info.oo2.patrones_ejercicio_8;

public class Dispositivo {
	
	private Ringer ringer;
	private Display display;
	private CRC16_Calculator crcCalculator;
	private Connection connection;

	public String send(String data) {
		Integer crc = this.crcCalculator.crcFor(data);
		
		return this.connection.sendData(data, crc);
	}
	
	public void switchToWifiConn() {
		connection = new WifiConn();
		afterConnectionSwitchCallbacks();
	}
	
	public void switchTo4GConn() {
		connection = new FourGConn();
		afterConnectionSwitchCallbacks();
	}
	
	private void afterConnectionSwitchCallbacks() {
		display.showBanner(connection.pict());
		ringer.ring();
	}
	
}
