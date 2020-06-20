package com.example.designModel.strategyModel;

import org.springframework.beans.factory.annotation.Autowired;

public class ReportHandler {

    @Autowired
    ReportStrategyDispatcher reportStrategyDispatcher;

    public Report pullReport(String scene, Long reportId) {
        ReportStrategy reportStrategy = reportStrategyDispatcher.getReportStrategy(scene);
        return reportStrategy.createReport(reportId);
    }

}
