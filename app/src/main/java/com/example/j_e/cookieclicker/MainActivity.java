package com.example.j_e.cookieclicker;

        import android.content.Context;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageButton;
        import android.widget.TextView;
        import android.widget.Toast;

        import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {
    ImageButton btnClick;
    Button btnReset;
    TextView txtCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClick=(ImageButton) findViewById(R.id.buttonClick);
        btnReset=(Button) findViewById(R.id.buttonReset);
        txtCount=(TextView) findViewById(R.id.textViewCount);
        btnClick.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String countValue=txtCount.getText().toString();
                int intCountValue=Integer.parseInt(countValue);
                intCountValue++;
                txtCount.setText(String.valueOf(intCountValue));

                Context context=getApplicationContext();
                CharSequence text="+1";
                int duration = Toast.LENGTH_SHORT;
                Toast toast= Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtCount.setText(String.valueOf(0));
            }
        });
    }
}
