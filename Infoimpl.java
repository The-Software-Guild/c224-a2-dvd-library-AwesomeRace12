/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DVD;
import java.util.*;
import java.util.List;

/**
 *
 * @author aakar
 */
public class Infoimpl implements Info{

    @Override
    public DvdCollection addDvd(String title) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DvdCollection> getalldvd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DvdCollection removeDvd(String title) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Map<String, DvdCollection> collection = new HashMap<>();
    
    public DvdCollection addDvdCollection(String title, DvdCollection DvdCollect) {
    DvdCollection prevDvdCollection = collection.put(title, DvdCollect);
    return prevDvdCollection;
}
}
