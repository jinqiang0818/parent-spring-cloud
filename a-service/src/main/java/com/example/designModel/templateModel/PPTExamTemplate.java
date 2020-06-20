package com.example.designModel.templateModel;

public class PPTExamTemplate extends ExamTemplate {
    @Override
    void setExamInfo() {
        System.out.println("设置ppt的信息啦");
    }

    @Override
    void selectPaper() {
        System.out.println("选择ppt的试卷啦");
    }

    @Override
    void selectCandidate() {
        System.out.println("选择ppt的考生啦");
    }

    @Override
    void otherSet() {
        System.out.println("ppt的其他设置啦");
    }
}
