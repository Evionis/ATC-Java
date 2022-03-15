/*
 * Noah Anderson
 * noah.anderson@mymail.champlain.edu
 * ATC Project
 */
package planes;

import java.util.ArrayList;

public class Boeing777 extends Plane {
	
	public Boeing777(String callsign, ArrayList<Plane> landingQueue, ArrayList<Plane> takeoffQueue) {
		super(callsign, landingQueue, landingQueue);
		fuelReq = 175000;
		mealReq = 160;
	}
	
	//Prints a message requesting an amount of fuel and in-flight meals
	public void requestService() {
		System.out.println("Boeing 777 " + callsign + " requires " + fuelReq + "L of fuel and " + mealReq + " in-flight meals.");
	}
}
