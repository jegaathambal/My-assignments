package week4.day1homeassignment;

public abstract class SQLconnection implements DatabaseConnection{
	
	
	public abstract void ConnectionDetails();
		
	
	
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connected to database");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("database disconnected");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("update query executed");
	}


	}
	
	
	


	


	  
