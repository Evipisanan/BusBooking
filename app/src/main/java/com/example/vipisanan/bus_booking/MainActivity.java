package com.example.vipisanan.bus_booking;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
Spinner spinner ,spinner2; //for select country
  Button btngoSeat , try1;


  @Override
  protected void onCreate( Bundle savedInstanceState ) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

// for map open
    Button button = (Button) findViewById (R.id.btnMap);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        startActivity(new Intent(MainActivity.this, MapsActivity.class));
      }
    });

    Button btnL = (Button) findViewById(R.id.btnLogin);
    btnL.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick( View v ) {
       startActivity(new Intent(MainActivity.this, Login.class));
      }
    });


    spinner =(Spinner) findViewById(R.id.idSpinner);
    String[] citys  ={"Mullaitivu" , "Vavuniya" , "Killinochi" , "Ampra"};
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,citys);
    spinner.setAdapter(adapter);

    spinner2 =(Spinner) findViewById(R.id.idSpinnerTo);
    String[] citysTo  ={"colombo","Mullaitivu" , "Vavuniya" , "Killinochi" , "Ampra"};
    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,citysTo);
    spinner2.setAdapter(adapter2);


    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);


    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
    drawer.addDrawerListener(toggle);
    toggle.syncState();

    NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
    navigationView.setNavigationItemSelectedListener(this);
  }


  public void btnClickseat(View view){
    Intent i = new Intent(this , Buses.class);
    startActivity(i);
  }


  @Override
  public void onBackPressed() {
    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    if (drawer.isDrawerOpen(GravityCompat.START)) {
      drawer.closeDrawer(GravityCompat.START);
    } else {
      super.onBackPressed();
    }
  }

  @Override
  public boolean onCreateOptionsMenu( Menu menu ) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected( MenuItem item ) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }

  @SuppressWarnings("StatementWithEmptyBody")
  @Override
  public boolean onNavigationItemSelected( MenuItem item ) {
    // Handle navigation view item clicks here.
    int id = item.getItemId();

    if (id == R.id.id_buses) {
      // Handle the camera action

    } else if (id == R.id.nav_gallery) {
      Intent i2 = new Intent(this , Buses.class);
      startActivity(i2);

    } else if (id == R.id.nav_slideshow) {

    } else if (id == R.id.nav_manage) {

    } else if (id == R.id.nav_share) {

    } else if (id == R.id.nav_send) {

    }

    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    drawer.closeDrawer(GravityCompat.START);
    return true;
  }
}
