
package corejave;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import static java.lang.System.in;

class student implements Serializable{
    String name;
    int roll;
    public student(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
}



public class SerializeTest {

    
    public static void main(String[] args) throws ClassNotFoundException {
    student std=new student("Scott",111);
    try{
        FileOutputStream fileout=new FileOutputStream("C:\\JavaWorks\\tst.txt");
        ObjectOutputStream objout=new ObjectOutputStream(fileout);
        
        objout.writeObject(std);
        objout.close();
        System.out.println("File Write Success");
        student obj=null;
        
        FileInputStream finein=new FileInputStream("tst.txt");
        ObjectInputStream objin=new ObjectInputStream(finein);
        
        obj=(student)objin.readObject();
        objin.close();
        System.out.println("  " + obj.name);
        
                
        
        
        
        
        
    }catch(FileNotFoundException fle){
        fle.printStackTrace();
    } catch(IOException ioe){
        ioe.printStackTrace();
    }
        
        
    }
    
}
