package com.example.android.viewpager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(@NonNull Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView name = (TextView)listItemView.findViewById(R.id.name);
        name.setText(currentPlace.getName());

        TextView location = (TextView)listItemView.findViewById(R.id.location);
        location.setText(currentPlace.getLocation());

        TextView contact = (TextView)listItemView.findViewById(R.id.contact);
        contact.setText(currentPlace.getContact());

        ImageView image = (ImageView)listItemView.findViewById(R.id.image);
        image.setImageResource(currentPlace.getImage());

        return listItemView;
    }
}
