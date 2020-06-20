package com.example.designModel.strategyModel;

public class ModelReportStrategy implements ReportStrategy {
    @Override
    public Report createReport(Long reportId) {
        System.out.println("调用模型生成报告啦");
        return new Report();
    }
}
