package com.example.yangsiyoung.badwatchtest.data.heros.board;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-09-17.
 */

public class BoardMoreData {

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

    @SerializedName("content")
    private String content;

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return  content;
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

    @SerializedName("board_type")
    private String boardType;

    public void setBoardType(String boardType){
        this.boardType = boardType;
    }

    public String getBoardType(){
        return boardType;
    }

    @SerializedName("written_time")
    private String writtenTime;

    public void setWrittenTime(String writtenTime){
        this.writtenTime = writtenTime;
    }

    public String getWrittenTime(){
        return writtenTime;
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

    @SerializedName("authentication")
    private boolean authentication;

    public void setAuthentication(boolean authentication){
        this.authentication = authentication;
    }

    public boolean getAuthentication(){
        return authentication;
    }

    @SerializedName("like_status")
    private boolean likeStatus;

    public void setLikeStatus(boolean likeStatus){
        this.likeStatus = likeStatus;
    }

    public boolean getLikeStatus(){
        return likeStatus;
    }

}
