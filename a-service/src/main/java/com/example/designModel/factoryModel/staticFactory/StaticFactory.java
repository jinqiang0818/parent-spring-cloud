package com.example.designModel.factoryModel.staticFactory;

import com.example.designModel.factoryModel.bean.Exam;
import com.example.designModel.factoryModel.bean.OnlineExam;
import com.example.designModel.factoryModel.bean.PPTExam;
import com.example.designModel.factoryModel.bean.TestExam;

public class StaticFactory {

    public static Exam getExam(String flag) {
        if ("online".equals(flag)) {
            return new OnlineExam();
        }else if ("ppt".equals(flag)) {
            return new PPTExam();
        }else {
            return new TestExam();
        }

    }
}
