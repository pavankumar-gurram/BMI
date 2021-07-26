package com.example.bmi1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txt1=findViewById(R.id.text11);
        txt2=findViewById(R.id.text12);
        txt3=findViewById(R.id.text13);
        txt4=findViewById(R.id.text14);
        txt5=findViewById(R.id.text15);
        txt6=findViewById(R.id.text16);
        txt7=findViewById(R.id.text17);
        txt8=findViewById(R.id.text18);
        txt9=findViewById(R.id.text19);
        txt10=findViewById(R.id.text20);
        float i=getIntent().getFloatExtra("bmi",0);
        if(i<18.5)
        {
            underweight();
        }
        if((i >= 18.5) && (i <= 24.9))
        {
                normalweight();
        }
        if ((i >= 25) && (i <= 29.9))
        {
            overweight();
        }
        if(i>=30)
        {
                obesity();
        }
    }

    private void obesity() {
        String text1="1.Exercise.\n";
        String text2="Regular physical activity burns calories and builds muscle — both of which help you look and feel good and keep weight off.\n";
        String text3="2.Reduce screen time. \n";
        String text4="People who spend a lot of time in front of screens are more likely to be overweight. Set reasonable limits on the amount of time you spend watching TV, playing video games,etc.\n";
        String text5="3.Watch out for portion distortion:\n";
        String text6="Sugary beverages such as sodas, juice drinks,and sports drinks, are empty calories that also contribute to obesity. \n";
        String text7="4.Eat 5 servings of fruits and veggies a day. \n";
        String text8="Fruits and veggies are about more than just vitamins and minerals. They're also packed with fiber,which means they fill you up.\n";
        String text9="5.Don't skip breakfast. \n";
        String text10="People who skip breakfast often feel so hungry that they eat more later on. So they get more calories than they would have if they ate breakfast.";
        txt1.setText(text1);
        txt2.setText(text2);
        txt3.setText(text3);
        txt4.setText(text4);
        txt5.setText(text5);
        txt6.setText(text6);
        txt7.setText(text7);
        txt8.setText(text8);
        txt9.setText(text9);
        txt10.setText(text10);
    }

    private void overweight() {
        String text1="1.Trying intermittent fasting:\n";
        String text2="Intermittent fasting (IF) is a pattern of eating that involves regular short-term fasts and consuming meals within a shorter time period during the day.\n";
        String text3="2.Alternate day fasting (ADF):\n";
        String text4="Fast every other day and eat normally on non-fasting days.The modified version involves eating just 25–30 percent of the body's energy needs on fasting days.\n";
        String text5="3.Eating protein for breakfast:\n";
        String text6="Protein can regulate appetite hormones to help people feel full. This is mostly due to a decrease in the hunger hormone ghrelin and a rise in the satiety hormones peptide YY, GLP-1, and cholecystokinin.\n";
        String text7="4. Eating plenty of fiber\n";
        String text8="Dietary fiber describes plant-based carbohydrates that it is not possible to digest in the small intestine,unlike sugar and starch. Including plenty of fiber in the diet can increase the feeling of fullness,potentially leading to weight loss.\n";
        String text9="5. Managing your stress levels\n";
        String text10="when people are under constant stress, cortisol can remain in the bloodstream for longer,which will increase their appetite and potentially lead to them eating more.";
        txt1.setText(text1);
        txt2.setText(text2);
        txt3.setText(text3);
        txt4.setText(text4);
        txt5.setText(text5);
        txt6.setText(text6);
        txt7.setText(text7);
        txt8.setText(text8);
        txt9.setText(text9);
        txt10.setText(text10);    }

    private void normalweight() {
        txt7.setText("You Are Normal");
    }

    private void underweight() {

        String text1="1.Adding snacks:";
        String text2="High-protein and whole-grain carbohydrate snacks can help a person gain weight.Examples include peanut butter,protein bars,or a handful of almonds.";
        String text3="Eating several small meals a day. Sometimes a person may be underweight because they cannot tolerate eating large meals. Instead, a person can eat several small meals throughout the day.";
        String text4="Foods to gain weight quickly";
        String text5="1. Milk: \n";
        String text6="Milk offers a mix of fat, carbohydrates, and proteins.It is also an excellent source of vitamins and minerals, including calcium.\n";
        String text7="2. Protein shakes:\n";
        String text8="Protein shakes can help a person to gain weight easily and efficiently. A shake is most effective at helping to build muscle if drunk shortly after a workout.\n";
        String text9="3. Rice:\n";
        String text10="A cup of rice contains about 200 calories, and it is also a good source of carbohydrates,which contribute to weight gain. Many people find it easy to incorporate rice into meals containing proteins and vegetables.";
        txt1.setText(text1);
        txt2.setText(text2);
        txt3.setText(text3);
        txt4.setText(text4);
        txt5.setText(text5);
        txt6.setText(text6);
        txt7.setText(text7);
        txt8.setText(text8);
        txt9.setText(text9);
        txt10.setText(text10);
    }
}
