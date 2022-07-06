package gotogoole;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoToGoogle {
	
	// Set here where the chromedriver is
	private static String driver_path = "/home/loris/Scaricati/chromedriver_linux64/chromedriver";
	
	public static void main(String[] args) {

		// Creating frame, setting behaviour and location
        JFrame frame = new JFrame("Go to Google");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        // Creating panel, setting dimension 480x240 to easy find it
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(480,240));
        
        // Creating button, when pressed it opens google using selenium libs
        // Action listener is created on spot to make the reading of code easier
        JButton button = new JButton("Go to Google");
        button.addActionListener( new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.setProperty("webdriver.chrome.driver",driver_path);
        		WebDriver driver = new ChromeDriver();
                driver.get("https://www.google.it");
        	}
        });
        
        // Adding buttons to panel and to frame
        panel.add(button);
        frame.getContentPane().add(panel,BorderLayout.CENTER);
        
        // Making frame visible
        frame.pack();
        frame.setVisible(true);
    }
}
