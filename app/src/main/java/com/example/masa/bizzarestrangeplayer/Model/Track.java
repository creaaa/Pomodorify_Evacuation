
package com.example.masa.bizzarestrangeplayer.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Track implements Serializable {

    @SerializedName("album")
    @Expose
    private Album album;

    @SerializedName("artists")
    @Expose
    private List<Artist> artists = null;

    @SerializedName("disc_number")
    @Expose
    private Integer discNumber;

    @SerializedName("duration_ms")
    @Expose
    private Integer durationMs;

    @SerializedName("explicit")
    @Expose
    private Boolean explicit;

    @SerializedName("external_ids")
    @Expose
    private ExternalIds externalIds;

    @SerializedName("external_urls")
    @Expose
    private ExternalUrls externalUrls;

    @SerializedName("href")
    @Expose
    private String href;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("is_playable")
    @Expose
    private Boolean isPlayable;

    @SerializedName("linked_from")
    @Expose
    private LinkedFrom linkedFrom;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("popularity")
    @Expose
    private Integer popularity;

    @SerializedName("preview_url")
    @Expose
    private String previewUrl;

    @SerializedName("track_number")
    @Expose
    private Integer trackNumber;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("uri")
    @Expose
    private String uri;




    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public Integer getDiscNumber() {
        return discNumber;
    }

    public void setDiscNumber(Integer discNumber) {
        this.discNumber = discNumber;
    }

    public Integer getDurationMs() {
        return durationMs;
    }

    public void setDurationMs(Integer durationMs) {
        this.durationMs = durationMs;
    }

    public Boolean getExplicit() {
        return explicit;
    }

    public void setExplicit(Boolean explicit) {
        this.explicit = explicit;
    }

    public ExternalIds getExternalIds() {
        return externalIds;
    }

    public void setExternalIds(ExternalIds externalIds) {
        this.externalIds = externalIds;
    }

    public ExternalUrls getExternalUrls() {
        return externalUrls;
    }

    public void setExternalUrls(ExternalUrls externalUrls) {
        this.externalUrls = externalUrls;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsPlayable() {
        return isPlayable;
    }

    public void setIsPlayable(Boolean isPlayable) {
        this.isPlayable = isPlayable;
    }

    public LinkedFrom getLinkedFrom() {
        return linkedFrom;
    }

    public void setLinkedFrom(LinkedFrom linkedFrom) {
        this.linkedFrom = linkedFrom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

}
