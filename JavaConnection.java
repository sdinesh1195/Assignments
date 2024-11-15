package w3;

public class JavaConnection implements DatabseConnection {

	@Override
	public void connect() {
		System.out.println("connected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("executed");
		
	}
	public static void main(String[] args) {
		JavaConnection J = new JavaConnection();
		J.connect();
		J.disconnect();
		J.executeUpdate();
		
	}
	
	
	
	

}
