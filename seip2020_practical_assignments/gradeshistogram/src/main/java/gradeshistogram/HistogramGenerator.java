package gradeshistogram;
import java.io.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


/*** This code has been created under the guide of professor Antonis Gkortzis.
 * 
 * @author agkortzis The purpose of this class is to demonstrate a simple
 *         scenario of a JFreeChart XYLine chart.
 * @since May 2019 
 */

public class HistogramGenerator {
	
	
	/***
	 * Receives a single dimension Integer array. From this array the dataset
	 * that will be used for the visualization is generated. Finally, The chart
	 * is generated with the use of the aforementioned dataset and then
	 * presented in the screen.
	 * @param dataValues Single dimension integer array
	 */
			   
		public static void generateChart(int[] dataValues) {
			   
		  XYSeriesCollection dataset = new XYSeriesCollection();
		  
		  XYSeries data = new XYSeries("random values:;");
		   
		  for (int i=0;i<dataValues.length; i++ ) {
				   
			  data.add(i,dataValues[i]);
				   
		   }
		   
		   dataset.addSeries(data); // do not visualize a legend
		   
		   boolean legend = false; // do not visualize tooltips 
		  
		   boolean tooltips = false; // do not visualize urls
		   
		   boolean urls = false;
		   
		   JFreeChart chart = ChartFactory.createXYLineChart("HonduP Frequency", "freq", "grades", dataset, PlotOrientation.VERTICAL, legend, tooltips, urls);
		   
		   ChartFrame frame = new ChartFrame("First", chart);
		   
		   frame.pack();
		   
		   frame.setVisible(true);
			   
		}
		
		
		/***
		 * Reads a txt file containing numbers from 0 to 10
		 * and computes the frequency of each number. It then 
		 * stores the frequency in a single dimension Integer array. 
		 */
		
		
		public static int[] readGrade(String path) {
		 
			int[] frequency = new int[11]; 
			
			for (int i=0;i<frequency.length;i++) {
				
				frequency[i] = 0;
				
			}	
			
			File myObj = new File(path);
		    
			try {
		       
		    		
		    		BufferedReader br = null;
		    				
		    			br = new BufferedReader(new FileReader(myObj)); 
		    	  
		    		String st; 
		    		
		    		while ((st = br.readLine()) != null) {
		    	   
		    			frequency[Integer.parseInt(st)] += 1;		
		    			
		    			System.out.println(st); 
		    	 
		    		} 
		    		br.close();
				}catch (IOException e){
					
					e.printStackTrace();
					
		   
				}
				
				for (int i=0;i<frequency.length;i++) {
		    	
					System.out.println(i+ " has "+ frequency[i]);
				}
		    	
		    	
		    	return frequency;
		     
		}
		
		/***
		 * User inputs txt file via command line and data
		 * that will be used for the visualization of frequency of grades is generated. 
		 * Finally, The chart  is generated and then presented in the screen. 
		 */
			
			 
		
		 public static void main(String[] args) {
			  
			 	String path = null;
				
			 	if (args[0] != null) {
			 
					path = args[0];
				
			 	}else
				
			 		System.out.println("Sorry, theres was an error");
					
					int[] data = readGrade(path);
					
					generateChart(data);
				
			    
				}
				
		   
}


	  
	    



