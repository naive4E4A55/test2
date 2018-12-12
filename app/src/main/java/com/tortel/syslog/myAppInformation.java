package com.tortel.syslog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class myAppInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_information);
    }

    public void myAppOnClick_1(View view) {
    }

    public int getAppSource(int x,int y){
        if(y!=0){
            int z=x/y;
            int w=x*y;
            return z+w;
        }
        else{
            return 2*x;
        }
    }

    public int getFib(int x){
        if(x<=0)return 0;
        if(x==1||x==2)return 1;
        int fib1=1,fib2=1;
        for(int i=2;i<x;i++){
            int y=fib1+fib2;
            fib1=fib2;
            fib2=y;
        }
        return fib2;
    }

    public boolean isPrimeNumber(int x){
        if(x<2)return false;
        for(int i=2;i<x-1;i++)
            if(x%i==0)return false;
        return true;
    }

    public int maxPrime(int x){
        for(int i=x;i>2;i--)
            if(isPrimeNumber(i))return i;
        return 0;
    }

    public int getDis(int x1,int y1,int x2,int y2){
        return (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
    }
}
