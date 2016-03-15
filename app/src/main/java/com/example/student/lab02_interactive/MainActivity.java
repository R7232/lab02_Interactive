package com.example.student.lab02_interactive;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int mQuantity = 0 ; //初始值(數量)
    private int mPrice = 5 ;    //初始值(價錢)



    private void displayQuantity(){            //輸出數量
        TextView quantityTextView = (TextView)findViewById(R.id.quantity_text_view) ; //取數量值
        quantityTextView.setText(String.valueOf(mQuantity));

    }
    public void submitOrder(View view) {

        displayTotalPrice();
    }
    private void displayTotalPrice(){          //輸出金額

        TextView priceTextView = (TextView)findViewById(R.id.price_text_view) ; //取金額值
        int total = mQuantity * mPrice ;

        String myString = NumberFormat.getCurrencyInstance().format(total) ; //轉NT


        String message = myString + (mQuantity == 0 ? "\nFree" : "\nThank you!") ;
        priceTextView.setText(message);
    }

    public void increment(View view){
        ++mQuantity ;
        displayQuantity();
        resetTotolPrice();
    }
    public void decrement(View view){
        --mQuantity ;
        displayQuantity();
        resetTotolPrice();
    }

    private void resetTotolPrice(){

        TextView priceTextView = (TextView)findViewById(R.id.price_text_view) ;
        priceTextView.setText("");
    }



   // private int getqua() {
   //     TextView qua = (TextView) findViewById(R.id.quantity_view); //數量
   //     String addstring = qua.getText().toString(); //轉String
   //     return Integer.parseInt(addstring); //轉INT
   // }
}
