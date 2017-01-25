package com.example.yangsiyoung.badwatchtest.list;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.yangsiyoung.badwatchtest.R;
import com.example.yangsiyoung.badwatchtest.data.heros.youtube.YoutubeCommentData;

import java.util.ArrayList;

/**
 * Created by Yang Si Young on 2016-11-15.
 */

public class YoutubeCommentAdapter extends RecyclerView.Adapter<YoutubeCommentAdapter.ViewHolder> {

    private ArrayList<YoutubeCommentData> arrayListOfYoutubeCommentData;
    private Context context;

    public YoutubeCommentAdapter(ArrayList<YoutubeCommentData> arrayListOfYoutubeCommentData){
        this.arrayListOfYoutubeCommentData = arrayListOfYoutubeCommentData;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View youtubeView = inflater.inflate(R.layout.layout_youtube_comment, parent, false);
        ViewHolder viewHolder = new ViewHolder(youtubeView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        YoutubeCommentData youtubeCommentData = arrayListOfYoutubeCommentData.get(position);

        ImageView imgYoutubeCommenterProfile = holder.imgYoutubeCommenterProfile;
        TextView txtYoutubeCommenterName = holder.txtYoutubeCommenterName;
        TextView txtYoutubeCommenterWriteDate = holder.txtYoutubeCommenterWriteDate;
        TextView txtYoutubeCommenterContent = holder.txtYoutubeCommenterContent;
        try {
            if(youtubeCommentData.getAvatar() != null) {

                    Glide.with(context).load(youtubeCommentData.getAvatar()).into(imgYoutubeCommenterProfile);
            } else{
                    imgYoutubeCommenterProfile.setImageResource(R.drawable.oval_4_path_71);
            }
        } catch (Exception e) {
            Log.d("error", "Youtube Commenter Profile Glide Load Error is " + e.toString());
        }

        if(youtubeCommentData.getName() != null){
            txtYoutubeCommenterName.setText(youtubeCommentData.getName());
        } else if(youtubeCommentData.getName() == null){
            txtYoutubeCommenterName.setText("익명");
        }
        String youtubeCommenterWriteDate = youtubeCommentData.getWrittenTime().substring(0,9) + " " + youtubeCommentData.getWrittenTime().substring(11,18);
        txtYoutubeCommenterWriteDate.setText(youtubeCommenterWriteDate);
        txtYoutubeCommenterContent.setText(youtubeCommentData.getContent());

    }

    @Override
    public int getItemCount() {
        return arrayListOfYoutubeCommentData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imgYoutubeCommenterProfile;
        public TextView txtYoutubeCommenterName;
        public TextView txtYoutubeCommenterWriteDate;
        public TextView txtYoutubeCommenterContent;

        public ViewHolder(View itemView){
            super(itemView);

            imgYoutubeCommenterProfile = (ImageView) itemView.findViewById(R.id.imgYoutubeCommenterProfile);
            txtYoutubeCommenterName = (TextView) itemView.findViewById(R.id.txtYoutubeCommenterName);
            txtYoutubeCommenterWriteDate = (TextView) itemView.findViewById(R.id.txtYoutubeCommenterWriteDate);
            txtYoutubeCommenterContent = (TextView) itemView.findViewById(R.id.txtYoutubeCommenterContent);

        }
    }
}
