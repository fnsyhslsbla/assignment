package com.hacktiv8.assigment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText komentar;
    private SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        komentar = findViewById(R.id.komentar);

        sharedPreferences = getSharedPreferences("testimoni-app", MODE_PRIVATE);


 public MainActivity(); {
            super();
        }

        @Override
        protected void onStart() {
            Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT);
            super.onStart();
        }

        @Override
        protected void onStop() {
            Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT);
            //Save Komentar
            super.onStop();
        }

        @Override
        protected void onPause() {
            Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT);
            super.onPause();
        }

        @Override
        protected void onResume() {
            Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT);
            //Ambil Data Komentar yang tersimpan
            super.onResume();
        }

        private void saveDataKomentar(String value){
            SharedPreferences.Editor editor = this.getSharedPreferences("komentar", Context.MODE_PRIVATE).edit();
            editor.putString("keyKomentar", value);
            editor.commit();
        }
        private String ambilDataKomentar (){
            String result = this.getSharedPreferences("komentar", Context.MODE_PRIVATE).getString("keyKomentar", null);

            return result;
        }
    }
}