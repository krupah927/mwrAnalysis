package graph;


import graph.*;
import screen.ScreenCloudFinal;
import screen.ScreenCloudPointsLevel1;
import screen.ScreenCloudPointsLevel2;
import screen.ScreenCloudPointsLevel3;
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
import org.jfree.util.ShapeUtilities;
//import org.jfree.ui.Spacer;

/**
 * A demo.
 * 
 */
public class PlotRawGraph extends JFrame  {

	private static final long serialVersionUID = 1L;

	/**
     * A demo.
     * 
     * @param title  the frame title.
     */

	XYDataset dataset;

	JFreeChart chart;

  ChartPanel chartPanel;
JPanel c;
String filtNum;
 

public PlotRawGraph(JPanel c2) {
	c=c2;
//	glayout=new GridLayout(5, 2,30,40);
	//c.setLayout(glayout);
	 c.setLayout(new GridLayout(5, 2,30,40));
	 
	
	
}
public ChartPanel drawGraph(final FileSplitter fs,int f){
	
	for( int i=0;i<f;i++){
		final int n=i;
		 dataset = createDataset(fs,i);
		 chart = createChart(dataset);
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

    private JFreeChart createChart(final XYDataset dataset) {

        final JFreeChart chart = ChartFactory.createXYLineChart("", "", "", dataset);
       
    //   Shape shape  = new Ellipse2D.Double(0,0,0.01,0.01);
   Shape shape= ShapeUtilities.createDiagonalCross((float)0.2, (float) 0.2);
     // Shape shape1=

        final XYPlot plot = chart.getXYPlot();
        plot.setOutlinePaint(null);
        plot.setBackgroundPaint(Color.lightGray);
        //////////////////////////
       
     ///////////////////////
        plot.setDomainCrosshairVisible(true);
        plot.setRangeCrosshairVisible(false);
        
      
        
     //   XYPlot plot = (XYPlot)chart.getPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        plot.getRenderer().setSeriesPaint(0, Color.RED);
        renderer.setSeriesLinesVisible(1, true);
        renderer.setSeriesShapesVisible(1, false);
      //  renderer.setBaseShape(shape);
        renderer.setSeriesShape(0, shape);
        renderer.setSeriesShape(3, shape);
        renderer.setSeriesShape(4, shape);
       renderer.setSeriesLinesVisible(0, false);
        renderer.setSeriesShapesVisible(0, true);
        renderer.setSeriesStroke(1, new BasicStroke(5.0f));
        renderer.setSeriesStroke(3, new BasicStroke(1.0f));
        renderer.setSeriesStroke(4, new BasicStroke(1.0f));
        plot.setRenderer(renderer);
        plot.getRenderer().setSeriesPaint(0, Color.RED);
        plot.getRenderer().setSeriesPaint(1, Color.blue);
        plot.getRenderer().setSeriesPaint(3, Color.cyan);
        plot.getRenderer().setSeriesPaint(4, Color.cyan);
        plot.getRenderer().setSeriesPaint(2, Color.yellow);
        plot.getRenderer().setSeriesPaint(5, Color.green);
        
        return chart;

    }
    
    /**
     * Creates a sample dataset.
     *
     * @return the dataset.
     */
    private XYDataset createDataset(FileSplitter fs,int n) {
    //	System.out.println("inside createdata");
    	

    	XYSeriesCollection dataset = new XYSeriesCollection();
    	XYSeries s1= new XYSeries(" ");
    	XYSeries s2= new XYSeries("");
    	XYSeries s3=new XYSeries("  ");
    	XYSeries s4=new XYSeries("   ");
    	XYSeries s5=new XYSeries(".");
    	XYSeries s6=new XYSeries(". ");
    	ScreenCloudPointsLevel1 scp= new ScreenCloudPointsLevel1(fs);
    	ScreenCloudPointsLevel2 scp2= new ScreenCloudPointsLevel2(fs,scp);
    	ScreenCloudPointsLevel3 scp3=new ScreenCloudPointsLevel3(fs,scp,scp2);
    	ScreenCloudFinal scpf= new ScreenCloudFinal (fs,scp,scp3);
  	
        if(n==0){
        	for(int i=0;i<fs.arr1.size();i++){
        		s1.add((fs.arr1.get(i)/60), fs.vol1.get(i));
        	}
        	scp.createNormMAt(fs,1,s2);
        	scp2.screen2(1,scp.yValue);
        	scp3.screen3(1,scp2.yNew,s3,s4,s5);
        	scpf.screenFinal(1,scp3.yNew2,s6);
        	
        }
        
        if(n==1){
        	  for(int i=0;i<fs.arr2.size();i++){
        	      s1.add((fs.arr2.get(i)/60), fs.vol2.get(i));
        	        }
        	  scp.createNormMAt(fs,2,s2);
        	  scp2.screen2(2,scp.yValue);
          	scp3.screen3(2,scp2.yNew,s3,s4,s5);
          	scpf.screenFinal(2,scp3.yNew2,s6);
        }
        
        if(n==2){
        	  for(int i=0;i<fs.arr3.size();i++){
        	      s1.add((fs.arr3.get(i)/60), fs.vol3.get(i));
        	        }
        	  scp.createNormMAt(fs,3,s2);
        	  scp2.screen2(3,scp.yValue);
          	scp3.screen3(3,scp2.yNew,s3,s4,s5);
          	scpf.screenFinal(3,scp3.yNew2,s6);
        }
        
        if(n==3){
        	  for(int i=0;i<fs.arr4.size();i++){
        	      s1.add( (fs.arr4.get(i)/60), fs.vol4.get(i));
        	        }
        	  scp.createNormMAt(fs,4,s2);
        	  scp2.screen2(4,scp.yValue);
          	scp3.screen3(4,scp2.yNew,s3,s4,s5);
          	scpf.screenFinal(4,scp3.yNew2,s6);
        }
        
        if(n==4){
        for(int i=0;i<fs.arr5.size();i++){
            s1.add(( fs.arr5.get(i)/60), fs.vol5.get(i));
              }
        scp.createNormMAt(fs,5,s2);
        scp2.screen2(5,scp.yValue);
    	scp3.screen3(5,scp2.yNew,s3,s4,s5);
    	scpf.screenFinal(5,scp3.yNew2,s6);
        }
        
        if(n==5){
        	  for(int i=0;i<fs.arr6.size();i++){
        	      s1.add(( fs.arr6.get(i)/60), fs.vol6.get(i));
        	        }
        	  scp.createNormMAt(fs,6,s2);
        	  scp2.screen2(6,scp.yValue);
          	scp3.screen3(6,scp2.yNew,s3,s4,s5);
          	scpf.screenFinal(6,scp3.yNew2,s6);
        	 
        }
        
        if(n==6){
        	  for(int i=0;i<fs.arr7.size();i++){
        	      s1.add((fs.arr7.get(i)/60), fs.vol7.get(i));
        	        }
        	  scp.createNormMAt(fs,7,s2);
        	  scp2.screen2(7,scp.yValue);
          	scp3.screen3(7,scp2.yNew,s3,s4,s5);
          	scpf.screenFinal(7,scp3.yNew2,s6);
   
        }
        
        
        if(n==7){
        	  for(int i=0;i<fs.arr8.size();i++){
        	      s1.add(( fs.arr8.get(i)/60), fs.vol8.get(i));
        	        }
        	  scp.createNormMAt(fs,8,s2);
        	  scp2.screen2(8,scp.yValue);
          	scp3.screen3(8,scp2.yNew,s3,s4,s5);
          	scpf.screenFinal(8,scp3.yNew2,s6);
        }
        if(n==8){
        	  for(int i=0;i<fs.arr9.size();i++){
        	      s1.add(( fs.arr9.get(i)/60), fs.vol9.get(i));
        	        }
        	  scp.createNormMAt(fs,9,s2);
        	  scp2.screen2(9,scp.yValue);
          	scp3.screen3(9,scp2.yNew,s3,s4,s5);
          	scpf.screenFinal(9,scp3.yNew2,s6);
        }
        
        if(n==9){
        	  for(int i=0;i<fs.arr10.size();i++){
        	      s1.add((fs.arr10.get(i)/60), fs.vol10.get(i));
        	        }
        	  scp.createNormMAt(fs,10,s2);
        	  scp2.screen2(10,scp.yValue);
          	scp3.screen3(10,scp2.yNew,s3,s4,s5);
          	scpf.screenFinal(10,scp3.yNew2,s6);
        }
        
        	 dataset.addSeries(s1);
             dataset.addSeries(scp.getSeries());
             dataset.addSeries(scp3.getSeries1());
             dataset.addSeries(scp3.getSeries2());
             dataset.addSeries(scp3.getSeries3());
             dataset.addSeries(scpf.getSeries());
      

        return dataset;

    }
}