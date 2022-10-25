package com.example.rulesenginepoc.model;

public class UnitOfWorkDecider {

    private String operationId;

    private String configType;

    private String orchestratorUuid;

    public UnitOfWorkDecider(String operationId, String configType, String orchestratorUuid) {
        this.operationId = operationId;
        this.configType = configType;
        this.orchestratorUuid = orchestratorUuid;
    }

    public UnitOfWorkDecider() {
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public String getConfigType() {
        return configType;
    }

    public void setConfigType(String configType) {
        this.configType = configType;
    }

    public String getOrchestratorUuid() {
        return orchestratorUuid;
    }

    public void setOrchestratorUuid(String orchestratorUuid) {
        this.orchestratorUuid = orchestratorUuid;
    }

    @Override
    public String toString() {
        return "UnitOfWorkDecider{" +
                "operationId='" + operationId + '\'' +
                ", configType='" + configType + '\'' +
                ", orchestratorUuid='" + orchestratorUuid + '\'' +
                '}';
    }
}
