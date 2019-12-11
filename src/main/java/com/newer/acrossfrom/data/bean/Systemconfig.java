package com.newer.acrossfrom.data.bean;


public class Systemconfig {
    private Integer sysId;

    private String configCode;

    private String configName;

    private Integer configValueId;

    private String configValueName;

    private String sysIsStart;

    public Integer getSysId() {
        return sysId;
    }

    public void setSysId(Integer sysId) {
        this.sysId = sysId;
    }

    public String getConfigCode() {
        return configCode;
    }

    public void setConfigCode(String configCode) {
        this.configCode = configCode == null ? null : configCode.trim();
    }

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName == null ? null : configName.trim();
    }

    public Integer getConfigValueId() {
        return configValueId;
    }

    public void setConfigValueId(Integer configValueId) {
        this.configValueId = configValueId;
    }

    public String getConfigValueName() {
        return configValueName;
    }

    public void setConfigValueName(String configValueName) {
        this.configValueName = configValueName == null ? null : configValueName.trim();
    }

    public String getSysIsStart() {
        return sysIsStart;
    }

    public void setSysIsStart(String sysIsStart) {
        this.sysIsStart = sysIsStart == null ? null : sysIsStart.trim();
    }
}