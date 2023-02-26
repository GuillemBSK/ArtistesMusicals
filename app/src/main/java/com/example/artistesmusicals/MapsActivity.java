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

    /**
     * Marcador a l'institut Jaume Huguet
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {

        LatLng institut = new LatLng(41.289558967903304, 1.2459889876953898);   //Posicio de l'institut
        googleMap.addMarker(new MarkerOptions().position(institut).title("Jaume Huguet").icon(BitmapDescriptorFactory.fromResource(R.drawable.pin))); //Personalitzacio del marcador
        googleMap.moveCamera(CameraUpdateFactory.zoomTo(17.0f)); //Fixem el zoom
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(institut));
        googleMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE); //Tipus de mapa
    }
}