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
 * The purpose of this class is to be able to read a file ( in our project it is a grades file containing a number of grades from 0-10 )
 * via command line and by using the methods ... we calculate the frequency of each grade and generate a histogram with all the frequencies
 * of the numbers ranging from 0-10 with the help of a JFreeChart XYLine chart.     
 */
public class HistogramGenerator {
			
	/***
	 * Receives a single dimension Integer array containing the frequencies of grades ranging from 0-10. 
	 * This particular array will be used for generating the visualization using a JFreeChart XYLine chart . Finally, The chart
	 * This method has been copied under the influence of prof. Antonis Gkortzis.. Visit
	 * https://github.com/AntonisGkortzis/BuildAutomationToolsDemoProject for the orgininal and full explanation.
	 * @param dataValues Single dimension integer array
	 */

		public static void generateChart(int[] dataValues) {
			/*
			 * The XYSeriesCollection object is a set XYSeries series (dataset) that
			 * can be visualized in the same chart
			 */
			XYSeriesCollection dataset = new XYSeriesCollection();
			/*
			 * The XYSeries that are loaded in the dataset. There might be many
			 * series in one dataset.
			 */
			XYSeries data = new XYSeries("random values:;");
			/*
			 * Populating the XYSeries data object from the input Integer array
			 * values.
			 */
			for (int i=0;i<dataValues.length; i++ ) {		
				data.add(i,dataValues[i]);
			}
			// add the series to the dataset
			dataset.addSeries(data); 
			boolean legend = false;  // do not visualize a legend
			boolean tooltips = false; // do not visualize tooltips
			boolean urls = false; // do not visualize urls
		
			// Declare and initialize a createXYLineChart JFreeChart
			JFreeChart chart = ChartFactory.createXYLineChart("HonduP Frequency", "frequency", "grades", dataset, PlotOrientation.VERTICAL, legend, tooltips, urls);
			
			/*
			 * Initialize a frame for visualizing the chart and attach the
			 * previously created chart.
			 */
			ChartFrame frame = new ChartFrame("First", chart);
			frame.pack();
			// makes the previously created frame visible
			frame.setVisible(true);	
		}
				
		/***
		 * Method that reads a txt file containing numbers from 0 to 10
		 * via command line and computes the frequency of each number. It then 
		 * stores the frequency in a single dimension Integer array.
		 * @param a path. 
		 */
		public static int[] readGrade(String path) {
			/*
			 * Create a one dimensional int array and intitialize it with value 0. 
			 */
			int[] frequency = new int[11]; 
			for (int i=0;i<frequency.length;i++) {
				frequency[i] = 0;
			}
			
			/*
			* We need to provide file path as the parameter:  
			*/
			File myObj = new File(path);
			try {
				//illustrating BufferedReader() method
			   	BufferedReader br = null;  
				br = new BufferedReader(new FileReader(myObj)); //opening the path for the file.
			   	String st; //
			   	while ((st = br.readLine()) != null) { //every line is an st and checks if it is not null
			    	frequency[Integer.parseInt(st)] += 1; //adding the frequencies of each number to the array frequency
			    	System.out.println(st); 
			   	} 
			    br.close();
			    
			}catch (IOException e){ //if the path is incorrect or if the file is not in its correct morph, it prints an error.
				e.printStackTrace();			
			}
			return frequency;//returns the array of frequencies		   	
		 }	
		
		/***
		 * Main method that reads a txt file containing numbers from 0 to 10
		 * and calls the methods specified above to complete the requirements of this essay.
		 * @param a path. 
		 */
		public static void main(String[] args) {
			
			/*
			* gets the path of user via command line.  
			*/
		 	String path = null; 
		 	if (args[0] != null) {
				path = args[0];
		 	}else {
		 		System.out.println("Sorry, theres was an error");
		 		System.exit(0);
		 	}
		 	
		 	/*
			* calls readGrade method with the path specified by the user and 
			* stores all values generated in an array int[]
			*/
		 	int[] data = readGrade(path);
		 	/*
			* the aforamentioned int[] data array is then added as an input to the generateChart method
			* 
			*/
			generateChart(data);
		}
			


}
