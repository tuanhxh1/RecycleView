package com.example.tuan.recycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {
    private Context mContext;
    private List<item> mData;

    public Adapter(Context context, List<item> data) {
        mContext = context;
        mData = data;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(R.layout.card_item, viewGroup, false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder myViewHolder, int i) {

        myViewHolder.img_background.setImageResource(mData.get(i).getBackground());
        myViewHolder.tv_title.setText(mData.get(i).getCardName());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        private ImageView img_background;
        private TextView tv_title;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            img_background = itemView.findViewById(R.id.card_background);
            tv_title = itemView.findViewById(R.id.tv_title);



        }
    }


}
