package com.pierre.homeshop;

public class Customer {

		private String fullName;
		private String address;

		public Customer(String fullname, String address) {
			this.fullName = fullname;
			this.address = address;
		}
		
		public String getFullName() {
			return fullName;
		}
		public String getAddress() {
			return address;
		}
		
		
}
