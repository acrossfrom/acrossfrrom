package com.newer.acrossfrom.data.bean;

import java.math.BigDecimal;
import java.util.Date;

public class PoleInfo {
    private BigDecimal poleId;

    private String poleCode;

    private Date poleCreationTime;

    private String poleCreatedBy;

    private Date poleLastUpdateTime;

    private String poleIsStart;

    public BigDecimal getPoleId() {
        return poleId;
    }

    public void setPoleId(BigDecimal poleId) {
        this.poleId = poleId;
    }

    public String getPoleCode() {
        return poleCode;
    }

    public void setPoleCode(String poleCode) {
        this.poleCode = poleCode == null ? null : poleCode.trim();
    }

    public Date getPoleCreationTime() {
        return poleCreationTime;
    }

    public void setPoleCreationTime(Date poleCreationTime) {
        this.poleCreationTime = poleCreationTime;
    }

    public String getPoleCreatedBy() {
        return poleCreatedBy;
    }

    public void setPoleCreatedBy(String poleCreatedBy) {
        this.poleCreatedBy = poleCreatedBy == null ? null : poleCreatedBy.trim();
    }

    public Date getPoleLastUpdateTime() {
        return poleLastUpdateTime;
    }

    public void setPoleLastUpdateTime(Date poleLastUpdateTime) {
        this.poleLastUpdateTime = poleLastUpdateTime;
    }

    public String getPoleIsStart() {
        return poleIsStart;
    }

    public void setPoleIsStart(String poleIsStart) {
        this.poleIsStart = poleIsStart == null ? null : poleIsStart.trim();
    }
}