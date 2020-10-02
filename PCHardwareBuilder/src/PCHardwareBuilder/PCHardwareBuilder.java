/*
 * 
 * 
 * 
 * private int clicks = 0;
	  private JLabel label = new JLabel("Number of clicks:  0     ");
	  private JFrame frame = new JFrame();
	  
 * public PCHardwareBuilder(){

	String[] items = {"One", "Two", "Three", "Four", "Five"};
	
	
	
	
    JButton button = new JButton("Click Me");
    button.addActionListener(this);

    // the panel with the button and text
    JPanel panel = new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
    panel.setLayout(new GridLayout(0, 1));
    panel.add(button);
    panel.add(label);

    // set up the frame and display it
    frame.add(panel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("GUI");
    frame.pack();
    frame.setVisible(true);
}
 */

package PCHardwareBuilder;

import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PCHardwareBuilder implements ActionListener{
	
	public static void main(String args[]){
		
		String[] items = {"Four Hundred ", "Seven Hundred", "One Thousand", "One Thousand Two Hundred", "One Thousand Five Hundred"};
		JPanel panel = new JPanel(new GridLayout(6, 1));
		panel.add(new JLabel("Select A Budget For Your Build"));
		JComboBox combo = extracted(items);
		
		
		
		
		panel.add(combo);
		panel.add(new JLabel("Processor: " +findProcessor()));
		panel.add(new JLabel("GPU: " +findGPU()));
		panel.add(new JLabel("RAM: " +findRam()));
		panel.add(new JLabel("Motherboard: " +findMotherboard()));
		
		
		
		 int result = JOptionPane.showConfirmDialog(null, panel, "Hardware Builder",
			        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
			    
		 
		
		new PCHardwareBuilder();
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		sc.close();
		
		partPicker(x);
	}

	private static JComboBox extracted(String[] items) {
		return new JComboBox(items);
	}

	private static void partPicker(int a) {
		System.out.println(a +"Lets see what we can get you!");
		int p = (a / 100)*33;
		int g = (a / 100)*33;
		int r = (a / 100)*16;
		int m = (a / 100)*16;
		
		System.out.println(p +" " + g  +" " +r +" " +m);
		
		System.out.println("Processor : " +findProcessor()); 
		System.out.println("Processor : " +findRam()); 
		System.out.println("Processor : " +findGPU()); 
		System.out.println("Processor : " +findMotherboard()); 
		
	}
	


	private static String findProcessor() {
		
		return "Ryzen 5";
	}

	
	private static String findRam() {
		
		return "GSkill TridentZ";
	}

	private static String findMotherboard() {
		
		return "Asus B450";
	}

	private static String findGPU(){
		
		return "GTX 1060";
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
	}


	

}


