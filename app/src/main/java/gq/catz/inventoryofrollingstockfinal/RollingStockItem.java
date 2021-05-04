package gq.catz.inventoryofrollingstockfinal;

import java.util.UUID;

/**
 *  [description]
 */
public class RollingStockItem {


	private UUID id;
	private String reportingMarks, fleetID, stockType, owningCompany, isEngine, isLoaded, isRented, isChecked;

	/**
	 * @param id
	 * @param reportingMarks
	 * @param fleetID
	 * @param stockType
	 * @param owningCompany
	 * @param isEngine
	 * @param isLoaded
	 * @param isRented
	 * @param isChecked
	 */
	public RollingStockItem(UUID id, String reportingMarks, String fleetID, String stockType, String owningCompany, String isEngine, String isLoaded, String isRented, String isChecked) {
		this.id = UUID.randomUUID();
		this.reportingMarks = reportingMarks;
		this.fleetID = fleetID;
		this.stockType = stockType;
		this.owningCompany = owningCompany;
		this.isEngine = isEngine;
		this.isLoaded = isLoaded;
		this.isRented = isRented;
		this.isChecked = isChecked;
	}

	/**
	 * @return
	 */
	public String getReportingMark() {
		return reportingMarks;
	}

	/**
	 * @param reportingMarks
	 */
	public void setReportingMark(String reportingMarks) {
		this.reportingMarks = reportingMarks;
	}

	/**
	 * @return
	 */
	public String getFleetID() {
		return fleetID;
	}

	/**
	 * @param fleetID
	 */
	public void setFleetID(String fleetID) {
		this.fleetID = fleetID;
	}

	/**
	 * @return
	 */
	public String getStockType() {
		return stockType;
	}

	/**
	 * @param stockType
	 */
	public void setStockType(String stockType) {
		this.stockType = stockType;
	}

	/**
	 * @return
	 */
	public String getOwningCompany() {
		return owningCompany;
	}

	/**
	 * @param owningCompany
	 */
	public void setOwningCompany(String owningCompany) {
		this.owningCompany = owningCompany;
	}

	/**
	 * @return
	 */
	public String isEngine() {
		return isEngine;
	}

	/**
	 * @param isEngine
	 */
	public void setIsEngine(String isEngine) {
		this.isEngine = isEngine;
	}

	/**
	 * @return
	 */
	public String isLoaded() {
		return isLoaded;
	}

	/**
	 * @param isLoaded
	 */
	public void setIsLoaded(String isLoaded) {
		this.isLoaded = isLoaded;
	}

	/**
	 * @return
	 */
	public String isRented() {
		return isRented;
	}

	/**
	 * @param isRented
	 */
	public void setIsRented(String isRented) {
		this.isRented = isRented;
	}

	/**
	 * @return
	 */
	public String isChecked() {
		return isChecked;
	}

	/**
	 * @param isChecked
	 */
	public void setIsChecked(String isChecked) {
		this.isChecked = isChecked;
	}

	/**
	 * @return
	 */
	public UUID getId() {
		return id;
	}

}
