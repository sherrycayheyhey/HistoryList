package com.chromsicle.historylist;

/* todo
*   add the actual street address and update the list_item to have this next to the distance
*
*
*
* */

public class Location {

    /** Title of location */
    private String mName;

    /** Historic marker or point of interest */
    private String mType;

    /** Historic marker number or point of interest letter identifier */
    private String mId;

    /** Distance to location */
    private String mDistance;

    /** Visited status */
    private boolean mVisited;


    //********CONSTRUCTOR********
    public Location(String name, String type, String id, String distance) {
        mName = name;
        mType = type;
        mId = id;
        mDistance = distance;
        mVisited = false;
    }


    //********METHODS********

    /**
     * get the location name (the LocationAdapter class calls this to get the name)
     */
    public String getmName() {
        return mName;
    }

    /**
     * get the location type (the LocationAdapter class calls this to get the type)
     */
    public String getmType() {

        return  mType;
    }

    /**
     * get the location id (the LocationAdapter class calls this to get the id)
     */
    public String getmId() {
        return mId;
    }

    /**
     * get the distance to the location
     */
    public String getmDistance() {
        return mDistance;
    }

    /**
     * get the visited status
     */
    public boolean getmVisited() {
        return mVisited;
    }
}
