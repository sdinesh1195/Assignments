package w3;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println(endpoint);
		
	}
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println(endpoint);
		System.out.println(requestBody);
		System.out.println(requestStatus);
		
	}
	public static void main(String[] args) {
		APIClient A = new APIClient();
		A.sendRequest("APIClient");
		A.sendRequest("endpoint5", "body", false);
		
		
	}
	
	

}
