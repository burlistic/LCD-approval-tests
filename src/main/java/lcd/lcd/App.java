package lcd.lcd;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {    	
    	App app = new App();
    	app.Display(0);
    	app.Display(1);
    	
    	System.out.print(app.formatOutput());
    }

	public String formatOutput() {
		
		StringBuilder sb = new StringBuilder();
		
		for (String item : Row1) {
			sb.append(item);
    	}
    	
		sb.append("\n");
    	
    	for (String item : Row2) {
    		sb.append(item);
    	}
    	
    	sb.append("\n");
    	
    	for (String item : Row3) {
    		sb.append(item);
    	}
    	
    	sb.append("\n");
    	
    	return sb.toString();
	}

    public List<String> Row1 = new java.util.ArrayList<String>();
	public List<String> Row2 = new java.util.ArrayList<String>();
	public List<String> Row3 = new java.util.ArrayList<String>();

	public void Display(int i) {
		
		// set for index
		int index = Row1.size();
		
		
		if(i == 0)
		{
			Row1.add("._.");
			Row2.add("|.|");
			Row3.add("|_|");
		}
		
		if(i == 1)
		{
			Row1.add("...");
			Row2.add("..|");
			Row3.add("..|");
		}
		
		if(i == 2) {
			Row1.add("._.");
			Row2.add("._|");
			Row3.add("|_.");
		}
		
		if(i == 3) {
			Row1.add("._.");
			Row2.add("._|");
			Row3.add("._|");
		}
		if(i == 4) {
			Row1.add("...");
			Row2.add("|_|");
			Row3.add("..|");
		}
		if(i == 5) {
			Row1.add("._.");
			Row2.add("|_.");
			Row3.add("._|");
		}
		if(i == 6) {
			Row1.add("._.");
			Row2.add("|_.");
			Row3.add("|_|");
		}
		if(i == 7) {
			Row1.add("._.");
			Row2.add("..|");
			Row3.add("..|");
		}
		if(i == 8) {
			Row1.add("._.");
			Row2.add("|_|");
			Row3.add("|_|");
		}
		if(i == 9) {
			Row1.add("._.");
			Row2.add("|_|");
			Row3.add("..|");
		}
		
	}
}
