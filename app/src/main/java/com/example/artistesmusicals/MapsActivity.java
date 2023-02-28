package com.example.artistesmusicals;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        LatLng institut = new LatLng(41.289558967903304, 1.2459889876953898);
        googleMap.addMarker(new MarkerOptions().position(institut).title("Jaume Huguet").icon(BitmapDescriptorFactory.fromResource(R.drawable.pin_azul)));

        LatLng madrid = new LatLng(40.4167047, -3.7035825);
        googleMap.addMarker(new MarkerOptions().position(madrid).title("Madrid").icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));

        LatLng barcelona = new LatLng(41.3828939, 2.1774322);
        googleMap.addMarker(new MarkerOptions().position(barcelona).title("Barcelona").icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));

        LatLng paris = new LatLng(48.8588897, 2.320041);
        googleMap.addMarker(new MarkerOptions().position(paris).title("Paris").icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));

        LatLng berlin = new LatLng(52.5170365, 13.3888599);
        googleMap.addMarker(new MarkerOptions().position(berlin).title("Berlin").icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));

        googleMap.moveCamera(CameraUpdateFactory.zoomTo(5.0f)); //Fixem el zoom
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(institut));
        googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID); //Tipus de mapa

    }
}