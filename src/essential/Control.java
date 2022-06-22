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
public class Control extends Users{
    ArrayList<Users> allusers ;
    ArrayList<Posts> postsAll;
    private int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public ArrayList<Posts> getPostsAll() {
        return postsAll;
    }

    public void setPostsAll(Posts post) {
        this.postsAll.add(post);
    }


    public Control() {
        allusers = new ArrayList();
        postsAll = new ArrayList();
    }

    public ArrayList<Users> getAllusers() {
        return allusers;
    }

    public void setAllusers(Users user) {
        this.allusers.add(user);
    }
    
    
}
