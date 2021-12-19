/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author User
 */
class courses {
    String cname;
    String description;
    String university;
    String type;
    byte[] cimage;
    int duration;
    
   public courses(String cname,String description,String university,String type,byte[] cimage,int duration)
   {
       this.cname=cname;
       this.description=description;
       this.university=university;
       this.type=type;
       this.cimage=cimage;
       this.duration=duration;
   }
   public String getcname(){
       return cname;
   }
   public String getdescription(){
       return description;
   }
    public String getuniversity(){
        return university;
    }
     public String gettype(){
         return type;
     }
     public byte[] getcimage(){
         return cimage;
     }
     public int getduration(){
         return duration;
     }

}