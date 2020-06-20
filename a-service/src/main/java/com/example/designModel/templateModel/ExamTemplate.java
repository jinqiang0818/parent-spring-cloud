package com.example.designModel.templateModel;

public abstract class ExamTemplate {

    abstract void setExamInfo();

    abstract void selectPaper();

    abstract void selectCandidate();

    abstract void otherSet();

    protected void createExam() {
        setExamInfo();
        selectPaper();
        selectCandidate();
        otherSet();
    }


}
