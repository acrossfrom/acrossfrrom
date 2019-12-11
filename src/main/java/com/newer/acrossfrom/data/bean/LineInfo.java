package com.newer.acrossfrom.data.bean;

import java.math.BigDecimal;
import java.util.Date;

public class LineInfo {
    private BigDecimal lineId;

    private String lineCode;

    private String lineName;

    private BigDecimal lineLength;

    private BigDecimal backLength;

    private Date productDate;

    private BigDecimal voltageLevel;

    private BigDecimal lineStartPole;

    private BigDecimal lineEndPole;

    private BigDecimal towerBaseNum;

    private String maintenanceCompany;

    private BigDecimal runningSysId;

    private String common;

    private Date lineCreationTime;

    private BigDecimal lineCreatedId;

    private Date lineLastUpdateTime;

    private String lineIsStart;

    public BigDecimal getLineId() {
        return lineId;
    }

    public void setLineId(BigDecimal lineId) {
        this.lineId = lineId;
    }

    public String getLineCode() {
        return lineCode;
    }

    public void setLineCode(String lineCode) {
        this.lineCode = lineCode == null ? null : lineCode.trim();
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName == null ? null : lineName.trim();
    }

    public BigDecimal getLineLength() {
        return lineLength;
    }

    public void setLineLength(BigDecimal lineLength) {
        this.lineLength = lineLength;
    }

    public BigDecimal getBackLength() {
        return backLength;
    }

    public void setBackLength(BigDecimal backLength) {
        this.backLength = backLength;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public BigDecimal getVoltageLevel() {
        return voltageLevel;
    }

    public void setVoltageLevel(BigDecimal voltageLevel) {
        this.voltageLevel = voltageLevel;
    }

    public BigDecimal getLineStartPole() {
        return lineStartPole;
    }

    public void setLineStartPole(BigDecimal lineStartPole) {
        this.lineStartPole = lineStartPole;
    }

    public BigDecimal getLineEndPole() {
        return lineEndPole;
    }

    public void setLineEndPole(BigDecimal lineEndPole) {
        this.lineEndPole = lineEndPole;
    }

    public BigDecimal getTowerBaseNum() {
        return towerBaseNum;
    }

    public void setTowerBaseNum(BigDecimal towerBaseNum) {
        this.towerBaseNum = towerBaseNum;
    }

    public String getMaintenanceCompany() {
        return maintenanceCompany;
    }

    public void setMaintenanceCompany(String maintenanceCompany) {
        this.maintenanceCompany = maintenanceCompany == null ? null : maintenanceCompany.trim();
    }

    public BigDecimal getRunningSysId() {
        return runningSysId;
    }

    public void setRunningSysId(BigDecimal runningSysId) {
        this.runningSysId = runningSysId;
    }

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common == null ? null : common.trim();
    }

    public Date getLineCreationTime() {
        return lineCreationTime;
    }

    public void setLineCreationTime(Date lineCreationTime) {
        this.lineCreationTime = lineCreationTime;
    }

    public BigDecimal getLineCreatedId() {
        return lineCreatedId;
    }

    public void setLineCreatedId(BigDecimal lineCreatedId) {
        this.lineCreatedId = lineCreatedId;
    }

    public Date getLineLastUpdateTime() {
        return lineLastUpdateTime;
    }

    public void setLineLastUpdateTime(Date lineLastUpdateTime) {
        this.lineLastUpdateTime = lineLastUpdateTime;
    }

    public String getLineIsStart() {
        return lineIsStart;
    }

    public void setLineIsStart(String lineIsStart) {
        this.lineIsStart = lineIsStart == null ? null : lineIsStart.trim();
    }
}