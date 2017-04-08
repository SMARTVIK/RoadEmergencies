package com.roadsideemergencies.vik.roademergencies;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ItemViewHolder>{

    private ArrayList<MapsModel.ResultsBean> listOfWithdraw;
    private Context context;

    //TODO this adapter can be used for withdraws also
    public Adapter(ArrayList<MapsModel.ResultsBean> listOfWithdraw) {
        this.listOfWithdraw = listOfWithdraw;
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
                    Intent intent = new Intent(itemView.getContext(), MapsActivity.class);
                    MapsModel.ResultsBean resultsBean = listOfWithdraw.get(getLayoutPosition());
                    intent.putExtra("lat", resultsBean.getGeometry().getLocation().getLat() + "");
                    intent.putExtra("lang", resultsBean.getGeometry().getLocation().getLng() + "");
                    intent.putExtra("name", resultsBean.getName());
                    intent.putExtra("rating", resultsBean.getRating() + "");
                    intent.putExtra("open_now", resultsBean.getOpening_hours()!=null ? resultsBean.getOpening_hours().isOpen_now():false);
                    itemView.getContext().startActivity(intent);
                }
            });

        }
    }

}
