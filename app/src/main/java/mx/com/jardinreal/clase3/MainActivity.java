package mx.com.jardinreal.clase3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int puntajeA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE
        displayForTeamA(0);
    }

    public void sumarTresPuntos(View v) {
        puntajeA += 3;
        displayForTeamA(puntajeA);
    }

    public void sumarDosPuntos(View v) {
        puntajeA += 2;
        displayForTeamA(puntajeA);
    }

    public void sumarUnPunto(View v) {
        puntajeA += 1;
        displayForTeamA(puntajeA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}