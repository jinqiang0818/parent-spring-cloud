package com.example.designModel.factoryModel.factoryMethod;

import com.example.designModel.factoryModel.bean.Exam;
import com.example.designModel.factoryModel.bean.PPTExam;

public class PPTExamFactory implements ExamFactory{
    @Override
    public Exam createExam() {
        return new PPTExam();
    }
}
