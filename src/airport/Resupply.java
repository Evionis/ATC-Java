/*
 * Noah Anderson
 * noah.anderson@mymail.champlain.edu
 * ATC Project
 */
package airport;

public class Resupply implements Service {
	@Override
	//Prints a message certifying that service has been performed on a plane with the given callsign
	public String performService(String callsign, int requirement) {
		return " resupplies " + callsign + " with " + requirement + " meals.";
	}
}
