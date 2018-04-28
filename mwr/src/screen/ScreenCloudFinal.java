package screen;

import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.jfree.data.xy.XYSeries;

import filestuff.FileSplitter;

public class ScreenCloudFinal {

	FileSplitter fs;
	double[] volt2;
	XYSeries lastSeries;
	int size;
	
	ScreenCloudPointsLevel1 scp;
	ScreenCloudPointsLevel3 scp3;
	public ScreenCloudFinal(FileSplitter f, ScreenCloudPointsLevel1 sp1, ScreenCloudPointsLevel3 sp3) {
	fs=f;
	scp=sp1;
	scp3=sp3;
	lastSeries=new XYSeries("");
	}
	
	public void screenFinal(int filtNo, double[] yNew2,XYSeries s6) {
		lastSeries=s6;
		if(filtNo==1){
		volt2=new double[fs.vol1.size()];
		volt2=scp.toArray(fs.vol1);
		 StandardDeviation sd= new StandardDeviation();
	        double std=sd.evaluate(volt2);
	      
	       for(int i=0;i<volt2.length-1;i++)
	       {
	    	   if(volt2[i] < (yNew2[i]-(0.4*std)))
	    			   fs.vol1.set(i, (double) 0);
	       }
	       
	       for(int i=0;i<=fs.vol1.size()-1;i++){
				if(fs.vol1.get(i)<2.0){
			
				fs.vol1.remove(i);
				
				fs.arr1.remove(i);	
				i--;
				
				}
	       }
	       size=fs.arr1.size()-1;
		
		}
		if(filtNo==2){
			volt2=new double[fs.vol2.size()];
			volt2=scp.toArray(fs.vol2);
			 StandardDeviation sd= new StandardDeviation();
		        double std=sd.evaluate(volt2);
		        
		        
		       for(int i=0;i<volt2.length-1;i++)
		       {
		    	   if(volt2[i] < (yNew2[i]-(0.4*std)))
		    			   fs.vol2.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol2.size()-1;i++){
					if(fs.vol2.get(i)<2.0){
				
					fs.vol2.remove(i);
					
					fs.arr2.remove(i);	
					i--;
					
					}
		       }
		       size=fs.arr2.size()-1;
			
			}
		if(filtNo==3){
			volt2=new double[fs.vol3.size()];
			volt2=scp.toArray(fs.vol3);
			 StandardDeviation sd= new StandardDeviation();
		        double std=sd.evaluate(volt2);
		        
		
		       for(int i=0;i<volt2.length-1;i++)
		       {
		    	   if(volt2[i] < (yNew2[i]-(0.4*std)))
		    			   fs.vol3.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol3.size()-1;i++){
					if(fs.vol3.get(i)<2.0){
				
					fs.vol3.remove(i);
					
					fs.arr3.remove(i);	
					i--;
					
					}
		       }
		       size=fs.arr3.size()-1;
			
			}
		
		if(filtNo==4){
			volt2=new double[fs.vol4.size()];
			volt2=scp.toArray(fs.vol4);
			 StandardDeviation sd= new StandardDeviation();
		        double std=sd.evaluate(volt2);
		        
		        
		       for(int i=0;i<volt2.length-1;i++)
		       {
		    	   if(volt2[i] < (yNew2[i]-(0.4*std)))
		    			   fs.vol4.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol2.size()-1;i++){
					if(fs.vol4.get(i)<2.0){
				
					fs.vol4.remove(i);
					
					fs.arr4.remove(i);	
					i--;
					
					}
		       }
		       size=fs.arr4.size()-1;
			
			}
		
		if(filtNo==5){
			volt2=new double[fs.vol5.size()];
			volt2=scp.toArray(fs.vol5);
			 StandardDeviation sd= new StandardDeviation();
		        double std=sd.evaluate(volt2);
		        
		        
		       for(int i=0;i<volt2.length-1;i++)
		       {
		    	   if(volt2[i] < (yNew2[i]-(0.4*std)))
		    			   fs.vol5.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol5.size()-1;i++){
					if(fs.vol5.get(i)<2.0){
				
					fs.vol5.remove(i);
					
					fs.arr5.remove(i);	
					i--;
					
					}
		       }
		       size=fs.arr5.size()-1;
			
			}
		
		if(filtNo==6){
			volt2=new double[fs.vol6.size()];
			volt2=scp.toArray(fs.vol6);
			 StandardDeviation sd= new StandardDeviation();
		        double std=sd.evaluate(volt2);
		        
		     
		       for(int i=0;i<volt2.length-1;i++)
		       {
		    	   if(volt2[i] < (yNew2[i]-(0.4*std)))
		    			   fs.vol6.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol6.size()-1;i++){
					if(fs.vol7.get(i)<2.0){
				
					fs.vol6.remove(i);
					
					fs.arr6.remove(i);	
					i--;
					
					}
		       }
		       size=fs.arr6.size()-1;
			
			}
		if(filtNo==7){
			volt2=new double[fs.vol7.size()];
			volt2=scp.toArray(fs.vol7);
			 StandardDeviation sd= new StandardDeviation();
		        double std=sd.evaluate(volt2);
		    
		       for(int i=0;i<volt2.length-1;i++)
		       {
		    	   if(volt2[i] < (yNew2[i]-(0.4*std)))
		    			   fs.vol7.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol7.size()-1;i++){
					if(fs.vol7.get(i)<2.0){
				
					fs.vol7.remove(i);
					
					fs.arr7.remove(i);	
					i--;
					
					}
		       }
		       size=fs.arr7.size()-1;
			
			}
		if(filtNo==8){
			volt2=new double[fs.vol1.size()];
			volt2=scp.toArray(fs.vol1);
			 StandardDeviation sd= new StandardDeviation();
		        double std=sd.evaluate(volt2);
		       
		       for(int i=0;i<volt2.length-1;i++)
		       {
		    	   if(volt2[i] < (yNew2[i]-(0.4*std)))
		    			   fs.vol8.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol8.size()-1;i++){
					if(fs.vol8.get(i)<2.0){
				
					fs.vol8.remove(i);
					
					fs.arr8.remove(i);	
					i--;
					
					}
		       }
		       size=fs.arr8.size()-1;
			
			}
		if(filtNo==9){
			volt2=new double[fs.vol9.size()];
			volt2=scp.toArray(fs.vol9);
			 StandardDeviation sd= new StandardDeviation();
		        double std=sd.evaluate(volt2);
		       
		      
		       for(int i=0;i<volt2.length-1;i++)
		       {
		    	   if(volt2[i] < (yNew2[i]-(0.4*std)))
		    			   fs.vol9.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol9.size()-1;i++){
					if(fs.vol9.get(i)<2.0){
				
					fs.vol9.remove(i);
					
					fs.arr9.remove(i);	
					i--;
					
					}
		       }
		       size=fs.arr9.size()-1;
			
			}
		
		if(filtNo==10){
			volt2=new double[fs.vol10.size()];
			volt2=scp.toArray(fs.vol10);
			 StandardDeviation sd= new StandardDeviation();
		        double std=sd.evaluate(volt2);
		     
		       for(int i=0;i<volt2.length-1;i++)
		       {
		    	   if(volt2[i] < (yNew2[i]-(0.4*std)))
		    			   fs.vol10.set(i, (double) 0);
		       }
		       
		       for(int i=0;i<=fs.vol10.size()-1;i++){
					if(fs.vol10.get(i)<2.0){
				
					fs.vol10.remove(i);
					
					fs.arr10.remove(i);	
					i--;
					
					}
		       }
		       size=fs.arr10.size()-1;
			
			}
		
		
		
		for(int i=0;i<size;i++){
			if(filtNo==1)
				lastSeries.add(fs.arr1.get(i)/60,fs.vol1.get(i));
			if(filtNo==2)
				lastSeries.add(fs.arr2.get(i)/60, fs.vol2.get(i));
			if(filtNo==3)
				lastSeries.add(fs.arr3.get(i)/60, fs.vol3.get(i));
			if(filtNo==4)
				lastSeries.add(fs.arr4.get(i)/60, fs.vol4.get(i));
			if(filtNo==5)
				lastSeries.add(fs.arr5.get(i)/60, fs.vol5.get(i));
			if(filtNo==6)
				lastSeries.add(fs.arr6.get(i)/60, fs.vol6.get(i));
			if(filtNo==7)
				lastSeries.add(fs.arr7.get(i)/60, fs.vol7.get(i));
			if(filtNo==8)	
				lastSeries.add(fs.arr8.get(i)/60, fs.vol8.get(i));
			if(filtNo==9)	
				lastSeries.add(fs.arr9.get(i)/60, fs.vol9.get(i));
			if(filtNo==10)	
				lastSeries.add(fs.arr10.get(i)/60, fs.vol10.get(i));
		}
	
	}
	
	public XYSeries getSeries(){
		
	return lastSeries;
	}
	
	

}
