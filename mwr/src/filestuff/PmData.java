package filestuff;

import java.util.ArrayList;

public class PmData {
	FileSplitter fs;
	public ArrayList<Double> arr1pm = new ArrayList<Double>();
	public ArrayList<Double> arr2pm = new ArrayList<Double>();
	public ArrayList<Double> arr3pm = new ArrayList<Double>();
	public ArrayList<Double> arr4pm = new ArrayList<Double>();
	public ArrayList<Double> arr5pm = new ArrayList<Double>();
	public ArrayList<Double> arr6pm = new ArrayList<Double>();
	public ArrayList<Double> arr7pm = new ArrayList<Double>();
	public ArrayList<Double> arr8pm = new ArrayList<Double>();
	public ArrayList<Double> arr9pm = new ArrayList<Double>();
	public ArrayList<Double> arr10pm = new ArrayList<Double>();
		public PmData(FileSplitter f) {
			fs = f;
		}
		
		public void getData(){
			for(int i=0;i<fs.arr1.size()-1;i++){

				if(fs.arr1.get(i)>=(12*60))
				arr1pm.add(fs.arr1.get(i));
				else
					break;
				
			}
			
			for(int i=0;i<fs.arr2.size()-1;i++){

				if(fs.arr2.get(i)>=(12*60))
					arr2pm.add(fs.arr2.get(i));
					else
						break;
			}
			for(int i=0;i<fs.arr3.size()-1;i++){

				if(fs.arr3.get(i)>=(12*60))
					arr3pm.add(fs.arr3.get(i));
					else
						break;
			}
			for(int i=0;i<fs.arr4.size()-1;i++){
				if(fs.arr4.get(i)>=(12*60))
					arr4pm.add(fs.arr4.get(i));
					else
						break;
			}
			for(int i=0;i<fs.arr5.size()-1;i++){

				if(fs.arr5.get(i)>=(12*60))
					arr5pm.add(fs.arr5.get(i));
					else
						break;
			}
			
			for(int i=0;i<fs.arr6.size()-1;i++){

				if(fs.arr6.get(i)>=(12*60))
					arr6pm.add(fs.arr6.get(i));
					else
						break;
			}
			
			for(int i=0;i<fs.arr7.size()-1;i++){

				if(fs.arr7.get(i)>=(12*60))
					arr7pm.add(fs.arr7.get(i));
					else
						break;
			}
			for(int i=0;i<fs.arr8.size()-1;i++){

				if(fs.arr8.get(i)>=(12*60))
					arr8pm.add(fs.arr8.get(i));
					else
						break;
			}
			for(int i=0;i<fs.arr9.size()-1;i++){

				if(fs.arr9.get(i)>=(12*60))
					arr9pm.add(fs.arr9.get(i));
					else
						break;
			}
			for(int i=0;i<fs.arr10.size()-1;i++){

				if(fs.arr10.get(i)>=(12*60))
					arr10pm.add(fs.arr10.get(i));
					else
						break;
			}
			
		}
		
	}


