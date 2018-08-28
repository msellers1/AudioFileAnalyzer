package com.example.maggiesellerswork.audiofileanalyzer.audiofiles;

import com.example.maggiesellerswork.audiofileanalyzer.model.AudioFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataProvider {

    public static List<AudioFile> audioFileList;
    public static Map<String, AudioFile> audioFileMap;

    static {
        audioFileList = new ArrayList<>();
        audioFileMap = new HashMap<>();

        addItem(new AudioFile("testing.mp3", 0));


    }

    private static void addItem(AudioFile file) {
        audioFileList.add(file);
        audioFileMap.put(file.getFilename(), file);
    }

}
