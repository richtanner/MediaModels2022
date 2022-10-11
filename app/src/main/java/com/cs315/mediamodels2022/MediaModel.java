package com.cs315.mediamodels2022;

public class MediaModel {

    // a generic MODEL (like a database schema) for a MEDIA object
    private String mediaTitle;  // we will use the mediaTitle as a primary key throughout our app, so this must be always unique!
    private String mediaDescription;
    private String mediaYear;
    private String mediaImage;
    private String mediaWeblink;

    /* initializer */
    public MediaModel(final String movieTitle, final String mediaDescription, final String mediaYear, final String mediaImage, final String mediaWeblink) {
        setMediaTitle(movieTitle);
        setMediaDescription(mediaDescription);
        setMediaYear(mediaYear);
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

    public String getMediaYear() {
        return mediaYear;
    }

    public String getMediaImage() {
        return String.valueOf(mediaImage);
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

    public void setMediaYear(final String mediaYear) {
        this.mediaYear = mediaYear;
    }

    public void setMediaImage(final String mediaImage) {
        this.mediaImage = mediaImage;
    }

    public void setMediaWeblink(final String mediaWeblink) {
        this.mediaWeblink = mediaWeblink;
    }

}
