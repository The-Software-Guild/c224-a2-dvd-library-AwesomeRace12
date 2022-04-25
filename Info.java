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
public interface Info {
    DvdCollection addDvd(String title);
    
    List<DvdCollection> getalldvd();
    
    DvdCollection removeDvd(String title);
}
