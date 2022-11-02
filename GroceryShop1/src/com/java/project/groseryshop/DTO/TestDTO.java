package com.java.project.Groceryshop.DTO;

	import com.project.Groceryshop.DAO.GroceryShopDAO;

	import java.util.TreeSet;

	public class TestDTO {
		public static void main(String[] args) {
			ProductDTO product = new ProductDTO();
			product.setNameOfproduct("Biscuit");
			product.setMRPrice(165);
			product.setBarcodenumber((long)805088825);
			product.setDto(null);
			product.setIsveg(false);
			product.setManufacturingdate("01/11/2022");
			product.setExpirydate("15/11/2024");
			product.setQuality(50);
			
			ManufacturercompanyDTO Manufacturercompany = new ManufacturercompanyDTO();
			Manufacturercompany.setCompanyname("Ninja Tech limlited");
			Manufacturercompany.setContactno(123456789);
			Manufacturercompany.setMailid("yuvarajkm1100@gmail.com");
			
			AddressDTO address = new AddressDTO();
			address.setBuildingno("No.100.whitefield.bangalore");
			address.setArea("whitefield");
			address.setCity("Bangalore");
			address.setState("Karnataka");
			address.setCountry("India");
			address.setZip(560066);
			
	        GroceryShopDAO shop = new GroceryShopDAO ();
			String  display  = shop.removeProctByCompanyName("Biscuit","Ninja Tech limlited");
			System.out.println(display);
			
			ManufacturercompanyDTO  show  = shop.getAllProductByCompanyName("Ninja Tech limlited");
			System.out.println(show);
			
			ProductDTO  s  = shop.getAllProductBynameofpruduct("Biscuit");
			System.out.println(s);
			
			shop.showallprodut();
			
			int  xyz  = shop.totalNumberOfProduct();
			System.out.println(xyz);
			
		}

	}

