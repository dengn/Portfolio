package dengn.portfolio;

import android.content.Context;
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
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String TOAST1 = "This app will launch my Sportify Streamer APP";
    private static final String TOAST2 = "This app will launch my Scores APP";
    private static final String TOAST3 = "This app will launch my Library APP";
    private static final String TOAST4 = "This app will launch my Build it bigger APP";
    private static final String TOAST5 = "This app will launch my XYZ Reader APP";
    private static final String TOAST6 = "This app will launch my Sportify Streamer APP";

    @InjectView(R.id.title)
    TextView title;

    @InjectView(R.id.button_sportify_streamer)
    Button buttonSportifyStreamer;

    @InjectView(R.id.button_scores_app)
    Button buttonScoresApp;

    @InjectView(R.id.button_library_app)
    Button buttonLibraryApp;

    @InjectView(R.id.button_build_it_bigger)
    Button buttonBuildItBigger;

    @InjectView(R.id.button_xyz_reader)
    Button buttonXyzReader;

    @InjectView(R.id.button_my_own_app)
    Button buttonMyOwnApp;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.inject(this);



    }


    private void setButtonToast(Button button, final String string) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setButtonSnackbar(Button button, final String string) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, string, Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });
    }

    @OnClick({
            R.id.button_sportify_streamer,
            R.id.button_scores_app,
            R.id.button_library_app,
            R.id.button_build_it_bigger,
            R.id.button_xyz_reader,
            R.id.button_my_own_app
            })
    public void onAnyButtonClick(View view){
        Button button = (Button) view;

        String buttonText = (String) button.getText();

        Context context = getApplicationContext();
        // open_app would add "Opens the app "
        CharSequence text = getString(R.string.open_app)
                + buttonText;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
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
