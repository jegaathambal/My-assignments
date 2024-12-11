package week1.day2;

public class Browser {

static float browserversion = 13.0f ; 

public void launchBrowser() {
	System.out.println("Browser launched successfully");
}

public void loadUrl() {
	System.out.println("URL loaded successfully");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Browser Chrome = new Browser();
    Browser Edge = new Browser();
    System.out.println("chrome version" +browserversion);
    Chrome.launchBrowser();
	Chrome.loadUrl();
	System.out.println("-------------");
	System.out.println("edge version" +browserversion);
	Edge.launchBrowser();
	Edge.loadUrl();

}

}
