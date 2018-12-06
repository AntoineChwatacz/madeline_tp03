package fr.utt.if26.madeline_tp03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Super méthode qui créerun bouton qui permet de changer un texte de couleur. Amazing.
     * @param savedInstanceState
     */
    var testModif = "JE suis une modification pour tester le GIIIIIIIIIIIT";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tx = (TextView) findViewById(R.id.textview);
        String str = (String) getResources().getString(R.string.message);
        tx.setText(str);

        Button btn = (Button) findViewById(R.id.bouton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               tx.setBackgroundColor(Color.RED);
            }
        });

    }
}
