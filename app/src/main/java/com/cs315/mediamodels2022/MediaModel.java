package com.cs315.mediamodels2022;

public class MediaModel {

    // a generic MODEL (like a database schema) for a MEDIA object
    private String mediaTitle;  // we will use the mediaTitle as a primary key throughout our app, so this must be always unique!
    private String mediaDescription;
    private String mediaLeader;
    private String mediaImage;
    private String mediaWeblink;

    /* initializer */
    public MediaModel(final String movieTitle, final String mediaDescription, final String mediaLeader, final String mediaImage, final String mediaWeblink) {
        setMediaTitle(movieTitle);
        setMediaDescription(mediaDescription);
        setmediaLeader(mediaLeader);
        setMediaImage(mediaImage);
        setMediaWeblink(mediaWeblink);
    }

    /* getters */
    public String getMediaTitle() {
        return mediaTitle;
    }

    public String getMediaDescription() {
        return mediaDescription;
    }

    public String getmediaLeader() {
        return mediaLeader;
    }

    public String getMediaImage() {
        return mediaImage;
    }

    public String getMediaWeblink() {
        return mediaWeblink;
    }

    /* setters */
    public void setMediaTitle(final String mediaTitle) {
        this.mediaTitle = mediaTitle;
    }

    public void setMediaDescription(final String mediaDescription) {
        this.mediaDescription = mediaDescription;
    }

    public void setmediaLeader(final String mediaLeader) {
        this.mediaLeader = mediaLeader;
    }

    public void setMediaImage(final String mediaImage) {
        this.mediaImage = mediaImage;
    }

    public void setMediaWeblink(final String mediaWeblink) {
        this.mediaWeblink = mediaWeblink;
    }

}
