package cn.lvpeng.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DiabetesFollowUpInfo implements Serializable {
    private Integer detailid;

    private Integer followupid;

    private String regularactivities;

    private String activityfrequency;

    private String eachduration;

    private String dietarystatus;

    private Short diabetessymptoms;

    private String diabetessymptomssupplement;

    private Short hypoglycemicreaction;

    private Short systolicpressure;

    private Short diastolicpressure;

    private BigDecimal height;

    private BigDecimal weight;

    private BigDecimal targetweight;

    private BigDecimal constitutionalindex;

    private BigDecimal targetconstitutionalindex;

    private Short footdorsalartery;

    private String othersigns;

    private Short dailysmoking;

    private Short targetdailysmoking;

    private Short dailyalcohol;

    private Short targetdailyalcohol;

    private Short weeklyexercisesnumber;

    private Short targetweeklyexercisesnumber;

    private Short exerciseduration;

    private Short targetexerciseduration;

    private Short saltuptake;

    private Short targetsaltuptake;

    private Short psychologicaladjustment;

    private Short compliancebehavior;

    private BigDecimal fastingbloodsugar;

    private BigDecimal glycosylatedhemoglobin;

    private Date inspectiondate;

    private BigDecimal supplementaryexamination;

    private Short medicationcompliance;

    private Short adversedrugreactions;

    private String diabetesmedicinesinfo;

    private String drugname;

    private BigDecimal eachdose;

    private String doseunit;

    private BigDecimal insulinperdose;

    private String insulindoseunit;

    private Short diabetesfollowuptype;

    private Short diabetesfollowuptypesupplement;

    private String referralagency;

    private String referralcauses;

    private Short turnover;

    private Date createtime;

    private String lastmodifieruser;

    private Date lastmodificationtime;

    private Boolean isdeleted;

    private Date deletedtime;

    private static final long serialVersionUID = 1L;

    public Integer getDetailid() {
        return detailid;
    }

    public void setDetailid(Integer detailid) {
        this.detailid = detailid;
    }

    public Integer getFollowupid() {
        return followupid;
    }

    public void setFollowupid(Integer followupid) {
        this.followupid = followupid;
    }

    public String getRegularactivities() {
        return regularactivities;
    }

    public void setRegularactivities(String regularactivities) {
        this.regularactivities = regularactivities == null ? null : regularactivities.trim();
    }

    public String getActivityfrequency() {
        return activityfrequency;
    }

    public void setActivityfrequency(String activityfrequency) {
        this.activityfrequency = activityfrequency == null ? null : activityfrequency.trim();
    }

    public String getEachduration() {
        return eachduration;
    }

    public void setEachduration(String eachduration) {
        this.eachduration = eachduration == null ? null : eachduration.trim();
    }

    public String getDietarystatus() {
        return dietarystatus;
    }

    public void setDietarystatus(String dietarystatus) {
        this.dietarystatus = dietarystatus == null ? null : dietarystatus.trim();
    }

    public Short getDiabetessymptoms() {
        return diabetessymptoms;
    }

    public void setDiabetessymptoms(Short diabetessymptoms) {
        this.diabetessymptoms = diabetessymptoms;
    }

    public String getDiabetessymptomssupplement() {
        return diabetessymptomssupplement;
    }

    public void setDiabetessymptomssupplement(String diabetessymptomssupplement) {
        this.diabetessymptomssupplement = diabetessymptomssupplement == null ? null : diabetessymptomssupplement.trim();
    }

    public Short getHypoglycemicreaction() {
        return hypoglycemicreaction;
    }

    public void setHypoglycemicreaction(Short hypoglycemicreaction) {
        this.hypoglycemicreaction = hypoglycemicreaction;
    }

    public Short getSystolicpressure() {
        return systolicpressure;
    }

    public void setSystolicpressure(Short systolicpressure) {
        this.systolicpressure = systolicpressure;
    }

    public Short getDiastolicpressure() {
        return diastolicpressure;
    }

    public void setDiastolicpressure(Short diastolicpressure) {
        this.diastolicpressure = diastolicpressure;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getTargetweight() {
        return targetweight;
    }

    public void setTargetweight(BigDecimal targetweight) {
        this.targetweight = targetweight;
    }

    public BigDecimal getConstitutionalindex() {
        return constitutionalindex;
    }

    public void setConstitutionalindex(BigDecimal constitutionalindex) {
        this.constitutionalindex = constitutionalindex;
    }

    public BigDecimal getTargetconstitutionalindex() {
        return targetconstitutionalindex;
    }

    public void setTargetconstitutionalindex(BigDecimal targetconstitutionalindex) {
        this.targetconstitutionalindex = targetconstitutionalindex;
    }

    public Short getFootdorsalartery() {
        return footdorsalartery;
    }

    public void setFootdorsalartery(Short footdorsalartery) {
        this.footdorsalartery = footdorsalartery;
    }

    public String getOthersigns() {
        return othersigns;
    }

    public void setOthersigns(String othersigns) {
        this.othersigns = othersigns == null ? null : othersigns.trim();
    }

    public Short getDailysmoking() {
        return dailysmoking;
    }

    public void setDailysmoking(Short dailysmoking) {
        this.dailysmoking = dailysmoking;
    }

    public Short getTargetdailysmoking() {
        return targetdailysmoking;
    }

    public void setTargetdailysmoking(Short targetdailysmoking) {
        this.targetdailysmoking = targetdailysmoking;
    }

    public Short getDailyalcohol() {
        return dailyalcohol;
    }

    public void setDailyalcohol(Short dailyalcohol) {
        this.dailyalcohol = dailyalcohol;
    }

    public Short getTargetdailyalcohol() {
        return targetdailyalcohol;
    }

    public void setTargetdailyalcohol(Short targetdailyalcohol) {
        this.targetdailyalcohol = targetdailyalcohol;
    }

    public Short getWeeklyexercisesnumber() {
        return weeklyexercisesnumber;
    }

    public void setWeeklyexercisesnumber(Short weeklyexercisesnumber) {
        this.weeklyexercisesnumber = weeklyexercisesnumber;
    }

    public Short getTargetweeklyexercisesnumber() {
        return targetweeklyexercisesnumber;
    }

    public void setTargetweeklyexercisesnumber(Short targetweeklyexercisesnumber) {
        this.targetweeklyexercisesnumber = targetweeklyexercisesnumber;
    }

    public Short getExerciseduration() {
        return exerciseduration;
    }

    public void setExerciseduration(Short exerciseduration) {
        this.exerciseduration = exerciseduration;
    }

    public Short getTargetexerciseduration() {
        return targetexerciseduration;
    }

    public void setTargetexerciseduration(Short targetexerciseduration) {
        this.targetexerciseduration = targetexerciseduration;
    }

    public Short getSaltuptake() {
        return saltuptake;
    }

    public void setSaltuptake(Short saltuptake) {
        this.saltuptake = saltuptake;
    }

    public Short getTargetsaltuptake() {
        return targetsaltuptake;
    }

    public void setTargetsaltuptake(Short targetsaltuptake) {
        this.targetsaltuptake = targetsaltuptake;
    }

    public Short getPsychologicaladjustment() {
        return psychologicaladjustment;
    }

    public void setPsychologicaladjustment(Short psychologicaladjustment) {
        this.psychologicaladjustment = psychologicaladjustment;
    }

    public Short getCompliancebehavior() {
        return compliancebehavior;
    }

    public void setCompliancebehavior(Short compliancebehavior) {
        this.compliancebehavior = compliancebehavior;
    }

    public BigDecimal getFastingbloodsugar() {
        return fastingbloodsugar;
    }

    public void setFastingbloodsugar(BigDecimal fastingbloodsugar) {
        this.fastingbloodsugar = fastingbloodsugar;
    }

    public BigDecimal getGlycosylatedhemoglobin() {
        return glycosylatedhemoglobin;
    }

    public void setGlycosylatedhemoglobin(BigDecimal glycosylatedhemoglobin) {
        this.glycosylatedhemoglobin = glycosylatedhemoglobin;
    }

    public Date getInspectiondate() {
        return inspectiondate;
    }

    public void setInspectiondate(Date inspectiondate) {
        this.inspectiondate = inspectiondate;
    }

    public BigDecimal getSupplementaryexamination() {
        return supplementaryexamination;
    }

    public void setSupplementaryexamination(BigDecimal supplementaryexamination) {
        this.supplementaryexamination = supplementaryexamination;
    }

    public Short getMedicationcompliance() {
        return medicationcompliance;
    }

    public void setMedicationcompliance(Short medicationcompliance) {
        this.medicationcompliance = medicationcompliance;
    }

    public Short getAdversedrugreactions() {
        return adversedrugreactions;
    }

    public void setAdversedrugreactions(Short adversedrugreactions) {
        this.adversedrugreactions = adversedrugreactions;
    }

    public String getDiabetesmedicinesinfo() {
        return diabetesmedicinesinfo;
    }

    public void setDiabetesmedicinesinfo(String diabetesmedicinesinfo) {
        this.diabetesmedicinesinfo = diabetesmedicinesinfo == null ? null : diabetesmedicinesinfo.trim();
    }

    public String getDrugname() {
        return drugname;
    }

    public void setDrugname(String drugname) {
        this.drugname = drugname == null ? null : drugname.trim();
    }

    public BigDecimal getEachdose() {
        return eachdose;
    }

    public void setEachdose(BigDecimal eachdose) {
        this.eachdose = eachdose;
    }

    public String getDoseunit() {
        return doseunit;
    }

    public void setDoseunit(String doseunit) {
        this.doseunit = doseunit == null ? null : doseunit.trim();
    }

    public BigDecimal getInsulinperdose() {
        return insulinperdose;
    }

    public void setInsulinperdose(BigDecimal insulinperdose) {
        this.insulinperdose = insulinperdose;
    }

    public String getInsulindoseunit() {
        return insulindoseunit;
    }

    public void setInsulindoseunit(String insulindoseunit) {
        this.insulindoseunit = insulindoseunit == null ? null : insulindoseunit.trim();
    }

    public Short getDiabetesfollowuptype() {
        return diabetesfollowuptype;
    }

    public void setDiabetesfollowuptype(Short diabetesfollowuptype) {
        this.diabetesfollowuptype = diabetesfollowuptype;
    }

    public Short getDiabetesfollowuptypesupplement() {
        return diabetesfollowuptypesupplement;
    }

    public void setDiabetesfollowuptypesupplement(Short diabetesfollowuptypesupplement) {
        this.diabetesfollowuptypesupplement = diabetesfollowuptypesupplement;
    }

    public String getReferralagency() {
        return referralagency;
    }

    public void setReferralagency(String referralagency) {
        this.referralagency = referralagency == null ? null : referralagency.trim();
    }

    public String getReferralcauses() {
        return referralcauses;
    }

    public void setReferralcauses(String referralcauses) {
        this.referralcauses = referralcauses == null ? null : referralcauses.trim();
    }

    public Short getTurnover() {
        return turnover;
    }

    public void setTurnover(Short turnover) {
        this.turnover = turnover;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getLastmodifieruser() {
        return lastmodifieruser;
    }

    public void setLastmodifieruser(String lastmodifieruser) {
        this.lastmodifieruser = lastmodifieruser == null ? null : lastmodifieruser.trim();
    }

    public Date getLastmodificationtime() {
        return lastmodificationtime;
    }

    public void setLastmodificationtime(Date lastmodificationtime) {
        this.lastmodificationtime = lastmodificationtime;
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Date getDeletedtime() {
        return deletedtime;
    }

    public void setDeletedtime(Date deletedtime) {
        this.deletedtime = deletedtime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DiabetesFollowUpInfo other = (DiabetesFollowUpInfo) that;
        return (this.getDetailid() == null ? other.getDetailid() == null : this.getDetailid().equals(other.getDetailid()))
            && (this.getFollowupid() == null ? other.getFollowupid() == null : this.getFollowupid().equals(other.getFollowupid()))
            && (this.getRegularactivities() == null ? other.getRegularactivities() == null : this.getRegularactivities().equals(other.getRegularactivities()))
            && (this.getActivityfrequency() == null ? other.getActivityfrequency() == null : this.getActivityfrequency().equals(other.getActivityfrequency()))
            && (this.getEachduration() == null ? other.getEachduration() == null : this.getEachduration().equals(other.getEachduration()))
            && (this.getDietarystatus() == null ? other.getDietarystatus() == null : this.getDietarystatus().equals(other.getDietarystatus()))
            && (this.getDiabetessymptoms() == null ? other.getDiabetessymptoms() == null : this.getDiabetessymptoms().equals(other.getDiabetessymptoms()))
            && (this.getDiabetessymptomssupplement() == null ? other.getDiabetessymptomssupplement() == null : this.getDiabetessymptomssupplement().equals(other.getDiabetessymptomssupplement()))
            && (this.getHypoglycemicreaction() == null ? other.getHypoglycemicreaction() == null : this.getHypoglycemicreaction().equals(other.getHypoglycemicreaction()))
            && (this.getSystolicpressure() == null ? other.getSystolicpressure() == null : this.getSystolicpressure().equals(other.getSystolicpressure()))
            && (this.getDiastolicpressure() == null ? other.getDiastolicpressure() == null : this.getDiastolicpressure().equals(other.getDiastolicpressure()))
            && (this.getHeight() == null ? other.getHeight() == null : this.getHeight().equals(other.getHeight()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getTargetweight() == null ? other.getTargetweight() == null : this.getTargetweight().equals(other.getTargetweight()))
            && (this.getConstitutionalindex() == null ? other.getConstitutionalindex() == null : this.getConstitutionalindex().equals(other.getConstitutionalindex()))
            && (this.getTargetconstitutionalindex() == null ? other.getTargetconstitutionalindex() == null : this.getTargetconstitutionalindex().equals(other.getTargetconstitutionalindex()))
            && (this.getFootdorsalartery() == null ? other.getFootdorsalartery() == null : this.getFootdorsalartery().equals(other.getFootdorsalartery()))
            && (this.getOthersigns() == null ? other.getOthersigns() == null : this.getOthersigns().equals(other.getOthersigns()))
            && (this.getDailysmoking() == null ? other.getDailysmoking() == null : this.getDailysmoking().equals(other.getDailysmoking()))
            && (this.getTargetdailysmoking() == null ? other.getTargetdailysmoking() == null : this.getTargetdailysmoking().equals(other.getTargetdailysmoking()))
            && (this.getDailyalcohol() == null ? other.getDailyalcohol() == null : this.getDailyalcohol().equals(other.getDailyalcohol()))
            && (this.getTargetdailyalcohol() == null ? other.getTargetdailyalcohol() == null : this.getTargetdailyalcohol().equals(other.getTargetdailyalcohol()))
            && (this.getWeeklyexercisesnumber() == null ? other.getWeeklyexercisesnumber() == null : this.getWeeklyexercisesnumber().equals(other.getWeeklyexercisesnumber()))
            && (this.getTargetweeklyexercisesnumber() == null ? other.getTargetweeklyexercisesnumber() == null : this.getTargetweeklyexercisesnumber().equals(other.getTargetweeklyexercisesnumber()))
            && (this.getExerciseduration() == null ? other.getExerciseduration() == null : this.getExerciseduration().equals(other.getExerciseduration()))
            && (this.getTargetexerciseduration() == null ? other.getTargetexerciseduration() == null : this.getTargetexerciseduration().equals(other.getTargetexerciseduration()))
            && (this.getSaltuptake() == null ? other.getSaltuptake() == null : this.getSaltuptake().equals(other.getSaltuptake()))
            && (this.getTargetsaltuptake() == null ? other.getTargetsaltuptake() == null : this.getTargetsaltuptake().equals(other.getTargetsaltuptake()))
            && (this.getPsychologicaladjustment() == null ? other.getPsychologicaladjustment() == null : this.getPsychologicaladjustment().equals(other.getPsychologicaladjustment()))
            && (this.getCompliancebehavior() == null ? other.getCompliancebehavior() == null : this.getCompliancebehavior().equals(other.getCompliancebehavior()))
            && (this.getFastingbloodsugar() == null ? other.getFastingbloodsugar() == null : this.getFastingbloodsugar().equals(other.getFastingbloodsugar()))
            && (this.getGlycosylatedhemoglobin() == null ? other.getGlycosylatedhemoglobin() == null : this.getGlycosylatedhemoglobin().equals(other.getGlycosylatedhemoglobin()))
            && (this.getInspectiondate() == null ? other.getInspectiondate() == null : this.getInspectiondate().equals(other.getInspectiondate()))
            && (this.getSupplementaryexamination() == null ? other.getSupplementaryexamination() == null : this.getSupplementaryexamination().equals(other.getSupplementaryexamination()))
            && (this.getMedicationcompliance() == null ? other.getMedicationcompliance() == null : this.getMedicationcompliance().equals(other.getMedicationcompliance()))
            && (this.getAdversedrugreactions() == null ? other.getAdversedrugreactions() == null : this.getAdversedrugreactions().equals(other.getAdversedrugreactions()))
            && (this.getDiabetesmedicinesinfo() == null ? other.getDiabetesmedicinesinfo() == null : this.getDiabetesmedicinesinfo().equals(other.getDiabetesmedicinesinfo()))
            && (this.getDrugname() == null ? other.getDrugname() == null : this.getDrugname().equals(other.getDrugname()))
            && (this.getEachdose() == null ? other.getEachdose() == null : this.getEachdose().equals(other.getEachdose()))
            && (this.getDoseunit() == null ? other.getDoseunit() == null : this.getDoseunit().equals(other.getDoseunit()))
            && (this.getInsulinperdose() == null ? other.getInsulinperdose() == null : this.getInsulinperdose().equals(other.getInsulinperdose()))
            && (this.getInsulindoseunit() == null ? other.getInsulindoseunit() == null : this.getInsulindoseunit().equals(other.getInsulindoseunit()))
            && (this.getDiabetesfollowuptype() == null ? other.getDiabetesfollowuptype() == null : this.getDiabetesfollowuptype().equals(other.getDiabetesfollowuptype()))
            && (this.getDiabetesfollowuptypesupplement() == null ? other.getDiabetesfollowuptypesupplement() == null : this.getDiabetesfollowuptypesupplement().equals(other.getDiabetesfollowuptypesupplement()))
            && (this.getReferralagency() == null ? other.getReferralagency() == null : this.getReferralagency().equals(other.getReferralagency()))
            && (this.getReferralcauses() == null ? other.getReferralcauses() == null : this.getReferralcauses().equals(other.getReferralcauses()))
            && (this.getTurnover() == null ? other.getTurnover() == null : this.getTurnover().equals(other.getTurnover()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getLastmodifieruser() == null ? other.getLastmodifieruser() == null : this.getLastmodifieruser().equals(other.getLastmodifieruser()))
            && (this.getLastmodificationtime() == null ? other.getLastmodificationtime() == null : this.getLastmodificationtime().equals(other.getLastmodificationtime()))
            && (this.getIsdeleted() == null ? other.getIsdeleted() == null : this.getIsdeleted().equals(other.getIsdeleted()))
            && (this.getDeletedtime() == null ? other.getDeletedtime() == null : this.getDeletedtime().equals(other.getDeletedtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDetailid() == null) ? 0 : getDetailid().hashCode());
        result = prime * result + ((getFollowupid() == null) ? 0 : getFollowupid().hashCode());
        result = prime * result + ((getRegularactivities() == null) ? 0 : getRegularactivities().hashCode());
        result = prime * result + ((getActivityfrequency() == null) ? 0 : getActivityfrequency().hashCode());
        result = prime * result + ((getEachduration() == null) ? 0 : getEachduration().hashCode());
        result = prime * result + ((getDietarystatus() == null) ? 0 : getDietarystatus().hashCode());
        result = prime * result + ((getDiabetessymptoms() == null) ? 0 : getDiabetessymptoms().hashCode());
        result = prime * result + ((getDiabetessymptomssupplement() == null) ? 0 : getDiabetessymptomssupplement().hashCode());
        result = prime * result + ((getHypoglycemicreaction() == null) ? 0 : getHypoglycemicreaction().hashCode());
        result = prime * result + ((getSystolicpressure() == null) ? 0 : getSystolicpressure().hashCode());
        result = prime * result + ((getDiastolicpressure() == null) ? 0 : getDiastolicpressure().hashCode());
        result = prime * result + ((getHeight() == null) ? 0 : getHeight().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getTargetweight() == null) ? 0 : getTargetweight().hashCode());
        result = prime * result + ((getConstitutionalindex() == null) ? 0 : getConstitutionalindex().hashCode());
        result = prime * result + ((getTargetconstitutionalindex() == null) ? 0 : getTargetconstitutionalindex().hashCode());
        result = prime * result + ((getFootdorsalartery() == null) ? 0 : getFootdorsalartery().hashCode());
        result = prime * result + ((getOthersigns() == null) ? 0 : getOthersigns().hashCode());
        result = prime * result + ((getDailysmoking() == null) ? 0 : getDailysmoking().hashCode());
        result = prime * result + ((getTargetdailysmoking() == null) ? 0 : getTargetdailysmoking().hashCode());
        result = prime * result + ((getDailyalcohol() == null) ? 0 : getDailyalcohol().hashCode());
        result = prime * result + ((getTargetdailyalcohol() == null) ? 0 : getTargetdailyalcohol().hashCode());
        result = prime * result + ((getWeeklyexercisesnumber() == null) ? 0 : getWeeklyexercisesnumber().hashCode());
        result = prime * result + ((getTargetweeklyexercisesnumber() == null) ? 0 : getTargetweeklyexercisesnumber().hashCode());
        result = prime * result + ((getExerciseduration() == null) ? 0 : getExerciseduration().hashCode());
        result = prime * result + ((getTargetexerciseduration() == null) ? 0 : getTargetexerciseduration().hashCode());
        result = prime * result + ((getSaltuptake() == null) ? 0 : getSaltuptake().hashCode());
        result = prime * result + ((getTargetsaltuptake() == null) ? 0 : getTargetsaltuptake().hashCode());
        result = prime * result + ((getPsychologicaladjustment() == null) ? 0 : getPsychologicaladjustment().hashCode());
        result = prime * result + ((getCompliancebehavior() == null) ? 0 : getCompliancebehavior().hashCode());
        result = prime * result + ((getFastingbloodsugar() == null) ? 0 : getFastingbloodsugar().hashCode());
        result = prime * result + ((getGlycosylatedhemoglobin() == null) ? 0 : getGlycosylatedhemoglobin().hashCode());
        result = prime * result + ((getInspectiondate() == null) ? 0 : getInspectiondate().hashCode());
        result = prime * result + ((getSupplementaryexamination() == null) ? 0 : getSupplementaryexamination().hashCode());
        result = prime * result + ((getMedicationcompliance() == null) ? 0 : getMedicationcompliance().hashCode());
        result = prime * result + ((getAdversedrugreactions() == null) ? 0 : getAdversedrugreactions().hashCode());
        result = prime * result + ((getDiabetesmedicinesinfo() == null) ? 0 : getDiabetesmedicinesinfo().hashCode());
        result = prime * result + ((getDrugname() == null) ? 0 : getDrugname().hashCode());
        result = prime * result + ((getEachdose() == null) ? 0 : getEachdose().hashCode());
        result = prime * result + ((getDoseunit() == null) ? 0 : getDoseunit().hashCode());
        result = prime * result + ((getInsulinperdose() == null) ? 0 : getInsulinperdose().hashCode());
        result = prime * result + ((getInsulindoseunit() == null) ? 0 : getInsulindoseunit().hashCode());
        result = prime * result + ((getDiabetesfollowuptype() == null) ? 0 : getDiabetesfollowuptype().hashCode());
        result = prime * result + ((getDiabetesfollowuptypesupplement() == null) ? 0 : getDiabetesfollowuptypesupplement().hashCode());
        result = prime * result + ((getReferralagency() == null) ? 0 : getReferralagency().hashCode());
        result = prime * result + ((getReferralcauses() == null) ? 0 : getReferralcauses().hashCode());
        result = prime * result + ((getTurnover() == null) ? 0 : getTurnover().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifieruser() == null) ? 0 : getLastmodifieruser().hashCode());
        result = prime * result + ((getLastmodificationtime() == null) ? 0 : getLastmodificationtime().hashCode());
        result = prime * result + ((getIsdeleted() == null) ? 0 : getIsdeleted().hashCode());
        result = prime * result + ((getDeletedtime() == null) ? 0 : getDeletedtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", detailid=").append(detailid);
        sb.append(", followupid=").append(followupid);
        sb.append(", regularactivities=").append(regularactivities);
        sb.append(", activityfrequency=").append(activityfrequency);
        sb.append(", eachduration=").append(eachduration);
        sb.append(", dietarystatus=").append(dietarystatus);
        sb.append(", diabetessymptoms=").append(diabetessymptoms);
        sb.append(", diabetessymptomssupplement=").append(diabetessymptomssupplement);
        sb.append(", hypoglycemicreaction=").append(hypoglycemicreaction);
        sb.append(", systolicpressure=").append(systolicpressure);
        sb.append(", diastolicpressure=").append(diastolicpressure);
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append(", targetweight=").append(targetweight);
        sb.append(", constitutionalindex=").append(constitutionalindex);
        sb.append(", targetconstitutionalindex=").append(targetconstitutionalindex);
        sb.append(", footdorsalartery=").append(footdorsalartery);
        sb.append(", othersigns=").append(othersigns);
        sb.append(", dailysmoking=").append(dailysmoking);
        sb.append(", targetdailysmoking=").append(targetdailysmoking);
        sb.append(", dailyalcohol=").append(dailyalcohol);
        sb.append(", targetdailyalcohol=").append(targetdailyalcohol);
        sb.append(", weeklyexercisesnumber=").append(weeklyexercisesnumber);
        sb.append(", targetweeklyexercisesnumber=").append(targetweeklyexercisesnumber);
        sb.append(", exerciseduration=").append(exerciseduration);
        sb.append(", targetexerciseduration=").append(targetexerciseduration);
        sb.append(", saltuptake=").append(saltuptake);
        sb.append(", targetsaltuptake=").append(targetsaltuptake);
        sb.append(", psychologicaladjustment=").append(psychologicaladjustment);
        sb.append(", compliancebehavior=").append(compliancebehavior);
        sb.append(", fastingbloodsugar=").append(fastingbloodsugar);
        sb.append(", glycosylatedhemoglobin=").append(glycosylatedhemoglobin);
        sb.append(", inspectiondate=").append(inspectiondate);
        sb.append(", supplementaryexamination=").append(supplementaryexamination);
        sb.append(", medicationcompliance=").append(medicationcompliance);
        sb.append(", adversedrugreactions=").append(adversedrugreactions);
        sb.append(", diabetesmedicinesinfo=").append(diabetesmedicinesinfo);
        sb.append(", drugname=").append(drugname);
        sb.append(", eachdose=").append(eachdose);
        sb.append(", doseunit=").append(doseunit);
        sb.append(", insulinperdose=").append(insulinperdose);
        sb.append(", insulindoseunit=").append(insulindoseunit);
        sb.append(", diabetesfollowuptype=").append(diabetesfollowuptype);
        sb.append(", diabetesfollowuptypesupplement=").append(diabetesfollowuptypesupplement);
        sb.append(", referralagency=").append(referralagency);
        sb.append(", referralcauses=").append(referralcauses);
        sb.append(", turnover=").append(turnover);
        sb.append(", createtime=").append(createtime);
        sb.append(", lastmodifieruser=").append(lastmodifieruser);
        sb.append(", lastmodificationtime=").append(lastmodificationtime);
        sb.append(", isdeleted=").append(isdeleted);
        sb.append(", deletedtime=").append(deletedtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}