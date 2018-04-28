package screen;

import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.jfree.data.xy.XYSeries;

import filestuff.FileSplitter;
import polyfit.PolynomialRegression;

public class ScreenCloudPointsLevel3 {
FileSplitter fs;
double[] volt1;
double[] x2Array,y2Array;
public double[] yNew2;
ScreenCloudPointsLevel1 scp;
ScreenCloudPointsLevel2 scp2;
XYSeries screenSeries1,screenSeries2,screenSeries3;
double [] temp;


	public ScreenCloudPointsLevel3(FileSplitter f, ScreenCloudPointsLevel1 sp1, ScreenCloudPointsLevel2 sp2) {
		fs=f;
		scp2=sp2;
		scp=sp1;
		screenSeries1=new XYSeries("");
		screenSeries2=new XYSeries("");
		screenSeries3=new XYSeries("");
		 //StandardDeviation sd= new StandardDeviation();
	}

	public void screen3(int filtNum, double[] yNew, XYSeries s3,XYSeries s4,XYSeries s5) {
		StandardDeviation sd= new StandardDeviation();
		screenSeries1=s3;
		screenSeries2=s4;
		screenSeries3=s5;
		if(filtNum==1){
			volt1=new double[fs.vol1.size()];
			volt1=scp.toArray(fs.vol1);
			
		       double std=sd.evaluate(volt1);
		       for(int i=0;i<volt1.length-1;i++)
		       {
		    	   if(volt1[i] < (yNew[i]-(0.4*std)))
		    			   fs.vol1.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol1.size()-1;i++){
					if(fs.vol1.get(i)<2.0){
				
					fs.vol1.remove(i);
					
					fs.arr1.remove(i);	
					i--;
					
					}
		       }
		       	x2Array=new double[fs.arr1.size()];
				x2Array=scp.toArray(fs.arr1);
				y2Array=new double[fs.vol1.size()];
				y2Array=scp.toArray(fs.vol1);
		
		}
		
		if(filtNum==2){
			volt1=new double[fs.vol2.size()];
			volt1=scp.toArray(fs.vol2);
			
		       double std=sd.evaluate(volt1);
		       for(int i=0;i<volt1.length-1;i++)
		       {
		    	   if(volt1[i] < (yNew[i]-(0.4*std)))
		    			   fs.vol2.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol2.size()-1;i++){
					if(fs.vol2.get(i)<2.0){
				
					fs.vol2.remove(i);
					
					fs.arr2.remove(i);	
					i--;
					
					}
		       }
		       	x2Array=new double[fs.arr2.size()];
				x2Array=scp.toArray(fs.arr2);
				y2Array=new double[fs.vol2.size()];
				y2Array=scp.toArray(fs.vol2);
		
		}
		
		if(filtNum==3){
			volt1=new double[fs.vol3.size()];
			volt1=scp.toArray(fs.vol3);
			
		       double std=sd.evaluate(volt1);
		       for(int i=0;i<volt1.length-1;i++)
		       {
		    	   if(volt1[i] < (yNew[i]-(0.4*std)))
		    			   fs.vol3.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol3.size()-1;i++){
					if(fs.vol3.get(i)<2.0){
				
					fs.vol3.remove(i);
					
					fs.arr3.remove(i);	
					i--;
					
					}
		       }
		       	x2Array=new double[fs.arr3.size()];
				x2Array=scp.toArray(fs.arr3);
				y2Array=new double[fs.vol3.size()];
				y2Array=scp.toArray(fs.vol3);
		
		}
		
		if(filtNum==4){
			volt1=new double[fs.vol4.size()];
			volt1=scp.toArray(fs.vol4);
			
		       double std=sd.evaluate(volt1);
		       for(int i=0;i<volt1.length-1;i++)
		       {
		    	   if(volt1[i] < (yNew[i]-(0.4*std)))
		    			   fs.vol4.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol4.size()-1;i++){
					if(fs.vol4.get(i)<2.0){
				
					fs.vol4.remove(i);
					
					fs.arr4.remove(i);	
					i--;
					
					}
		       }
		       	x2Array=new double[fs.arr4.size()];
				x2Array=scp.toArray(fs.arr4);
				y2Array=new double[fs.vol4.size()];
				y2Array=scp.toArray(fs.vol4);
		
		}
		
		if(filtNum==5){
			volt1=new double[fs.vol5.size()];
			volt1=scp.toArray(fs.vol5);
			
		       double std=sd.evaluate(volt1);
		       for(int i=0;i<volt1.length-1;i++)
		       {
		    	   if(volt1[i] < (yNew[i]-(0.4*std)))
		    			   fs.vol5.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol5.size()-1;i++){
					if(fs.vol5.get(i)<2.0){
				
					fs.vol5.remove(i);
					
					fs.arr5.remove(i);	
					i--;
					
					}
		       }
		       	x2Array=new double[fs.arr5.size()];
				x2Array=scp.toArray(fs.arr5);
				y2Array=new double[fs.vol5.size()];
				y2Array=scp.toArray(fs.vol5);
		
		}
		
		
		if(filtNum==6){
			volt1=new double[fs.vol6.size()];
			volt1=scp.toArray(fs.vol6);
			
		       double std=sd.evaluate(volt1);
		       for(int i=0;i<volt1.length-1;i++)
		       {
		    	   if(volt1[i] < (yNew[i]-(0.4*std)))
		    			   fs.vol6.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol6.size()-1;i++){
					if(fs.vol6.get(i)<2.0){
				
					fs.vol6.remove(i);
					
					fs.arr6.remove(i);	
					i--;
					
					}
		       }
		       	x2Array=new double[fs.arr6.size()];
				x2Array=scp.toArray(fs.arr6);
				y2Array=new double[fs.vol6.size()];
				y2Array=scp.toArray(fs.vol6);
		
		}
		if(filtNum==7){
			volt1=new double[fs.vol7.size()];
			volt1=scp.toArray(fs.vol7);
			
		       double std=sd.evaluate(volt1);
		       for(int i=0;i<volt1.length-1;i++)
		       {
		    	   if(volt1[i] < (yNew[i]-(0.4*std)))
		    			   fs.vol7.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol7.size()-1;i++){
					if(fs.vol7.get(i)<2.0){
				
					fs.vol7.remove(i);
					
					fs.arr7.remove(i);	
					i--;
					
					}
		       }
		       	x2Array=new double[fs.arr7.size()];
				x2Array=scp.toArray(fs.arr7);
				y2Array=new double[fs.vol7.size()];
				y2Array=scp.toArray(fs.vol7);
		
		}
		
		if(filtNum==8){
			volt1=new double[fs.vol8.size()];
			volt1=scp.toArray(fs.vol8);
			
		       double std=sd.evaluate(volt1);
		       for(int i=0;i<volt1.length-1;i++)
		       {
		    	   if(volt1[i] < (yNew[i]-(0.4*std)))
		    			   fs.vol8.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol8.size()-1;i++){
					if(fs.vol8.get(i)<2.0){
				
					fs.vol8.remove(i);
					
					fs.arr8.remove(i);	
					i--;
					
					}
		       }
		       	x2Array=new double[fs.arr8.size()];
				x2Array=scp.toArray(fs.arr8);
				y2Array=new double[fs.vol8.size()];
				y2Array=scp.toArray(fs.vol8);
		
		}
		if(filtNum==9){
			volt1=new double[fs.vol9.size()];
			volt1=scp.toArray(fs.vol9);
			
		       double std=sd.evaluate(volt1);
		       for(int i=0;i<volt1.length-1;i++)
		       {
		    	   if(volt1[i] < (yNew[i]-(0.4*std)))
		    			   fs.vol9.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol9.size()-1;i++){
					if(fs.vol9.get(i)<2.0){
				
					fs.vol9.remove(i);
					
					fs.arr9.remove(i);	
					i--;
					
					}
		       }
		       	x2Array=new double[fs.arr9.size()];
				x2Array=scp.toArray(fs.arr9);
				y2Array=new double[fs.vol9.size()];
				y2Array=scp.toArray(fs.vol9);
		
		}
		
		if(filtNum==10){
			volt1=new double[fs.vol10.size()];
			volt1=scp.toArray(fs.vol10);
			
		       double std=sd.evaluate(volt1);
		       for(int i=0;i<volt1.length-1;i++)
		       {
		    	   if(volt1[i] < (yNew[i]-(0.4*std)))
		    			   fs.vol10.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol10.size()-1;i++){
					if(fs.vol10.get(i)<2.0){
				
					fs.vol10.remove(i);
					
					fs.arr10.remove(i);	
					i--;
					
					}
		       }
		       	x2Array=new double[fs.arr10.size()];
				x2Array=scp.toArray(fs.arr10);
				y2Array=new double[fs.vol10.size()];
				y2Array=scp.toArray(fs.vol10);
		
		}
		
		
		
		
		yNew2=new double[x2Array.length];
		yNew2=PolynomialRegression.getPolyfit(x2Array, y2Array);
		
		
		
		for(int i=0;i<x2Array.length;i++){
			if(filtNum==1){
				temp=new double[fs.vol1.size()];
				temp=scp.toArray(fs.vol1);
				double sdTemp=sd.evaluate(temp);
			screenSeries1.add(fs.arr1.get(i)/60, yNew2[i]);
			screenSeries2.add(fs.arr1.get(i)/60,(yNew2[i]+(0.4*sdTemp)));
			screenSeries3.add(fs.arr1.get(i)/60,(yNew2[i]-(0.4*sdTemp)));
			
			}
			if(filtNum==2){
				temp=new double[fs.vol2.size()];
				temp=scp.toArray(fs.vol2);
				double sdTemp=sd.evaluate(temp);
				screenSeries1.add(fs.arr2.get(i)/60, yNew2[i]);
				screenSeries2.add(fs.arr2.get(i)/60,(yNew2[i]+(0.4*sdTemp)));
				screenSeries3.add(fs.arr2.get(i)/60,(yNew2[i]-(0.4*sdTemp)));
			}
			if(filtNum==3)
			{
				temp=new double[fs.vol3.size()];
				temp=scp.toArray(fs.vol3);
				double sdTemp=sd.evaluate(temp);
				screenSeries1.add(fs.arr3.get(i)/60, yNew2[i]);
				screenSeries2.add(fs.arr3.get(i)/60,(yNew2[i]+(0.4*sdTemp)));
				screenSeries3.add(fs.arr3.get(i)/60,(yNew2[i]-(0.4*sdTemp)));
			}
			if(filtNum==4)
			{
				temp=new double[fs.vol4.size()];
				temp=scp.toArray(fs.vol4);
				double sdTemp=sd.evaluate(temp);
				screenSeries1.add(fs.arr4.get(i)/60, yNew2[i]);
				screenSeries2.add(fs.arr4.get(i)/60,(yNew2[i]+(0.4*sdTemp)));
				screenSeries3.add(fs.arr4.get(i)/60,(yNew2[i]-(0.4*sdTemp)));
			}
			if(filtNum==5){
				temp=new double[fs.vol5.size()];
				temp=scp.toArray(fs.vol5);
				double sdTemp=sd.evaluate(temp);
				screenSeries1.add(fs.arr5.get(i)/60, yNew2[i]);
				screenSeries2.add(fs.arr5.get(i)/60,(yNew2[i]+(0.4*sdTemp)));
				screenSeries3.add(fs.arr5.get(i)/60,(yNew2[i]-(0.4*sdTemp)));
			}
			if(filtNum==6)
			{
				temp=new double[fs.vol6.size()];
				temp=scp.toArray(fs.vol6);
				double sdTemp=sd.evaluate(temp);
				screenSeries1.add(fs.arr6.get(i)/60, yNew2[i]);
				screenSeries2.add(fs.arr6.get(i)/60,(yNew2[i]+(0.4*sdTemp)));
				screenSeries3.add(fs.arr6.get(i)/60,(yNew2[i]-(0.4*sdTemp)));
			}
			if(filtNum==7)
			{
				temp=new double[fs.vol7.size()];
				temp=scp.toArray(fs.vol7);
				double sdTemp=sd.evaluate(temp);
				screenSeries1.add(fs.arr7.get(i)/60, yNew2[i]);
				screenSeries2.add(fs.arr7.get(i)/60,(yNew2[i]+(0.4*sdTemp)));
				screenSeries3.add(fs.arr7.get(i)/60,(yNew2[i]-(0.4*sdTemp)));
			}
			if(filtNum==8)	
			{
				temp=new double[fs.vol8.size()];
				temp=scp.toArray(fs.vol8);
				double sdTemp=sd.evaluate(temp);
				screenSeries1.add(fs.arr8.get(i)/60, yNew2[i]);
				screenSeries2.add(fs.arr8.get(i)/60,(yNew2[i]+(0.4*sdTemp)));
				screenSeries3.add(fs.arr8.get(i)/60,(yNew2[i]-(0.4*sdTemp)));
			}
			if(filtNum==9)	
			{	
			temp=new double[fs.vol9.size()];
			temp=scp.toArray(fs.vol9);
			double sdTemp=sd.evaluate(temp);
			screenSeries1.add(fs.arr9.get(i)/60, yNew2[i]);
			screenSeries2.add(fs.arr9.get(i)/60,(yNew2[i]+(0.4*sdTemp)));
			screenSeries3.add(fs.arr9.get(i)/60,(yNew2[i]-(0.4*sdTemp)));
			}
			if(filtNum==10)	
			{
				temp=new double[fs.vol10.size()];
				temp=scp.toArray(fs.vol10);
				double sdTemp=sd.evaluate(temp);
				screenSeries1.add(fs.arr10.get(i)/60, yNew2[i]);
				screenSeries2.add(fs.arr10.get(i)/60,(yNew2[i]+(0.4*sdTemp)));
				screenSeries3.add(fs.arr10.get(i)/60,(yNew2[i]-(0.4*sdTemp)));
			}
		}
		
		
		
	}
	
	public XYSeries getSeries1(){
		
	return screenSeries1;
	
	}
	
	public XYSeries getSeries2(){
		
	return screenSeries2;
	
	}
	
	public XYSeries getSeries3(){
		
	return screenSeries3;
	
	}
	
	

	
	
}
