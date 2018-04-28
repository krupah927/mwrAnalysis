package graph;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Paint;
import java.awt.Shape;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.util.ShapeUtilities;

import airmasCalculations.CalcAirmass;
import filestuff.AmData;
import filestuff.FileSplitter;

public class PlotFinalGraph extends JFrame{
	XYDataset dataset;

	JFreeChart chart;

  ChartPanel chartPanel;
JPanel c;
FileSplitter fs;
public PlotFinalGraph(JPanel c2) {
	c=c2;
	// TODO Auto-generated constructor stub
	c.setLayout(new GridLayout(5, 2,30,40));
	c.removeAll();
}

public ChartPanel drawGraph(final FileSplitter fp,AmData a,int f){
	fs=fp;
	for( int i=0;i<f;i++){
		final int n=i;
		 dataset = createDataset(a,i);
		 chart = createChart(dataset);
	      chartPanel = new ChartPanel(chart);
	     chartPanel.setSize(20, 20);
	      chartPanel.setDomainZoomable(true);
	      chartPanel.setVisible(true);
	      c.getRootPane().add(chartPanel);
	     c.add(chartPanel, i);
	      c.validate();
	      
	     
	}
	return chartPanel;
	 
     
  }

private JFreeChart createChart(final XYDataset dataset) {

    final JFreeChart chart = ChartFactory.createXYLineChart("", "", "", dataset);


    final XYPlot plot = chart.getXYPlot();
    plot.setOutlinePaint(null);
    plot.setBackgroundPaint(Color.lightGray);
   
    plot.setDomainCrosshairVisible(true);
    plot.setRangeCrosshairVisible(false);
    
  
    

    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
 
  renderer.setSeriesLinesVisible(0, true);
  //  renderer.setSeriesShapesVisible(1, false);
 
  
    renderer.setSeriesStroke(0, new BasicStroke(5.0f));
    plot.setRenderer(renderer);
    plot.getRenderer().setSeriesPaint(0, Color.blue);
    return chart;

}


private XYDataset createDataset(AmData a, int n) {
	XYSeriesCollection dataset = new XYSeriesCollection();
	XYSeries s1= new XYSeries(" ");
	ArrayList<Double> airmass;
	CalcAirmass air=new CalcAirmass(a, fs);
	
	if(n==0){
		airmass=air.getAirmass(a.arr1am);
		for(int i=0;i<airmass.size()-1;i++){
			double volt=fs.vol1.get(i);
			volt=Math.log(volt);
			double xval=airmass.get(i);
			s1.add(xval, volt);
		}
	}	
	if(n==1){
		airmass=air.getAirmass(a.arr2am);
		for(int i=0;i<airmass.size()-1;i++){
			double volt=fs.vol2.get(i);
			volt=Math.log(volt);
			double xval=airmass.get(i);
			s1.add(xval, volt);
	}
	}	
		if(n==2){
		airmass=air.getAirmass(a.arr3am);
		for(int i=0;i<airmass.size()-1;i++){
			double volt=fs.vol3.get(i);
			volt=Math.log(volt);
			double xval=airmass.get(i);
			s1.add(xval, volt);
		}
		
	}
	
		if(n==3){
			airmass=air.getAirmass(a.arr4am);
			for(int i=0;i<airmass.size()-1;i++){
				double volt=fs.vol4.get(i);
				volt=Math.log(volt);
				double xval=airmass.get(i);
				s1.add(xval, volt);
			}
			
		}
		if(n==4){
			airmass=air.getAirmass(a.arr4am);
			for(int i=0;i<airmass.size()-1;i++){
				double volt=fs.vol4.get(i);
				volt=Math.log(volt);
				double xval=airmass.get(i);
				s1.add(xval, volt);
			}
			
		}
		
		if(n==4){
			airmass=air.getAirmass(a.arr5am);
			for(int i=0;i<airmass.size()-1;i++){
				double volt=fs.vol5.get(i);
				volt=Math.log(volt);
				double xval=airmass.get(i);
				s1.add(xval, volt);
			}
			
		}
		
		if(n==5){
			airmass=air.getAirmass(a.arr6am);
			for(int i=0;i<airmass.size()-1;i++){
				double volt=fs.vol6.get(i);
				volt=Math.log(volt);
				double xval=airmass.get(i);
				s1.add(xval, volt);
			}
			
		}
		if(n==6){
			airmass=air.getAirmass(a.arr7am);
			for(int i=0;i<airmass.size()-1;i++){
				double volt=fs.vol7.get(i);
				volt=Math.log(volt);
				double xval=airmass.get(i);
				s1.add(xval, volt);
			}
			
		}
		if(n==7){
			airmass=air.getAirmass(a.arr8am);
			for(int i=0;i<airmass.size()-1;i++){
				double volt=fs.vol8.get(i);
				volt=Math.log(volt);
				double xval=airmass.get(i);
				s1.add(xval, volt);
			}
			
		}
		if(n==8){
			airmass=air.getAirmass(a.arr9am);
			for(int i=0;i<airmass.size()-1;i++){
				double volt=fs.vol9.get(i);
				volt=Math.log(volt);
				double xval=airmass.get(i);
				s1.add(xval, volt);
			}
			
		}
		if(n==9){
			airmass=air.getAirmass(a.arr9am);
			for(int i=0;i<airmass.size()-1;i++){
				double volt=fs.vol9.get(i);
				volt=Math.log(volt);
				double xval=airmass.get(i);
				s1.add(xval, volt);
			}
			
		}
		if(n==10){
			airmass=air.getAirmass(a.arr10am);
			for(int i=0;i<airmass.size()-1;i++){
				double volt=fs.vol10.get(i);
				volt=Math.log(volt);
				double xval=airmass.get(i);
				s1.add(xval, volt);
			}
			
		}
	 dataset.addSeries(s1);
	 return dataset;

}
}