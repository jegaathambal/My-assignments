package week3.day2;

public class Elements extends Button{

	public static void main(String[] args) {
		// TODO Auto-generated method stubUse appropriate keyword for inheritance.
		//Finally, in a separate class Elements create objects for sub classes and call their respective methods
		
		// create object for super parent
		WebElement Wbe = new WebElement();
		
		//calling methods from super parent
		Wbe.click();
		Wbe.setText("Webelement calling");
		System.out.println("***********");
		
		// create object for  parent
		Button but=new Button();
		
		//calling methods from super parent
		but.click();
		but.setText("Button calling");
		
		//calling the methods of button
		but.Submit();
		System.out.println("***********");
		
		//creating object Sub Class TextField
		TextField txf=new TextField();
		
		//calling methods from super parent
		txf.click();
		txf.setText("TextField Calling");
		
		//calling the methods of Textfield
		txf.getText();
		System.out.println("***********");
		
		//Creating object for SubClass CheckBoxButton
		CheckBoxButton cbb=new CheckBoxButton();
		
		//calling methods from super parent
		cbb.click();
		cbb.setText("CheckBox Button Calling");
		
		//calling button methods
		cbb.Submit();
		
		//calling checkbox method
		cbb.clickCheckButton();
		System.out.println("***********");
		
		//Creating object of RadioButton 
		RadioButton rb=new RadioButton();
		
		//calling web elemnt methods
		rb.click();
		rb.setText("Radio Button Calling");
		
		//calling button method
		rb.Submit();
		
		//calling radio button methods
		rb.selectRadioButton();
		System.out.println("***********");
		
		//An object for element is created
		Elements ele=new Elements();
		
		//Calling the methods of Super class WebElement
		ele.click();
		ele.setText("Element Calling");
		
		//Calling the methods of Sub class Button
		ele.Submit();
		

	}

}
