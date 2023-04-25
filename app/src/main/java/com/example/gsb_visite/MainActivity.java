 package com.example.gsb_visite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.gsb_visite.databinding.ActivityMainBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

 public class MainActivity extends AppCompatActivity {

     private Token token;
     private String username;
     private Visiteurs visiteurs;


     private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GsbVisite service =
                RetrofitClientInstance.getRetrofitInstance().create(GsbVisite.
                        class);
        Call<Token> call = service.getToken();
        call.enqueue(new Callback<Token>() {
            @Override
            public void onResponse(Call<Token> call, Response<Token>
                    response) {
                response.body();
            token = response.body();
            Intent intentVisiteurActivity = new Intent(getApplicationContext(), VisiteurActivity.class);
            intentVisiteurActivity.putExtra("token", token);
            intentVisiteurActivity.putExtra("username", username);
            startActivity(intentVisiteurActivity);
            }
            @Override
            public void onFailure(Call<Token> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Une erreur est survenue !",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }


}