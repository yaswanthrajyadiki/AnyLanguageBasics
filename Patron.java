class Patron {
	private String userName;
	private String mobileNumber;
	Patron(String userName,
		String mobileNumber) {
		this.userName = userName;
		this.mobileNumber = mobileNumber;
	}

	public String toString() {
		String s = userName + "\n";
		s = s + mobileNumber;
		return s;
	}
	public String getUserName() {
		return this.userName;
	}
	public String getUserMobileNumber() {
		return this.mobileNumber;
	}
}