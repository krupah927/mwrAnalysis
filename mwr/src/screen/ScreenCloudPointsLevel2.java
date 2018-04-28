package screen;

import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;

import filestuff.FileSplitter;
import polyfit.PolynomialRegression;

public class ScreenCloudPointsLevel2 {
	FileSplitter fs;
	double[] volt;
	double[] x1Array,y1Array;
	public double[] yNew;
	ScreenCloudPointsLevel1 scp;
	public ScreenCloudPointsLevel2(FileSplitter f, ScreenCloudPointsLevel1 sp) {
		fs=f;
		scp=sp;
	}

	public void screen2(int filtNum, double[] yValue) {
		if(filtNum==1){
			volt=new double[fs.vol1.size()];
			volt=scp.toArray(fs.vol1);
			 StandardDeviation sd= new StandardDeviation();
		        double std=sd.evaluate(volt);
		       for(int i=0;i<volt.length-1;i++)
		       {
		    	   if(volt[i] < (yValue[i]-(0.6*std)))
		    			   fs.vol1.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol1.size()-1;i++){
					if(fs.vol1.get(i)<2.0){
				
					fs.vol1.remove(i);
					
					fs.arr1.remove(i);	
					i--;
					
					}
		       }
		       	x1Array=new double[fs.arr1.size()];
				x1Array=scp.toArray(fs.arr1);
				y1Array=new double[fs.vol1.size()];
				y1Array=scp.toArray(fs.vol1);
		
		}
		
		if(filtNum==2){
			volt=new double[fs.vol2.size()];
			volt=scp.toArray(fs.vol2);
			 StandardDeviation sd= new StandardDeviation();
		        double std=sd.evaluate(volt);
		       for(int i=0;i<volt.length-1;i++)
		       {
		    	   if(volt[i] < (yValue[i]-(0.6*std)))
		    			   fs.vol2.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol2.size()-1;i++){
					if(fs.vol2.get(i)<2.0){
				
					fs.vol2.remove(i);
					
					fs.arr2.remove(i);	
					i--;
					
					}
		       }
		       	x1Array=new double[fs.arr2.size()];
				x1Array=scp.toArray(fs.arr2);
				y1Array=new double[fs.vol2.size()];
				y1Array=scp.toArray(fs.vol2);
		
		}
		
		if(filtNum==3){
			volt=new double[fs.vol3.size()];
			volt=scp.toArray(fs.vol3);
			 StandardDeviation sd= new StandardDeviation();
		        double std=sd.evaluate(volt);
		       for(int i=0;i<volt.length-1;i++)
		       {
		    	   if(volt[i] < (yValue[i]-(0.6*std)))
		    			   fs.vol3.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol3.size()-1;i++){
					if(fs.vol3.get(i)<2.0){
				
					fs.vol3.remove(i);
					
					fs.arr3.remove(i);	
					i--;
					
					}
		       }
		       	x1Array=new double[fs.arr3.size()];
				x1Array=scp.toArray(fs.arr3);
				y1Array=new double[fs.vol3.size()];
				y1Array=scp.toArray(fs.vol3);
		
		}
		if(filtNum==4){
			volt=new double[fs.vol4.size()];
			volt=scp.toArray(fs.vol4);
			 StandardDeviation sd= new StandardDeviation();
		        double std=sd.evaluate(volt);
		       for(int i=0;i<volt.length-1;i++)
		       {
		    	   if(volt[i] < (yValue[i]-(0.6*std)))
		    			   fs.vol4.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol4.size()-1;i++){
					if(fs.vol4.get(i)<2.0){
				
					fs.vol4.remove(i);
					
					fs.arr4.remove(i);	
					i--;
					
					}
		       }
		       	x1Array=new double[fs.arr4.size()];
				x1Array=scp.toArray(fs.arr4);
				y1Array=new double[fs.vol4.size()];
				y1Array=scp.toArray(fs.vol4);
		
		}
		
		if(filtNum==5){
			volt=new double[fs.vol5.size()];
			volt=scp.toArray(fs.vol5);
			 StandardDeviation sd= new StandardDeviation();
		        double std=sd.evaluate(volt);
		       for(int i=0;i<volt.length-1;i++)
		       {
		    	   if(volt[i] < (yValue[i]-(0.6*std)))
		    			   fs.vol5.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol5.size()-1;i++){
					if(fs.vol5.get(i)<2.0){
				
					fs.vol5.remove(i);
					
					fs.arr5.remove(i);	
					i--;
					
					}
		       }
		       	x1Array=new double[fs.arr5.size()];
				x1Array=scp.toArray(fs.arr5);
				y1Array=new double[fs.vol5.size()];
				y1Array=scp.toArray(fs.vol5);
		
		}
		
		if(filtNum==6){
			volt=new double[fs.vol6.size()];
			volt=scp.toArray(fs.vol6);
			 StandardDeviation sd= new StandardDeviation();
		        double std=sd.evaluate(volt);
		       for(int i=0;i<volt.length-1;i++)
		       {
		    	   if(volt[i] < (yValue[i]-(0.6*std)))
		    			   fs.vol6.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol6.size()-1;i++){
					if(fs.vol6.get(i)<2.0){
				
					fs.vol6.remove(i);
					
					fs.arr6.remove(i);	
					i--;
					
					}
		       }
		       	x1Array=new double[fs.arr6.size()];
				x1Array=scp.toArray(fs.arr6);
				y1Array=new double[fs.vol6.size()];
				y1Array=scp.toArray(fs.vol6);
		
		}
		if(filtNum==7){
			volt=new double[fs.vol7.size()];
			volt=scp.toArray(fs.vol7);
			 StandardDeviation sd= new StandardDeviation();
		        double std=sd.evaluate(volt);
		       for(int i=0;i<volt.length-1;i++)
		       {
		    	   if(volt[i] < (yValue[i]-(0.6*std)))
		    			   fs.vol7.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol7.size()-1;i++){
					if(fs.vol7.get(i)<2.0){
				
					fs.vol7.remove(i);
					
					fs.arr7.remove(i);	
					i--;
					
					}
		       }
		       	x1Array=new double[fs.arr7.size()];
				x1Array=scp.toArray(fs.arr7);
				y1Array=new double[fs.vol7.size()];
				y1Array=scp.toArray(fs.vol7);
		
		}
		
		if(filtNum==8){
			volt=new double[fs.vol8.size()];
			volt=scp.toArray(fs.vol8);
			 StandardDeviation sd= new StandardDeviation();
		        double std=sd.evaluate(volt);
		       for(int i=0;i<volt.length-1;i++)
		       {
		    	   if(volt[i] < (yValue[i]-(0.6*std)))
		    			   fs.vol8.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol8.size()-1;i++){
					if(fs.vol8.get(i)<2.0){
				
					fs.vol8.remove(i);
					
					fs.arr8.remove(i);	
					i--;
					
					}
		       }
		       	x1Array=new double[fs.arr8.size()];
				x1Array=scp.toArray(fs.arr8);
				y1Array=new double[fs.vol8.size()];
				y1Array=scp.toArray(fs.vol8);
		
		}
		if(filtNum==9){
			volt=new double[fs.vol9.size()];
			volt=scp.toArray(fs.vol9);
			 StandardDeviation sd= new StandardDeviation();
		        double std=sd.evaluate(volt);
		       for(int i=0;i<volt.length-1;i++)
		       {
		    	   if(volt[i] < (yValue[i]-(0.6*std)))
		    			   fs.vol9.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol9.size()-1;i++){
					if(fs.vol9.get(i)<2.0){
				
					fs.vol9.remove(i);
					
					fs.arr9.remove(i);	
					i--;
					
					}
		       }
		       	x1Array=new double[fs.arr9.size()];
				x1Array=scp.toArray(fs.arr9);
				y1Array=new double[fs.vol9.size()];
				y1Array=scp.toArray(fs.vol9);
		
		}
		
		if(filtNum==10){
			volt=new double[fs.vol10.size()];
			volt=scp.toArray(fs.vol10);
			 StandardDeviation sd= new StandardDeviation();
		        double std=sd.evaluate(volt);
		       for(int i=0;i<volt.length-1;i++)
		       {
		    	   if(volt[i] < (yValue[i]-(0.6*std)))
		    			   fs.vol10.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol10.size()-1;i++){
					if(fs.vol10.get(i)<2.0){
				
					fs.vol10.remove(i);
					
					fs.arr10.remove(i);	
					i--;
					
					}
		       }
		       	x1Array=new double[fs.arr10.size()];
				x1Array=scp.toArray(fs.arr10);
				y1Array=new double[fs.vol10.size()];
				y1Array=scp.toArray(fs.vol10);
		
		}
		
		
		yNew=new double[x1Array.length];
		yNew=PolynomialRegression.getPolyfit(x1Array, y1Array);

		
		
	}
}
