/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.DvdCollection;
import dao.DvdDao;
import dao.DvddaoException;
import UI.Dvdview;
import java.util.*;
/**
 *
 * @author aakar
 */
public class Dvdcontroller {
    
    Dvdview view;
    DvdDao dao;

    public Dvdcontroller(DvdDao dao, Dvdview view) {
        this.dao = dao;
        this.view = view;
    }

    private int getMenuSelection() {
        return view.printmenu();
    }

    public void run() {
        boolean keepGoing = true;
        int menuSelect = 0;
        try {
            while (keepGoing) {

                try {
                    menuSelect = getMenuSelection();
                } catch (NumberFormatException e) {
                    view.displayErrorMessage(e.getMessage());
                    continue;
                }
                switch (menuSelect) {
                    case 1:
                        listDVDs();
                        break;
                    case 2:
                        createDVD();
                        break;
                    case 3:
                        viewDVD();
                        break;
                    case 4:
                        removeDVD();
                        break;
                    case 5:
                        editDVD();
                        break;
                    case 6:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }
            }
            exitMessage();
        } catch (DvddaoException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }
    private void listDVDs() throws DvddaoException {
        view.displayDisplayAll();
        List<DvdCollection> dvdList = dao.getAllDVDs();
        view.displayDVDList(dvdList);
    }

    private void createDVD() throws DvddaoException {
        view.displayCreateDVD();
        DvdCollection newDVD = view.getDVDInfo();
        dao.addDVD(newDVD.gettitle(), newDVD);
        view.displayCreateSuccess();
    }

    private void viewDVD() throws DvddaoException {
        view.displayDisplayDVD();
        String title = view.getDVDTitleChoice();
        DvdCollection dvd = dao.getDVD(title);
        view.displayDVD(dvd);
    }

    private void removeDVD() throws DvddaoException {
        view.displayRemoveDVD();
        String title = view.getDVDTitleChoice();
        dao.removeDVD(title);
        view.displayRemove();
    }

    private void editDVD() throws DvddaoException {
        view.displayEditDVD();
        String title = view.getDVDTitleChoice();
        DvdCollection previousDVD = dao.getDVD(title);
        DvdCollection editedDVD = view.editDVD(previousDVD);
        dao.editDVD(editedDVD.gettitle(), editedDVD);
        view.displayEdit();
    }

    private void unknownCommand() {
        view.displayUnknownCommand();
    }

    private void exitMessage() {
        view.displayExit();
    }
}