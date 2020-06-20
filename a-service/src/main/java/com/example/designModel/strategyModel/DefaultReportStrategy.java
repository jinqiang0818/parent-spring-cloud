package com.example.designModel.strategyModel;

public class DefaultReportStrategy implements ReportStrategy {
    @Override
    public Report createReport(Long reportId) {

        System.out.println("采用默认的方式生成报告啦");
        return new Report();
    }
}
