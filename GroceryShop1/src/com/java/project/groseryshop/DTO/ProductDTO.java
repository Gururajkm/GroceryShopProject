package com.java.project.groseryshop.DTO;

public class ProductDTO extends groceryshop {
		private String nameOfproduct;
		private double Price;
		private long barcodenumber;
		private ManufacturercompanyDTO dto;
		private String manufacturingdate;
		private String expirydate;
		private int quality;
		
		ProductDTO(){
			  System.out.println("invoking"+ getClass().getSimpleName()+"Constructor");
			}
	    public String getNameOfproduct() {
			return nameOfproduct;
		}

		public void setNameOfproduct(String nameOfproduct) {
			this.nameOfproduct = nameOfproduct;
		}

		public double getMRPrice() {
			return Price;
		}

		public void setMRPrice(double Price) {
			Price = Price;
		}

		public long getBarcodenumber() {
			return barcodenumber;
		}

		public void setBarcodenumber(long barcodenumber) {
			this.barcodenumber = barcodenumber;
		}

		public ManufacturercompanyDTO getDto() {
			return dto;
		}

		public void setDto(ManufacturercompanyDTO dto) {
			this.dto = dto;
		}

		public String getManufacturingdate() {
			return manufacturingdate;
		}

		public void setManufacturingdate(String manufacturingdate) {
			this.manufacturingdate = manufacturingdate;
		}

		public String getExpirydate() {
			return expirydate;
		}

		public void setExpirydate(String expirydate) {
			this.expirydate = expirydate;
		}

		public int getQuality() {
			return quality;
		}

		public void setQuality(int quality) {
			this.quality = quality;
		}
		
		
	    

	}


