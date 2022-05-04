/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import dto.DvdCollection;
import java.util.*;


/**
 *
 * @author aakar
 */
public class Dvdview {
    
    private UserIO sys;
    
    public Dvdview(UserIO sys){
        this.sys=sys;
    }
    
    public int printmenu(){
        System.out.println("Main menu Which one you would like to enter");
        System.out.println("1. List");
        System.out.println("2. Create");
        System.out.println("3. View");
        System.out.println("4. Remove");
        System.out.println("5. Edit");
        System.out.println("6. Exit");
        
        return sys.readInt("Please select from above", 1, 6);
}
        public void displayDisplayAll() {
        sys.print("Display All DVD's"); 
    }

    public void displayDVDList(List<DvdCollection> dvdList) { 
        for (DvdCollection currentDVD : dvdList) {
            sys.print(currentDVD.gettitle() + " "
                    + currentDVD.getdate() + " "
                    + currentDVD.getstudio() + " "
                    + currentDVD.getdname() + " "
                    + currentDVD.geturating() + " "
                    + currentDVD.getmrating());
        }
        sys.readString("Please hit enter to continue.");
    }

    public void displayCreateDVD() { 
        sys.print("Create DVD");
    }

    public void displayCreateSuccess() { 
        sys.readString(
                "DVD successfully created.  Please hit enter to continue");
    }

    public DvdCollection getDVDInfo() {
        String title = sys.readString("enter the DVD Title");
        String year = sys.readString("enter the date");
        String studsys = sys.readString("enter the studio");
        String directorsName = sys.readString("enter the Directors name");
        String userRating = sys.readString("enter a rating 1 - 5 stars");
        String mpaaRating = sys.readString("enter the MPAA Rating");
        DvdCollection currentDVD = new DvdCollection(title);
        currentDVD.setdate(year);
        currentDVD.setstudio(studsys);
        currentDVD.setdname(directorsName);
        currentDVD.seturating(userRating);
        currentDVD.setmrating(mpaaRating);
        return currentDVD;
    }

    public DvdCollection editDVD(DvdCollection dvd) {

        String title = sys.readString("enter the title");
        String year = sys.readString("enter the Year");
        String studsys = sys.readString("enter the Studsys");
        String directorsName = sys.readString("enter the Directors name");
        String userRating = sys.readString("enter a rating 1 - 5 stars");
        String mpaaRating = sys.readString("enter the MPAA Rating");

        dvd.setdate(year);
        dvd.setstudio(studsys);
        dvd.setdname(directorsName);
        dvd.seturating(userRating);
        dvd.setmrating(mpaaRating);

        return dvd;

    }

    public String getDVDTitleChoice() { 
        return sys.readString("Please enter the DVD Title.");
    }

    public void displayDisplayDVD() { 
        sys.print("Display DVD");
    }

    public void displayDVD(DvdCollection dvd) { 
        if (dvd != null) {
            sys.print(dvd.gettitle());
            sys.print(dvd.getdate() + " " + dvd.getstudio());
            sys.print(dvd.getdname() + " " + dvd.geturating());
            sys.print(dvd.getmrating());
            sys.print("");
        } else {
            sys.print("No such DVD.");
        }
        sys.readString("Please hit enter to continue.");
    }

    public void displayRemoveDVD() { 
        sys.print("Remove DVD");
    }

    public void displayRemove() { 
        sys.readString("DVD successfully removed. Please hit enter to continue.");
    }

    public void displayExit() {
        sys.print("Good Bye");
    }

    public void displayEditDVD() {
        sys.print("Edit DVD");
    }

    public void displayEdit() { 
        sys.readString("DVD successfully Edited. Please hit enter to continue.");
    }

    public void displayUnknownCommand() {
        sys.print("Unknown Command");
    }

    public void displayErrorMessage(String errorMsg) {
        sys.print("ERROR");
        sys.print(errorMsg);
    }
}