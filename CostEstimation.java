import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import org.apache.logging.log4j.Logger;

import com.epam.loggingdemo.App;
public class CostEstimation{
	int material_standard;
	int cost_per_sqre_feet;
	int total_area;
	private static logger LOGGER = LogManager.getLogger(CostEstimation.class);
	public void readInput(){
		Scanner read = new Scanner(System.in);
		Logger.info("Press 1 for standard materials \n Press 2 for above standard materials \n Press 3 for high standard materials");
		material_standard = read.nextInt();
		Logger.info("Enter total area of your house");
		total_area = read.nextInt();
		switch(material_standard){
		case 1:
			cost_per_sqre_feet = 1200;
			break;
		case 2:
			cost_per_sqre_feet = 1500;
			break;
		case 3:
			Logger.info("press y if you require automated home else press n:");
			char automated = read,].next.charAt(0);
			if(automated == 'n'){
				cost_per_sqre_feet = 1800;
			}
			else{
				cost_per_sqre_feet = 2500;
			}
			break;
		default : Logger.info("Press a valid option");
		}
	}
		public int totalCost(){
			return cost_per_sqre_feet*total_area;
		}
}