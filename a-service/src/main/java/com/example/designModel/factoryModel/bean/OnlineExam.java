package com.example.designModel.factoryModel.bean;

import com.example.designModel.factoryModel.bean.Exam;

public class OnlineExam implements Exam {
    @Override
    public void startExam() {
        System.out.println("开始在线考试");
    }

    @Override
    public void endExam() {
        System.out.println("结束在线考试");
    }
}
