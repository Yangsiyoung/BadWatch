package com.example.yangsiyoung.badwatchtest.data.heros.youtube;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Yang Si Young on 2016-11-02.
 */

public class YoutubeData implements Serializable {

    @SerializedName("youtube_id")
    String youtubeId;

    public void setYoutubeId(String youtubeId){
        this.youtubeId = youtubeId;
    }

    public String getYoutubeId(){
        return youtubeId;
    }

    @SerializedName("title")
    String title;

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    @SerializedName("content")
    String content;

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return content;
    }

    @SerializedName("member_id")
    String memberId;

    public void setMemberId(String memberId){
        this.memberId = memberId;
    }

    public String getMemberId(){
        return memberId;
    }

    @SerializedName("name")
    String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @SerializedName("avatar")
    String avatar;

    public void setAvatar(String avatar){
        this.avatar = avatar;
    }

    public String getAvatar(){
        return avatar;
    }

    @SerializedName("youtube_key")
    String youtubeKey;

    public void setYoutubeKey(String youtubeKey){
        this.youtubeKey = youtubeKey;
    }

    public String getYoutubeKey(){
        return youtubeKey;
    }

    @SerializedName("thumbnail")
    String thumbnail;

    public void setThumbnail(String thumbnail){
        this.thumbnail = thumbnail;
    }

    public String getThumbnail(){
        return thumbnail;
    }

    @SerializedName("comment_count")
    String commentCount;

    public void setCommentCount(String commentCount){
        this.commentCount = commentCount;
    }

    public String getCommentCount(){
        return commentCount;
    }

    @SerializedName("hit_count")
    String hitCount;

    public void setHitCount(String hitCount){
        this.hitCount = hitCount;
    }

    public String getHitCount(){
        return hitCount;
    }

    @SerializedName("like_count")
    String likeCount;

    public void setLikeCount(String likeCount){
        this.likeCount = likeCount;
    }

    public String getLikeCount(){
        return likeCount;
    }

    @SerializedName("written_time")
    String writtenTime;

    public void setWrittenTime(String writtenTime){
        this.writtenTime = writtenTime;
    }

    public String getWrittenTime(){
        return writtenTime;
    }

    @SerializedName("authentication")
    boolean authentication;

    public void setAuthentication(boolean authentication){
        this.authentication = authentication;
    }

    public boolean getAuthentication(){
        return authentication;
    }

    @SerializedName("like_status")
    boolean likeStatus;

    public void setLikeStatus(boolean likeStatus){
        this.likeStatus = likeStatus;
    }

    public boolean getLikeStatus(){
        return likeStatus;
    }
}
