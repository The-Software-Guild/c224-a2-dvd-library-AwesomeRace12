/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import dao.DvdDao;
import dao.DvDDaoImpl;
import controller.Dvdcontroller;
import UI.UserIO;
import UI.UserIOImpl;
import UI.Dvdview;
/**
 *
 * @author aakar
 */
public class Main {
    public static void main(String[] args) {
    UserIO myIo = new UserIOImpl();
    Dvdview myView = new Dvdview(myIo);
    DvdDao myDao = new DvDDaoImpl();
    Dvdcontroller controller = new Dvdcontroller(myDao, myView);
    controller.run();
    }
    
}
