package loginapp.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginRegisterActivity extends AppCompatActivity {
    //Declaración de variables
    ImageView ivMoveOn = null;
    EditText etCorreo = null;
    EditText etPassword = null;
    Button btnLogin = null;
    Button btnRegistrar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}