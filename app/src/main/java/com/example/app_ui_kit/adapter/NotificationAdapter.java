package com.example.app_ui_kit.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app_ui_kit.R;
import com.example.app_ui_kit.model.NotificationModel;

import java.util.List;


public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.ViewHolder> {

    private Context context;
    private List<NotificationModel> notificationModels;

    public NotificationAdapter(Context context, List<NotificationModel> notificationModels) {
        this.context = context;
        this.notificationModels = notificationModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        NotificationModel notificationModel = notificationModels.get(position);
        if (notificationModel != null) {
            holder.ivImg.setImageResource(notificationModel.getImage());
            holder.tvName.setText(notificationModel.getName());
            holder.tvName.setText(notificationModel.getTime());
            holder.tvName.setText(notificationModel.getTitle());
        }
    }

    @Override
    public int getItemCount() {
        if (notificationModels == null) {
            return 0;
        }
        return notificationModels.size();
//        return notificationModels == null ? 0 : notificationModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivAvt, ivImg;
        TextView tvTitle, tvTime, tvName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivAvt = itemView.findViewById(R.id.ivAvt);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvTime = itemView.findViewById(R.id.tvTime);
            tvName = itemView.findViewById(R.id.tvName);
            ivImg = itemView.findViewById(R.id.img1);
        }
    }
}