package br.com.moreira.dogage;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editNameDog;
    private EditText editAgeDog;
    private Button btn_calc;
    private String age;
    private int human_age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNameDog = findViewById(R.id.txt_name_dog);
        editAgeDog = findViewById(R.id.txt_age_dog);

        btn_calc = findViewById(R.id.btn_calc);

    }
    public void calc_click (View view) {
        String name = editNameDog.getText().toString();
        age = editAgeDog.getText().toString();


        if(name.isEmpty()){
            Toast.makeText(this,R.string.error_msg, Toast.LENGTH_LONG).show();
            return;
        }if (age.isEmpty()){
            Toast.makeText(this,R.string.error_msg, Toast.LENGTH_LONG).show();
        }
        int convAge = Integer.parseInt(age);
        human_age = (16*convAge)+31;


        Log.d("Teste", "A(O)" + " " + name + " " + "TEM A IDADE HUMANA DE:" + " " + human_age + " " + "anos");


    }

}