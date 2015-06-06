package myappportfolio.hiteshkumar.com.myappportfolio;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MyAppPortfolioActivity extends AppCompatActivity {

    private Toast mAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);

    }

    public void launchApp(View view) {
        String appName = null;
        Resources res = getResources();
        switch (view.getId()) {
            case R.id.spotifyButton:
                appName = res.getString(R.string.spotify_streamer);
                break;
            case R.id.scoresButton:
                appName = res.getString(R.string.scores_app);
                break;
            case R.id.libraryButton:
                appName = res.getString(R.string.library_app);
                break;
            case R.id.builditButton:
                appName = res.getString(R.string.build_it_bigger);
                break;
            case R.id.xyzButton:
                appName = res.getString(R.string.xyz_render);
                break;
            case R.id.myownButton:
                appName = res.getString(R.string.my_own_app);
                break;
            default:

        }
        if (mAppToast != null) {
            mAppToast.cancel();
        }

        mAppToast = Toast.makeText(this, String.format(getResources().getString(R.string.toast_messages), appName), Toast.LENGTH_SHORT);
        mAppToast.show();
    }
}
