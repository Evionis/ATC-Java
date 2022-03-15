/*
 * Noah Anderson
 * noah.anderson@mymail.champlain.edu
 * ATC Project
 */
package test;

import java.util.ArrayList;

import airport.*;
import planes.*;

public class TestDrive {
	public static void main(String[] args) {
		GroundCrewController groundCrewController = new GroundCrewController();
		Refuel refuel = new Refuel();
		GroundCrew refuelers = new GroundCrew("Refuel Crew");
		refuelers.setService(refuel);
		Resupply resupply = new Resupply();
		GroundCrew resuppliers = new GroundCrew("Resupply Crew");
		resuppliers.setService(resupply);
		groundCrewController.setRefueler(refuelers);
		groundCrewController.setResupplier(resuppliers);
		
		ArrayList<Plane> landingQueue = new ArrayList<Plane>();
		ArrayList<Plane> takeoffQueue = new ArrayList<Plane>();
		ATC atc = new ATC(landingQueue, takeoffQueue, groundCrewController);
		
		Boeing747 plane1 = new Boeing747("Alpha", landingQueue, takeoffQueue);
		Boeing777 plane2 = new Boeing777("Omega", landingQueue, takeoffQueue);
		AirbusA380 plane3 = new AirbusA380("Delta", landingQueue, takeoffQueue);
		atc.registerLandingPlane(plane1);
		atc.registerLandingPlane(plane2);
		atc.registerTakingOffPlane(plane3);
		
		plane3.requestService();
		System.out.println("");
		atc.performService(plane3, "meals");
		atc.performService(plane3, "fuel");
		System.out.println("");
		atc.landNext();
		System.out.println("");
		atc.takeoffNext();
		System.out.println("");
		atc.landNext();
		System.out.println("");
		plane1.requestService();
		System.out.println("");
		atc.performService(plane1, "meals");
		atc.performService(plane1, "fuel");
		System.out.println("");
		plane2.requestService();
		System.out.println("");
		atc.performService(plane2, "meals");
		atc.performService(plane2, "fuel");
		System.out.println("");
		System.out.println("ATC Weather Report: " + atc.weatherReport);
		System.out.println("Plane 1 Weather Report: " + plane1.weatherReport);
		System.out.println("");
		atc.updateWeather("Light cloud cover");
		System.out.println("ATC Weather Report: " + atc.weatherReport);
		System.out.println("Plane 1 Weather Report: " + plane1.weatherReport);
		System.out.println("Plane 3 Weather Report: " + plane3.weatherReport);
		System.out.println("");
		atc.takeoffNext();
		System.out.println("");
		atc.takeoffNext();
		System.out.println("");
	}
}
