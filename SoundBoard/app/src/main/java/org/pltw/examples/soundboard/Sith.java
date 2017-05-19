package org.pltw.examples.soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by anthony90113 on 5/18/2017.
 */
public class Sith extends MainActivity {
    private final int WHOLE_NOTE = 1000;
    public static final String TAG = Sith.class.getName();
    public Button mVader;
    //public Button mFbutton;
    private MediaPlayer mDV1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sith);

        mVader = (Button) findViewById(R.id.vader);
        //mFbutton = (Button) findViewById(R.id.fButton);
        mDV1 = MediaPlayer.create(this, R.raw.darthvader_yourfather);
    }
}
