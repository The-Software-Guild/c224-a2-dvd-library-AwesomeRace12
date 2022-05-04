/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.DvdCollection;
import java.util.*;

/**
 *
 * @author aakar
 */
public interface DvdDao {
    
    DvdCollection addDVD(String title, DvdCollection dvd)
            throws DvddaoException;
    
    List<DvdCollection> getAllDVDs()
            throws DvddaoException;
    
    DvdCollection getDVD(String title)
             throws DvddaoException;
    
    DvdCollection removeDVD(String title)
             throws DvddaoException;
    
    DvdCollection editDVD(String title, DvdCollection dvd)
             throws DvddaoException;
}
