package fi.arcada.codechallenge;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView View1;

    TextView View2;

    Button calc;


    ArrayList<Double> numbers = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View1 = (TextView) findViewById(R.id.View1);

        View1.setText("CodeChallenge2");

        View2 = (TextView) findViewById(R.id.View2);

        View2.setText("Appen funkar fint");

        calc = (Button) findViewById(R.id.calc);
        calc.setOnClickListener( v ->   calculate());

        numbers.add(0.0);
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(3.0);
        numbers.add(5.0);
        numbers.add(6.0);
        numbers.add(7.0);
        numbers.add(8.0);
        numbers.add(9.0);
    }


public void calculate(){

        int sum = 0;
        for(int i = 0; i <numbers.size(); i++) {
            sum += numbers.get(i);
        }

        double average = (double)sum / numbers.size();
        View2.setText("Median:  "  + average);







    }
}