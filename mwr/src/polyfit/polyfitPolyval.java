package polyfit;

/*
 * final polyfit :)
 */
import org.apache.commons.math3.fitting.PolynomialCurveFitter;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;

import Jama.Matrix;
import Jama.QRDecomposition;
import Jama.CholeskyDecomposition;
/**
 *  The <tt>PolynomialRegression</tt> class performs a polynomial regression
 *  on an set of <em>N</em> data points (<em>y<sub>i</sub></em>, <em>x<sub>i</sub></em>).
 *  That is, it fits a polynomial
 *  <em>y</em> = &beta;<sub>0</sub> +  &beta;<sub>1</sub> <em>x</em> +
 *  &beta;<sub>2</sub> <em>x</em><sup>2</sup> + ... +
 *  &beta;<sub><em>d</em></sub> <em>x</em><sup><em>d</em></sup>
 *  (where <em>y</em> is the response variable, <em>x</em> is the predictor variable,
 *  and the &beta;<sub><em>i</em></sub> are the regression coefficients)
 *  that minimizes the sum of squared residuals of the multiple regression model.
 *  It also computes associated the coefficient of determination <em>R</em><sup>2</sup>.
 *  <p>
 *  This implementation performs a QR-decomposition of the underlying
 *  Vandermonde matrix, so it is not the fastest or most numerically
 *  stable way to perform the polynomial regression.
 *
 *  @author Robert Sedgewick
 *  @author Kevin Wayne
 */
public class polyfitPolyval {
    private final int N;                // number of observations
    private final String variableName;  // name of the predictor variable
    private int degree;                 // degree of the polynomial regression
    private Matrix beta;                // the polynomial regression coefficients
    private double SSE;                 // sum of squares due to error
    private double SST;                 // total sum of squares
  public  static double res[]=new double[3];
  static double[] xArray;
double[] yArray;
   static double polyval[]=new double[3];
  public double[][] v;
   static double[] xnew;
   static double[] yRes;

 static double[] mu=new double[2];
     
    public polyfitPolyval(double[] x, double[] y, int degree) {
    	
        this(x, y, degree, "N");
      
      
    }

  /**
     * Performs a polynomial reggression on the data points <tt>(y[i], x[i])</tt>.
     *
     * @param  x the values of the predictor variable
     * @param  y the corresponding values of the response variable
     * @param  degree the degree of the polynomial to fit
     * @param  variableName the name of the predictor variable
     * @throws IllegalArgumentException if the lengths of the two arrays are not equal
     */
    public polyfitPolyval(double[] x, double[] y, int degree, String variableName) {
    	xArray=x;
    	yArray=y;
        this.degree = degree;
        this.variableName = variableName;

        N = x.length;

      
        boolean done = false;
        while (!done) {

            // build Vandermonde matrix
            double[][] vandermonde = new double[N][this.degree+1];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= this.degree; j++) {
                    vandermonde[i][j] = Math.pow(x[i], j);
                }
            }
            
            Matrix X = new Matrix(vandermonde);

            // create matrix from vector
            Matrix Y = new Matrix(y, N);
         
            
            xnew=new double[x.length];
          xnew= calculateXnew(x);
          double[][] X1= multiplyMatrix(x,(degree+1));
        
          System.out.println("created mtrix");
          Matrix Xnew=new Matrix(X1);
      
          System.out.println("caliin qr");
            QRDecomposition qr = new QRDecomposition(Xnew);
      
            // decrease degree and try again
            if (!qr.isFullRank()) {
                this.degree--;
                continue;
            }
            
            
           System.out.println("after qr"); 
            // linear regression coefficients
           
            beta = qr.solve(Y);
           System.out.println("beta "+beta);
            
            // mean of y[] values
            double sum = 0.0;
            for (int i = 0; i < N; i++)
                sum += y[i];
            double mean = sum / N;

            // total variation to be accounted for
            for (int i = 0; i < N; i++) {
                double dev = y[i] - mean;
                SST += dev*dev;
            }

            // variation not accounted for
            Matrix residuals = X.times(beta).minus(Y);
            SSE = residuals.norm2() * residuals.norm2();
         //   System.out.println(residuals);
            
           // System.out.println(SSE);
            break;
        }
    }
/////////////////////////////////////////////////////////////////////////////////////
    private double[][] multiplyMatrix( double[] x, int degree) {
    	double sum=0;
    	int n=degree;
    	
    	double[][] v=new double[x.length][degree];
    	 for(int i=0;i<x.length;i++){
         	for(int j=0;j<n;j++){
         		if(j==degree-1)
         			v[i][j]=1;
         		else
         			v[i][j]=0;
         	}
         }
    	 
    	
    	 
    	 for(int j=degree-1;j>0;j--){
    		 for(int i=0;i<x.length;i++)
    			 v[i][j-1]=x[i]*v[i][j];
    	 }

    	 System.out.println("printing v after calculation");
    
    	 for (int i=0;i<x.length;i++)
    	 {
    		 for(int j=0;j<degree;j++)
    			 System.out.print(v[i][j]+"  ");
    		 System.out.println("");
    	 }
    	
    	
    	return v;
    	
	
}
 ////////////////////////////////////////////////////////////////////////////////////////
    static	double[]  calculateXnew(double[] x){

    	calculateMU(x);
    	
        for(int i=0;i<x.length;i++){
        	x[i]=(x[i]-mu[0])/mu[1];
        }
        
        System.out.println("printing x after mu");
        for(int i=0;i<x.length;i++)
        	System.out.println(x[i]);
        
        System.out.println("end x");
        return x;
    }
///////////////////////////////////////////////////////////////////////////////////////////	
	
   /**
     * Returns the <tt>j</tt>th regression coefficient.
     *
     * @param  j the index
     * @return the <tt>j</tt>th regression coefficient
     */
    public double beta(int j) {
        // to make -0.0 print as 0.0
        if (Math.abs(beta.get(j, 0)) < 1E-4) return 0.0;
        return beta.get(j, 0);
    }
//////////////////////////////////////////////////////////////////////////////
   /**
     * Returns the degree of the polynomial to fit.
     *
     * @return the degree of the polynomial to fit
     */
    public int degree() {
        return degree;
    }
/////////////////////////////////////////////////////////////////////////////////////
   /**
     * Returns the coefficient of determination <em>R</em><sup>2</sup>.
     *
     * @return the coefficient of determination <em>R</em><sup>2</sup>,
     *         which is a real number between 0 and 1
     */
    public double R2() {
        if (SST == 0.0) return 1.0;   // constant function
        return 1.0 - SSE/SST;
    }
/////////////////////////////////////////////////////////////////////////////////////
   /**
     * Returns the expected response <tt>y</tt> given the value of the predictor
     *    variable <tt>x</tt>.
     *
     * @param  x the value of the predictor variable
     * @return the expected response <tt>y</tt> given the value of the predictor
     *         variable <tt>x</tt>
     */
    public double predict(double x) {
        // horner's method
        double y = 0.0;
        for (int j = degree; j >= 0; j--)
            y = beta(j) + (x * y);
        return y;
    }
/////////////////////////////////////////////////////////////////////////////////////
   /**
     * Returns a string representation of the polynomial regression model.
     *
     * @return a string representation of the polynomial regression model,
     *         including the best-fit polynomial and the coefficient of
     *         determination <em>R</em><sup>2</sup>
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        int j = degree;

        System.out.println("j="+j);
        
        // ignoring leading zero coefficients
        while (j >= 0 && Math.abs(beta(j)) < 1E-5){
        	System.out.println("j="+j); 
        	j--;
        }
           
        
        int i=0;
        // create remaining terms
        while (j >= 0) {
        	double a= beta(j);
        	res[i]=a;
        	i++;
        	System.out.println("beta="+a);
            if      (j == 0) s.append(String.format("%.2f ", beta(j)));
            else if (j == 1) s.append(String.format("%.2f %s + ", beta(j), variableName));
            else             s.append(String.format("%.2f %s^%d + ", beta(j), variableName, j));
            j--;
        }
        s = s.append("  (R^2 = " + String.format("%.3f", R2()) + ")");
        return s.toString();
    }
///////////////////////////////////////////////////////////////////////////////////////
  

private static double[] polyval(double[] p, double[] x) {
//double[] x2= new double[x.length];
double[] y= new double[x.length];

//x2=calculateXnew(x);
int length=p.length-1;
for(int i=0;i<x.length;i++)
	y[i]=1;

for(int i=0;i<x.length;i++)
	y[i]=y[i]*p[0];
System.out.println("print  y.........");
for(int i=0;i<x.length;i++)
	System.out.println(y[i]);

for(int i=1;i<p.length;i++){
	for(int j=0;j<x.length;j++)
		y[j]=(y[j]*x[j])+p[i];
}
/*
System.out.println("print final y.........");
for(int i=0;i<x.length;i++)
	System.out.println(y[i]);*/

return y;
}
 ////////////////////////////////////////////////////////////
static void calculateMU (double[] array){
	 double mean=StatUtils.mean(array);
     StandardDeviation sd= new StandardDeviation();
     double std=sd.evaluate(array);
     
     mu[0]=mean;
     mu[1]=std;

     
}
    
//////////////////////////////////////////////////////////////////////////////////////////
   /**
     * Unit tests the <tt>PolynomialRegression</tt> data type.
 * @return 
     */
 final static   public double[] getPolyfit() {
      
    	
       
       
      //  PolynomialRegression regression = new PolynomialRegression(x, y, 2);
    //  double[] p= regression.toString();
    //    System.out.println(regression);
       
        int size=res.length;
        double[] p=new double[size];
        int m=0;
        //to reverse the array res
        for(int i=size-1;i>=0;i--){
        	p[m]=res[i];
        	m++;
        }
        
     
   for(int i=0;i<res.length;i++)
	   System.out.println("p= "+res[i]);
   
   for(int i=0;i<res.length;i++)
	   System.out.println("p("+i+") "+p[i]);

   yRes=new double[xnew.length];
   yRes= polyval(p,xnew);
    return yRes;
   
    }

}

