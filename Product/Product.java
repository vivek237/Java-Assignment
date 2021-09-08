package com;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Product {
   
// Get call using spring based web services	=============================================
	
   @GetMapping("/myurl")
   public String sayHello()
   {
       return "Welcome To Our Site";
   }
   
//retrieve the person info using @GET Method ============================================
   
   @GetMapping("/productinfo")
   public ProductInfo getProductInfo() {
   ProductInfo p =new  ProductInfo();
   
   //creating java object ===============================================================
   
   p.setId(1);
   p.setUserid("vivek123");
   p.setTitle("AllenSolly");
   p.setType("Zeans");
   p.setPrice(2000.00);
   p.setDiscount(200.00);
   p.setQuantity(1);
   p.setVendor("BigBazar");  
   return p;
   }
   
// retrieve the person information by id ================================================
   
   @GetMapping("/productinfo/{id}")
   public ProductInfo getProductById(@PathVariable("id") Integer id) {
       ProductInfo p =new  ProductInfo();
       
   //creating java object ===============================================================
       
       p.setId(1);
       p.setUserid("vivek123");
       p.setTitle("AllenSolly");
       p.setType("Zeans");
       p.setPrice(2000.00);
       p.setDiscount(200.00);
       p.setQuantity(1);
       p.setVendor("BigBazar");  
       return p;
  
}
   
// add the person information Post =======================================================
   
  @PostMapping(value = "/insertproductdetails")
  public ProductInfo insertProductDetail(@RequestBody ProductInfo product) {
  return new ProductService().addProduct(product); //calling the service
  }
  
//update person info =====================================================================
  
  @PutMapping("/update")
  public ProductInfo updateProductInfo(@RequestBody ProductInfo product) {
  return new ProductService().updateProduct(product);
  }
  
//get list ===============================================================================
  
  @GetMapping("/getlist")
  public List<ProductInfo> getProductList() {
  List<ProductInfo> listOfProduct = new ProductService().getAllProductlist();
  return listOfProduct;
  }
  
//delete list ============================================================================
  
  @DeleteMapping("/delete/{id}")
  public List<ProductInfo> deleteProductById(@PathVariable Integer id) {
      new ProductService().deleteProduct(id);
      return new ProductService().getAllProductlist();
  }
}