package com.example.maggiesellerswork.audiofileanalyzer.model;

public class AudioFile {

    private String filename;
    private int position;
    private int analysis;
    //if analysis=1, the file has not been analzyed. If analysis = 2, the file does contain conversation. If analysis = 3, the file does not contain conversation.
    //Could I use a Boolean initially set to null?

    public AudioFile() {

    }

    public AudioFile(String filename, int position) {
        this.filename=filename;
        this.position=position;
        this.analysis=1;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getAnalysis() {
        return analysis;
    }

    public void setAnalysis(int analysis) {
        this.analysis = analysis;
    }
}
