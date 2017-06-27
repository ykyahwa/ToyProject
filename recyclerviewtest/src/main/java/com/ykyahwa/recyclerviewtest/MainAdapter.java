package com.ykyahwa.recyclerviewtest;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ehlee on 2017. 6. 27..
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ItemViewHolder> {
    private final String TAG = "MainAdapter";
    private List<String> items;

    public MainAdapter(List<String> items) {
        this.items = items;
    }

    @Override
    public MainAdapter.ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder position = " +position);
        holder.tvText.setText(items.get(position));
    }

    @Override
    public void onViewRecycled(ItemViewHolder holder) {
        Log.d(TAG, "onViewRecycled");
        super.onViewRecycled(holder);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView tvText;

        public ItemViewHolder(View itemView) {
            super(itemView);
            tvText = (TextView) itemView.findViewById(R.id.ITEM_TV_TEXT);
        }
    }
}
