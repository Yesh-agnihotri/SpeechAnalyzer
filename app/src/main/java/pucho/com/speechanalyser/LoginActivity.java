package pucho.com.speechanalyser;

/**
 * Created by YESH on 26-05-2018.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.container);


        if (fragment == null) {
            fragment = new GPlusFragment();
            fm.beginTransaction()
                    .add(R.id.container, fragment)
                    .commit();
        }
    }
}
