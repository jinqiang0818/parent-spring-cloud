package com.example.designModel.factoryModel.factoryMethod;

import com.example.designModel.factoryModel.bean.Exam;
import com.example.designModel.factoryModel.bean.OnlineExam;

public class OnlineExamFactory implements ExamFactory{

    @Override
    public Exam createExam() {
        return new OnlineExam();
    }
}
