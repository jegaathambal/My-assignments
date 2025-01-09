package week4.day1homeassignment;

public  class JavaConnection extends SQLconnection{



public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	JavaConnection extn = new JavaConnection();
	
	extn.connect();
	extn.disconnect();
	extn.executeUpdate();
	extn.ConnectionDetails();
}

@Override
public void ConnectionDetails() {
	// TODO Auto-generated method stub
	{
		System.out.println("query are executed sucessfully");
	}
		
}
}




