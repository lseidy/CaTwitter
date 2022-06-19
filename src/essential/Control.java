/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package essential;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class Control extends Users {
    List<Users> allusers = new ArrayList<Users>();

    public Control() {
    }

    public List getAllusers() {
        return allusers;
    }

    public void setAllusers(Users user) {
        this.allusers.add(user);
    }
    
    
}
