/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Mubin Shrestha
 */
public class TfIdfMain {
    
    /**
     * Main method
     * @param args
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void main(String args[]) throws FileNotFoundException, IOException
    {
        DocumentParser dp = new DocumentParser();
        dp.parseFiles("C:\\Users\\anshu\\Desktop\\JAVA PROJECT\\datasets2");
        dp.tfIdfCalculator(); //calculates tfidf
        dp.runkmeans(); //calculated cosine similarity   
    }
} 