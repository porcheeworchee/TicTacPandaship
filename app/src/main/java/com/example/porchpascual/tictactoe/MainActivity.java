package com.example.porchpascual.tictactoe;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.b1) Button btn1;
    @BindView(R.id.b2) Button btn2;
    @BindView(R.id.b3) Button btn3;
    @BindView(R.id.b4) Button btn4;
    @BindView(R.id.b5) Button btn5;
    @BindView(R.id.b6) Button btn6;
    @BindView(R.id.b7) Button btn7;
    @BindView(R.id.b8) Button btn8;
    @BindView(R.id.b9) Button btn9;

    String pandaUnicode = "\uD83D\uDC3C";
    String shipUnicode = "\uD83D\uDEA2";
    int turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        turn = 1;
    }

    @OnClick({R.id.b1, R.id.b2, R.id.b3, R.id.b4, R.id.b5, R.id.b6, R.id.b7, R.id.b8, R.id.b9})
    public void onClickButtons (Button btn) {
        if (btn.getText().toString().equals("")) {
            String unicode = "";
            if (turn == 1) {
                turn = 2;
                unicode = pandaUnicode;
            } else if (turn == 2) {
                turn = 1;
                unicode = shipUnicode;
            }
            btn.setText(unicode);
            setDefaultLocale(getApplicationContext(), "en");
        }
        endGame();
    }

    private void setDefaultLocale(Context ctx, String locale) {
        Locale loc1 = new Locale(locale.trim());
        Locale.setDefault(loc1);

        Configuration config = new Configuration();
        config.locale = loc1;

        ctx.getResources().updateConfiguration(config, ctx.getResources().getDisplayMetrics());
        loc1 = null;
        config = null;
    }

    public void endGame() {
        String A, B, C, D, E, F, G, H, I;

        boolean end = false;

        A = btn1.getText().toString();
        B = btn2.getText().toString();
        C = btn3.getText().toString();

        D = btn4.getText().toString();
        E = btn5.getText().toString();
        F = btn6.getText().toString();

        G = btn7.getText().toString();
        H = btn8.getText().toString();
        I = btn9.getText().toString();

        if (A.equals(pandaUnicode)&& B.equals(pandaUnicode)&& C.equals(pandaUnicode)) {
            displayWhoWon(pandaUnicode);
            end = true;
        }
        if (A.equals(pandaUnicode)&& E.equals(pandaUnicode)&& I.equals(pandaUnicode)) {
            displayWhoWon(pandaUnicode);
            end = true;
        }
        if (A.equals(pandaUnicode)&& D.equals(pandaUnicode)&& G.equals(pandaUnicode)) {
            displayWhoWon(pandaUnicode);
            end = true;
        }
        if (B.equals(pandaUnicode)&& E.equals(pandaUnicode)&& H.equals(pandaUnicode)) {
            displayWhoWon(pandaUnicode);
            end = true;
        }
        if (C.equals(pandaUnicode)&& F.equals(pandaUnicode)&& I.equals(pandaUnicode)) {
            displayWhoWon(pandaUnicode);
            end = true;
        }
        if (D.equals(pandaUnicode)&& E.equals(pandaUnicode)&& F.equals(pandaUnicode)) {
            displayWhoWon(pandaUnicode);
            end = true;
        }
        if (G.equals(pandaUnicode)&& H.equals(pandaUnicode)&& I.equals(pandaUnicode)) {
            displayWhoWon(pandaUnicode);
            end = true;
        }

        // SHIP PATTERN
        if (A.equals(shipUnicode)&& B.equals(shipUnicode)&& C.equals(shipUnicode)) {
            displayWhoWon(shipUnicode);
            end = true;
        }
        if (A.equals(shipUnicode)&& E.equals(shipUnicode)&& I.equals(shipUnicode)) {
            displayWhoWon(shipUnicode);
            end = true;
        }
        if (A.equals(shipUnicode)&& D.equals(shipUnicode)&& G.equals(shipUnicode)) {
            displayWhoWon(shipUnicode);
            end = true;
        }
        if (B.equals(shipUnicode)&& E.equals(shipUnicode)&& H.equals(shipUnicode)) {
            displayWhoWon(shipUnicode);
            end = true;
        }
        if (C.equals(shipUnicode)&& F.equals(shipUnicode)&& I.equals(shipUnicode)) {
            displayWhoWon(shipUnicode);
            end = true;
        }
        if (D.equals(shipUnicode)&& E.equals(shipUnicode)&& F.equals(shipUnicode)) {
            displayWhoWon(shipUnicode);
            end = true;
        }
        if (G.equals(shipUnicode)&& H.equals(shipUnicode)&& I.equals(shipUnicode)) {
            displayWhoWon(shipUnicode);
            end = true;
        }

        if (end) {
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
    }

    private void displayWhoWon(String unicode) {
        Toast.makeText(MainActivity.this, unicode + " wins!", Toast.LENGTH_LONG).show();
    }

}