package com.too.many.parameter.builder.pattern;

/**
 * When too many parameters in a class and if the parameters are not available
 * all at once then use Builder Pattern.
 * 
 * @author "Jigar Gosalia"
 *
 */
public class Person {

	private String salutation;
	private String first;
	private String middle;
	private String last;
	private String streetName;
	private String city;
	private String state;
	private String zipCode;
	private boolean isMale;

	public Person() {
	}

	public Person(String salutation, String first, String middle, String last, String streetName, String city,
			String state, String zipCode, boolean isMale) {
		super();
		this.salutation = salutation;
		this.first = first;
		this.middle = middle;
		this.last = last;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.isMale = isMale;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getMiddle() {
		return middle;
	}

	public void setMiddle(String middle) {
		this.middle = middle;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public static class PersonBuilder {
		private String iSalutation;
		private String iFirst;
		private String iMiddle;
		private String iLast;
		private String iStreetName;
		private String iCity;
		private String iState;
		private String iZipCode;
		private boolean iIsMale;

		public PersonBuilder() {
		}

		public PersonBuilder(String iSalutation, String iFirst, String iMiddle, String iLast, String iStreetName,
				String iCity, String iState, String iZipCode, boolean iIsMale) {
			super();
			this.iSalutation = iSalutation;
			this.iFirst = iFirst;
			this.iMiddle = iMiddle;
			this.iLast = iLast;
			this.iStreetName = iStreetName;
			this.iCity = iCity;
			this.iState = iState;
			this.iZipCode = iZipCode;
			this.iIsMale = iIsMale;
		}

		public PersonBuilder salutation(String salutation) {
			this.iSalutation = salutation;
			return this;
		}

		public PersonBuilder first(String first) {
			this.iFirst = first;
			return this;
		}

		public PersonBuilder middle(String middle) {
			this.iMiddle = middle;
			return this;
		}

		public PersonBuilder isMale(boolean isMale) {
			this.iIsMale = isMale;
			return this;
		}

		public PersonBuilder last(String last) {
			this.iLast = last;
			return this;
		}

		public PersonBuilder streetName(String streetName) {
			this.iStreetName = streetName;
			return this;
		}

		public PersonBuilder city(String city) {
			this.iCity = city;
			return this;
		}

		public PersonBuilder state(String state) {
			this.iState = state;
			return this;
		}

		public PersonBuilder zipCode(String zipCode) {
			this.iZipCode = zipCode;
			return this;
		}

		public Person build() {
			return new Person(iSalutation, iFirst, iMiddle, iLast, iStreetName, iCity, iState, iZipCode, iIsMale);
		}
	}

	@Override
	public String toString() {
		return "Person [salutation=" + salutation + ", first=" + first + ", middle=" + middle + ", last=" + last
				+ ", streetName=" + streetName + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode
				+ ", isMale=" + isMale + "]";
	}
}
