/*
 * Noah Anderson
 * noah.anderson@mymail.champlain.edu
 * ATC Project
 */
package planes;

import java.util.ArrayList;

public class AirbusA380 extends Plane {
	
	public AirbusA380(String callsign, ArrayList<Plane> landingQueue, ArrayList<Plane> takeoffQueue) {
		super(callsign, landingQueue, landingQueue);
		fuelReq = 310000;
		mealReq = 400;
	}
	
	//Prints a message requesting an amount of fuel and in-flight meals
	public void requestService() {
		System.out.println("Airbus A380 " + callsign + " requires " + fuelReq + "L of fuel and " + mealReq + " in-flight meals.");
	}
}
