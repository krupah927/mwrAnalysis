package airmasCalculations;

import java.util.ArrayList;

import filestuff.AmData;
import filestuff.FileSplitter;

public class CalcAirmass {
ArrayList<Double> airmas=new ArrayList<Double>();

AmData a;
FileSplitter fs;
double eqntim;
double decl;
double alt;
double lc;
double chi;
public CalcAirmass(AmData a,FileSplitter f){
	this.a=a;
	fs=f;
}

	
	public ArrayList<Double> getAirmass(ArrayList<Double> al){
		/////////////////////////////////////////////////////////////////////
		
		lc = (82.5-77.0)*4.0;
		 eqntim=fs.lo;
		 decl=fs.la;
		 
		
		for(int i=0;i<al.size();i++){
			double ist=al.get(i);
			double lmt = ist - lc;
			 alt = lmt + eqntim;
		
			 double hrang = (alt/4.0) - 180.0;
		        double s = sind(decl) * sind(8.55);
		        double c = cosd(decl) * cosd(8.55);
		        double ch = c*cosd(hrang);
		        chi= Math.acos(s+ch)*(180.0/Math.PI);
		        
		//end of Zenith calculation
/////////////////////// ////////////////////////////////////////////////////////////
		        
		        if(chi <= 45){
		        //    return(1./cosd(chi));
		        	double tem = (1./cosd(chi));
		        	System.out.println("tem"+tem);
		        airmas.add(tem);
		        	//airmas.addAll(tem);
		        }
		        else{
		        	double res=doIntegeration(chi);
		        //System.out.println("aftr do integration "+res);
		        System.out.println("res="+res);
		        airmas.add(res);
		        }
		           
		}
		return airmas;
}
	
	 private double doIntegeration(double chi)
	    {
	        double rho[] = {1.170000,1.069000,9.688000E-01,8.753000E-01,7.902000E-01
	        ,7.121000E-01,6.410000E-01,5.763000E-01,5.180000E-01,4.654000E-01
	        ,4.175000E-01,3.739000E-01,3.339000E-01,2.968000E-01,2.622000E-01
	        ,2.294000E-01,1.975000E-01,1.667000E-01,1.376000E-01,1.136000E-01
	        ,9.444000E-02,7.885000E-02,6.627000E-02,5.582000E-02,4.714000E-02
	        ,3.997000E-02,3.402000E-02,2.899000E-02,2.476000E-02,2.116000E-02
	        ,1.813000E-02,1.556000E-02,1.337000E-02,1.148000E-02,9.876000E-03
	        ,8.503000E-03,7.332000E-03,6.327000E-03,5.472000E-03,4.744000E-03
	        ,4.106000E-03,3.575000E-03,3.122000E-03,2.735000E-03,2.403000E-03
	        ,2.110000E-03,1.855000E-03,1.633000E-03,1.441000E-03,1.274000E-03
	        ,1.129000E-03,1.003000E-03,8.929000E-04,7.953000E-04,7.086000E-04
	        ,6.307000E-04,5.585000E-04,4.948000E-04,4.383000E-04,3.873000E-04
	        ,3.417000E-04,3.018000E-04,2.656000E-04,2.330000E-04,2.037000E-04
	        ,1.777000E-04,1.550000E-04,1.347000E-04,1.160000E-04,1.003000E-04
	        ,8.630000E-05,7.565000E-05,6.568000E-05,5.654000E-05,4.832000E-05
	        ,4.090000E-05,3.474000E-05,2.929000E-05,2.485000E-05,1.953000E-05
	        ,1.787000E-05};

	        double re = 6371000.0;
	        double sh = 0.0;
	        double sum = 0.0;
	        double an0 = 1.00029652;
	        double h[] = new double[81];
	        double am[] = new double[81];

	        for(int i=0; i<80; i++)
	            sh=sh+((rho[i]+rho[i+1])/(2.*rho[1])*1000.0);
	        for(int i=0; i<81; i++)
	        {
	            double r = an0*an0;                  
	            double a = (Math.PI/180.)*chi;
	            h[i] = (i-1)*1000.0;
	            double b = (1/sh)*(rho[i]/rho[0]);
	            double c1 = (re/(re+h[i]));
	            double c11 = c1*c1;
	            double c22 = an0*an0/r;
	            double c3 = c11*c22;
	            double dd = 1.- c3*(Math.sin(a));
	            double d = dd*dd;
	            double e =1.0/(Math.sqrt(d));
	            am[i]= b*e;
	        }
	        for(int i=0; i<80; i++)
	        {
	            double aa =(am[i] +am[i+1])/2.0;
	            double ah = aa*(h[i+1]-h[i]);
	            sum=sum+ah;
	        }
	        
	        System.out.println("sum="+sum);
	        return sum;
	        
	    }
	
	
    private double cosd( double deg)
    {
        double rad = (deg*Math.PI)/180;
        return Math.cos(rad);
    }
    private double sind( double deg)
    {
        double rad = (deg*Math.PI)/180;
        return Math.sin(rad);
    }
	
}
