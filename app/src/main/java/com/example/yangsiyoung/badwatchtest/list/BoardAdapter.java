package com.example.yangsiyoung.badwatchtest.list;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.yangsiyoung.badwatchtest.R;
import com.example.yangsiyoung.badwatchtest.data.heros.board.BoardData;

import java.util.ArrayList;

/**
 * Created by Yang Si Young on 2016-09-07.
 */

public class BoardAdapter extends RecyclerView.Adapter<BoardAdapter.ViewHolder> {

    private ArrayList<BoardData> arrayListOfBoardData;
    public BoardAdapter(ArrayList<BoardData> arrayListOfBoardData){
        this.arrayListOfBoardData = arrayListOfBoardData;
    };

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View boardView = inflater.inflate(R.layout.layout_board_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(boardView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        BoardData boardData = arrayListOfBoardData.get(position);

        TextView txtBoardTitle = holder.txtBoardTitle;
        TextView txtWriterName = holder.txtWriterName;
        //TextView txtView = holder.txtView;
        TextView txtViewCount = holder.txtViewCount;
        TextView txtLikeCount = holder.txtLikeCount;

        txtBoardTitle.setText(boardData.getTitle());
        if(boardData.getName() != null){
            txtWriterName.setText(boardData.getName());
        }else if(boardData.getName() == null) {
            txtWriterName.setText("익명");
        }

        txtViewCount.setText(boardData.getHitCount());
        txtLikeCount.setText(boardData.getLikeCount());
        //txtBoardTitle.setPadding(0,0,txtView.getMeasuredWidth()+txtViewCount.getMeasuredWidth(),0);

    }

    @Override
    public int getItemCount() {
        return arrayListOfBoardData.size();
    }

    public static class ViewHolder extends  RecyclerView.ViewHolder {

        public TextView txtBoardTitle;
        public TextView txtWriterName;
        public TextView txtView;
        public TextView txtViewCount;
        public TextView txtLikeCount;

        public ViewHolder(View itemView) {
            super(itemView);

            txtBoardTitle = (TextView) itemView.findViewById(R.id.txtBoardTitle);
            txtWriterName = (TextView) itemView.findViewById(R.id.txtWriterName);
            txtView = (TextView) itemView.findViewById(R.id.txtView);
            txtViewCount = (TextView) itemView.findViewById(R.id.txtViewCount);
            txtLikeCount = (TextView) itemView.findViewById(R.id.txtLikeCount);
        }


    }
    }

