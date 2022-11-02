package com.java.project.Groceryshop.DAO;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import com.java.project.Groceryshop.DTO.ManufacturercompanyDTO;
import com.java.project.Groceryshop.DTO.ProductDTO;

public class GroceryShopDAO {
	
	LinkedList list = new LinkedList();
    public String addproduct(ProductDTO dto) {
	   list.add(dto);
	    return dto.getDto()+"data saved";
		
		
	}
       public String removeProductByCompanyName(String nameOfproduct,String companyname) {
    	for(int i=0; i<list.length(); i++) {
    		if(list.equals(companyname));
    		return null;
    			
    	}
    	return nameOfproduct;
    	
    }
     
     HashSet<ProductDTO> list2 = new HashSet<ProductDTO>();
    public ProductDTO  getAllProductBynameofpruduct(String nameOfproduct) {
    	for(ProductDTO hashset :list2) {
    		if(hashset.getNameOfproduct().equals(nameOfproduct)) {
    			return hashset;
    		}
    	}
		return null;
    	
    }
    
    TreeSet<com.java.project.groseryshop.DTO.ManufacturercompanyDTO> list1 = new TreeSet<ManufacturercompanyDTO>();
    public ManufacturercompanyDTO  getAllProductByCompanyName(String companyname) {
    	for(ManufacturercompanyDTO treeset :list1) {
    		if(treeset.getCompanyname().equals(companyname)) {
    			return treeset;
    		}
    	}
		return null;
    	
    }
    
    public void showallprodut() {
    	for(ProductDTO h : list2) {
        	System.out.println(h);	
        		
        		}
        	}
    	
    public int totalNumberOfProduct() {
    	for(ProductDTO sum : list2) {
        		
       }
		return 0;
        	}
    	
    }


