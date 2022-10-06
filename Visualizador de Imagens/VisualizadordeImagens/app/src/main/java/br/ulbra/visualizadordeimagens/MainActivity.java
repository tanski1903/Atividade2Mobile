package br.ulbra.visualizadordeimagens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imgFoto;
    Button btFoto1, btFoto2;
    TextView txtInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgFoto = (ImageView) findViewById(R.id.imgFoto);
        btFoto1 = (Button) findViewById(R.id.btfoto1);
        btFoto2 = (Button)  findViewById(R.id.btfoto2);
        txtInfo = (TextView) findViewById(R.id.txtInfo);
        btFoto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgFoto.setImageResource(R.drawable.foto1);
                txtInfo.setText("Bola de Futebol");
            }
        });
        btFoto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgFoto.setImageResource(R.drawable.foto2);
                txtInfo.setText("Bola de Basquete");
            }
        });
    }
}