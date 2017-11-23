package main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Driver {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int driverId;
	private String driverSurname;
	private String driverName;
	public Driver() {
		super();
	}
	public Driver(int driverId, String driverSurname, String driverName, String driverStatus) {
		super();
		this.driverId = driverId;
		this.driverSurname = driverSurname;
		this.driverName = driverName;
		this.driverStatus = driverStatus;
	}
	private String driverStatus;
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getDriverSurname() {
		return driverSurname;
	}
	public void setDriverSurname(String driverSurname) {
		this.driverSurname = driverSurname;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverStatus() {
		return driverStatus;
	}
	public void setDriverStatus(String driverStatus) {
		this.driverStatus = driverStatus;
	}
}
