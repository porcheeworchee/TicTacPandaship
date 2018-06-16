package com.example.porchpascual.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    int turn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        turn = 1;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b1.setText("P");
                    } else if (turn == 2) {
                        turn = 1;
                        b1.setText("S");
                    }

                }
                endGame();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("P");
                    } else if (turn == 2) {
                        turn = 1;
                        b2.setText("S");
                    }

                }
                endGame();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("P");
                    } else if (turn == 2) {
                        turn = 1;
                        b3.setText("S");
                    }

                }
                endGame();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("P");
                    } else if (turn == 2) {
                        turn = 1;
                        b4.setText("S");
                    }

                }
                endGame();

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("P");
                    } else if (turn == 2) {
                        turn = 1;
                        b5.setText("S");
                    }

                }
                endGame();

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("P");
                    } else if (turn == 2) {
                        turn = 1;
                        b6.setText("S");
                    }

                }
                endGame();

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("P");
                    } else if (turn == 2) {
                        turn = 1;
                        b7.setText("S");
                    }

                }
                endGame();

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("P");
                    } else if (turn == 2) {
                        turn = 1;
                        b8.setText("S");
                    }

                }
                endGame();

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("P");
                    } else if (turn == 2) {
                        turn = 1;
                        b9.setText("S");
                    }

                }
                endGame();

            }
        });

    }

    public void endGame() {
        String A, B, C, D, E, F, G, H, I;

        boolean end = false;

        A = b1.getText().toString();
        B = b2.getText().toString();
        C = b3.getText().toString();

        D = b4.getText().toString();
        E = b5.getText().toString();
        F = b6.getText().toString();

        G = b7.getText().toString();
        H = b8.getText().toString();
        I = b9.getText().toString();

        if (A.equals("P")&& B.equals("P")&& C.equals("P")) {
            Toast.makeText(MainActivity.this, "Panda Wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (A.equals("P")&& E.equals("P")&& I.equals("P")) {
            Toast.makeText(MainActivity.this, "Panda Wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (A.equals("P")&& D.equals("P")&& G.equals("P")) {
            Toast.makeText(MainActivity.this, "Panda Wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B.equals("P")&& E.equals("P")&& H.equals("P")) {
            Toast.makeText(MainActivity.this, "Panda Wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (C.equals("P")&& F.equals("P")&& I.equals("P")) {
            Toast.makeText(MainActivity.this, "Panda Wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (D.equals("P")&& E.equals("P")&& F.equals("P")) {
            Toast.makeText(MainActivity.this, "Panda Wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (G.equals("P")&& H.equals("P")&& I.equals("P")) {
            Toast.makeText(MainActivity.this, "Panda Wins!", Toast.LENGTH_LONG).show();
            end = true;
        }


        if (A.equals("S")&& B.equals("S")&& C.equals("S")) {
            Toast.makeText(MainActivity.this, "Ship Wins!!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (A.equals("S")&& E.equals("S")&& I.equals("S")) {
            Toast.makeText(MainActivity.this, "Ship Wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (A.equals("S")&& D.equals("S")&& G.equals("S")) {
            Toast.makeText(MainActivity.this, "Ship Wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (B.equals("S")&& E.equals("S")&& H.equals("S")) {
            Toast.makeText(MainActivity.this, "Ship Wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (C.equals("S")&& F.equals("S")&& I.equals("S")) {
            Toast.makeText(MainActivity.this, "Ship Wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (D.equals("S")&& E.equals("S")&& F.equals("S")) {
            Toast.makeText(MainActivity.this, "Ship Wins!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (G.equals("S")&& H.equals("S")&& I.equals("S")) {
            Toast.makeText(MainActivity.this, "Ship Wins!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (end) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    }

}