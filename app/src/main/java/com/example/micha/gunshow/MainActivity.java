package com.example.micha.gunshow;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {


    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;
    Button button16;
    Button button17;
    Button button18;
    Button button23;
    Button button24;
    Button button25;
    Button button26;
    Button button27;
    Button button31;
    Button button32;
    Button button33;
    Button button34;
    Button button35;
    Button button36;
    Button button37;
    Button button41;
    Button button42;
    Button button43;
    Button button44;
    Button button45;




    int counter1 = 0;
    int counter2 = 0;
    int counter3 = 0;
    int counter4 = 0;
    int counter5 = 0;
    int counter6 = 0;
    int counter7 = 0;
    int counter11 = 0;
    int counter12 = 0;
    int counter13 = 0;
    int counter14 = 0;
    int counter15 = 0;
    int counter16 = 0;
    int counter17 = 0;
    int counter18 = 0;
    int counter23 = 0;
    int counter24 = 0;
    int counter25 = 0;
    int counter26 = 0;
    int counter27 = 0;
    int counter31 = 0;
    int counter32 = 0;
    int counter33 = 0;
    int counter34 = 0;
    int counter35 = 0;
    int counter36 = 0;
    int counter37 = 0;
    int counter41 = 0;
    int counter42 = 0;
    int counter43 = 0;
    int counter44 = 0;
    int counter45 = 0;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button23 = (Button) findViewById(R.id.button23);
        button24 = (Button) findViewById(R.id.button24);
        button25 = (Button) findViewById(R.id.button25);
        button26 = (Button) findViewById(R.id.button26);
        button27 = (Button) findViewById(R.id.button27);
        button31 = (Button) findViewById(R.id.button31);
        button32 = (Button) findViewById(R.id.button32);
        button33 = (Button) findViewById(R.id.button33);
        button34 = (Button) findViewById(R.id.button34);
        button35 = (Button) findViewById(R.id.button35);
        button36 = (Button) findViewById(R.id.button36);
        button37 = (Button) findViewById(R.id.button37);
     //   button41 = (Button) findViewById(R.id.button41);
        button42 = (Button) findViewById(R.id.button42);
        button43 = (Button) findViewById(R.id.button43);
        button44 = (Button) findViewById(R.id.button44);
        button45 = (Button) findViewById(R.id.button45);



    }

    public void onClick1(View v) {
        if (counter1 == 0) {
            button1.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter1++;
        } else if (counter1 == 1) {
            button1.setText("1/");
            counter1++;
        } else if (counter1 == 2) {
            button1.setText("1\\");
            counter1++;
        } else if (counter1 == 3) {
            button1.setText("1X");
            counter1++;
        } else {
            button1.setText("1");
            button1.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter1 = 0;
        }
    }

    public void onClick2(View v) {
        if (counter2 == 0) {
            button2.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter2++;
        } else if (counter2 == 1) {
            button2.setText("2/");
            counter2++;
        } else if (counter2 == 2) {
            button2.setText("2\\");
            counter2++;
        } else if (counter2 == 3) {
            button2.setText("2X");
            counter2++;
        } else {
            button2.setText("2");
            button2.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter2 = 0;
        }
    }

    public void onClick3(View v) {
        if (counter3 == 0) {
            button3.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter3++;
        } else if (counter3 == 1) {
            button3.setText("3/");
            counter3++;
        } else if (counter3 == 2) {
            button3.setText("3\\");
            counter3++;
        } else if (counter3 == 3) {
            button3.setText("3X");
            counter3++;
        } else {
            button3.setText("3");
            button3.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter3 = 0;
        }
    }

    public void onClick4(View v) {
        if (counter4 == 0) {
            button4.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter4++;
        } else if (counter4 == 1) {
            button4.setText("4/");
            counter4++;
        } else if (counter4 == 2) {
            button4.setText("4\\");
            counter4++;
        } else if (counter4 == 3) {
            button4.setText("4X");
            counter4++;
        } else {
            button4.setText("4");
            button4.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter4 = 0;
        }
    }

    public void onClick5(View v) {
        if (counter5 == 0) {
            button5.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter5++;
        } else if (counter5 == 1) {
            button5.setText("5/");
            counter5++;
        } else if (counter5 == 2) {
            button5.setText("5\\");
            counter5++;
        } else if (counter5 == 3) {
            button5.setText("5X");
            counter5++;
        } else {
            button5.setText("5");
            button5.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter5 = 0;
        }
    }

    public void onClick6(View v) {
        if (counter6 == 0) {
            button6.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter6++;
        } else if (counter6 == 1) {
            button6.setText("6/");
            counter6++;
        } else if (counter6 == 2) {
            button6.setText("6\\");
            counter6++;
        } else if (counter6 == 3) {
            button6.setText("6X");
            counter6++;
        } else {
            button6.setText("6");
            button6.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter6 = 0;
        }
    }

    public void onClick7(View v) {
        if (counter7 == 0) {
            button7.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter7++;
        } else if (counter7 == 1) {
            button7.setText("7/");
            counter7++;
        } else if (counter7 == 2) {
            button7.setText("7\\");
            counter7++;
        } else if (counter7 == 3) {
            button7.setText("7X");
            counter7++;
        } else {
            button7.setText("7");
            button7.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter7 = 0;
        }
    }

    public void onClick11(View v) {
        if (counter11 == 0) {
            button11.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter11++;
        } else if (counter11 == 1) {
            button11.setText("11/");
            counter11++;
        } else if (counter11 == 2) {
            button11.setText("11\\");
            counter11++;
        } else if (counter11 == 3) {
            button11.setText("11X");
            counter11++;
        } else {
            button11.setText("11");
            button11.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter11 = 0;
        }
    }

    public void onClick12(View v) {
        if (counter12 == 0) {
            button12.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter12++;
        } else if (counter12 == 1) {
            button12.setText("12/");
            counter12++;
        } else if (counter12 == 2) {
            button12.setText("12\\");
            counter12++;
        } else if (counter12 == 3) {
            button12.setText("12X");
            counter12++;
        } else {
            button12.setText("12");
            button12.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter12 = 0;
        }
    }

    public void onClick13(View v) {
        if (counter13 == 0) {
            button13.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter13++;
        } else if (counter13 == 1) {
            button13.setText("13/");
            counter13++;
        } else if (counter13 == 2) {
            button13.setText("13\\");
            counter13++;
        } else if (counter13 == 3) {
            button13.setText("13X");
            counter13++;
        } else {
            button13.setText("13");
            button13.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter13 = 0;
        }
    }

    public void onClick14(View v) {
        if (counter14 == 0) {
            button14.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter14++;
        } else if (counter14 == 1) {
            button14.setText("14/");
            counter14++;
        } else if (counter14 == 2) {
            button14.setText("14\\");
            counter14++;
        } else if (counter14 == 3) {
            button14.setText("14X");
            counter14++;
        } else {
            button14.setText("14");
            button14.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter14 = 0;
        }
    }

    public void onClick15(View v) {
        if (counter15 == 0) {
            button15.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter15++;
        } else if (counter15 == 1) {
            button15.setText("15/");
            counter15++;
        } else if (counter15 == 2) {
            button15.setText("15\\");
            counter15++;
        } else if (counter15 == 3) {
            button15.setText("15X");
            counter15++;
        } else {
            button15.setText("15");
            button15.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter15 = 0;
        }
    }

    public void onClick16(View v) {
        if (counter16 == 0) {
            button16.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter16++;
        } else if (counter16 == 1) {
            button16.setText("16/");
            counter16++;
        } else if (counter16 == 2) {
            button16.setText("16\\");
            counter16++;
        } else if (counter16 == 3) {
            button16.setText("16X");
            counter16++;
        } else {
            button16.setText("16");
            button16.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter16 = 0;
        }
    }

    public void onClick17(View v) {
        if (counter17 == 0) {
            button17.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter17++;
        } else if (counter17 == 1) {
            button17.setText("17/");
            counter17++;
        } else if (counter17 == 2) {
            button17.setText("17\\");
            counter17++;
        } else if (counter17 == 3) {
            button17.setText("17X");
            counter17++;
        } else {
            button17.setText("17");
            button17.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter17 = 0;
        }
    }

    public void onClick18(View v) {
        if (counter18 == 0) {
            button18.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter18++;
        } else if (counter18 == 1) {
            button18.setText("18/");
            counter18++;
        } else if (counter18 == 2) {
            button18.setText("18\\");
            counter18++;
        } else if (counter18 == 3) {
            button18.setText("18X");
            counter18++;
        } else {
            button18.setText("18");
            button18.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter18 = 0;
        }
    }

    public void onClick23(View v) {
        if (counter23 == 0) {
            button23.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter23++;
        } else if (counter23 == 1) {
            button18.setText("23/");
            counter23++;
        } else if (counter23 == 2) {
            button23.setText("23\\");
            counter23++;
        } else if (counter23 == 3) {
            button23.setText("23X");
            counter23++;
        } else {
            button23.setText("23");
            button23.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter23 = 0;
        }
    }

    public void onClick24(View v) {
        if (counter24 == 0) {
            button24.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter24++;
        } else if (counter24 == 1) {
            button24.setText("24/");
            counter24++;
        } else if (counter24 == 2) {
            button24.setText("24\\");
            counter24++;
        } else if (counter24 == 3) {
            button24.setText("24X");
            counter24++;
        } else {
            button24.setText("24");
            button24.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter24 = 0;
        }
    }

    public void onClick25(View v) {
        if (counter25 == 0) {
            button25.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter25++;
        } else if (counter25 == 1) {
            button25.setText("25/");
            counter25++;
        } else if (counter25 == 2) {
            button25.setText("25\\");
            counter25++;
        } else if (counter25 == 3) {
            button25.setText("25X");
            counter25++;
        } else {
            button25.setText("25");
            button25.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter25 = 0;
        }
    }

    public void onClick26(View v) {
        if (counter26 == 0) {
            button26.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter26++;
        } else if (counter26 == 1) {
            button26.setText("26/");
            counter26++;
        } else if (counter26 == 2) {
            button26.setText("26\\");
            counter26++;
        } else if (counter26 == 3) {
            button26.setText("26X");
            counter26++;
        } else {
            button26.setText("26");
            button26.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter26 = 0;
        }
    }

    public void onClick27(View v) {
        if (counter27 == 0) {
            button27.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter27++;
        } else if (counter27 == 1) {
            button27.setText("27/");
            counter27++;
        } else if (counter27 == 2) {
            button27.setText("27\\");
            counter27++;
        } else if (counter27 == 3) {
            button27.setText("27X");
            counter27++;
        } else {
            button27.setText("27");
            button27.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter27 = 0;
        }
    }
    public void onClick31(View v) {
        if (counter31 == 0) {
            button31.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter31++;
        } else if (counter31 == 1) {
            button31.setText("31/");
            counter31++;
        } else if (counter31 == 2) {
            button31.setText("31\\");
            counter31++;
        } else if (counter31 == 3) {
            button31.setText("31X");
            counter31++;
        } else {
            button31.setText("31");
            button31.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter31 = 0;
        }
    }
    public void onClick32(View v) {
        if (counter32 == 0) {
            button32.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter32++;
        } else if (counter32 == 1) {
            button32.setText("32/");
            counter32++;
        } else if (counter32 == 2) {
            button32.setText("32\\");
            counter32++;
        } else if (counter32 == 3) {
            button32.setText("32X");
            counter32++;
        } else {
            button32.setText("32");
            button32.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter32 = 0;
        }
    }

    public void onClick33(View v) {
        if (counter33 == 0) {
            button33.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter33++;
        } else if (counter33 == 1) {
            button33.setText("33/");
            counter33++;
        } else if (counter33 == 2) {
            button33.setText("33\\");
            counter33++;
        } else if (counter33 == 3) {
            button33.setText("33X");
            counter33++;
        } else {
            button33.setText("33");
            button33.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter33 = 0;
        }
    }
    public void onClick34(View v) {
        if (counter34 == 0) {
            button34.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter34++;
        } else if (counter34 == 1) {
            button34.setText("34/");
            counter34++;
        } else if (counter34 == 2) {
            button34.setText("34\\");
            counter34++;
        } else if (counter34 == 3) {
            button34.setText("34X");
            counter34++;
        } else {
            button34.setText("34");
            button34.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter34 = 0;
        }
    }
    public void onClick35(View v) {
        if (counter35 == 0) {
            button35.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter35++;
        } else if (counter35 == 1) {
            button35.setText("35/");
            counter35++;
        } else if (counter35 == 2) {
            button35.setText("35\\");
            counter35++;
        } else if (counter35 == 3) {
            button35.setText("35X");
            counter35++;
        } else {
            button35.setText("35");
            button35.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter35 = 0;
        }
    }
    public void onClick36(View v) {
        if (counter36 == 0) {
            button36.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter36++;
        } else if (counter36 == 1) {
            button36.setText("36/");
            counter36++;
        } else if (counter36 == 2) {
            button36.setText("36\\");
            counter36++;
        } else if (counter36 == 3) {
            button36.setText("36X");
            counter36++;
        } else {
            button36.setText("36");
            button36.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter36 = 0;
        }
    }
    public void onClick37(View v) {
        if (counter37 == 0) {
            button37.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter37++;
        } else if (counter37 == 1) {
            button37.setText("37/");
            counter37++;
        } else if (counter37 == 2) {
            button37.setText("37\\");
            counter37++;
        } else if (counter37 == 3) {
            button37.setText("37X");
            counter37++;
        } else {
            button37.setText("37");
            button37.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter37 = 0;
        }
    }

    public void onClick41(View v) {
        if (counter41 == 0) {
            button41.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter41++;
        } else if (counter41 == 1) {
            button41.setText("41/");
            counter41++;
        } else if (counter41 == 2) {
            button41.setText("41\\");
            counter41++;
        } else if (counter41 == 3) {
            button41.setText("41X");
            counter41++;
        } else {
            button41.setText("41");
            button41.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter41 = 0;
        }
    }

    public void onClick42(View v) {
        if (counter42 == 0) {
            button42.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter42++;
        } else if (counter42 == 1) {
            button42.setText("42/");
            counter42++;
        } else if (counter42 == 2) {
            button42.setText("42\\");
            counter42++;
        } else if (counter42 == 3) {
            button42.setText("42X");
            counter42++;
        } else {
            button42.setText("42");
            button42.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter42 = 0;
        }
    }

    public void onClick43(View v) {
        if (counter43 == 0) {
            button43.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter43++;
        } else if (counter43 == 1) {
            button43.setText("43/");
            counter43++;
        } else if (counter43 == 2) {
            button43.setText("43\\");
            counter43++;
        } else if (counter43 == 3) {
            button43.setText("43X");
            counter43++;
        } else {
            button43.setText("43");
            button43.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter43 = 0;
        }
    }

    public void onClick44(View v) {
        if (counter44 == 0) {
            button44.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter44++;
        } else if (counter44 == 1) {
            button44.setText("44/");
            counter44++;
        } else if (counter44 == 2) {
            button44.setText("44\\");
            counter44++;
        } else if (counter44 == 3) {
            button44.setText("44X");
            counter44++;
        } else {
            button44.setText("44");
            button44.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter44 = 0;
        }
    }

    public void onClick45(View v) {
        if (counter45 == 0) {
            button45.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_selected));
            counter45++;
        } else if (counter45 == 1) {
            button45.setText("45/");
            counter45++;
        } else if (counter45 == 2) {
            button45.setText("45\\");
            counter45++;
        } else if (counter45 == 3) {
            button45.setText("45X");
            counter45++;
        } else {
            button45.setText("41");
            button45.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_normal));
            counter45 = 0;
        }
    }


}
