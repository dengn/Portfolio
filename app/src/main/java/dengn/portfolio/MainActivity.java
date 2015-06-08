package dengn.portfolio;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {

    private static final String TOAST1 = "This app will launch my Sportify Streamer APP";
    private static final String TOAST2 = "This app will launch my Scores APP";
    private static final String TOAST3 = "This app will launch my Library APP";
    private static final String TOAST4 = "This app will launch my Build it bigger APP";
    private static final String TOAST5 = "This app will launch my XYZ Reader APP";
    private static final String TOAST6 = "This app will launch my Sportify Streamer APP";

    @InjectView(R.id.title)
    TextView title;

    @InjectView(R.id.button)
    Button button;

    @InjectView(R.id.button2)
    Button button2;

    @InjectView(R.id.button3)
    Button button3;

    @InjectView(R.id.button4)
    Button button4;

    @InjectView(R.id.button5)
    Button button5;

    @InjectView(R.id.button6)
    Button button6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.inject(this);

        setButtonToast(button, TOAST1);
        setButtonToast(button2, TOAST2);
        setButtonToast(button3, TOAST3);
        setButtonToast(button4, TOAST4);
        setButtonToast(button5, TOAST5);
        setButtonToast(button6, TOAST6);
//        setButtonSnackbar(button, TOAST1);
//        setButtonSnackbar(button2, TOAST2);
//        setButtonSnackbar(button3, TOAST3);
//        setButtonSnackbar(button4, TOAST4);
//        setButtonSnackbar(button5, TOAST5);
//        setButtonSnackbar(button6, TOAST6);


    }

    private void setButtonToast(Button button, final String string){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setButtonSnackbar(Button button, final String string){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, string, Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
