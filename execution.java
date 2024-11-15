package w3;

public class execution extends Button{
	
	public void radio() {
		
		
	}
	
	public static void main(String[] args) {
		execution e = new execution();
		e.click();
		e.setText("textfield");
		e.submit();
		RadioButton r = new RadioButton();
		r.selectRadioButton();
		CheckBoxButton c = new CheckBoxButton();
		c.clickCheckButton();
		TextField t = new TextField();
		t.getText("123");
		
	}

}
