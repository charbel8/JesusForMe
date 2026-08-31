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
import androidx.activity.OnBackPressedCallback;
import com.charbel.jesusforme.data.template;

public class dynamicAct extends AppCompatActivity {

    private Button back;
    private TextView title;
    private TextView componetes;
    private TextView currentFontSizeTextView;
    private float currentFontSize = 16f;
    Button increaseFontBtn ;
    Button decreaseFontBtn ;
    Button exportBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_prayer);

        // Keep screen on
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        // Handle system back gesture/button (replaces onBackPressed)
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                navigateToMain();
            }
        });

        currentFontSizeTextView = findViewById(R.id.currentFontSize);

        back = findViewById(R.id.back);
        back.setOnClickListener(v -> {
            Intent intent = new Intent(dynamicAct.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

        increaseFontBtn = findViewById(R.id.increaseFontSize);
        increaseFontBtn.setOnClickListener(
                v -> {
                    if (currentFontSize < 30f) {
                        currentFontSize += 2f;
                        updateFontSize();
                    }
                }
        );

        decreaseFontBtn = findViewById(R.id.decreaseFontSize);
        decreaseFontBtn.setOnClickListener(
                v -> {
                    if (currentFontSize > 10f) {
                        currentFontSize -= 2f;
                        updateFontSize();
                    }
                }
        );

        template _template = staticVar.getSalat();
        String titre = _template.getTitle();
        String body = _template.getData();

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

        // Export button: share the prayer title + text via the Android share sheet
        exportBtn = findViewById(R.id.export);
        exportBtn.setOnClickListener(v -> exportPrayer(titre, componetes.getText().toString()));
    }

    private void exportPrayer(String titre, String bodyText) {
        String shareText = titre + "\n\n" + bodyText;

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, titre);
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);

        startActivity(Intent.createChooser(shareIntent, "مشاركة الصلاة"));
    }

    private void navigateToMain() {
        Intent intent = new Intent(dynamicAct.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

    private void updateFontSize() {
        componetes.setTextSize(TypedValue.COMPLEX_UNIT_SP, currentFontSize);
        currentFontSizeTextView.setText(String.valueOf((int) currentFontSize));
    }
}
