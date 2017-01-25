package com.example.yangsiyoung.badwatchtest.data.heros.board;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-09-07.
 */

public class BoardData {

    @SerializedName("article_id")
    private String articleId;

    public void setArticleId(String articleId){
        this.articleId = articleId;
    }

    public String getArticleId(){
        return articleId;
    }

    @SerializedName("title")
    private String title;

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    @SerializedName("member_id")
    private String memberId;

    public void setMemberId(String memberId){
        this.memberId = memberId;
    }

    public String getMemberId(){
        return memberId;
    }

    @SerializedName("name")
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @SerializedName("comment_count")
    private String commentCount;

    public void setCommentCount(String commentCount){
        this.commentCount = commentCount;
    }

    public String getCommentCount(){
        return commentCount;
    }

    @SerializedName("hit_count")
    private String hitCount;

    public void setHitCount(String hitCount){
        this.hitCount = hitCount;
    }

    public String getHitCount(){
        return hitCount;
    }

    @SerializedName("like_count")
    private String likeCount;

    public void setLikeCount(String likeCount){
        this.likeCount = likeCount;
    }

    public String getLikeCount(){
        return likeCount;
    }

    @SerializedName("written_time")
    private String writtenTime;

    public void setWrittenTime(String writtenTime){
        this.writtenTime = writtenTime;
    }

    public String getWrittenTime(){
        return writtenTime;
    }

}
