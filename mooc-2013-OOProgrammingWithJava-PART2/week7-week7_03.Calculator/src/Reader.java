import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kraczlam5898
 */
public class Reader {
    private Scanner reader;

    public Reader() {
        this.reader = new Scanner(System.in);
    }
    
    public String readString(){
        String readStr = reader.nextLine();
        return readStr;
    }
    
    public int readInteger(){
        int readInt = Integer.parseInt(reader.nextLine());
        return readInt;
    }
}
