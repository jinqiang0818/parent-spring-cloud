package com.example.designModel.wrapperModel;

public class ChioceQuestionWrapper implements ExamQuestion {

    private ExamQuestion examQuestion;

    public ChioceQuestionWrapper(ExamQuestion examQuestion) {
        this.examQuestion = examQuestion;
    }

    @Override
    public void show() {
        examQuestion.show();
        System.out.println("展示选项");
    }
}
