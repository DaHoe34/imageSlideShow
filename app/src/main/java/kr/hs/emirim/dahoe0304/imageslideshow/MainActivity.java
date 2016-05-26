package kr.hs.emirim.dahoe0304.imageslideshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper flip;
    EditText editTime;
    int time;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flip = (ViewFlipper) findViewById(R.id.view_flip);    //강제형변환은 (viewFlipper)
        //flip.setFlipInterval(1000); //1초니깐 1000.
        editTime=(EditText)findViewById(R.id.edit_time);
        Button but_start=(Button)findViewById(R.id.but_start);
        but_start.setOnClickListener(this);
        Button but_stop=(Button)findViewById(R.id.but_stop);
        but_stop.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but_start:
                time=(int)(Double.parseDouble(editTime.getText().toString())*1000);
                flip.setFlipInterval(time);
                flip.startFlipping();
                break;
            case R.id.but_stop:
                flip.stopFlipping();
                break;
        }
    }
}
