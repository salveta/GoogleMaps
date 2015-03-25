package com.example.googlemaps.googlemaps;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;



public class LUserInfoWindowsAdapter implements GoogleMap.InfoWindowAdapter {


    LayoutInflater inflater = null;

    LUserInfoWindowsAdapter(LayoutInflater inflater){
        this.inflater = inflater;
    }



    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        View infoWindows = inflater.inflate(R.layout.user_info_windows_adapter, null);

        TextView title = (TextView)infoWindows.findViewById(R.id.title);
        TextView description = (TextView)infoWindows.findViewById(R.id.snippet);

        title.setText(marker.getTitle());
        description.setText(marker.getSnippet());
        return (infoWindows);
    }
}