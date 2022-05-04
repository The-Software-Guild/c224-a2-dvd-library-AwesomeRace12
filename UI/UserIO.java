/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author aakar
 */
public interface UserIO {
    
    void print(String message);
    
    int readInt(String prompt, int min, int max);
    
    String readString(String prompt);
}
