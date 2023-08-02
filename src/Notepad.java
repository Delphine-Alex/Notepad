import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Notepad {
	
	JFrame window;
	JTextArea textArea;
	JScrollPane scrollPane;
	JMenuBar menuBar;
	
	JMenu menuFile, menuEdit, menuFormat, menuColor;
	JMenuItem menuItemNew, menuItemOpen, menuItemSave, menuItemSaveAs, menuItemExit;
	
	public static void main(String[] args) {
		
		new Notepad();
	}


	public Notepad() {
		
		createWindow();
		createTextArea();
		createMenuBar();
		createFileMenu();
		
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
	
	public void createMenuBar() {
		
		menuBar = new JMenuBar();
		window.setJMenuBar(menuBar);
		
		menuFile = new JMenu("File");
		menuBar.add(menuFile);
		
		menuEdit = new JMenu("Edit");
		menuBar.add(menuEdit);
		
		menuFormat = new JMenu("Format");
		menuBar.add(menuFormat);
		
		menuColor = new JMenu("Color");
		menuBar.add(menuColor);
	}
	
	public void createFileMenu() {
		
		menuItemNew = new JMenuItem("New");
		menuFile.add(menuItemNew);
		
		menuItemOpen = new JMenuItem("Open");
		menuFile.add(menuItemOpen);
		
		menuItemSave = new JMenuItem("Save");
		menuFile.add(menuItemSave);
		
		menuItemSaveAs = new JMenuItem("Save as");
		menuFile.add(menuItemSaveAs);
		
		menuItemExit = new JMenuItem("Exit");
		menuFile.add(menuItemExit);
	}
	
	
	
	

}
