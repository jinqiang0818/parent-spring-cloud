package com.example.designModel.templateModel;

public class TemplateModelTest {

    public static void main(String[] args) {
        ExamTemplate onlineExamTemplate = new OnlineExamTemplate();
        onlineExamTemplate.createExam();

        ExamTemplate pptExamTemplate = new PPTExamTemplate();
        pptExamTemplate.createExam();
    }
}
