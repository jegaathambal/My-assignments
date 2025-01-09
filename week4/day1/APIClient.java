package week4.day1homeassignment;

public class APIClient {

	
public void SendRequest(String a) {
		
		System.out.println(a);
		
	}
	
public void SendRequest(String a, String b, boolean requestStatus) {


	if ( requestStatus=true )
    
    {System.out.println("requestStatus sent to APIClient");}
    }
    

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		APIClient over = new APIClient();
	      over.SendRequest("endpoint");
	      over.SendRequest("endpoint","requestBody",true);

	}

}
