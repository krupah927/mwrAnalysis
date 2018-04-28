package screen;

import java.util.ArrayList;

import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.jfree.data.xy.XYSeries;

import filestuff.FileSplitter;
import polyfit.PolynomialRegression;
import polyfit.polyfitPolyval;

public class ScreenCloudPointsLevel1 {
	double[] xArray, yArray;
	public double[] yValue;
FileSplitter fs;	
int index;
XYSeries s=new XYSeries("");
int norm_Mat[];
int temp;
XYSeries tempSeries;
public ScreenCloudPointsLevel1(FileSplitter f) {
		fs=f;
		 tempSeries= new XYSeries("");
		
}

public void createNormMAt(FileSplitter fs,int  filtno,XYSeries s2){
	
	if(filtno==1){
		Double max= getMax(fs.vol1);// get max value
		norm_Mat=new int[fs.vol1.size()];
		int si=fs.vol1.size();// size of vol1
		for(int i=0;i<fs.vol1.size()-1;i++){
			temp=(int) ((fs.vol1.get(i)*1000)/max); 
			norm_Mat[i]=temp;
			if(norm_Mat[i]<50){ // if value of norm_mat <50 make corresponding voltage 0
				fs.vol1.set(i, (double) 0);
			}
		}
	//delete the vlues which are <2
		for(int i=0;i<=fs.vol1.size()-1;i++){
			if(fs.vol1.get(i)<2.0){
		
			fs.vol1.remove(i);
			
			fs.arr1.remove(i);	
			i--;
			
			}
		
		}
		
	
		xArray=new double[fs.arr1.size()];
		xArray=toArray(fs.arr1);
		yArray=new double[fs.vol1.size()];
		yArray=toArray(fs.vol1);
	
	}


	if(filtno==2){
		Double max= getMax(fs.vol2);
		norm_Mat=new int[fs.vol2.size()];
		int si=fs.vol2.size();
		for(int i=0;i<fs.vol2.size()-1;i++){
			
		temp=(int) ((fs.vol2.get(i)*1000)/max);
		norm_Mat[i]=temp;
		if(norm_Mat[i]<50){
			fs.vol2.set(i, (double) 0);
		} }
	
		for(int i=0;i<=fs.vol2.size()-1;i++){
			if(fs.vol2.get(i)<2.0){
		
			fs.vol2.remove(i);
			fs.arr2.remove(i);	
			i--;
			}
		
		}
		xArray=new double[fs.arr2.size()];
		xArray=toArray(fs.arr2);
		yArray=new double[fs.vol2.size()];
		yArray=toArray(fs.vol2);
		
	}
	
	if(filtno==3){
		Double max= getMax(fs.vol3);
		norm_Mat=new int[fs.vol3.size()];
		int si=fs.vol3.size();
		for(int i=0;i<fs.vol3.size()-1;i++){
			
		temp=(int) ((fs.vol3.get(i)*1000)/max);
		norm_Mat[i]=temp;
		if(norm_Mat[i]<50){
			fs.vol3.set(i, (double) 0);
		} }
	
		for(int i=0;i<=fs.vol3.size()-1;i++){
			if(fs.vol3.get(i)<2.0){
	//	System.out.println("deletin "+index+" "+fs.vol3.get(i));
			fs.vol3.remove(i);
			fs.arr3.remove(i);	
			i--;
			}
		
		}
		xArray=new double[fs.arr3.size()];
		xArray=toArray(fs.arr3);
		yArray=new double[fs.vol3.size()];
		yArray=toArray(fs.vol3);
		
		
		
		
	}
	
	if(filtno==4){
		Double max= getMax(fs.vol4);
		norm_Mat=new int[fs.vol4.size()];
		int si=fs.vol4.size();
		for(int i=0;i<fs.vol4.size()-1;i++){
			
		temp=(int) ((fs.vol4.get(i)*1000)/max);
		norm_Mat[i]=temp;
		if(norm_Mat[i]<50){
			fs.vol4.set(i, (double) 0);
		} }
	
		for(int i=0;i<=fs.vol4.size()-1;i++){
			if(fs.vol4.get(i)<2.0){
	//	System.out.println("deletin "+index+" "+fs.vol4.get(i));
			fs.vol4.remove(i);
			fs.arr4.remove(i);	
			i--;
			}
		
		}
		xArray=new double[fs.arr4.size()];
		xArray=toArray(fs.arr4);
		yArray=new double[fs.vol4.size()];
		yArray=toArray(fs.vol4);
		
	}
	
	if(filtno==5){
		Double max= getMax(fs.vol5);
		norm_Mat=new int[fs.vol5.size()];
		int si=fs.vol5.size();
		for(int i=0;i<fs.vol5.size()-1;i++){
			
		temp=(int) ((fs.vol5.get(i)*1000)/max);
		norm_Mat[i]=temp;
		if(norm_Mat[i]<50){
			fs.vol5.set(i, (double) 0);
		} }
	
		for(int i=0;i<=fs.vol5.size()-1;i++){
			if(fs.vol5.get(i)<2.0){
	//	System.out.println("deletin "+index+" "+fs.vol5.get(i));
			fs.vol5.remove(i);
			fs.arr5.remove(i);	
			i--;
			}
		
		}
		xArray=new double[fs.arr5.size()];
		xArray=toArray(fs.arr5);
		yArray=new double[fs.vol5.size()];
		yArray=toArray(fs.vol5);
	}
	
		if(filtno==6){
			Double max= getMax(fs.vol6);// get max value
			norm_Mat=new int[fs.vol6.size()];
			int si=fs.vol6.size();// size of vol1
			for(int i=0;i<fs.vol6.size()-1;i++){
				temp=(int) ((fs.vol6.get(i)*1000)/max); 
				norm_Mat[i]=temp;
				if(norm_Mat[i]<50){ // if value of norm_mat <50 make corresponding voltage 0
					fs.vol6.set(i, (double) 0);
				}
			}
		//delete the vlues which are <2
			for(int i=0;i<=fs.vol6.size()-1;i++){
				if(fs.vol6.get(i)<2.0){
			
				fs.vol6.remove(i);
				
				fs.arr6.remove(i);	
				i--;
				
				}
			
			}
			
		
			xArray=new double[fs.arr6.size()];
			xArray=toArray(fs.arr6);
			yArray=new double[fs.vol6.size()];
			yArray=toArray(fs.vol6);
		
		}
		
		if(filtno==7){
			Double max= getMax(fs.vol7);// get max value
			norm_Mat=new int[fs.vol7.size()];
			int si=fs.vol7.size();
			for(int i=0;i<fs.vol7.size()-1;i++){
				temp=(int) ((fs.vol7.get(i)*1000)/max); 
				norm_Mat[i]=temp;
				if(norm_Mat[i]<50){ // if value of norm_mat <50 make corresponding voltage 0
					fs.vol7.set(i, (double) 0);
				}
			}
		//delete the vlues which are <2
			for(int i=0;i<=fs.vol7.size()-1;i++){
				if(fs.vol7.get(i)<2.0){
			
				fs.vol7.remove(i);
				
				fs.arr7.remove(i);	
				i--;
				
				}
			
			}
			
		
			xArray=new double[fs.arr7.size()];
			xArray=toArray(fs.arr7);
			yArray=new double[fs.vol7.size()];
			yArray=toArray(fs.vol7);
		
		}
		
		if(filtno==8){
			Double max= getMax(fs.vol8);// get max value
			norm_Mat=new int[fs.vol8.size()];
			int si=fs.vol8.size();// size of vol1
			for(int i=0;i<fs.vol8.size()-1;i++){
				temp=(int) ((fs.vol8.get(i)*1000)/max); 
				norm_Mat[i]=temp;
				if(norm_Mat[i]<50){ // if value of norm_mat <50 make corresponding voltage 0
					fs.vol8.set(i, (double) 0);
				}
			}
		//delete the vlues which are <2
			for(int i=0;i<=fs.vol8.size()-1;i++){
				if(fs.vol8.get(i)<2.0){
			
				fs.vol8.remove(i);
				
				fs.arr8.remove(i);	
				i--;
				
				}
			
			}
			
		
			xArray=new double[fs.arr8.size()];
			xArray=toArray(fs.arr8);
			yArray=new double[fs.vol8.size()];
			yArray=toArray(fs.vol8);
		
		}
		
		if(filtno==9){
			Double max= getMax(fs.vol9);// get max value
			norm_Mat=new int[fs.vol9.size()];
			int si=fs.vol9.size();// size of vol1
			for(int i=0;i<fs.vol9.size()-1;i++){
				temp=(int) ((fs.vol9.get(i)*1000)/max); 
				norm_Mat[i]=temp;
				if(norm_Mat[i]<50){ // if value of norm_mat <50 make corresponding voltage 0
					fs.vol9.set(i, (double) 0);
				}
			}
		//delete the vlues which are <2
			for(int i=0;i<=fs.vol1.size()-1;i++){
				if(fs.vol9.get(i)<2.0){
			
				fs.vol9.remove(i);
				
				fs.arr9.remove(i);	
				i--;
				
				}
			
			}
			
		
			xArray=new double[fs.arr9.size()];
			xArray=toArray(fs.arr9);
			yArray=new double[fs.vol9.size()];
			yArray=toArray(fs.vol9);
		
		}
		
		if(filtno==10){
			Double max= getMax(fs.vol10);// get max value
			norm_Mat=new int[fs.vol10.size()];
			int si=fs.vol10.size();// size of vol1
			for(int i=0;i<fs.vol10.size()-1;i++){
				temp=(int) ((fs.vol10.get(i)*1000)/max); 
				norm_Mat[i]=temp;
				if(norm_Mat[i]<50){ // if value of norm_mat <50 make corresponding voltage 0
					fs.vol10.set(i, (double) 0);
				}
			}
		//delete the vlues which are <2
			for(int i=0;i<=fs.vol10.size()-1;i++){
				if(fs.vol10.get(i)<2.0){
			
				fs.vol10.remove(i);
				
				fs.arr10.remove(i);	
				i--;
				
				}
			
			}
			
		
			xArray=new double[fs.arr10.size()];
			xArray=toArray(fs.arr10);
			yArray=new double[fs.vol10.size()];
			yArray=toArray(fs.vol10);
		
		}
		
//		System.out.println("callin ploynomial regression");
	//PolynomialRegression pr=new PolynomialRegression(xArray,yArray,2);
		yValue=new double[xArray.length];
		yValue=PolynomialRegression.getPolyfit(xArray, yArray);


		for(int i=0;i<xArray.length;i++){
			if(filtno==1)
			tempSeries.add(fs.arr1.get(i)/60, yValue[i]);
			if(filtno==2)
				tempSeries.add(fs.arr2.get(i)/60, yValue[i]);
			if(filtno==3)
				tempSeries.add(fs.arr3.get(i)/60, yValue[i]);
			if(filtno==4)
				tempSeries.add(fs.arr4.get(i)/60, yValue[i]);
			if(filtno==5)
				tempSeries.add(fs.arr5.get(i)/60, yValue[i]);
			if(filtno==6)
				tempSeries.add(fs.arr6.get(i)/60, yValue[i]);
			if(filtno==7)
				tempSeries.add(fs.arr7.get(i)/60, yValue[i]);
			if(filtno==8)	
				tempSeries.add(fs.arr8.get(i)/60, yValue[i]);
			if(filtno==9)	
				tempSeries.add(fs.arr9.get(i)/60, yValue[i]);
			if(filtno==10)	
				tempSeries.add(fs.arr10.get(i)/60, yValue[i]);
		}
}




double[] toArray(ArrayList<Double> list) {
	double[] array=new double[list.size()];
	for(int i=0;i<list.size();i++){
	array[i]=  list.get(i);
//	System.out.println("inside toarray");	
	}
	return array;
}

private Double getMax(ArrayList<Double> vol10) {
	Double max=vol10.get(0);
	for(int i = 0; i < vol10.size(); i++) {
	    Double number = vol10.get(i);
	    if(number > max) max = number;
	}
	return max;
}

public XYSeries getSeries(){
	//System.out.println("inside getSeriess");
return tempSeries;
}
}

