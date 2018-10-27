package tw.brad.app.layouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

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
        HashSet<Integer> set = new HashSet<>();
        while (set.size()<3){
            set.add((int)(Math.random()*10));
        }
        LinkedList<Integer> list = new LinkedList<>();
        for (Integer i : set){
            list.add(i);
        }
        Collections.shuffle(list);
        String ret = "";
        for (Integer i : list){
            ret += i;
        }
        Log.v("brad", ret);
        return ret;
    }

    private String checkAB(String guess){
        // answer, guess
        // byte, short, int. long
        // float, double
        // char
        // boolean
        int A, B; A = B = 0;

        for (int i = 0; i<answer.length(); i++){
            if (guess.charAt(i) == answer.charAt(i)){
                A++;
            }else if (answer.indexOf(guess.charAt(i)) != -1){
                B++;
            }
        }
        return A + "A" + B + "B";
    }

    public void guess(View view) {
        String inputText = input.getText().toString();
        Log.v("brad", inputText);
        String result = checkAB(inputText);
        Log.v("brad", result);

    }
}
