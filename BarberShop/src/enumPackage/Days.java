package enumPackage;

public enum Days {
	MONDAY("Work"),
	TUESDAY("Work"),
	WEDNESDAY("Work"),
	THURSDAY("Work"),
	FRIDAY("Work"),
	SATURDAY("Work"),
	SUNDAY("Day off");
	
	private String status;
	
	Days (String status){
		this.setStatus(status);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
