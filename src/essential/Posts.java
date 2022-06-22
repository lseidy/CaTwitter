package essential;

import static catwitter.Main.control;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Posts  {

    public Posts(String author, String timestamp, String post) {
        this.author = author;
        this.timestamp = timestamp;
        this.post = post;
    }

    public Posts() {
    }

    private String author;
    private String timestamp;
    private String post;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

 


}
