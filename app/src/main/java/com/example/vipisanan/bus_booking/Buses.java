package com.example.vipisanan.bus_booking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Buses extends AppCompatActivity {
  ImageButton imgBtn1 ,imgBtn2,imgBtn3,imgBtn4,imgBtn5,imgBtn6,imgBtn7,imgBtn8,imgBtn9,imgBtn10,imgBtn11,imgBtn12,imgBtn13,imgBtn14,imgBtn15,imgBtn16,
    imgBtn17,imgBtn18,imgBtn19,imgBtn20,imgBtn21,imgBtn22,imgBtn23,imgBtn24,imgBtn25,imgBtn26,imgBtn27,imgBtn28;
  @Override
  protected void onCreate( Bundle savedInstanceState ) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_buses);

    imgBtn1 = (ImageButton) findViewById(R.id.btnS11);
    imgBtn2 = (ImageButton) findViewById(R.id.btnS12); //it's hide
    imgBtn3 = (ImageButton) findViewById(R.id.btnS13);
    imgBtn4 = (ImageButton) findViewById(R.id.btnS14);


    imgBtn5 = (ImageButton) findViewById(R.id.btnS21);
    imgBtn6 = (ImageButton) findViewById(R.id.btnS22);
    imgBtn7 = (ImageButton) findViewById(R.id.btnS23);
    imgBtn8 = (ImageButton) findViewById(R.id.btnS24);


    imgBtn9 = (ImageButton) findViewById(R.id.btnS31);
    imgBtn10 = (ImageButton) findViewById(R.id.btnS32);
    imgBtn11 = (ImageButton) findViewById(R.id.btnS33);
    imgBtn12 = (ImageButton) findViewById(R.id.btnS34);


    imgBtn13 = (ImageButton) findViewById(R.id.btnS41);
    imgBtn14 = (ImageButton) findViewById(R.id.btnS42);
    imgBtn15 = (ImageButton) findViewById(R.id.btnS43);
    imgBtn16 = (ImageButton) findViewById(R.id.btnS44);


    imgBtn17 = (ImageButton) findViewById(R.id.btnS51);
    imgBtn18 = (ImageButton) findViewById(R.id.btnS52);
    imgBtn19 = (ImageButton) findViewById(R.id.btnS53);
    imgBtn20 = (ImageButton) findViewById(R.id.btnS54);


    imgBtn21 = (ImageButton) findViewById(R.id.btnS61);
    imgBtn22 = (ImageButton) findViewById(R.id.btnS62);
    imgBtn23 = (ImageButton) findViewById(R.id.btnS63);
    imgBtn24 = (ImageButton) findViewById(R.id.btnS64);


    imgBtn25 = (ImageButton) findViewById(R.id.btnS71);
    imgBtn26 = (ImageButton) findViewById(R.id.btnS72);
    imgBtn27 = (ImageButton) findViewById(R.id.btnS73);
    imgBtn28 = (ImageButton) findViewById(R.id.btnS74);


  }

  public void onImageClickOneOne(View view){
    imgBtn1.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickOneTwo(View view){
    imgBtn3.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickOneThree(View view){
    imgBtn4.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickTwoOne(View view){
    imgBtn5.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickTwoTwo(View view){
    imgBtn6.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickTwoThree(View view){
    imgBtn7.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickTwoFour(View view){
    imgBtn8.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickThreeOne(View view){
    imgBtn9.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickThreeTwo(View view){
    imgBtn10.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickThreeThree(View view){
    imgBtn11.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickThreeFour(View view){
    imgBtn12.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickFourOne(View view){
    imgBtn13.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickFourTwo(View view){
    imgBtn14.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickFourThree(View view){
    imgBtn15.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickFourFour(View view){
    imgBtn16.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickFiveOne(View view){
    imgBtn17.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickFiveTwo(View view){
    imgBtn18.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickFiveThree(View view){
    imgBtn19.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickFiveFour(View view){
    imgBtn20.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickSixOne(View view){
    imgBtn21.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickSixTwo(View view){
    imgBtn22.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickSixThree(View view){
    imgBtn23.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickSixFour(View view){
    imgBtn24.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickSevenOne(View view){
    imgBtn25.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickSevenTwo(View view){
    imgBtn26.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickSevenThree(View view){
    imgBtn27.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }
  public void onImageClickSevenFour(View view){
    imgBtn28.setImageResource(R.drawable.seatclicked);
    //Toast.makeText(this,"Booked",Toast.LENGTH_SHORT).show();
  }

}
