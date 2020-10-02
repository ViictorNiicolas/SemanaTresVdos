package cl.santotomas.semanatresvdos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner comboDias;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        comboDias= (Spinner) findViewById(R.id.idspinnerDias);
        Adapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.combo_dias,android.R.layout.simple_spinner_item);

        comboDias.setAdapter(adapter);

    }
}