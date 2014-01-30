package main;
// Ames, class to do stuff when the game ends like print statistics

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import Buildings.Building;
import Buildings.TextureHandler;

public class Shutdown extends Thread {
    private List<Building> buildingList;
    
    public Shutdown(List<Building> buildingList) {
        this.buildingList = buildingList;
    }
    
    public void run() {
    	
        // Show the average draw time of every Building, not counting the first one.
        System.out.println("Average draw times, in milliseconds:");
        DecimalFormat formatter = new DecimalFormat("#,##0.00");
        double totalUs = 0; // milliseconds
        for (Building building: buildingList) { // calc total time
            totalUs += building.getAverageNonMovingDrawTimeMillis()
                      +building.getAverageMovingDrawTimeMillis();
        }
        Building[] buildings = buildingList.toArray(new Building[0]); // in order to sort
        Arrays.sort(buildings); // Sort by draw time
        for (Building building: buildings) {
            double nonMovingTime = building.getAverageNonMovingDrawTimeMillis();
            double movingTime    = building.getAverageMovingDrawTimeMillis();
            System.out.println(building.getClass().getName() + ": "
                    + "Non Moving: "+ formatter.format(nonMovingTime) + "ms (" + formatter.format(nonMovingTime/totalUs*100)+"%)"
                    + "    Moving: "+ formatter.format(movingTime   ) + "ms (" + formatter.format(movingTime   /totalUs*100)+"%)");
        }
        TextureHandler.writeTextureHash();  
    }
}
