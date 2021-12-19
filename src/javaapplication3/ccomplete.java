package javaapplication3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ccomplete {
    String cname,emailid,startdate,enddate,status;
    byte[] certificate;
    public ccomplete(String cname,String emailid,String startdate,String enddate,byte[] certificate,String status){
        this.cname=cname;
       
        this.startdate=startdate;
        this.enddate=enddate;
        this.certificate=certificate;
        this.status=status;
    }
    public String getcname(){
       return cname;
   }
  public String getemail(){
       return emailid;
   }
    
    public String getstartdate(){
       return startdate;
   }
     public String getenddate(){
         return enddate;
     }
     public byte[] getcertificate(){
         return certificate;
     }
     public String getstatus(){
         return status;
     }
}
