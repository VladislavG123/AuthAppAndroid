package home.vladislavg123.authapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.loginButton).setOnClickListener(v -> {
            String phone = ((EditText)findViewById(R.id.phone)).getText().toString();
            String pin = ((EditText)findViewById(R.id.pin)).getText().toString();

            String message = "Вы успешно вошли";
            if (phone.length() == 0 || pin.length() == 0) {
                message = "Не все поля заполнены";
            }

            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        });
    }
}