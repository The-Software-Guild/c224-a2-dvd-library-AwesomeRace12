/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DVD;
import java.util.*;
/**
 *
 * @author aakar
 */
public class DvdCollection {
    private String title;
    private String date;
    private String mrating;
    private String dname;
    private String studio;
    private String urating;
    
    public void settitle(String title){
        this.title = title;
        
    }
    public String gettitle(){
        return title;
    }
     public void setdate(String date){
        this.date = date;
        
    }
    public String getdate(){
        return date;
    }
     public void setmrating(String mrating){
        this.mrating = mrating;
        
    }
    public String getmrating(){
        return mrating;
    }
     public void setdname(String dname){
        this.dname = dname;
        
    }
    public String getdname(){
        return dname;
    }
     public void setstudio(String studio){
        this.studio = studio;
        
    }
    public String getstudio(){
        return studio;
    }
     public void seturating(String urating){
        this.urating = urating;
        
    }
    public String geturating(){
        return urating;
    }
    
 
    
  
}
