package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mAudio;
    private int mImageResourceId = no_image;
    private static final int no_image = -1;

    public Word(String defaultTranslation, String miwokTranslation, int audio) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudio = audio;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audio) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudio = audio;
        mImageResourceId = imageResourceId;
    }

        public String getDefaultTranslation() {
        return mDefaultTranslation;
        }

        public String getMiwokTranslation() {
        return mMiwokTranslation;
        }

        public int getAudio(){
        return mAudio;
        }

        public int getmImageResourceId() {
        return mImageResourceId;
    }

public boolean hasImage(){
return mImageResourceId != no_image;
}

    public int getAudioResourceId() {
        return mAudio;
    }
}
