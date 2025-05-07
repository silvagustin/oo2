package ar.edu.unlp.info.oo2.patrones_ejercicio_8;

public class WifiConn implements Connection {

	private String pict;
	
	@Override
	public String sendData(String data, Integer crc) {
		// TODO Auto-generated method stub
		return 4GConnection.transmit(data, crc);
	}

	@Override
	public String pict() {
		// TODO Auto-generated method stub
		return null;
	}

}
