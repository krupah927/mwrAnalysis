package gui;

import filestuff.*;
import graph.*;
import gui.*;
import screen.ScreenCloudPointsLevel1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.jfree.chart.ChartMouseEvent;
import org.jfree.chart.ChartMouseListener;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.entity.ChartEntity;
import org.jfree.ui.RefineryUtilities;

public class ActListner implements ActionListener { 
	JPanel c,proc;
	FileSplitter f;
	ActListner() {
		
	}
public ActListner(JPanel f,JPanel d) {
	
	c=f;
	proc=d;
}
@Override
public void actionPerformed(ActionEvent a) {
	// TODO Auto-generated method stub
	if(a.getActionCommand()=="browse"){
	 JFileChooser fc = new JFileChooser();        
     FileNameExtensionFilter datfilter = new FileNameExtensionFilter("dat files (*.dat)", "dat");
     fc.setFileFilter(datfilter);
     int status = fc.showOpenDialog(c);
     if (status == JFileChooser.APPROVE_OPTION)
     {
         File selectedFile = fc.getSelectedFile();
         String fn = selectedFile.getAbsolutePath();
         final FileSplitter fs=new FileSplitter();
        try {
			fs.splitFile(fn);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        f=fs;
 final PlotRawGraph demo= new PlotRawGraph(c);

ChartPanel chartPanel=  demo.drawGraph(fs,10);
     }
	}    
     if(a.getActionCommand()=="amdata"){
    	 AmData adata= new AmData(f);
			
			adata.getData();
			System.out.println("before calling graph");
			final PlotFinalGraph demo= new PlotFinalGraph(proc);

			ChartPanel chartPanel=  demo.drawGraph(f,adata,10);
			System.out.println("after calling graph");
			
			
		}
 
 
     
}


}

