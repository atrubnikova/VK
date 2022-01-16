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
    private String postType;
    private Geo geo;
    private int singerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private Donut donut;
    private int postponedId;

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
    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getPostType() {
        return postType;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public Geo getgeo() {
        return geo;
    }

    public void setSingerId() {
        this.singerId = singerId;
    }

    public int getSingerId() {
        return singerId;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
    }

    public Donut getDonut() {
        return donut;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public int getPostponedId() {
        return postponedId;
    }
}
