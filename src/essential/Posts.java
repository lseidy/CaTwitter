package essential;

import java.util.ArrayList;
import java.util.List;

public class Posts extends Users {
    private static final List postsAll = new ArrayList();
    public static void setPostsAll(String author, String post, String timestamp) {
        Posts.postsAll.add(author);
        Posts.postsAll.add(timestamp);
        Posts.postsAll.add(post);
    }
    public List getPostsAll() {
        return postsAll;
    }
}
