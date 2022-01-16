package domain;

public class Post {

    private int id;
    private int ownerId;
    private int createdBy;
    private int date;
    private String text;
    private int replyPostId;
    private CommentsInfo commentsInfo;
    private Favorite favorite;
    private Repost repost;
    private Views view;

    public void setid() {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setownerId() {
        this.ownerId = ownerId;
    }

    public int getownerId() {
        return ownerId;
    }

    public void setcreatedBy() {
        this.createdBy = createdBy;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setdate() {
        this.date = date;
    }

    public int getdate() {
        return date;
    }

    public void settext() {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setreplyPostId() {
        this.replyPostId = replyPostId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setCommentsInfo() {
        this.commentsInfo = commentsInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setLike() {
        this.favorite = favorite;
    }

    public Favorite getLike() {
        return favorite;
    }

    public void setRepost(Repost repost) {
        this.repost = repost;
    }

    public Repost getRepost() {
        return repost;
    }

    public void setView(Views view) {
        this.view = view;
    }

    public Views getView() {
        return view;
    }
}
