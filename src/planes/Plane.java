/*
 * Noah Anderson
 * noah.anderson@mymail.champlain.edu
 * ATC Project
 */
package planes;

import java.util.ArrayList;

public abstract class Plane {
	public String callsign;
	public ArrayList<Plane> landingQueue;
	public ArrayList<Plane> takeoffQueue;
	public String weatherReport;
	public int fuelReq;
	public int mealReq;
	
	public Plane(String callsign, ArrayList<Plane> landingQueue, ArrayList<Plane> takeoffQueue) {
		this.callsign = callsign;
		this.landingQueue = landingQueue;
		this.takeoffQueue = takeoffQueue;
	}
	
	//Updates landingQueue, takeoffQueue, and weatherReport with new information
	public void update(ArrayList<Plane> landingQueue, ArrayList<Plane> takeoffQueue, String weatherReport) {
		this.landingQueue = landingQueue;
		this.takeoffQueue = takeoffQueue;
		this.weatherReport = weatherReport;
	}
	
	//Prints a message that the plane is landing
	public void land() {
		System.out.println(callsign + " is now landing.");
	}
	
	//Prints a message that the plane is taking off
	public void takeoff() {
		System.out.println(callsign + " is now taking off.");
	}
	
	public abstract void requestService();
}
