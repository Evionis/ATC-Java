/*
 * Noah Anderson
 * noah.anderson@mymail.champlain.edu
 * ATC Project
 */
package airport;

import planes.Plane;

public class GroundCrewController {
	private GroundCrew refueler;
	private GroundCrew resupplier;
	
	public void setRefueler(GroundCrew refueler) {
		this.refueler = refueler;
	}
	public void setResupplier(GroundCrew resupplier) {
		this.resupplier = resupplier;
	}
	
	//Sends a ground crew to a given plane based on requirement
	public void performService(Plane plane, String requirement) {
		if (requirement == "fuel")
			refueler.performService(plane.callsign, plane.fuelReq);
		else if (requirement == "meals")
			resupplier.performService(plane.callsign, plane.mealReq);
	}
}
