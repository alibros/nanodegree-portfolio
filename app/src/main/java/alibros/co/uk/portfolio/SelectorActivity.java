package alibros.co.uk.portfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class SelectorActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);
        ButterKnife.inject(this);
    }


    @OnClick (R.id.button_streamer) void streamerPressed(){
        showToastWithText("Streamer App will be launched.");
    }

    @OnClick (R.id.button_scores) void scoresPressed(){
        showToastWithText("Scores App will be launched.");
    }

    @OnClick (R.id.button_library) void libraryPressed(){
        showToastWithText("Library App will be launched.");
    }

    @OnClick (R.id.button_build_bigger) void buildBiggerPressed(){
        showToastWithText("Build it bigger App will be launched.");

    }

    @OnClick (R.id.button_xyz_reader) void xyzReaderPressed(){
        showToastWithText("XYZ reader App will be launched.");

    }

    @OnClick (R.id.button_capstone) void capstonePressed(){
        showToastWithText("My own App will be launched.");

    }


    private void showToastWithText(String text){
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_selector, menu);
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
