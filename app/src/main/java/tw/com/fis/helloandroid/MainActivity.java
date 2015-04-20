package tw.com.fis.helloandroid;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;//MenuItem is a interface //byray//.view is name of package
//byray//http://developer.android.com/reference/android/view/MenuItem.html


public class MainActivity extends ActionBarActivity {//byray//extends=繼承

    @Override//byray//覆蓋的動作//annotation語法有@的
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//byray//super是繼承另一個matter
        setContentView(R.layout.activity_main);//byray//載入畫面view

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
