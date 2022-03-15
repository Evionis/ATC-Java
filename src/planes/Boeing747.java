/*
 * Noah Anderson
 * noah.anderson@mymail.champlain.edu
 * ATC Project
 */
package planes;

import java.util.ArrayList;

public class Boeing747 extends Plane {
	
	public Boeing747(String callsign, ArrayList<Plane> landingQueue, ArrayList<Plane> takeoffQueue) {
		super(callsign, landingQueue, landingQueue);
		fuelReq = 225000;
		mealReq = 200;
	}
	
	//Prints a message requesting an amount of fuel and in-flight meals
	public void requestService() {
		System.out.println("Boeing 747 " + callsign + " requires " + fuelReq + "L of fuel and " + mealReq + " in-flight meals.");
	}
}
