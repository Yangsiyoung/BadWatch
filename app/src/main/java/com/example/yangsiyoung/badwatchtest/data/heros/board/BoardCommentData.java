package com.example.yangsiyoung.badwatchtest.data.heros.board;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Yang Si Young on 2016-09-20.
 */

public class BoardCommentData {

    @SerializedName("comment_id")
    private String commentId;

    public void setCommentId(String commentId){
        this.commentId = commentId;
    }

    public String getCommentId(){
        return commentId;
    }

    @SerializedName("content")
    private String content;

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return content;
    }

    @SerializedName("reply_count")
    private String replyCount;

    public void setReplyCount(String replyCount){
        this.replyCount = replyCount;
    }

    public String getReplyCount(){
        return  replyCount;
    }

    @SerializedName("avatar")
    private String avatar;

    public void setAvatar(String avatar){
        this.avatar = avatar;
    }

    public String getAvatar(){
        return avatar;
    }

    @SerializedName("name")
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
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
