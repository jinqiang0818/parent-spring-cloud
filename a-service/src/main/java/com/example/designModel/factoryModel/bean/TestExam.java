package com.example.designModel.factoryModel.bean;

import com.example.designModel.factoryModel.bean.Exam;

public class TestExam implements Exam {
    @Override
    public void startExam() {
        System.out.println("开始文本考试");
    }

    @Override
    public void endExam() {
        System.out.println("结束文本考试");
    }
}
