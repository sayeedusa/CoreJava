/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corejave;

import java.io.IOException;

/**
 *
 * @author sayee
 */
public class CMDcommands {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Process p;
        try{
        p=Runtime.getRuntime().exec("notepad");
        }catch(IOException e){
            e.printStackTrace(System.err);
        }
        
        
        
    }
    
}
