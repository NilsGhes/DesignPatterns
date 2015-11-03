/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Nils
 */
public class InputTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c;

        try (InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")))) {
            while((c=in.read()) >=0){
                System.out.print((char)c);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
