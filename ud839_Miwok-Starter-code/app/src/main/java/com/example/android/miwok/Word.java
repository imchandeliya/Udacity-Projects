package com.example.android.miwok;

/**
 * Created by Aditya on 11-01-2018.
 */
public class Word
{
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    Word(String defaultTranslation, String miwokTranslation, int imageResourceId)
    {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;

    }
    Word(String defaultTranslation, String miwokTranslation)
    {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }
    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }
    public String getmDefaultTranslation()
    {
        return mDefaultTranslation;
    }
    public int getImageResourceId() {return mImageResourceId;}
    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
