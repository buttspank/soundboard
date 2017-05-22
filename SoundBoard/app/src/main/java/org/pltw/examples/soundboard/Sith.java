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
    public Button mVader1;
    public Button mVader2;
    public Button mVader3;
    private MediaPlayer mpDV1;
    private MediaPlayer mpDV2;
    private MediaPlayer mpDV3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sith);

        mVader1 = (Button) findViewById(R.id.vader1);
        mVader2 = (Button) findViewById(R.id.vader2);
        mVader3 = (Button) findViewById(R.id.vader3);
        mpDV1 = MediaPlayer.create(this, R.raw.darthvader_yourfather);
        mpDV2 = MediaPlayer.create(this, R.raw.darthvader_dontunderestimate);
        mpDV3 = MediaPlayer.create(this, R.raw.darthvader_failedme);
    }

    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SoundBoard", "Audio playback interrupted");
        }

    }

    public void onSith1Click(View view) {
        mpDV1.seekTo(0);
        Log.e(TAG, "Sith 1 clicked");
        mpDV1.start();
    }
}
