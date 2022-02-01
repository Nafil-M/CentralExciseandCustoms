package com.example.centralexciseandcustoms;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OfficialDetailsAdapter extends RecyclerView.Adapter<OfficialDetailsAdapter.OfficialDetailsViewHolder> {

    private Context mContext;

    public OfficialDetailsAdapter( Context context) {
        mContext = context;
    }

    @NonNull
    @Override
    public OfficialDetailsAdapter.OfficialDetailsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_table, parent, false);

        return new OfficialDetailsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull OfficialDetailsAdapter.OfficialDetailsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class OfficialDetailsViewHolder extends RecyclerView.ViewHolder {

        public OfficialDetailsViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
