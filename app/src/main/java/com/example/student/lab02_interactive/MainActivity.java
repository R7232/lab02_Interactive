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

    public void submitOrder(View view) {
        int a = getqua() ;
        dis(a);

    }

    private void dis(int a) {
        TextView sub = (TextView)findViewById(R.id.quantity_view); //數量ID
        sub.setText(String.valueOf(a));

        TextView pri = (TextView)findViewById(R.id.price); //總金額ID

        a = getqua() ;
        int b = 5 ;
        int total = a * b ;

        String nmstring = NumberFormat.getCurrencyInstance().format(total) ;
        pri.setText(nmstring); //轉金錢NT


    }


    public void add(View view) {
        int addint = getqua();
        addint ++ ;
        dis(addint);
    }

    public void abb(View view) {
        TextView abb = (TextView)findViewById(R.id.abb);
        int addint = getqua();

        if (addint > 0){
            addint -- ;
            dis(addint);
        }
    }


    private int getqua() {
        TextView qua = (TextView)findViewById(R.id.quantity_view); //數量
        String addstring = qua.getText().toString() ; //轉String
        return Integer.parseInt(addstring); //轉INT
    }
}
