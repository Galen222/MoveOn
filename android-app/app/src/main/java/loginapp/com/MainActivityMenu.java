package loginapp.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivityMenu extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //cargamos el layaut
        setContentView(R.layout.activity_main_menu);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        //fragmento inicial
        replaceFragment(new InicioFragment());
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId(); //depende de donde clickemos

            if (id == R.id.nav_inicio) {
                replaceFragment(new InicioFragment());
            } else if (id == R.id.nav_perfil) {
                replaceFragment(new PerfilFragment());
            } else if (id == R.id.nav_configuracion) {
                replaceFragment(new ConfiguracionFragment());
            }
            return  true;
        });
    }
    //método del replace
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);// esto reemplaza donde clickes , en el layauot entero y en cada fragmento
        fragmentTransaction.commit();

    }
}