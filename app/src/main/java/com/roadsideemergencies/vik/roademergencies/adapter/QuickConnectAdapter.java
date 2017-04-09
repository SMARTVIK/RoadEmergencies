package com.roadsideemergencies.vik.roademergencies.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.roadsideemergencies.vik.roademergencies.R;
import com.roadsideemergencies.vik.roademergencies.activities.OpenBottomSheetListener;
import com.roadsideemergencies.vik.roademergencies.models.Contact;

import java.util.ArrayList;

/**
 * Created by vik on 9/4/17.
 */

public class QuickConnectAdapter extends RecyclerView.Adapter<QuickConnectAdapter.ViewHolder> {

    private ArrayList<Contact> contacts;
    private Context context;
    private OpenBottomSheetListener listener;

    public QuickConnectAdapter(ArrayList<Contact> contacts, Context context, OpenBottomSheetListener listener) {
        this.contacts = contacts;
        this.context = context;
        this.listener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Contact contact = contacts.get(position);
        holder.textViewName.setText(contact.getName());
        holder.textViewDistance.setText(contact.getPhoneNumber());
    }

    public void setDataItems(ArrayList<Contact> contacts){
        this.contacts =contacts;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName, textViewDistance;

        public ViewHolder(final View itemView) {
            super(itemView);
            textViewName = (TextView) itemView.findViewById(R.id.name);
            textViewDistance = (TextView) itemView.findViewById(R.id.distance);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        listener.openBottomSheet(getLayoutPosition());
                    }
                }
            });
        }
    }
}
