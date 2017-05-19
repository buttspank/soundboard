package org.pltw.examples.soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by anthony90113 on 5/18/2017.
 */
public class Sith extends MainActivity {
    private final int WHOLE_NOTE = 1000;
    public static final String TAG = Sith.class.getName();
    public Button mVader;
    //public Button mFbutton;
    private MediaPlayer mpDV1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sith);

        mVader = (Button) findViewById(R.id.vader);
        //mFbutton = (Button) findViewById(R.id.fButton);
        mpDV1 = MediaPlayer.create(this, R.raw.darthvader_yourfather);
    }

    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SoundBoard", "Audio playback interrupted");
        }

    }

    public void onButton1Click(View view) {
        mpDV1.seekTo(0);
        Log.e(TAG, "Button 1 clicked");
        mpDV1.start();
    }
}
