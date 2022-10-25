package com.example.rulesenginepoc.model;

public class RoutingLogicBaseArgs {

    private String operation;

    private String cdoId;

    private String resource;

    private String appId;

    public RoutingLogicBaseArgs() {
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getCdoId() {
        return cdoId;
    }

    public void setCdoId(String cdoId) {
        this.cdoId = cdoId;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        return "RoutingLogicBaseArgs{" +
                "operation='" + operation + '\'' +
                ", cdoId='" + cdoId + '\'' +
                ", resource='" + resource + '\'' +
                ", appId='" + appId + '\'' +
                '}';
    }
}
