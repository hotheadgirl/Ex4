/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproperty;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author Yoga
 */
public class User1 implements PropertyChangeListener {
    
    @Override
    public void propertyChange(PropertyChangeEvent evt){
        System.out.println(evt.getNewValue());
    }
    
}
