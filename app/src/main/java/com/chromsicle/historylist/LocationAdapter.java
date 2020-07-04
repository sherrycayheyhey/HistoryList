package com.chromsicle.historylist;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//Word adapter inherits (extends) from the ArrayAdapter class and this WordAdapter class is also
//customized to expect the data source to be a list of Location objects because <Location> is added to the class declaration
public class LocationAdapter extends ArrayAdapter<Location> {

    //constructor
    //the context is the current context, used to inflate the layout file
    //the list the the data wanted to populate into the lists, a list of Location objects to display in a list
    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        //the constructor from ArrayAdapter is being called (super())
        //here the ArrayAdapter's internal storage for the context and the list are initialized
        //the second argument is used when the ArrayAdapter is populating a single TextView
        //since this is a custom adapter for the custom list_item, the adapter isn't going
        //to use this second argument so it can be any any value (we chose 0)
        super(context, 0, locations);
    }


    //override the getView method so we can use more than one TextView to make populate the ListView
    /**
     * this provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //get the {@link Word} object located at this position in the list
        Location currentLocation = getItem(position);

        //find the TextView in the list_item.xml layout for location name
        TextView locationTextView = listItemView.findViewById(R.id.location_title);
        //get the location name from the current Location object and set the text on the location TextView
        locationTextView.setText(currentLocation.getmName());

        //find the TextView for the location type, get the type, and set the text
        TextView typeTextView = listItemView.findViewById(R.id.location_type);
        typeTextView.setText(currentLocation.getmType());

        //find the TextView for the location id, get the id, and set the text
        TextView idTextView = listItemView.findViewById(R.id.location_id);
        idTextView.setText(currentLocation.getmId());

        //find the TextView for the distance to the location, get the distance, and set the text
        TextView distanceTextView = listItemView.findViewById(R.id.distance);
        distanceTextView.setText(currentLocation.getmDistance());

        return listItemView;
    }
}
