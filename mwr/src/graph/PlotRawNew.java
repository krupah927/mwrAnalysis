package graph;

import graph.*;
import screen.ScreenCloudPointsLevel1;
import filestuff.*;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartMouseEvent;
import org.jfree.chart.ChartMouseListener;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.block.GridArrangement;
import org.jfree.chart.entity.ChartEntity;
import org.jfree.chart.entity.XYItemEntity;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.XYDotRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
//import org.jfree.ui.Spacer;

/**
 * A demo.
 * 
 */
public class PlotRawNew extends JFrame  {

	private static final long serialVersionUID = 1L;

	/**
     * A demo.
     * 
     * @param title  the frame title.
     */

	XYDataset dataset1,dataset2;

	JFreeChart chart;

  ChartPanel chartPanel;
JPanel c;
String filtNum;
 

public PlotRawNew(JPanel c2) {
	c=c2;
//	glayout=new GridLayout(5, 2,30,40);
	//c.setLayout(glayout);
	 c.setLayout(new GridLayout(5, 2,30,40));
	 
	
	
}
public ChartPanel drawGraph(final FileSplitter fs,int f){
	
	for( int i=0;i<f;i++){
		final int n=i;
		// dataset = createDataset(fs,i);
		 chart = createChart(fs,i);
	      chartPanel = new ChartPanel(chart);
	     chartPanel.setSize(20, 20);
	      chartPanel.setDomainZoomable(true);
	      chartPanel.setVisible(true);
	   //   chartPanel.setMaximumDrawWidth(50);
	   // chartPanel.setPreferredSize(new java.awt.Dimension(50,50));
	    // chartPanel.setBounds(new Rectangle(3, 518, 826, 212));
	 //  chartPanel.setBounds(new Rectangle(30,30));
	      c.getRootPane().add(chartPanel);
	     
	      //c.add(chartPanel);
	      //.............................................................................//
	     
	      
	      
	      //..................................................................................../
	      c.add(chartPanel, i);
	      c.validate();
	      
	     
	}
	return chartPanel;
	 
     
  }

	/**
     * Creates a chart.
     * 
     * @param dataset  a dataset.
     * 
     * @return A chart.
     */

    private JFreeChart createChart(FileSplitter fs,int i) {
    	XYSeriesCollection dataset = new XYSeriesCollection();
    	XYSeries s1=createDataset(fs,i,1);
    //	XYSeries s2=createDataset(fs,i,2);
    	
    	dataset.addSeries(s1);
    	//dataset.addSeries(s2);
    	
    	Shape shape  = new Ellipse2D.Double(0,0,5,5);
   
    	
    	JFreeChart chart = ChartFactory.createXYLineChart("", "", "", dataset);
    	 XYPlot plot = (XYPlot)chart.getPlot();
         XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
         
         //renderer.setSeriesLinesVisible(0, true);
         //renderer.setSeriesShapesVisible(0, false);
         renderer.setBaseShape(shape);
        renderer.setSeriesLinesVisible(0, false);
         renderer.setSeriesShapesVisible(0, true);
         
         plot.setRenderer(renderer);
         
         
         
		return chart;

    
    }
    
     XYSeries createDataset(FileSplitter fs,int n,int seriesNum) {
        //	System.out.println("inside createdata");
    	 XYSeries s= new XYSeries(" ");

        	if(seriesNum==1){
        		
        		
        		if(n==0){
                	for(int i=0;i<fs.arr1.size();i++){
                		s.add((fs.arr1.get(i)/60), fs.vol1.get(i));
                	}
                	
                }
                
                if(n==1){
                	  for(int i=0;i<fs.arr2.size();i++){
                	      s.add((fs.arr2.get(i)/60), fs.vol2.get(i));
                	        }
                	  
                }
                
                if(n==2){
                	  for(int i=0;i<fs.arr3.size();i++){
                	      s.add((fs.arr3.get(i)/60), fs.vol3.get(i));
                	        }
                	 
                }
                
                if(n==3){
                	  for(int i=0;i<fs.arr4.size();i++){
                	      s.add( (fs.arr4.get(i)/60), fs.vol4.get(i));
                	        }
                	 
                }
                
                if(n==4){
                for(int i=0;i<fs.arr5.size();i++){
                    s.add(( fs.arr5.get(i)/60), fs.vol5.get(i));
 
                }
                }
                if(n==5){
                	  for(int i=0;i<fs.arr6.size();i++){
                	      s.add(( fs.arr6.get(i)/60), fs.vol6.get(i));
                	        }
                	  
                	 
                }
                
                if(n==6){
                	  for(int i=0;i<fs.arr7.size();i++){
                	      s.add((fs.arr7.get(i)/60), fs.vol7.get(i));
                	        }
                	 
                }
                
                
                if(n==7){
                	  for(int i=0;i<fs.arr8.size();i++){
                	      s.add(( fs.arr8.get(i)/60), fs.vol8.get(i));
                	        }
                	
                }
                if(n==8){
                	  for(int i=0;i<fs.arr9.size();i++){
                	      s.add(( fs.arr9.get(i)/60), fs.vol9.get(i));
                	        }
                	 
                }
                
                if(n==9){
                	  for(int i=0;i<fs.arr10.size();i++){
                	      s.add((fs.arr10.get(i)/60), fs.vol10.get(i));
                	        }
                	}
                
               
                }
        	
        	if(seriesNum==2){
        		//XYSeries s2= new XYSeries(" ");
            	ScreenCloudPointsLevel1 scp= new ScreenCloudPointsLevel1(fs);
                if(n==0){
                	
                	scp.createNormMAt(fs,1,s);
                }
                
                if(n==1){
                	  scp.createNormMAt(fs,2,s);
                }
                
                if(n==2){
                	  
                	  scp.createNormMAt(fs,3,s);
                }
                
                if(n==3){
                	 
                	  scp.createNormMAt(fs,4,s);
                }
                
                if(n==4){
                
                scp.createNormMAt(fs,5,s);
                }
                
                if(n==5){
                	 
                	  scp.createNormMAt(fs,6,s);
                	 
                }
                
                if(n==6){
                	  
                	  scp.createNormMAt(fs,7,s);
                }
                
                
                if(n==7){
                	 
                	  scp.createNormMAt(fs,8,s);
                }
                if(n==8){
                	  
                	  scp.createNormMAt(fs,9,s);
                }
                
                if(n==9){
                	 
                	//  scp.createNormMAt(fs,10,s2);
                }
             //   return (scp.getSeries());
                
        	}
			
        	return s;
        	
            	//dataset.addSeries(s1);
                 //dataset.addSeries(scp.getSeries());
          
     }

   }
