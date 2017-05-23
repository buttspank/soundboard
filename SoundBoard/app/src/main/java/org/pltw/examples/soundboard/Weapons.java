package org.pltw.examples.soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

public class Weapons extends MainActivity {
    private final int WHOLE_NOTE = 1000;
    public static final String TAG = Weapons.class.getName();

    public Button mWeapons1;

    private MediaPlayer mpW1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_weapons);

        mWeapons1 = (Button) findViewById(R.id.Weapons1);

        mpW1 = MediaPlayer.create(this, R.raw.blaster_imperial);
    }
}
