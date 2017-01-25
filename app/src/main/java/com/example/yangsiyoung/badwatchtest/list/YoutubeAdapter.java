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
import com.example.yangsiyoung.badwatchtest.data.heros.youtube.YoutubeData;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Yang Si Young on 2016-11-02.
 */

public class YoutubeAdapter extends RecyclerView.Adapter<YoutubeAdapter.ViewHolder> {

    private Context context;
    private ArrayList<YoutubeData> arrayListOfYoutubeData;

    public YoutubeAdapter(ArrayList<YoutubeData> arrayListOfYoutubeData){
        this.arrayListOfYoutubeData = arrayListOfYoutubeData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View youtubeView = inflater.inflate(R.layout.layout_youtube, parent, false);
        ViewHolder viewHolder = new ViewHolder(youtubeView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(YoutubeAdapter.ViewHolder holder, int position) {

        YoutubeData youtubeData = arrayListOfYoutubeData.get(position);

        ImageView imgYoutube = holder.imgYoutube;
        TextView txtYoutubeTitle = holder.txtYoutubeTitle;
        TextView txtYoutubeUserViewCount = holder.txtYoutubeUserViewCount;

        try {
            Glide.with(context).load(youtubeData.getThumbnail()).into(imgYoutube);
        }catch (Exception e){
            Log.d("error", "Load Youtube Thumbnail error is " + e.toString());
        }

        txtYoutubeTitle.setText(youtubeData.getTitle());
        txtYoutubeUserViewCount.setText(youtubeData.getHitCount());

    }

    @Override
    public int getItemCount() {
        return arrayListOfYoutubeData.size();
    }

    public static class ViewHolder extends  RecyclerView.ViewHolder{

        public ImageView imgYoutube;
        public TextView txtYoutubeTitle;
        public TextView txtYoutubeUserViewCount;

        public ViewHolder(View itemView){
            super(itemView);

            imgYoutube = (ImageView) itemView.findViewById(R.id.imgYoutube);
            txtYoutubeTitle = (TextView) itemView.findViewById(R.id.txtYoutubeTitle);
            txtYoutubeUserViewCount = (TextView) itemView.findViewById(R.id.txtYoutubeUserViewCount);

        }
    }

}
