/*
 * Noah Anderson
 * noah.anderson@mymail.champlain.edu
 * ATC Project
 */
package airport;

import java.util.ArrayList;
import planes.Plane;

public class ATC {
	private ArrayList<Plane> landingQueue;
	private ArrayList<Plane> takeoffQueue;
	private GroundCrewController groundCrewController;
	public String weatherReport = "Clear conditions";
	
	public ATC(ArrayList<Plane> landingQueue, ArrayList<Plane> takeoffQueue, GroundCrewController groundCrewController) {
		this.landingQueue = landingQueue;
		this.takeoffQueue = takeoffQueue;
		this.groundCrewController = groundCrewController;
	}
	
	//Orders groundCrewController to send a crew to a given plane to do a given service (requirement)
	public void performService(Plane plane, String requirement) {
		System.out.println("ATC sent ground crew to " + takeoffQueue.get(takeoffQueue.indexOf(plane)).callsign + " with " + requirement + ".");
		groundCrewController.performService(plane, requirement);
	}
	
	//Updates all registered planes with the current weather report
	public void updateWeather(String weather) {
		this.weatherReport = weather;
		notifyPlanes();
	}
	
	//Gives permission for the first plane on landingQueue to land, lands the plane, 
	//adds the plane to takeoffQueue, removes the plane from landingQueue, and updates the queues of all registered planes
	public void landNext() {
		System.out.println(landingQueue.get(0).callsign + " is now cleared for landing.");
		landingQueue.get(0).land();
		takeoffQueue.add(landingQueue.get(0));
		landingQueue.remove(0);
		notifyPlanes();
	}
	
	//Gives permission for the first plane on takeoffQueue to take off, makes the plane take off,
	//removes the plane from takeoffQueue, and updates the queues of all registered planes
	public void takeoffNext() {
		System.out.println(takeoffQueue.get(0).callsign + " is now cleared for takeoff.");
		takeoffQueue.get(0).takeoff();
		takeoffQueue.remove(0);
		notifyPlanes();
	}
	
	//Updates the landingQueue, takeoffQueue, and weatherReport of all registered planes
	private void notifyPlanes() {
		for (Plane plane : landingQueue) {
			plane.update(landingQueue, takeoffQueue, weatherReport);
		}
		for (Plane plane : takeoffQueue) {
			plane.update(landingQueue, takeoffQueue, weatherReport);
		}
	}
	
	//Adds a given plane to landingQueue
	public void registerLandingPlane(Plane plane) {
		landingQueue.add(plane);
	}

	//Removes a given plane from landingQueue
	public void removeLandingPlane(Plane plane) {
		landingQueue.remove(plane);
	}
	
	//Adds a given plane to takeoffQueue
	public void registerTakingOffPlane(Plane plane) {
		takeoffQueue.add(plane);
	}

	//Removes a given plane from takeoffQueue
	public void removeTakingOffPlane(Plane plane) {
		takeoffQueue.remove(plane);
	}
}
