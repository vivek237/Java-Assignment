package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
* It is just a helper class which should be replaced by database implementation.
* It is not very well written class, it is just used for demonstration.
*/

public class OrderService {
    static HashMap<Integer, OrderInfo> orderIdMap = getOrderIdMap();// map list
    public OrderService() {
    super();
    {
      if(orderIdMap == null) {
        orderIdMap = new HashMap<Integer, OrderInfo>();

// Creating some objects of Student while initializing =======================================
            
   OrderInfo AllenProduct = new OrderInfo(1, "vivek123", "1234", "Zeans12", 
		   1,200.00,5.00,2500.00,2000.00,"vkumar12");
   OrderInfo ZoccyProduct = new OrderInfo(2, "nitin456", "4564", "T-shirt12", 
		   1,80.00,5.00,5000.00, 5000.00,"vkumar12");
   OrderInfo ZaraProduct = new OrderInfo(3, "mayank678", "7879", "Lower12", 
		   1,20.00,5.00,1000.00, 1000.00,"vkumar12");
   OrderInfo TommyProduct = new OrderInfo(4, "rahul895", "7589", "Jacket12",
		   1,500.00,5.00,5000.00,5000.00,"vkumar12");


// adding map list of collections in java ====================================================
   
orderIdMap.put(1, AllenProduct);
orderIdMap.put(2, ZoccyProduct);
orderIdMap.put(3, ZaraProduct);
orderIdMap.put(4, TommyProduct);        
  }
 }
}

public List<OrderInfo> getAllOrderlist() {
     List<OrderInfo> orderlist = new ArrayList<OrderInfo>(orderIdMap.values());
     return orderlist;
}

 
public OrderInfo getOrder(int id) {
        OrderInfo order= orderIdMap.get(id);
        return order;
    }

// add student ===============================================================================
    public OrderInfo addOrder(OrderInfo order) {
        order.setId(getMaxId() + 1);
        
// key , value ===============================================================================
        
    orderIdMap.put(order.getId(), order); /// logic class
    return order;
   }

//update =====================================================================================
    
    public OrderInfo updateOrder(OrderInfo order) {
      if (order.getId() <= 0)
        return null;
        orderIdMap.put(order.getId(), order);
        return order;
     }
    
//delete =====================================================================================

 public void deleteOrder(int id) {
        orderIdMap.remove(id);
    }

 
public static HashMap<Integer, OrderInfo> getOrderIdMap() {
        return orderIdMap;
    }

 

// Utility method to get max id ==============================================================

public static int getMaxId() {
     int max = 0;
        for (int id :orderIdMap.keySet()) {
            if (max <= id)
                max = id;
        }
        return max;
    }
}