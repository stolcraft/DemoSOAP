package client;

public class MonCodeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelloObjisWSService hos = new HelloObjisWSService();
		HelloObjis port = hos.getHelloObjisWSPort();
		String resutlat = port.ditBonjour("objis");
		
		System.out.println(resutlat);
	}

}
