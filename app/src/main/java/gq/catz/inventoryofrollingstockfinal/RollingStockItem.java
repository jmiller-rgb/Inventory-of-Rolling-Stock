package gq.catz.inventoryofrollingstockfinal;

import java.util.UUID;

public class RollingStockItem {

	private UUID id;
	private String reportingMarks, fleetID, stockType, owningCompany, isEngine, isLoaded, isRented, isChecked;

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

	public String getReportingMarks() {
		return reportingMarks;
	}

	public void setReportingMarks(String reportingMarks) {
		this.reportingMarks = reportingMarks;
	}

	public String getFleetID() {
		return fleetID;
	}

	public void setFleetID(String fleetID) {
		this.fleetID = fleetID;
	}

	public String getStockType() {
		return stockType;
	}

	public void setStockType(String stockType) {
		this.stockType = stockType;
	}

	public String getOwningCompany() {
		return owningCompany;
	}

	public void setOwningCompany(String owningCompany) {
		this.owningCompany = owningCompany;
	}

	public String getIsEngine() {
		return isEngine;
	}

	public void setIsEngine(String isEngine) {
		this.isEngine = isEngine;
	}

	public String getIsLoaded() {
		return isLoaded;
	}

	public void setIsLoaded(String isLoaded) {
		this.isLoaded = isLoaded;
	}

	public String getIsRented() {
		return isRented;
	}

	public void setIsRented(String isRented) {
		this.isRented = isRented;
	}

	public String getIsChecked() {
		return isChecked;
	}

	public void setIsChecked(String isChecked) {
		this.isChecked = isChecked;
	}

	public UUID getId() {
		return id;
	}

}
