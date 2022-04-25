/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DVD;

import java.util.Scanner;

/**
 *
 * @author aakar
 */
public class Controller {
    public void run(){
         Scanner input = new Scanner(System.in);
        //DvdCollection info = new DvdCollection();
        boolean loop = true;
        while(loop){
        System.out.println("Main menu! Which one you would like to enter");
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Edit");
        System.out.println("4. List");
        System.out.println("5. Display");
        System.out.println("6. Search");
        System.out.println("7. Load");
        System.out.println("8. Save");
        System.out.println("9. Add, edit, and delete");
        System.out.println("10. Exit");
        int option=0;
        option = input.nextInt();
        switch(option){
            case 1:
                System.out.println("Add DVD to the collection");
                getDvdInfo();
                break;
            case 2:
                System.out.println("Remove Dvd from the collection");
                break;
            case 3:
                System.out.println("Edit information for existing Dvd");
                break;
            case 4:
                System.out.println("List Dvds in the collection");
                break;
            case 5:
                System.out.println("Display info about Dvd");
                break;
            case 6:
                System.out.println("Search Dvd by title");
                break;
            case 7:
                System.out.println("Load Dvd from file");
                break;
            case 8:
                System.out.println("Save Dvd to file");
                break;
            case 9:
                System.out.println("Add, edit, and delete many Dvds");
                break;
            case 10:
                loop = false;
                break;
        }
        }
        
        System.out.println("Goodbye");
}
       public DvdCollection getDvdInfo() {
        Scanner input = new Scanner(System.in);
        String title,date,mrating,dname,studio,urating;
        System.out.println("Enter title");
        title = input.nextLine();
        System.out.println("Enter date");
        date = input.nextLine();
        System.out.println("Enter mrating");
        mrating = input.nextLine();
        System.out.println("Enter director name");
        dname = input.nextLine();
        System.out.println("Enter studio name");
        studio = input.nextLine();
        System.out.println("Enter user rating");
        urating = input.nextLine();
        DvdCollection currentDvd = new DvdCollection();
        currentDvd.settitle(title);
        currentDvd.setdate(date);
        currentDvd.setmrating(mrating);
        currentDvd.setmrating(dname);
        currentDvd.setmrating(studio);
        currentDvd.setmrating(urating);
        return currentDvd;
}
 
}
