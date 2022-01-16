package domain;

public class CommentsInfo {
    private int count;
    private int canPost;
    private int groupsCanPost;
    private boolean canClose;
    private boolean canOpen;

    public void setCount() {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCanPost() {
        this.canPost = canPost;
    }

    public int getCanPost() {
        return canPost;
    }

    public void setGroupsCanPost() {
        this.groupsCanPost = groupsCanPost;
    }

    public int getGroupsCanPost() {
        return groupsCanPost;
    }

    public void setCanClose() {
        this.canClose = canClose;
    }

    public boolean getCanClose() {
        return canClose;
    }

    public void setCanOpen() {
        this.canOpen = canOpen;
    }

    public boolean getCanOpen() {
        return canOpen;
    }
}