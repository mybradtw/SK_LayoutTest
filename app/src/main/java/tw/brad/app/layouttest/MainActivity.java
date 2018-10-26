package tw.brad.app.layouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private String answer;
    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        answer = createAnswer();
        input = findViewById(R.id.main_input);

    }

    private String createAnswer(){
        // TODO
        return "123";
    }

    public void guess(View view) {
        String inputText = input.getText().toString();
        Log.v("brad", inputText);
    }
}
