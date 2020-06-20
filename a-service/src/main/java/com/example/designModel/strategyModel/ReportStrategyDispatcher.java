package com.example.designModel.strategyModel;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class ReportStrategyDispatcher {

    private static Map<String, ReportStrategy> strategyMap = new HashMap<>();

    @PostConstruct
    public void initStrategyMap() {
        strategyMap.put("1", new DefaultReportStrategy());
        strategyMap.put("2",new ModelReportStrategy());
    }

    public ReportStrategy getReportStrategy(String scene) {
        return strategyMap.get(scene);
    }
}
