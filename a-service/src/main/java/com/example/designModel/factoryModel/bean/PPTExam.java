package com.example.designModel.factoryModel.bean;

import com.example.designModel.factoryModel.bean.Exam;

public class PPTExam implements Exam {


    @Override
    public void startExam() {
        System.out.println("开始ppt考试");
    }

    @Override
    public void endExam() {
        System.out.println("结束ppt考试");
    }
}
