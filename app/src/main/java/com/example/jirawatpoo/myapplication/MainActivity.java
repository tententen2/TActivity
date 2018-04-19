package com.example.jirawatpoo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int height = 5;
    int width = 10;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //        startActivity(new Intent(this, com.ascend.trueyourseller.MainActivity.class));





//        loopja(3);
////        loopja2(10);
////        loopja3(1);
////        printRec3();
//    }
//
//    public void loopja(int loop){
//        String[][] myResult = new String[height*loop+10][width*loop+10];
//        for (int i = 0; i < loop; i++) {
//            printRec(myResult,loop,(3*i),i);
//        }
//
//        for(int i=0;i<height*loop+1;i++) {
//            for (int j = 0; j < width*loop+1; j++) {
//                if(myResult[i][j] == null){
//                    myResult[i][j] = " ";
//                }
//                System.out.print(myResult[i][j]);
//            }
//            System.out.println();
//        }
//    }
//
//    public void printRec(String[][] myResult,  int loop, int currentDiscount,int ff){
//        int ss = 0;
//        int aka = 0;
//        myResult[currentDiscount][width*loop/2] = "*";
//        for(int i=1+(currentDiscount);i<height*loop+1;i++){
//            for(int j=0;j<width*loop+1;j++){
//                if(j == (width*loop/2-i+currentDiscount)){
//                    myResult[i][j] = "*";
//                    aka = j;
//                }else if(j == (width*loop/2+i-currentDiscount)){
//                    myResult[i][j] = "*";
//                    ss = j;
//                }
//                if(i == height*loop-ff && j == (width*loop/2+i-currentDiscount) && ff > 0){
//                    myResult[i][j] = " ";
//                }
//                if(i == height*loop-(ff+ff) && j >= aka+3 && j <= ss){
//                    myResult[i][j] = "*";
//                }
//            }
//        }
//

    }

//
//
//
//    public void loopja2(int loop){
//        String[][] myResult = new String[height*loop+10][width*loop+10];
//        for (int i = 0; i < loop; i++) {
//            printRec2(myResult,loop,(3*i),i);
//        }
//
//        for(int i=0;i<height*loop+1;i++) {
//            for (int j = 0; j < width*loop+1; j++) {
//                if(myResult[i][j] == null){
//                    myResult[i][j] = " ";
//                }
//                System.out.print(myResult[i][j]);
//            }
//            System.out.println();
//        }
//    }
//
//    public void printRec2(String[][] myResult,  int loop, int currentDiscount,int ff){
//        int ss = 0;
//        int aka = 0;
//        myResult[currentDiscount][width*loop/2] = "*";
//        for(int i=1+(currentDiscount);i<height*loop+1;i++){
//            for(int j=0;j<width*loop+1;j++){
//                if(j == (width*loop/2-i+currentDiscount)){
//                    myResult[i][j] = "*";
//                    aka = j;
//
//                }else if(j == (width*loop/2+i-currentDiscount)){
//                    myResult[i][j] = "*";
//                    ss = j;
//                }
//
//                if(i == height*loop-ff && j >= aka && j <= ss-3){
//                    myResult[i][j] = "*";
//                }
//            }
//        }
//
//    }
//    public void loopja3(int loop){
//        String[][] myResult = new String[height*loop+10][width*loop+10];
//        for (int i = 0; i < loop; i++) {
////            printRec3(myResult,loop,(3*i),i);
//        }
//
//        for(int i=0;i<height*loop+1;i++) {
//            for (int j = 0; j < width*loop+1; j++) {
//                if(myResult[i][j] == null){
//                    myResult[i][j] = " ";
//                }
//                System.out.print(myResult[i][j]);
//            }
//            System.out.println();
//        }
//    }
//
//    public void printRec3(){
//        int height = 10;
//        int width = 5;
//        int sum = 0;
//        String[][] mm = new String[11][6];
//
//        for (int i = 0; i <= height; i++) {
//            for (int j = 0; j <= width; j++) {
//
//                if((i >2) || (i == 0) && j == width){
//                    mm[i][j] = "*";
//                }
//                if(sum == i && sum <5){
//                    mm[sum%5][j] = "*";
//                    sum++;
//                }
//
//            }
//        }
//
//        for(int i = 0; i <= height;i++) {
//            for (int j = 0; j <= width; j++) {
//                if(mm[i][j] == null){
//                    mm[i][j] = " ";
//                }
//                System.out.print(mm[i][j]);
//            }
//            System.out.println();
//        }
////        myResult[currentDiscount][width*loop/2] = "*";
////        for(int i=1+(currentDiscount);i<height*loop+1;i++){
////            for(int j=0;j<width*loop+1;j++){
////                if(j == (width*loop/2-i+currentDiscount)){
////                    myResult[i][j] = "*";
////                    aka = j;
////
////                }else if(j == (width*loop/2+i-currentDiscount)){
////                    myResult[i][j] = "*";
////                    ss = j;
////                }
////
////                if(i == height*loop-ff && j >= aka && j <= ss-3){
////                    myResult[i][j] = "*";
////                }
////            }
////        }
//
//
//    }
}
