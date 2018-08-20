package com.junior.concessionariajunior;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {


    private Spinner spmarca;
    private EditText etModelo;
    private RadioButton rbcarga;
    private RadioButton rbPassageiro;
    private CheckBox cbNovo;
    private Button btnSalvar;










    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    spmarca = (Spinner) findViewById(R.id.spMarca);

    }
}
