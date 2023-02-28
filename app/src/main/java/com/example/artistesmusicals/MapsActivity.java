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
        //MOSTREM EL LAYOUT DEL MAPS
        setContentView(R.layout.activity_map);
        // OBTENIM EL SupportMapFragment I ES MOSTRA UN MISSATGE QUAN ESTIGUI LLEST
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        //ASSIGNEM LES CORDENADES DEL INSTITUT
        LatLng institut = new LatLng(41.289558967903304, 1.2459889876953898);
        //AFEGIM L'ICONO A LES CORDENADES ANTERIORS I POSEM EL NOM DEL LLOC
        googleMap.addMarker(new MarkerOptions().position(institut).title("Jaume Huguet").icon(BitmapDescriptorFactory.fromResource(R.drawable.pin_azul)));

        //ASSIGNEM LES CORDENADES DE MADRID
        LatLng madrid = new LatLng(40.4167047, -3.7035825);
        //AFEGIM L'ICONO A LES CORDENADES ANTERIORS I POSEM EL NOM DEL LLOC
        googleMap.addMarker(new MarkerOptions().position(madrid).title("Madrid").icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));

        //ASSIGNEM LES CORDENADES DE BARCELONA
        LatLng barcelona = new LatLng(41.3828939, 2.1774322);
        //AFEGIM L'ICONO A LES CORDENADES ANTERIORS I POSEM EL NOM DEL LLOC
        googleMap.addMarker(new MarkerOptions().position(barcelona).title("Barcelona").icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));

        //ASSIGNEM LES CORDENADES DE PARIS
        LatLng paris = new LatLng(48.8588897, 2.320041);
        //AFEGIM L'ICONO A LES CORDENADES ANTERIORS I POSEM EL NOM DEL LLOC
        googleMap.addMarker(new MarkerOptions().position(paris).title("Paris").icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));

        //ASSIGNEM LES CORDENADES DE BERLIN
        LatLng berlin = new LatLng(52.5170365, 13.3888599);
        //AFEGIM L'ICONO A LES CORDENADES ANTERIORS I POSEM EL NOM DEL LLOC
        googleMap.addMarker(new MarkerOptions().position(berlin).title("Berlin").icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));

        //FIXEM EL ZOOM DEL MAPA
        googleMap.moveCamera(CameraUpdateFactory.zoomTo(5.0f));

        //POSEM LES CORDENADES QUE ES MOSTRARA A OBRIR EL MAPS
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(institut));

        //TIPUSDE MAPA
        googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

    }
}