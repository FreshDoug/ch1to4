package com.example.doug.geoquiz;

/**
 * Created by Doug 2281724 on 3/20/2016.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    // gets the resource id of the question; always int;
    public int getTextResId() {
        return mTextResId;
    }

    // sets the active text id; new value is passed on call
    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    // returns if answer is true or false
    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    // sets the active answer value T/F; new value is passed on call
    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    // begins the question series; allows questions to switch on next toast;
    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }
}
