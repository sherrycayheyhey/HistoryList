package com.chromsicle.historylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        //ArrayList for list of Location objects
        //ArrayList is the better structure here because locations might eventually be added or deleted
        //words has to be final so that you can use it to get it in the onItemClickListener below
        final ArrayList<Location> locations = new ArrayList<Location>();
        //add locations to the list, these are Location objects being created
        locations.add(new Location("Sixteen Mile House", "Historic Marker", "#1", "2.7"));
        locations.add(new Location("Mills Mansion", "Historic Marker", "#2", "3.7"));
        locations.add(new Location("Southern Pacific Depot", "Historic Marker", "#3", "0.7"));
        locations.add(new Location("Millbrae Museum", "Historic Marker", "#4", "2.4"));
        locations.add(new Location("Alfred F Green House", "Historic Marker", "#5", "7.7"));
        locations.add(new Location("Dunphy Mansion", "Historic Marker", "#6", "3.45"));
        locations.add(new Location("Our Lady of Lebanon Catholic Church", "Historic Marker", "#7", "1.7"));
        locations.add(new Location("Massolo Building", "Historic Marker", "#8", "2.6"));
        locations.add(new Location("Original Millbrae Firehouse", "Historic Marker", "#9", "9.9"));
        locations.add(new Location("Taylor Middle School", "Historic Marker", "#10", "2.1"));

        //create a LocationAdapter whose data source is an ArrayList of Location objects, as created above, and named locations
        //the adapter creates layouts for each item in the list by using the layout resource defined in the list_item.xml file
        //this layout contains TextViews (and an image) which the custom adapter (LocationAdapter) will
        // set to display the two words (and image)
        //the 3 things passed in here are the context (this = NumbersActivity), the ArrayList of words
        LocationAdapter adapter = new LocationAdapter(this, locations);
        //find the ListView object (ListView with id "list") from the location_list.xml
        ListView listView = (ListView) findViewById(R.id.list);
        //make the listView use the ArrayAdapter created above so the ListView will display the list items
        //for each Location object in the ArrayList (locations), aka, associate the ListView with the ArrayAdapter
        listView.setAdapter(adapter);
    }
}