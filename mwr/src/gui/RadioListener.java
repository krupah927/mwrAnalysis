package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import org.jfree.chart.ChartPanel;

import filestuff.AmData;
import filestuff.FileSplitter;
import filestuff.PmData;
import graph.PlotFinalGraph;



public class RadioListener implements ActionListener{
	JPanel c;
	//FileSplitter fs;
	ActListner listener=new ActListner();
	
	public RadioListener(JPanel procPanel) {
		c=procPanel;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String getData= e.getActionCommand();
		FileSplitter fs=listener.getFile();
		System.out.println("1st ele....."+fs.arr1.get(0));
	System.out.println(getData);
		if(getData=="amdata"){
			AmData a= new AmData(fs);
			
			a.getData();
			System.out.println("before calling graph");
			final PlotFinalGraph demo= new PlotFinalGraph(c);

			ChartPanel chartPanel=  demo.drawGraph(fs,a,10);
			System.out.println("after calling graph");
			
			
		}
		else {
			//PmData p= new PmData(fs);
			//p.getData();
			AmData a= new AmData(fs);
			a.getData();
			System.out.println("inside pm");
			final PlotFinalGraph demo= new PlotFinalGraph(c);

			ChartPanel chartPanel=  demo.drawGraph(fs,a,10);
			
		}
		
	}
	
	

}
