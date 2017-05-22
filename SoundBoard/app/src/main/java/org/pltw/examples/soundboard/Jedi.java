package org.pltw.examples.soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by anthony90113 on 5/18/2017.
 */
public class Jedi extends MainActivity {
    private Button jedi1;
    private Button jedi2;
    private Button jedi3;
    private Button jedi4;
    private Button jedi5;
    private Button jedi6;
    private MediaPlayer jedSound1;
    private MediaPlayer jedSound2;
    private MediaPlayer jedSound3;
    private MediaPlayer jedSound4;
    private MediaPlayer jedSound5;
    private MediaPlayer jedSound6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_jedi);
        
    }
}
