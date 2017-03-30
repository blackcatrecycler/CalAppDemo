package top.recyclerblacat.calappdemp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int FirstNum=0;
    private boolean Op=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t = (TextView) this.findViewById(R.id.Txt1);
        t.setText("0");
    }

    public void  Btn1Click(View v){
        TextView t = (TextView) this.findViewById(R.id.Txt1);
        if(t.getText()=="0") t.setText("");
        t.setText(t.getText()+"1");
    }

    public void  BtnAddClick(View v){
        Op=true;
        TextView t = (TextView) this.findViewById(R.id.Txt1);
        FirstNum = Integer.parseInt(t.getText().toString());
        t.setText("0");
    }

    public void  BtnEqualClick(View v){
        if(Op){
            TextView t = (TextView) this.findViewById(R.id.Txt1);
            int nowInt = Integer.parseInt(t.getText().toString());
            nowInt+=FirstNum;
            FirstNum=0;
            Op=false;
            String result = String.valueOf(nowInt);
            t.setText(result);
        }
    }
}
