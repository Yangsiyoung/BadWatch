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
import com.example.yangsiyoung.badwatchtest.data.heros.board.BoardCommentData;

import java.util.ArrayList;

import static com.example.yangsiyoung.badwatchtest.R.drawable.oval_4_path_71;

/**
 * Created by Yang Si Young on 2016-09-20.
 */

public class BoardCommentAdapter extends RecyclerView.Adapter<BoardCommentAdapter.ViewHolder>{

    private ArrayList<BoardCommentData> arrayListOfBoardCommentData;
    private Context context;

    public BoardCommentAdapter(ArrayList<BoardCommentData> arrayListOfCommentData){
        this.arrayListOfBoardCommentData = arrayListOfCommentData;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View boardCommentView = inflater.inflate(R.layout.layout_comment, parent, false);
        ViewHolder viewHolder = new ViewHolder(boardCommentView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        BoardCommentData boardCommentData = arrayListOfBoardCommentData.get(position);

        ImageView imgCommenterProfile = holder.imgCommenterProfile;
        TextView txtCommenterName = holder.txtCommenterName;
        TextView txtCommenterWriteDate = holder.txtCommenterWriteDate;
        TextView txtCommenterContent = holder.txtCommenterContent;

        try {
            if (boardCommentData.getAvatar() != null) {
                Glide.with(context).load(boardCommentData.getAvatar()).into(imgCommenterProfile);
            } else if (boardCommentData.getAvatar() == null) {
                Log.d("aaaa", "Commenter Profile is null");
                imgCommenterProfile.setImageResource(R.drawable.oval_4_path_71);

            }
            if (boardCommentData.getName() != null) {
                txtCommenterName.setText(boardCommentData.getName());
            } else if (boardCommentData.getName() == null) {
                txtCommenterName.setText("익명");
                Log.d("aaaa", "Commenter Name is null");
            }
            String writtenTime = boardCommentData.getWrittenTime();
            writtenTime = writtenTime.replace("T"," ");
            writtenTime = writtenTime.substring(0,19);
            txtCommenterWriteDate.setText(writtenTime);
            txtCommenterContent.setText(boardCommentData.getContent());

        }catch(Exception e){
            Log.d("error", "BoardCommentAdapter Error is " + e.toString());
        }
    }

    @Override
    public int getItemCount() {
        return arrayListOfBoardCommentData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imgCommenterProfile;
        public TextView txtCommenterName;
        public TextView txtCommenterWriteDate;
        public TextView txtCommenterContent;

        public ViewHolder(View itemView){
            super(itemView);

            imgCommenterProfile = (ImageView) itemView.findViewById(R.id.imgCommenterProfile);
            txtCommenterName = (TextView) itemView.findViewById(R.id.txtCommenterName);
            txtCommenterWriteDate = (TextView) itemView.findViewById(R.id.txtCommenterWriteDate);
            txtCommenterContent = (TextView) itemView.findViewById(R.id.txtCommenterContent);




        }
    }

}

