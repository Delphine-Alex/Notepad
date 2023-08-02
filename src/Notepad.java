import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Notepad {
	
	JFrame window;
	JTextArea textArea;
	JScrollPane scrollPane;
	
	public static void main(String[] args) {
		
		new Notepad();
	}


	public Notepad() {
		
		createWindow();
		createTextArea();
		
		window.setVisible(true);
		
	}
	
	public void createWindow() {
		
		window = new JFrame();
		window.setSize( 800, 600);
		window.setTitle("Notepad");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void createTextArea() {
		
		textArea = new JTextArea();
		
		scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBorder(BorderFactory.createEmptyBorder());
		window.add(scrollPane);
		// window.add(textArea);
		
	}
	
	
	
	

}
