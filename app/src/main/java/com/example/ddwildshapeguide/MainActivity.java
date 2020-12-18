package com.example.ddwildshapeguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextView nameOfMonster;
    TextView armorClassOfMonster;
    TextView hitPointsOfMonster;
    TextView sizeOfMonster;
    EditText chooseMonsterName;
    Button askMonsterName;
    ApiService apiService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameOfMonster = (TextView)findViewById(R.id.name);
        chooseMonsterName = (EditText)findViewById(R.id.nameOfMonster);
        askMonsterName = (Button)findViewById(R.id.askForMonster);
        armorClassOfMonster = (TextView)findViewById(R.id.ac);
        hitPointsOfMonster = (TextView)findViewById(R.id.hp);
        sizeOfMonster = (TextView)findViewById(R.id.size);
        apiService = Client.getClient().create(ApiService.class);
        askMonsterName.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                if (!TextUtils.isEmpty(chooseMonsterName.getText())){
                    String name = chooseMonsterName.getText().toString();
                    Call < Monster > call = apiService.getMonsterByName(name);
                    call.enqueue(new Callback<Monster>() {
                        @Override
                        public void onResponse(Call<Monster> call, Response<Monster> response) {
                            Log.d("TAG",response.message());
                            Monster monster = response.body();
                            MainActivity.this.nameOfMonster.setText(monster.name);
                            armorClassOfMonster.setText("Armor class"+String.valueOf(monster.armor_class));
                            hitPointsOfMonster.setText("Hit points: "+String.valueOf(monster.hit_points));
                            sizeOfMonster.setText("Size: "+monster.size);
                        }

                        @Override
                        public void onFailure(Call<Monster> call, Throwable t) {
                            call.cancel();

                            nameOfMonster.setText("epic fail");

                        }
                    });
                }
           }
           });

    }
}
