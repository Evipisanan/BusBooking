package com.example.vipisanan.bus_booking;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {


  private GoogleMap mMap;
  LocationManager locationManager;
  LocationListener locationListener;

  String json_url = "http://192.168.1.101/sylukka/db/getdata.php";

  @Override
  protected void onCreate( Bundle savedInstanceState ) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_maps);
    // Obtain the SupportMapFragment and get notified when the map is ready to be used.
    SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
    mapFragment.getMapAsync(this);
    //getLocation();
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
  public void onMapReady( GoogleMap googleMap ) {
    mMap = googleMap;

    locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
    locationListener = new LocationListener() {
      @Override
      public void onLocationChanged( Location location ) {
        LatLng userLocation = new LatLng(location.getLatitude(), location.getLongitude());
        mMap.clear();
        mMap.addMarker(new MarkerOptions().position(userLocation).title("Marker in userLocation"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(userLocation));

        String getLatitudeS  = new Double(location.getLatitude()).toString();
        String getLongitudeS = new Double(location.getLongitude()).toString();

        if (location != null) {
          BackgroundTask backgroundTask = new BackgroundTask();
          backgroundTask.execute(getLatitudeS, getLongitudeS);

          getLocation(); // i have to write some code inside of getLocation(); for point of Location

          System.out.println(getLatitudeS + "/n" + getLongitudeS + "background method done*****************************");
        }
      }

      @Override
      public void onStatusChanged( String provider, int status, Bundle extras ) {

      }

      @Override
      public void onProviderEnabled( String provider ) {

      }

      @Override
      public void onProviderDisabled( String provider ) {

      }
    };
    if(Build.VERSION.SDK_INT > 23){
      locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0 , 0, locationListener);
    }else{
      if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED){
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION},1);
      }else{
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0 , 0,locationListener);

        Location lastKnowLocation = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        LatLng userLocation = new LatLng(lastKnowLocation.getLatitude(), lastKnowLocation.getLongitude());
        mMap.clear();
        mMap.addMarker(new MarkerOptions().position(userLocation).title("Your Location"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(userLocation));

      }
    }

  }

  class BackgroundTask extends AsyncTask<String,Void,String> //sent location to server
  {
    String add_url;
    @Override
    protected void onPreExecute() {
      add_url="http://192.168.1.101/sylukka/db/add_data.php"; // script details
    }
    @Override
    protected String doInBackground(String... args) {

      String Latitude, Longitude;
      Latitude=args[0];
      Longitude=args[1];



      try {
        URL url=new URL(add_url);
        HttpURLConnection httpURLConnection=(HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        OutputStream outputStream=httpURLConnection.getOutputStream();
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
        String data_string= URLEncoder.encode("latitude","UTF-8")+"="+URLEncoder.encode(Latitude,"UTF-8")+"&"+
          URLEncoder.encode("longitude","UTF-8")+"="+URLEncoder.encode(Longitude,"UTF-8");
        bufferedWriter.write(data_string);
        bufferedWriter.flush();
        bufferedWriter.close();
        outputStream.close();
        InputStream inputStream=httpURLConnection.getInputStream();
        inputStream.close();
        httpURLConnection.disconnect();
        return "One row is inserted";
      }


      catch (MalformedURLException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }

      return null;
    }

    @Override
    protected void onProgressUpdate(Void... values) {
      super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(String result) {
      Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
    }


  }

// get location from MySql
private void getLocation(){
  JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, json_url, null, new Response.Listener<JSONObject>() {
    @Override
    public void onResponse( JSONObject response ) {

      try {
        //response.getString("Name");
        System.out.println("longitude *************++++++++++++++++++++++************"+ response.getString("longitude"));
        System.out.println("latitude  *************++++++++++++++++++++++************"+ response.getString("latitude"));

      } catch (JSONException e) {
        e.printStackTrace();
      }

    }
  }, new Response.ErrorListener() {
    @Override
    public void onErrorResponse( VolleyError error ) {
      Toast.makeText(MapsActivity.this,"Something went worng",Toast.LENGTH_SHORT).show();
      error.printStackTrace();
    }
  });
  MySingleton.getmInstance(MapsActivity.this).addToRequest(jsonObjectRequest);
}


}
