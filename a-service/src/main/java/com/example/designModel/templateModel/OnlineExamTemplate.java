package com.example.designModel.templateModel;

public class OnlineExamTemplate extends ExamTemplate {
    @Override
    void setExamInfo() {
        System.out.println("在线考试 考试基本设置");
    }

    @Override
    void selectPaper() {
        System.out.println("选择在线考试的试卷啦");
    }

    @Override
    void selectCandidate() {
        System.out.println("选择考生的啦");
    }

    @Override
    void otherSet() {
        System.out.println("其他设置的啦");
    }
}
