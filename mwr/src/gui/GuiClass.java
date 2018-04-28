package gui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

import filestuff.FileSplitter;

public class GuiClass extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	GuiClass(String title){
		super(title);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.black);
		 
        JPanel rawGraph = new JPanel();
        rawGraph.setPreferredSize(new Dimension(400,500));
        rawGraph.setBackground (Color.DARK_GRAY);
        JLabel label1 = new JLabel ("                                      raw data        ", JLabel.CENTER);

        label1.setForeground(Color.white);
        JPanel rawPanel =new JPanel();
        rawPanel.setBackground(Color.DARK_GRAY);
        rawGraph.setLayout(new BoxLayout(rawGraph,  BoxLayout.Y_AXIS));
        rawGraph.add (label1);
        rawGraph.add(rawPanel);
        rawPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        rawGraph.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        JPanel procGraph = new JPanel();
        procGraph.setPreferredSize(new Dimension(400,500));
        procGraph.setBackground(Color.DARK_GRAY);
        JLabel label2 = new JLabel ("data after processing", JLabel.CENTER);
        label2.setForeground(Color.white);
       
        JPanel procPanel=new JPanel();
        procPanel.setBackground(Color.BLACK);
        procGraph.setLayout(new BoxLayout(procGraph, BoxLayout.Y_AXIS));
        procGraph.add (label2);
        procGraph.add(procPanel);
        
        JPanel buttonsPanel = new JPanel();
        JButton browse= new JButton("Browse");
        browse.setSize(10, 15);
        buttonsPanel.setLayout(new FlowLayout());
        JTextField text=new JTextField(20);
        JLabel textLable=new JLabel("                   Select graph to be displayed:");
        JLabel amLable=new JLabel(" am");
        JLabel pmLable=new JLabel(" pm");
        
        ButtonGroup group = new ButtonGroup();
        
        
       JRadioButton am= new JRadioButton();
       am.setActionCommand("amdata");
       JRadioButton pm= new JRadioButton();
      pm.setActionCommand("pmdata");
       group.add(am);
       group.add(pm);
       
      String[] cities={"Bangalore","Delhi"};
	JComboBox city=new JComboBox(cities);
	
	
       
      
        buttonsPanel.add(browse);
        buttonsPanel.add(text);
        buttonsPanel.add(city);
        buttonsPanel.add(textLable);
        buttonsPanel.add(amLable);
     
        buttonsPanel.add(am);
        buttonsPanel.add(pmLable);
        buttonsPanel.add(pm);
        
       c.setLayout(new BorderLayout());
 
        c.add(rawGraph, BorderLayout.WEST);
        c.add(procGraph, BorderLayout.CENTER);
        c.add(buttonsPanel, BorderLayout.NORTH);
   
        browse.setActionCommand("browse");
        ActListner listener= new ActListner(rawPanel,procPanel);
    	browse.addActionListener((ActionListener) listener);
    	am.addActionListener((ActionListener)listener);
    	
    //	RadioListener rListener=new RadioListener(procPanel);
    	
    	//pm.addActionListener(listener);
    	
    	
    
        
}

}
