/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author aakar
 */
public class DvddaoException extends Exception {
      public DvddaoException(String msg) {
        super(msg);
    }

    public DvddaoException(String msg, Throwable cause) {
        super (msg, cause);
    }
}
