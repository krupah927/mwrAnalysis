package filestuff;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileSplitter {

	
	//int count1,count2,count3,count4,count5,count6;
	File f;
	int dd = 0,mm=0,yy=0;
	int filter = 0;
	 String str,day;
	 
public	 double la,lo,alt;
	 int count = 0;
	 double time=0;
	 double volValue=0;
	public ArrayList<Double> arr1 = new ArrayList<Double>();
	public ArrayList<Double>vol1=new ArrayList<Double>();
	public ArrayList<Double> voltage1 = new ArrayList<Double>();
		
	public ArrayList<Double> arr2 = new ArrayList<Double>();
	public ArrayList<Double>vol2=new ArrayList<Double>();
	public ArrayList<Double> voltage2 = new ArrayList<Double>();
	
	public 	ArrayList<Double> arr3 = new ArrayList<Double>();
	public ArrayList<Double>vol3=new ArrayList<Double>();
	public ArrayList<Double> voltage3 = new ArrayList<Double>();
	
	public 	ArrayList<Double> arr4 = new ArrayList<Double>();
	public ArrayList<Double>vol4=new ArrayList<Double>();
	public ArrayList<Double> voltage4 = new ArrayList<Double>();
	
	public ArrayList<Double> arr5 = new ArrayList<Double>();
	public ArrayList<Double>vol5=new ArrayList<Double>();
	public ArrayList<Double> voltage5 = new ArrayList<Double>();
	
	public ArrayList<Double> arr6 = new ArrayList<Double>();
	public ArrayList<Double>vol6=new ArrayList<Double>();
	public ArrayList<Double> voltage6 = new ArrayList<Double>();
	
	public ArrayList<Double> arr7 = new ArrayList<Double>();
	public ArrayList<Double>vol7=new ArrayList<Double>();
	public 	ArrayList<Double> voltage7 = new ArrayList<Double>();
	
	public ArrayList<Double> arr8 = new ArrayList<Double>();
	public ArrayList<Double>vol8=new ArrayList<Double>();
	public 	ArrayList<Double> voltage8 = new ArrayList<Double>();
	
	public ArrayList<Double> arr9 = new ArrayList<Double>();
	public ArrayList<Double>vol9=new ArrayList<Double>();
	public ArrayList<Double> voltage9 = new ArrayList<Double>();
	
	public ArrayList<Double> arr10 = new ArrayList<Double>();
	public ArrayList<Double>vol10=new ArrayList<Double>();
	public ArrayList<Double> voltage10 = new ArrayList<Double>();
	
	
	public void splitFile(String fn) throws FileNotFoundException {
		System.out.println("inside splitfile");
		 f= new File(fn);
		Scanner in= new Scanner(f);
		try{
			if(in.hasNextLine()){
				
		dd= in.nextInt();
			
		
			mm=in.nextInt();
			yy=in.nextInt();
			
			day=in.next();
			la=in.nextDouble();
			lo=in.nextDouble();
			alt=in.nextDouble();
			
			
			} }
			catch(Exception e){
				System.out.println(e);
			}
			//check if it has next line
		
		
			while(in.hasNextLine())
			{
				
				  String temp=in.next();//add to string
				  
	              if (isInteger(temp)) 
	              {
	            	  filter=Integer.parseInt(temp);
					//	System.out.println("filt num= "+filter);
						count=in.nextInt();
				
	              }
	              else{
	            	  
	            System.out.println(temp);
	              
	              
	              }
	              
	             
					
				              
						if(filter==01){ 
							 while(count>0){
						int i=in.nextInt();
						time=0;
						time=timeInMin(hours(i),mins(i),sec(i));
						arr1.add(time);
					//	System.out.println("time="+time);
						
					volValue=in.nextInt();
						vol1.add(volValue);
					//	voltage1.add(Math.log(volValue));
						count--;
							 }
						
						}
				              
						if(filter== 02){ 
							while(count>0){
							//System.out.println("inside filtr2");
								int i=in.nextInt();
								time=0;
								time=timeInMin(hours(i),mins(i),sec(i));
								arr2.add(time);
							//System.out.println("added arr2");
								volValue=in.nextInt();
								vol2.add(volValue);
								//voltage2.add(Math.log(volValue));
						
							count--;
							}
							}
						
						if(filter== 03){
							while(count>0){
								int i=in.nextInt();
								time=0;
								time=timeInMin(hours(i),mins(i),sec(i));
								arr3.add(time);
								volValue=in.nextInt();
								vol3.add(volValue);
						//		voltage3.add(Math.log(volValue));
							count--;
							}
							}
						if(filter== 04){ 
							while(count>0){
								int i=in.nextInt();
								time=0;
								time=timeInMin(hours(i),mins(i),sec(i));
								arr4.add(time);
								volValue=in.nextInt();
								vol4.add(volValue);
							//	voltage4.add(Math.log(volValue));
							count--;
							}
							}
						
						if(filter== 05){ 
							while(count>0){
								int i=in.nextInt();
								time=0;
								time=timeInMin(hours(i),mins(i),sec(i));
								arr5.add(time);
								volValue=in.nextInt();
								vol5.add(volValue);
							//	voltage5.add(Math.log(volValue));
							count--;
							}
						}
						
						if(filter== 06){ 
							while(count>0){
						
								int i=in.nextInt();
								time=0;
								time=timeInMin(hours(i),mins(i),sec(i));
								arr6.add(time);
								volValue=in.nextInt();
								vol6.add(volValue);
								//voltage6.add(Math.log(volValue));
							count--;
							}
							}
						
						if(filter== 07){ 
							while(count>0){
						
								int i=in.nextInt();
								time=0;
								time=timeInMin(hours(i),mins(i),sec(i));
								arr7.add(time);
								volValue=in.nextInt();
								vol7.add(volValue);
							//	voltage7.add(Math.log(volValue));
							count--;
							}
							}
						if(filter== 8){
							while(count>0){					
								int i=in.nextInt();
								time=0;
								time=timeInMin(hours(i),mins(i),sec(i));
								arr8.add(time);
								volValue=in.nextInt();
								vol8.add(volValue);
							//	voltage8.add(Math.log(volValue));
							count--;
							}
						}
						if(filter== 9){
							while(count>0){
						 
								int i=in.nextInt();
								time=0;
								time=timeInMin(hours(i),mins(i),sec(i));
								arr9.add(time);
							//int volt=in.nextInt();
								volValue=in.nextInt();
								vol9.add(volValue);
							//	voltage9.add(Math.log(volValue));
						
							count--;
							}
						}
						
						if(filter== 10){ 
							while(count>0){
							
								int i=in.nextInt();
								time=0;
								time=timeInMin(hours(i),mins(i),sec(i));
								arr10.add(time);
								volValue=in.nextInt();
								vol10.add(volValue);
							//	voltage10.add(Math.log(volValue));
							count--;
							}
						}
						
						
			     }
			
		
	/*
			//	System.out.println("filter1");
				System.out.println("time   voltage");
				
			for(int i=0;i<arr1.size();i++){
			
				
				//System.out.println(hours(arr1.get(i))+":"+mins(arr1.get(i))+":"+sec(arr1.get(i))+"    "+" voltage= "+voltage1.get(i));
				
				//	System.out.println(" "+arr1.get(i));
				System.out.println(arr1.get(i)+"    "+vol1.get(i));
				
			}*/
			
				
	}

	public static  boolean isInteger( String input ) {
        Pattern p=Pattern.compile("-?\\d+");
        return input.matches(p.pattern());
        }
    
	
//get hours
int hours(int data){
	//int temp=data;
	data=data/10;
	data=data/10;
	data=data/10;
	data=data/10;
	return data;
}
	
//get mins 112233
int mins(int data){
	int temp1;
	data=data/10;
	data=data/10;
	
	temp1=data%10;
	data=data/10;
	temp1=((data%10)*10)+temp1;
	return temp1;
}
int sec(int data){
	int temp1;
	temp1=data%10;
	data=data/10;
	temp1=((data%10)*10)+temp1;
	
	return temp1;
}

double timeInMin(double h,double m,double s){
	double sum=0;
	
	sum=(h*60)+m+(s/60);
	return sum;
	
}

}
	
	

