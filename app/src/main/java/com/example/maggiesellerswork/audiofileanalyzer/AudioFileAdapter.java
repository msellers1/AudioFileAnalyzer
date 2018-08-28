package com.example.maggiesellerswork.audiofileanalyzer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.maggiesellerswork.audiofileanalyzer.model.AudioFile;

import java.util.List;



public class AudioFileAdapter extends RecyclerView.Adapter<AudioFileAdapter.ViewHolder>{
    private List<AudioFile> mFiles;
    private Context mContext;

    public AudioFileAdapter(Context context, List<AudioFile> files) {
        this.mContext=context;
        this.mFiles=files;
    }

    @Override
    public AudioFileAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View itemView = inflater.inflate(R.layout.audio_file, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(AudioFileAdapter.ViewHolder holder, int position) {
        AudioFile audioFile = mFiles.get(position);

        holder.tvName.setText(audioFile.getFilename());


    }

    @Override
    public int getItemCount() {
        return mFiles.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView tvName;
        public View mView;
        //public ImageView analysisStatus;
        //public ImageButton mPlayButton;
        //public ImageButton mPauseButton;
        public ImageButton mDeleteButton;
        public Button mAnalyze;
        public Button mViewResults;
        public ViewHolder(View itemView) {
            super(itemView);

            tvName= (TextView) itemView.findViewById(R.id.fileNameText);
            mView=itemView;
            //analysisStatus = (ImageView) itemView.findViewById(R.id.analysisStatus);
            //mPlayButton = (ImageButton) itemView.findViewById(R.id.playButton);
            //mPauseButton = (ImageButton) itemView.findViewById(R.id.pauseButton);
            mDeleteButton = (ImageButton) itemView.findViewById(R.id.deleteButton);
            mAnalyze = (Button) itemView.findViewById(R.id.analyze);
            mViewResults = (Button) itemView.findViewById(R.id.viewResults);
            //mPlayButton.setOnClickListener(this);
            //mPauseButton.setOnClickListener(this);
            mDeleteButton.setOnClickListener(this);
            mAnalyze.setOnClickListener(this);
            mViewResults.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {
            if (v.getId() == mAnalyze.getId()) {
                //Run analysis code.
                //Set first image view accordingly
            } else if (v.getId()==mDeleteButton.getId()) {
                //Delete audio file
                //set View Results button to visible
            } else if (v.getId() == mViewResults.getId()) {
                //pass the AudioFile object in an intent
                //display the audio file in a new screen
            }
            }

    }


}
