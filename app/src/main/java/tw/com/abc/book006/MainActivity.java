package tw.com.abc.book006;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTxtR;
    private EditText mEdtSex,mEdtAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtSex =(EditText) findViewById(R.id.edtSex);
        mEdtAge=(EditText)findViewById(R.id.edtAge);
    }
}
