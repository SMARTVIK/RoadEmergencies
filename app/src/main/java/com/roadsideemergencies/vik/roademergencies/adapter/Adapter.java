package com.roadsideemergencies.vik.roademergencies.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.roadsideemergencies.vik.roademergencies.R;
import com.roadsideemergencies.vik.roademergencies.utils.Utility;
import com.roadsideemergencies.vik.roademergencies.models.MapsModel;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ItemViewHolder>{

    private ArrayList<MapsModel.ResultsBean> listOfWithdraw;
    private Context context;

    //TODO this adapter can be used for withdraws also
    public Adapter(ArrayList<MapsModel.ResultsBean> listOfWithdraw,Context context) {
        this.listOfWithdraw = listOfWithdraw;
        this.context = context;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.withdraw_items, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.textViewName.setText(listOfWithdraw.get(position).getName());
        holder.textViewDistance.setText(listOfWithdraw.get(position).getGeometry().getLocation().getLat() + " ," + listOfWithdraw.get(position).getGeometry().getLocation().getLng());
    }

    @Override
    public int getItemCount() {
        return listOfWithdraw.size();
    }

    public void setItems(ArrayList<MapsModel.ResultsBean> listOfWithdraws) {
        this.listOfWithdraw = listOfWithdraws;
        notifyDataSetChanged();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName, textViewDistance;

        public ItemViewHolder(final View itemView) {
            super(itemView);
            textViewName = (TextView) itemView.findViewById(R.id.name);
            textViewDistance = (TextView) itemView.findViewById(R.id.distance);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MapsModel.ResultsBean resultsBean = listOfWithdraw.get(getLayoutPosition());
                    Utility.getPlaceDetails(resultsBean.getPlace_id(),context);
                }
            });

        }
    }

}
