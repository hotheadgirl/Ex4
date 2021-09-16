/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproperty;
import java.util.*;

/**
 *
 * @author Yoga
 */
public class BoundProperty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyPropertyBean mySource = new  MyPropertyBean();
        Scanner inp = new Scanner(System.in);
        String score = "0";
        User1 a = new User1();
        User2 b = new User2();
        mySource.addPropertyChangeListener(a);
        mySource.addPropertyChangeListener(b);   
        while (!score.isEmpty()) {
            System.out.print("Enter Score ");
            score = inp.nextLine();
            if (!score.isEmpty()) {
                mySource.setScore(score);
            }
        }
        
    }  
 }
   
