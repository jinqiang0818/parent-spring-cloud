package com.example.designModel.wrapperModel;

public class WrapperModelTest {
    public static void main(String[] args) {
        new CaseQuestionWrapper(new ChioceQuestionWrapper(new TextQuestionWrapper())).show();
    }
}
