package com.example.app_ui_kit.adapter;

import  android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app_ui_kit.DiscoverModel;
import com.example.app_ui_kit.R;

import java.util.ArrayList;

public class DiscoverAdapter extends RecyclerView.Adapter<DiscoverAdapter.ViewHolder> {

    Context context;
    ArrayList<DiscoverModel> discoverModels;

    public DiscoverAdapter(Context context, ArrayList<DiscoverModel> discoverModels) {
        this.context = context;
        this.discoverModels = discoverModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DiscoverModel discoverModel = discoverModels.get(position);
        holder.ivAvt.setImageResource(discoverModel.getImage());
        holder.tvTitle.setText(discoverModel.getTitle());
        holder.tvTime.setText(discoverModel.getTime() + "  |");
        holder.tvName.setText(discoverModel.getName());
    }

    @Override
    public int getItemCount() {
        return discoverModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivAvt;
        TextView tvTitle, tvTime, tvName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivAvt = itemView.findViewById(R.id.ivAvt);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvTime = itemView.findViewById(R.id.tvTime);
            tvName = itemView.findViewById(R.id.tvName);

        }
    }
}
