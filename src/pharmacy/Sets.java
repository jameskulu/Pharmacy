package pharmacy;

public class Sets {
    String medicine_name,company_name,pack_size,expiry_date;
    int Id;
    double quantity,unit_price,quantity2,unit_price2,total_amount,tablet_in_leaflet;
    public Sets(int Id,String medicine_name, String company_name,String pack_size,double tablet_in_leaflet,double quantity,double unit_price,double quantity2,double unit_price2,double total_amount,String expiry_date){
        this.medicine_name = medicine_name;
        this.Id = Id;
        this.company_name = company_name;
        this.pack_size = pack_size;
        this.tablet_in_leaflet = tablet_in_leaflet;
        this.quantity = quantity;
        this.unit_price = unit_price;
        this.quantity2 = quantity2;
        this.unit_price2 = unit_price2;
        this.total_amount = total_amount;
        this.expiry_date = expiry_date;
}
    
    public int getId(){
    return Id;
    }
    
    public String getmedicine_name(){
    return medicine_name;
    }
    
    public String getpack_size(){
    return pack_size;
    }
    
     public String getcompany_name(){
    return company_name;
    }
     
     public double gettablet_in_leaflet(){
    return tablet_in_leaflet;
    }
       
      public double getquantity(){
    return quantity;
    }
          
       public double getunnit_price(){
    return unit_price;
    }
       
          public double getquantity2(){
    return quantity2;
    }
          
       public double getunnit_price2(){
    return unit_price2;
    }
         public double gettotal_amount(){
    return total_amount;
    }
         
        public String getexpiry_date(){
    return expiry_date;
    }
               
    }   
