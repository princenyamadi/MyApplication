package tech.peny.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void toastMe(View view){
        EditText toastEditText = findViewById(R.id.toastEditText);
        Toast.makeText(this,"Hi There !! "+toastEditText.getText().toString(),Toast.LENGTH_LONG).show();
    }
    public void login(View view){
        EditText nameEditText = findViewById(R.id.nameEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);

        Log.i("Info","Button Clicked");
        Log.i("Username ",nameEditText.getText().toString());
        Log.i("Password ", passwordEditText.getText().toString());

    }
    public void clickFunction(View view){
        EditText nameEditText = findViewById(R.id.nameEditText);
        Log.i("info","Button Clicked");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}