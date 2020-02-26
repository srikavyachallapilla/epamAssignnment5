package HouseConstruction;
import java.io.FileDescriptor;
public class Construction{
	private static Logger LOGGER = LogManager.getLogger(Construction.class);
	public static void main(String args[]){
		CostEstimation cost = new CostEstimation();
		cost.readInput();
		Logger.info("\nTtotal cost of construction = "+cost.totalCost()+"INR");
	}
}