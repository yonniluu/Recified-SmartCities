package com.example.thedata_minors.recified.login.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Window;

import com.example.thedata_minors.recified.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class RecreationMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_recreation_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng surrey = new LatLng(49.1044 , -122.8011);

        LatLng Cloverdale_rec = new LatLng(49.1154 , -122.7344);
        LatLng Fleetwood_rec = new LatLng(49.1549575,-122.781846);
        LatLng Guildford_rec = new LatLng(49.1936 , -122.8026);
        LatLng Newton_rec = new LatLng(42.3549 , -71.1853);
        LatLng NorthSurrey_rec = new LatLng(49.1883 , -122.8489);
        LatLng SouthSurrey_rec = new LatLng(49.0400 , -122.8185);

        //Bitmap myBitmap = drawableToBitmap(myIcon);
        //BitmapDescriptor BitmapDesc = BitmapDescriptorFactory.fromBitmap(myBitmap);

        mMap.addMarker(new MarkerOptions().position(Cloverdale_rec).title("Cloverdale Recreation Centre"));
        mMap.addMarker(new MarkerOptions().position(Fleetwood_rec).title("Fleetwood Recreation Centre"));
        mMap.addMarker(new MarkerOptions().position(Guildford_rec).title("Guildford Recreation Centre"));
        mMap.addMarker(new MarkerOptions().position(Newton_rec).title("Newton Recreation Centre"));
        mMap.addMarker(new MarkerOptions().position(NorthSurrey_rec).title("North Surrey Recreation Centre"));
        mMap.addMarker(new MarkerOptions().position(SouthSurrey_rec).title("South Surrey Recreation Centre"));
        mMap.addMarker(new MarkerOptions().position(surrey).title("My Position"));

        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener()
        {

            @Override
            public boolean onMarkerClick(Marker m) {
                if(m.getTitle().equals("Cloverdale Recreation Centre")) { // if marker source is clicked
                    Intent startIntent = new Intent(getApplicationContext(), RecreationCentre.class);
                    startIntent.putExtra("Name","Cloverdale Recreation Centre");
                    startIntent.putExtra("Hours","Mon - Fri: 5:30am-10:00pm\n" +
                            "Sat & Sun: 8:00am-8:00pm\n" +
                            "Holidays: 8:00am-8:00pm");
                    startIntent.putExtra("Location","6188 176 St, Surrey, BC\n " +
                            "V3S 4E7");
                    startIntent.putExtra("Phone","604-598-7960");
                    startActivity(startIntent);
                }
                if(m.getTitle().equals("Fleetwood Recreation Centre")) { // if marker source is clicked
                    Intent startIntent = new Intent(getApplicationContext(), RecreationCentre.class);
                    startIntent.putExtra("Name","Fleetwood Recreation Centre");
                    startIntent.putExtra("Hours","Mon - Fri: 7:00am-10:00pm\n" +
                            "Sat & Sun: 8:00am-5:00pm\n" +
                            "Holidays: Closed");
                    startIntent.putExtra("Location","15996 - 84 Avenue, Surrey, BC V4N 0W1");
                    startIntent.putExtra("Phone","604-501-5030");
                    startActivity(startIntent);
                }
                if(m.getTitle().equals("Guildford Recreation Centre")) { // if marker source is clicked
                    Intent startIntent = new Intent(getApplicationContext(), RecreationCentre.class);
                    startIntent.putExtra("Name","Guildford Recreation Centre");
                    startIntent.putExtra("Hours","Mon - Fri: 6:00am-10:00pm\n" +
                            "Sat & Sun: 8:00am-8:00pm\n" +
                            "Holidays: 8:00am to 8:00pm");
                    startIntent.putExtra("Location","15105 - 105 Avenue, Surrey, BC  V3R 7G8");
                    startIntent.putExtra("Phone","604-502-6360");
                    startActivity(startIntent);
                }
                if(m.getTitle().equals("Newton Recreation Centre")) { // if marker source is clicked
                    Intent startIntent = new Intent(getApplicationContext(), RecreationCentre.class);
                    startIntent.putExtra("Name","Newton Recreation Centre");
                    startIntent.putExtra("Hours","Mon & Wed: 6:00am-10:00pm\n" +
                            "Tues & Thurs: 6:00am-9:30pm\n" +
                            "Fri & Sat: 6:00am-9:00pm\n" +
                            "Sun: 8:00am-8:00pm\n" +
                            "Holidays: 8:00am-8:00pm");
                    startIntent.putExtra("Location","13730 - 72 Avenue, Surrey, BC V3W 2P4");
                    startIntent.putExtra("Phone","604-501-5540");
                    startActivity(startIntent);
                }
                if(m.getTitle().equals("North Surrey Recreation Centre")) { // if marker source is clicked
                    Intent startIntent = new Intent(getApplicationContext(), RecreationCentre.class);
                    startIntent.putExtra("Name","North Surrey Recreation Centre");
                    startIntent.putExtra("Hours","Mon - Thurs: 6:00am-9:00pm\n" +
                            "Fri: 6:00am-10:00pm\n" +
                            "Sat: 7:00am-9:00pm\n" +
                            "Sun: 8:00am-9:00pm\n" +
                            "Holidays: 8:00am-8:00pm");
                    startIntent.putExtra("Location","10275 City Parkway, Surrey, BC V3T 4C3");
                    startIntent.putExtra("Phone","604-502-6300");
                    startActivity(startIntent);
                }
                if(m.getTitle().equals("South Surrey Recreation Centre")) { // if marker source is clicked
                    Intent startIntent = new Intent(getApplicationContext(), RecreationCentre.class);
                    startIntent.putExtra("Name","South Surrey Recreation Centre");
                    startIntent.putExtra("Hours","Mon - Fri: 6:00am-10:00pm\n" +
                            "Sat & Sun: 8:00am-8:00pm\n" +
                            "Holidays: 8:00am-8:00pm");
                    startIntent.putExtra("Location","14601 - 20 Avenue, Surrey, BC V4A 9P5");
                    startIntent.putExtra("Phone","604-592-6970");
                    startActivity(startIntent);
                }
                return true;
            }});
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(surrey,11));

    }
}
