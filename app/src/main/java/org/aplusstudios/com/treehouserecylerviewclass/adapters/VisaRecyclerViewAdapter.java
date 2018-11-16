package org.aplusstudios.com.treehouserecylerviewclass.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import org.aplusstudios.com.treehouserecylerviewclass.R;
import org.aplusstudios.com.treehouserecylerviewclass.databinding.HouseItemLayoutBinding;
import org.aplusstudios.com.treehouserecylerviewclass.viewModel.Visa;

import java.util.List;

public class VisaRecyclerViewAdapter extends RecyclerView.Adapter<VisaRecyclerViewAdapter.ViewHolder> {

    private List<Visa> visaList;
    private Context context;

    public VisaRecyclerViewAdapter(Context context, List<Visa> visaList){
        this.context = context;
        this.visaList = visaList;
    }

    @NonNull
    @Override
    public VisaRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        HouseItemLayoutBinding houseItemLayoutBinding = DataBindingUtil
                .inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.house_item_layout,
                        parent,
                        false);

        return new ViewHolder(houseItemLayoutBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.houseItemLayoutBinding.setVisa(visaList.get(position));
    }

    @Override
    public int getItemCount() {
        return visaList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public HouseItemLayoutBinding houseItemLayoutBinding;

        public ViewHolder(@NonNull HouseItemLayoutBinding itemLayoutBinding) {
            super(itemLayoutBinding.getRoot());
            houseItemLayoutBinding = itemLayoutBinding;
        }
    }
}
