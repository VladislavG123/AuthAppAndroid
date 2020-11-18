package home.vladislavg123.authapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class LogupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logup);

        findViewById(R.id.sendButton).setOnClickListener(v -> {

            ArrayList<String> fields = new ArrayList<>(Arrays.asList(
                    ((EditText) findViewById(R.id.address)).getText().toString(),
                    ((EditText) findViewById(R.id.apartment)).getText().toString(),
                    ((EditText) findViewById(R.id.firstname)).getText().toString(),
                    ((EditText) findViewById(R.id.lastname)).getText().toString(),
                    ((EditText) findViewById(R.id.date)).getText().toString(),
                    ((EditText) findViewById(R.id.email)).getText().toString(),
                    ((EditText) findViewById(R.id.phone)).getText().toString()
            ));

            String message = "Вы успешно зарегистрировались";

            for (String field: fields) {
                if (field.length() == 0){
                    message = "Не все поля заполнены";
                }
            }

            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        });
    }
}