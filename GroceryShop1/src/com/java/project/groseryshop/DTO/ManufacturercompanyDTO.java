package com.java.project.groseryshop.DTO;

public class ManufacturercompanyDTO
		private String companyname;
		private  AddressDT0 addr;
		private long contactno;
		private String mailid;


		 ManufacturercompanyDTO(){
			 System.out.println("invoking" + getClass().getSimpleName()+"constructor");
		 }
		public String getCompanyname() {
			return companyname;
		}

		public void setCompanyname(String companyname) {
			this.companyname = companyname;
		}

		public AddressDTO getAddr() {
			return addr;
		}

		public void setAdd(AddressDTO addr) {
			this.addr = addr;
		}

		public long getContactno() {
			return contactno;
		}

		public void setContactno(long contactno) {
			this.contactno = contactno;
		}

		public String getMailid() {
			return mailid;
		}

		public void setMailid(String mailid) {
			this.mailid = mailid;
		}

		 
	}
