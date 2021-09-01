
public class Address {
	String streetAddress;
	String city;
	String state;
	Integer zip;
	
	public Address(String streetAddress, String city, String state, Integer zip) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}

}
