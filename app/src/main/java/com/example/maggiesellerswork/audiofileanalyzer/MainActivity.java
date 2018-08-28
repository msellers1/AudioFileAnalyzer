package com.example.maggiesellerswork.audiofileanalyzer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.maggiesellerswork.audiofileanalyzer.audiofiles.DataProvider;
import com.example.maggiesellerswork.audiofileanalyzer.model.AudioFile;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<AudioFile> audioFileList = DataProvider.audioFileList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AudioFileAdapter adapter = new AudioFileAdapter(this, audioFileList);

        RecyclerView recyclerView =(RecyclerView) findViewById(R.id.rvItems);
        recyclerView.setAdapter(adapter);
    }
}
