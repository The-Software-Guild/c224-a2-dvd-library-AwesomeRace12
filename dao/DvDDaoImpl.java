/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import dto.DvdCollection;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author aakar
 */
public class DvDDaoImpl implements DvdDao{
     private Map<String, DvdCollection> dvds = new HashMap<>();

        public final String FILE;
        public final String str = ":";

        public DvDDaoImpl(){
        FILE = "lib.txt";
    }

        public DvDDaoImpl(String libraryTextFile){
        FILE = libraryTextFile;
    }

        
        public DvdCollection addDVD(String title, DvdCollection dvd)
                throws DvddaoException {
            DvdCollection newDVD = dvds.put(title, dvd);
            try {
                writeDVD();
            } catch (DvddaoException ex) {
                ex.printStackTrace();

            } catch (IOException ex) {
                ex.printStackTrace();

            }
            return newDVD;
        }

        public List<DvdCollection> getAllDVDs()
                throws DvddaoException {
            loadDVD();
            return new ArrayList<DvdCollection>(dvds.values());
        }

        public DvdCollection removeDVD(String title) throws DvddaoException {
            DvdCollection removedDVD = dvds.remove(title);
            try {
                writeDVD();
            } catch (DvddaoException ex) {
                ex.printStackTrace();

            } catch (IOException ex) {
                ex.printStackTrace();

            }
            return removedDVD;
        }

        public DvdCollection getDVD(String title) {
            return dvds.get(title);
        }

        public DvdCollection editDVD(String title, DvdCollection dvd) {
            dvds.put(title, dvd);
            return dvd;
        }

        private void loadDVD() throws DvddaoException {
            Scanner scanner;

            try {

                scanner = new Scanner(
                        new BufferedReader(
                                new FileReader(FILE)));
            } catch (FileNotFoundException e) {
                throw new DvddaoException(
                        "Could not load library data.", e);
            }

            String currentLine;

            String[] currentTokens;

            while (scanner.hasNextLine()) {

                currentLine = scanner.nextLine();

                currentTokens = currentLine.split(str);

                DvdCollection currentDVD = new DvdCollection(currentTokens[0]);

                currentDVD.setdate(currentTokens[2]);
                currentDVD.setstudio(currentTokens[3]);
                currentDVD.setdname(currentTokens[4]);
                currentDVD.seturating(currentTokens[5]);
                currentDVD.setmrating(currentTokens[6]);

                dvds.put(currentDVD.gettitle(), currentDVD);
            }
        }

        private void writeDVD() throws DvddaoException, IOException {

            PrintWriter out;

            try {
                out = new PrintWriter(new FileWriter(FILE));
            } catch (IOException e) {
                throw new DvddaoException(
                        "Could not save dvd data.", e);
            }

            List<DvdCollection> dvdList = this.getAllDVDs();
            for (DvdCollection currentDVD : dvdList) {

                out.println(currentDVD.gettitle() + str
                        + currentDVD.getdate() + str
                        + currentDVD.getstudio() + str
                        + currentDVD.getdname() + str
                        + currentDVD.geturating() + str
                        + currentDVD.getmrating());

                out.flush();
            }

            out.close();
        }
}