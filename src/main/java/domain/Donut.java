package domain;

public class Donut {
    private boolean isDonut;
    private int paidDuration;
    private boolean canPublishFreeCopy;
    private String editMode;
    private String placeHolder;

    public void setisDanut() {
        this.isDonut = isDonut;
    }

    public boolean isDonut() {
        return isDonut;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setPlaceHolder(String placeHolder) {
        this.placeHolder = placeHolder;
    }

    public String getPlaceHolder() {
        return placeHolder;
    }
}

