package com.newer.acrossfrom.data.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Inspectiontask {
    private BigDecimal inspectId;

    private BigDecimal inspectTaskId;

    private BigDecimal inspectPoleId;

    private BigDecimal inspectLineId;

    private String isBug;

    private String intactRate;

    private BigDecimal bugLevel;

    private BigDecimal bugType;

    private String bugDesc;

    private BigDecimal discovererId;

    private Date discoverTime;

    private String isSolve;

    private String isBugLevel;

    private Date inspectTime;

    private Date inspectCreationTime;

    private String inspectCreatedBy;

    private Date inspectLastUpdateTime;

    public BigDecimal getInspectId() {
        return inspectId;
    }

    public void setInspectId(BigDecimal inspectId) {
        this.inspectId = inspectId;
    }

    public BigDecimal getInspectTaskId() {
        return inspectTaskId;
    }

    public void setInspectTaskId(BigDecimal inspectTaskId) {
        this.inspectTaskId = inspectTaskId;
    }

    public BigDecimal getInspectPoleId() {
        return inspectPoleId;
    }

    public void setInspectPoleId(BigDecimal inspectPoleId) {
        this.inspectPoleId = inspectPoleId;
    }

    public BigDecimal getInspectLineId() {
        return inspectLineId;
    }

    public void setInspectLineId(BigDecimal inspectLineId) {
        this.inspectLineId = inspectLineId;
    }

    public String getIsBug() {
        return isBug;
    }

    public void setIsBug(String isBug) {
        this.isBug = isBug == null ? null : isBug.trim();
    }

    public String getIntactRate() {
        return intactRate;
    }

    public void setIntactRate(String intactRate) {
        this.intactRate = intactRate == null ? null : intactRate.trim();
    }

    public BigDecimal getBugLevel() {
        return bugLevel;
    }

    public void setBugLevel(BigDecimal bugLevel) {
        this.bugLevel = bugLevel;
    }

    public BigDecimal getBugType() {
        return bugType;
    }

    public void setBugType(BigDecimal bugType) {
        this.bugType = bugType;
    }

    public String getBugDesc() {
        return bugDesc;
    }

    public void setBugDesc(String bugDesc) {
        this.bugDesc = bugDesc == null ? null : bugDesc.trim();
    }

    public BigDecimal getDiscovererId() {
        return discovererId;
    }

    public void setDiscovererId(BigDecimal discovererId) {
        this.discovererId = discovererId;
    }

    public Date getDiscoverTime() {
        return discoverTime;
    }

    public void setDiscoverTime(Date discoverTime) {
        this.discoverTime = discoverTime;
    }

    public String getIsSolve() {
        return isSolve;
    }

    public void setIsSolve(String isSolve) {
        this.isSolve = isSolve == null ? null : isSolve.trim();
    }

    public String getIsBugLevel() {
        return isBugLevel;
    }

    public void setIsBugLevel(String isBugLevel) {
        this.isBugLevel = isBugLevel == null ? null : isBugLevel.trim();
    }

    public Date getInspectTime() {
        return inspectTime;
    }

    public void setInspectTime(Date inspectTime) {
        this.inspectTime = inspectTime;
    }

    public Date getInspectCreationTime() {
        return inspectCreationTime;
    }

    public void setInspectCreationTime(Date inspectCreationTime) {
        this.inspectCreationTime = inspectCreationTime;
    }

    public String getInspectCreatedBy() {
        return inspectCreatedBy;
    }

    public void setInspectCreatedBy(String inspectCreatedBy) {
        this.inspectCreatedBy = inspectCreatedBy == null ? null : inspectCreatedBy.trim();
    }

    public Date getInspectLastUpdateTime() {
        return inspectLastUpdateTime;
    }

    public void setInspectLastUpdateTime(Date inspectLastUpdateTime) {
        this.inspectLastUpdateTime = inspectLastUpdateTime;
    }
}