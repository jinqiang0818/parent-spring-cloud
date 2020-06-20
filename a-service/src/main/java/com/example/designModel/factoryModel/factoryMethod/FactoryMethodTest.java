package com.example.designModel.factoryModel.factoryMethod;

public class FactoryMethodTest {

    public static void main(String[] args) {

        ExamFactory onlineExamFactory = new OnlineExamFactory();
        onlineExamFactory.createExam();

        ExamFactory pptExamFactory = new PPTExamFactory();
        pptExamFactory.createExam();
    }

}
