package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
* It is just a helper class which should be replaced by database implementation.
* It is not very well written class, it is just used for demonstration.
*/

public class ProductService {
    static HashMap<Integer, ProductInfo> productIdMap = getProductIdMap();// map list
    public ProductService() {
    super();
    {
      if(productIdMap == null) {
         productIdMap = new HashMap<Integer, ProductInfo>();

// Creating some objects of Student while initializing =======================================
            
   ProductInfo AllenProduct = new ProductInfo(1, "vivek123", "AllenSolly", "Zeans", 
		   2000.00, 200.00,1, "BigBazar");
   ProductInfo ZoccyProduct = new ProductInfo(2, "nitin456", "Zoccy", "T-shirt", 
		   500.00, 80.00,2, "V Mart");
   ProductInfo ZaraProduct = new ProductInfo(3, "mayank678", "Zara", "Lower", 
		   1000.00, 20.00,1, "Kolkata Bazar");
   ProductInfo TommyProduct = new ProductInfo(4, "rahul895", "Tommy", "Jacket",
		   5000.00,500.00,1, "NCM");


// adding map list of collections in java ====================================================
   
productIdMap.put(1, AllenProduct);
productIdMap.put(2, ZoccyProduct);
productIdMap.put(3, ZaraProduct);
productIdMap.put(4, TommyProduct);        
  }
 }
}

public List<ProductInfo> getAllProductlist() {
     List<ProductInfo> productlist = new ArrayList<ProductInfo>(productIdMap.values());
     return productlist;
}

 
public ProductInfo getProduct(int id) {
        ProductInfo product= productIdMap.get(id);
        return product;
    }

// add student ===============================================================================
    public ProductInfo addProduct(ProductInfo product) {
        product.setId(getMaxId() + 1);
        
// key , value ===============================================================================
        
    productIdMap.put(product.getId(), product); /// logic class
    return product;
   }

//update =====================================================================================
    
    public ProductInfo updateProduct(ProductInfo product) {
      if (product.getId() <= 0)
        return null;
        productIdMap.put(product.getId(), product);
        return product;
     }
    
//delete =====================================================================================

 public void deleteProduct(int id) {
        productIdMap.remove(id);
    }

 
public static HashMap<Integer, ProductInfo> getProductIdMap() {
        return productIdMap;
    }

 

// Utility method to get max id ==============================================================

public static int getMaxId() {
     int max = 0;
        for (int id :productIdMap.keySet()) {
            if (max <= id)
                max = id;
        }
        return max;
    }
}