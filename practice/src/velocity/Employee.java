package velocity;

public class Employee {
	public class Employee {

		private int id;
		private String firstName;
		private String lastName;
		private String mobileNumber;

		private Address address;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getMobileNumber() {
			return mobileNumber;
		}

		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		// getter and setter
	}
	package com.test;

	public class Address {

		private String streetNo;
		private String city;
		private String state;
		private String country;

		public String getStreetNo() {
			return streetNo;
		}

		public void setStreetNo(String streetNo) {
			this.streetNo = streetNo;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

	}
	package com.test;

	import java.util.Scanner;

	public class Test {

		public void getUserDetails() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter employee id>>");
			int id = scanner.nextInt();
			System.out.println("Enter employee first name>>");
			String firstName = scanner.next();
			System.out.println("Enter employee last name>>");
			String lastName = scanner.next();
			System.out.println("Enter employee mobile number>>");
			String mobileNumber = scanner.next();

			System.out.println("Enter street no>>");
			String streetNo = scanner.next();
			System.out.println("Enter city>>");
			String city = scanner.next();
			System.out.println("Enter state>>");
			String state = scanner.next();
			System.out.println("Enter country>>");
			String country = scanner.next();
			// set the value into employee object here
			Employee employee = new Employee();
			employee.setId(id);
			employee.setFirstName(firstName);
			employee.setLastName(lastName);
			employee.setMobileNumber(mobileNumber);

			// set value into address object here
			Address address = new Address();
			address.setStreetNo(streetNo);
			address.setCity(city);
			address.setState(state);
			address.setCountry(country);

			//set address object into employee object
			employee.setAddress(address);

			// get the value from employee object here
			System.out.println("Employee ID>>" + employee.getId());
			System.out.println("Employee First Name>>" + employee.getFirstName());
			System.out.println("Employee Last Name>>" + employee.getLastName());
			System.out.println("Employee Mobile Number>>" + employee.getMobileNumber());

			System.out.println("Employee Street No>>" + employee.getAddress().getStreetNo());
			System.out.println("Employee City>>" + employee.getAddress().getCity());
			System.out.println("Employee State>>" + employee.getAddress().getState());
			System.out.println("Employee Country>>" + employee.getAddress().getCountry());

		}

		public static void main(String[] args) {

			Test test = new Test();
			test.getUserDetails();

		}
	}

}
