/*
 * Noah Anderson
 * noah.anderson@mymail.champlain.edu
 * ATC Project
 */
package airport;

public class GroundCrew {
	String name;
	private Service service;
	
	public GroundCrew(String name) {
		this.name = name;
	}
	
	//Sets service to a given Service
	public void setService(Service service) {
		this.service = service;
	}
	
	//Prints a message about performing service on a plane with the given callsign
	public void performService(String callsign, int requirement) {
		System.out.println(name + service.performService(callsign, requirement));
	}
}
