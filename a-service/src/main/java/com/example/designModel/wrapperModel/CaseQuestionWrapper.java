package com.example.designModel.wrapperModel;

public class CaseQuestionWrapper implements ExamQuestion {

    private ExamQuestion examQuestion;

    public CaseQuestionWrapper(ExamQuestion examQuestion) {
        this.examQuestion = examQuestion;
    }

    @Override
    public void show() {
        System.out.println("展示案例");
        examQuestion.show();
    }
}
