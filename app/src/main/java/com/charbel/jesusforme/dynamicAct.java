package com.charbel.jesusforme;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.util.TypedValue;

import androidx.appcompat.app.AppCompatActivity;

import com.charbel.jesusforme.data.template;

public class dynamicAct extends AppCompatActivity {

    private Button back;
    private TextView title;
    private TextView componetes;
    private TextView currentFontSizeTextView;

    private float currentFontSize = 16f;

    Button increaseFontBtn ;
    Button decreaseFontBtn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_prayer);

        // Keep screen on
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        currentFontSizeTextView = findViewById(R.id.currentFontSize);

        //  StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        //  StrictMode.setThreadPolicy(policy);

        back = findViewById(R.id.back);
        back.setOnClickListener(v -> {
            Intent intent = new Intent(dynamicAct.this, MainActivity.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });

        increaseFontBtn = findViewById(R.id.increaseFontSize);
        increaseFontBtn.setOnClickListener(
                v -> {
                    if (currentFontSize < 30f) { // Max size limit
                        currentFontSize += 2f;
                        updateFontSize();
                    }
                }

              );

        decreaseFontBtn = findViewById(R.id.decreaseFontSize);
        decreaseFontBtn.setOnClickListener(
                v -> {
                    if (currentFontSize > 10f) { // Min size limit
                        currentFontSize -= 2f;
                        updateFontSize();
                    }
                }

        );


        template _template =staticVar.getSalat();
String titre =_template.getTitle();
String body =_template.getData();


        title = findViewById(R.id.title);
        title.setText(titre);

        String html = body;
        Spanned spanned;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            spanned = Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY);
        } else {
            spanned = Html.fromHtml(html);
        }

        componetes = findViewById(R.id.data);
        componetes.setText(spanned);
        componetes.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());



    }

    private void updateFontSize() {
        componetes.setTextSize(TypedValue.COMPLEX_UNIT_SP, currentFontSize);
        currentFontSizeTextView.setText(String.valueOf((int) currentFontSize));
    }
}