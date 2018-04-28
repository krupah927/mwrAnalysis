package filestuff;

import java.util.ArrayList;

public class AmData {
FileSplitter fs;
public ArrayList<Double> arr1am = new ArrayList<Double>();
public ArrayList<Double> arr2am = new ArrayList<Double>();
public ArrayList<Double> arr3am = new ArrayList<Double>();
public ArrayList<Double> arr4am = new ArrayList<Double>();
public ArrayList<Double> arr5am = new ArrayList<Double>();
public ArrayList<Double> arr6am = new ArrayList<Double>();
public ArrayList<Double> arr7am = new ArrayList<Double>();
public ArrayList<Double> arr8am = new ArrayList<Double>();
public ArrayList<Double> arr9am = new ArrayList<Double>();
public ArrayList<Double> arr10am = new ArrayList<Double>();
	public AmData(FileSplitter f) {
		fs = f;
	}
	
	public void getData(){
		System.out.println("inside getdATa");
		
		System.out.println("displY 1st ele of fs "+fs.arr1.get(0));
		
		for(int i=0;i<fs.arr1.size()-1;i++){
			System.out.println("inside for");
			if(fs.arr1.get(i)<(12*60)){
			arr1am.add(fs.arr1.get(i));
			System.out.println("after if");
			}
			else
				break;
			
		}
		
		for(int i=0;i<fs.arr2.size()-1;i++){
			
			if(fs.arr2.get(i)<(12*60)){
			arr2am.add(fs.arr2.get(i));
		
			}
			else
				break;
			
		}
		for(int i=0;i<fs.arr3.size()-1;i++){
			
			if(fs.arr3.get(i)<(12*60)){
			arr3am.add(fs.arr3.get(i));
		
			}
			else
				break;
			
		}
		
for(int i=0;i<fs.arr4.size()-1;i++){
			
			if(fs.arr4.get(i)<(12*60)){
			arr4am.add(fs.arr4.get(i));
		
			}
			else
				break;
			
		}
for(int i=0;i<fs.arr5.size()-1;i++){
	
	if(fs.arr5.get(i)<(12*60)){
	arr5am.add(fs.arr5.get(i));

	}
	else
		break;
	
}
for(int i=0;i<fs.arr6.size()-1;i++){
	
	if(fs.arr6.get(i)<(12*60)){
	arr6am.add(fs.arr6.get(i));

	}
	else
		break;
	
}
		
		for(int i=0;i<fs.arr7.size()-1;i++){

			if(fs.arr7.get(i)<(12*60))
				arr7am.add(fs.arr7.get(i));
				else
					break;
		}
		for(int i=0;i<fs.arr8.size()-1;i++){

			if(fs.arr8.get(i)<(12*60))
				arr8am.add(fs.arr8.get(i));
				else
					break;
		}
		for(int i=0;i<fs.arr9.size()-1;i++){

			if(fs.arr9.get(i)<(12*60))
				arr9am.add(fs.arr9.get(i));
				else
					break;
		}
		for(int i=0;i<fs.arr10.size()-1;i++){

			if(fs.arr10.get(i)<(12*60))
				arr10am.add(fs.arr10.get(i));
				else
					break;
		}
		
	}
	
}
