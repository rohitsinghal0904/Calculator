package com.example.rohitsinghal.calculatorassignment;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
    EditText e1,e2;
    TextView t1;
    TextToSpeech ts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=(Button)findViewById(R.id.button0);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b10=(Button)findViewById(R.id.butttondot);
        b11=(Button)findViewById(R.id.buttonmultiply);
        b12=(Button)findViewById(R.id.buttonadd);
        b13=(Button)findViewById(R.id.buttonsubtract);
        b14=(Button)findViewById(R.id.buttonnext);
        b15=(Button)findViewById(R.id.buttondivide);
        b16=(Button)findViewById(R.id.sinbutton);
        b17=(Button)findViewById(R.id.cosbutton);
        b18=(Button)findViewById(R.id.tanbutton);
        b19=(Button)findViewById(R.id.clrbutton);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        t1=(TextView)findViewById(R.id.textView);
        ts=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                ts.setLanguage(Locale.ENGLISH);
                ts.setSpeechRate(0.5f);
            }
        });

e1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() + "0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() + "9");
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() + ".");
            }
        });

    }
});


        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                if (s1.isEmpty()  || s2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter Number", Toast.LENGTH_SHORT).show();
                }else{
                    Float f1 = Float.parseFloat(s1);
                    Float f2 = Float.parseFloat(s2);
                    Float f3 = f1 * f2;
                    String s3 = Float.toString(f3);
                    t1.setText(s3);
                    ts.speak(s3, TextToSpeech.QUEUE_FLUSH, null);
                }

            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                if (s1.isEmpty()  || s2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter Number", Toast.LENGTH_SHORT).show();
                } else {
                    Float f1 = Float.parseFloat(s1);
                    Float f2 = Float.parseFloat(s2);
                    Float f3 = f1 + f2;
                    String s3 = Float.toString(f3);
                    t1.setText(s3);
                    ts.speak(s3, TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                if (s1.isEmpty()  || s2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter Number", Toast.LENGTH_SHORT).show();
                } else {
                    Float f1 = Float.parseFloat(s1);
                    Float f2 = Float.parseFloat(s2);
                    Float f3 = f1 - f2;
                    String s3 = Float.toString(f3);
                    t1.setText(s3);
                    ts.speak(s3, TextToSpeech.QUEUE_FLUSH, null);
                }
            }

        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText() + "0");
                    }
                });

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText() + "1");                    }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText() + "2");                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText() + "3");                    }
                });
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText() + "4");                    }
                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText() + "5");                    }
                });
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText() + "6");                    }
                });
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText() + "7");                    }
                });
                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText() + "8");                    }
                });
                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText() + "9");                    }
                });
                b10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e2.setText(e2.getText() + ".");                    }
                });

            }
        });


        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                if (s1.isEmpty() || s2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter Number", Toast.LENGTH_SHORT).show();
                } else {
                    Float f1 = Float.parseFloat(s1);
                    Float f2 = Float.parseFloat(s2);
                    Float f3 = f1 / f2;
                    String s3 = Float.toString(f3);
                    t1.setText(s3);
                    ts.speak(s3, TextToSpeech.QUEUE_FLUSH, null);
                }
            }

        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = t1.getText().toString();
                if (s1.isEmpty()){
                    Toast.makeText(MainActivity.this, "First Perform Operation", Toast.LENGTH_SHORT).show();
                } else {
                    Float f3 = Float.parseFloat(s1);
                    double r = Math.toRadians(f3);
                    double f4 = Math.sin(r);
                    String s2 = Double.toString(f4);
                    t1.setText(s2);
                    ts.speak(s2, TextToSpeech.QUEUE_FLUSH, null);
                    Toast.makeText(MainActivity.this, "Consider the previous result as a value", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = t1.getText().toString();
                if (s1.isEmpty()) {
                    Toast.makeText(MainActivity.this, "First Perform Operation", Toast.LENGTH_SHORT).show();
                } else {
                    Float f3 = Float.parseFloat(s1);
                    double r = Math.toRadians(f3);
                    double f4 = Math.cos(r);
                    String s2 = Double.toString(f4);
                    t1.setText(s2);
                    ts.speak(s2, TextToSpeech.QUEUE_FLUSH, null);
                    Toast.makeText(MainActivity.this, "Consider the previous result as a value", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = t1.getText().toString();
                if (s1.isEmpty()) {
                    Toast.makeText(MainActivity.this, "First Perform Operation", Toast.LENGTH_SHORT).show();
                } else {
                    Float f3 = Float.parseFloat(s1);
                    double r = Math.toRadians(f3);
                    double f4 = Math.tan(r);
                    String s2 = Double.toString(f4);
                    t1.setText(s2);
                    ts.speak(s2, TextToSpeech.QUEUE_FLUSH, null);
                    Toast.makeText(MainActivity.this, "Consider the previous result as a value", Toast.LENGTH_SHORT).show();
                }
            }
        });




        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
                e2.setText("");
                t1.setText("");
            }
        });





    }
}
