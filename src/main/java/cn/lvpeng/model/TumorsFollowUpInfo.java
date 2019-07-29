package cn.lvpeng.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TumorsFollowUpInfo implements Serializable {
    private Integer detailid;

    private Integer followupid;

    private Boolean isresidenceverification;

    private String unverifiedresidencereasons;

    private String passivesmokingplaces;

    private Short smokingage;

    private Short quitsmokingage;

    private Short smokingnum;

    private String tumorsfamilyhistory;

    private String relationshipwithpatient;

    private String tumorfamilyhistorytype;

    private Date firstsymptomsdate;

    private Date firstvisitdate;

    private String tumortreatmenthospital;

    private String firstoperationhospital;

    private Date firstoperationdate;

    private String firstoperationtype;

    private String reportcardno;

    private String nextunverifiedresidencereasons;

    private Boolean ismetastasis;

    private String metastasissite;

    private Boolean isrecurrence;

    private Short recurrencenumber;

    private Date recurrencedate;

    private String therapeuticmodalities;

    private String patientstatus;

    private BigDecimal weight;

    private Boolean issmoking;

    private String guidancecontents;

    private Integer karnofsky;

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

    public Boolean getIsresidenceverification() {
        return isresidenceverification;
    }

    public void setIsresidenceverification(Boolean isresidenceverification) {
        this.isresidenceverification = isresidenceverification;
    }

    public String getUnverifiedresidencereasons() {
        return unverifiedresidencereasons;
    }

    public void setUnverifiedresidencereasons(String unverifiedresidencereasons) {
        this.unverifiedresidencereasons = unverifiedresidencereasons == null ? null : unverifiedresidencereasons.trim();
    }

    public String getPassivesmokingplaces() {
        return passivesmokingplaces;
    }

    public void setPassivesmokingplaces(String passivesmokingplaces) {
        this.passivesmokingplaces = passivesmokingplaces == null ? null : passivesmokingplaces.trim();
    }

    public Short getSmokingage() {
        return smokingage;
    }

    public void setSmokingage(Short smokingage) {
        this.smokingage = smokingage;
    }

    public Short getQuitsmokingage() {
        return quitsmokingage;
    }

    public void setQuitsmokingage(Short quitsmokingage) {
        this.quitsmokingage = quitsmokingage;
    }

    public Short getSmokingnum() {
        return smokingnum;
    }

    public void setSmokingnum(Short smokingnum) {
        this.smokingnum = smokingnum;
    }

    public String getTumorsfamilyhistory() {
        return tumorsfamilyhistory;
    }

    public void setTumorsfamilyhistory(String tumorsfamilyhistory) {
        this.tumorsfamilyhistory = tumorsfamilyhistory == null ? null : tumorsfamilyhistory.trim();
    }

    public String getRelationshipwithpatient() {
        return relationshipwithpatient;
    }

    public void setRelationshipwithpatient(String relationshipwithpatient) {
        this.relationshipwithpatient = relationshipwithpatient == null ? null : relationshipwithpatient.trim();
    }

    public String getTumorfamilyhistorytype() {
        return tumorfamilyhistorytype;
    }

    public void setTumorfamilyhistorytype(String tumorfamilyhistorytype) {
        this.tumorfamilyhistorytype = tumorfamilyhistorytype == null ? null : tumorfamilyhistorytype.trim();
    }

    public Date getFirstsymptomsdate() {
        return firstsymptomsdate;
    }

    public void setFirstsymptomsdate(Date firstsymptomsdate) {
        this.firstsymptomsdate = firstsymptomsdate;
    }

    public Date getFirstvisitdate() {
        return firstvisitdate;
    }

    public void setFirstvisitdate(Date firstvisitdate) {
        this.firstvisitdate = firstvisitdate;
    }

    public String getTumortreatmenthospital() {
        return tumortreatmenthospital;
    }

    public void setTumortreatmenthospital(String tumortreatmenthospital) {
        this.tumortreatmenthospital = tumortreatmenthospital == null ? null : tumortreatmenthospital.trim();
    }

    public String getFirstoperationhospital() {
        return firstoperationhospital;
    }

    public void setFirstoperationhospital(String firstoperationhospital) {
        this.firstoperationhospital = firstoperationhospital == null ? null : firstoperationhospital.trim();
    }

    public Date getFirstoperationdate() {
        return firstoperationdate;
    }

    public void setFirstoperationdate(Date firstoperationdate) {
        this.firstoperationdate = firstoperationdate;
    }

    public String getFirstoperationtype() {
        return firstoperationtype;
    }

    public void setFirstoperationtype(String firstoperationtype) {
        this.firstoperationtype = firstoperationtype == null ? null : firstoperationtype.trim();
    }

    public String getReportcardno() {
        return reportcardno;
    }

    public void setReportcardno(String reportcardno) {
        this.reportcardno = reportcardno == null ? null : reportcardno.trim();
    }

    public String getNextunverifiedresidencereasons() {
        return nextunverifiedresidencereasons;
    }

    public void setNextunverifiedresidencereasons(String nextunverifiedresidencereasons) {
        this.nextunverifiedresidencereasons = nextunverifiedresidencereasons == null ? null : nextunverifiedresidencereasons.trim();
    }

    public Boolean getIsmetastasis() {
        return ismetastasis;
    }

    public void setIsmetastasis(Boolean ismetastasis) {
        this.ismetastasis = ismetastasis;
    }

    public String getMetastasissite() {
        return metastasissite;
    }

    public void setMetastasissite(String metastasissite) {
        this.metastasissite = metastasissite == null ? null : metastasissite.trim();
    }

    public Boolean getIsrecurrence() {
        return isrecurrence;
    }

    public void setIsrecurrence(Boolean isrecurrence) {
        this.isrecurrence = isrecurrence;
    }

    public Short getRecurrencenumber() {
        return recurrencenumber;
    }

    public void setRecurrencenumber(Short recurrencenumber) {
        this.recurrencenumber = recurrencenumber;
    }

    public Date getRecurrencedate() {
        return recurrencedate;
    }

    public void setRecurrencedate(Date recurrencedate) {
        this.recurrencedate = recurrencedate;
    }

    public String getTherapeuticmodalities() {
        return therapeuticmodalities;
    }

    public void setTherapeuticmodalities(String therapeuticmodalities) {
        this.therapeuticmodalities = therapeuticmodalities == null ? null : therapeuticmodalities.trim();
    }

    public String getPatientstatus() {
        return patientstatus;
    }

    public void setPatientstatus(String patientstatus) {
        this.patientstatus = patientstatus == null ? null : patientstatus.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Boolean getIssmoking() {
        return issmoking;
    }

    public void setIssmoking(Boolean issmoking) {
        this.issmoking = issmoking;
    }

    public String getGuidancecontents() {
        return guidancecontents;
    }

    public void setGuidancecontents(String guidancecontents) {
        this.guidancecontents = guidancecontents == null ? null : guidancecontents.trim();
    }

    public Integer getKarnofsky() {
        return karnofsky;
    }

    public void setKarnofsky(Integer karnofsky) {
        this.karnofsky = karnofsky;
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
        TumorsFollowUpInfo other = (TumorsFollowUpInfo) that;
        return (this.getDetailid() == null ? other.getDetailid() == null : this.getDetailid().equals(other.getDetailid()))
            && (this.getFollowupid() == null ? other.getFollowupid() == null : this.getFollowupid().equals(other.getFollowupid()))
            && (this.getIsresidenceverification() == null ? other.getIsresidenceverification() == null : this.getIsresidenceverification().equals(other.getIsresidenceverification()))
            && (this.getUnverifiedresidencereasons() == null ? other.getUnverifiedresidencereasons() == null : this.getUnverifiedresidencereasons().equals(other.getUnverifiedresidencereasons()))
            && (this.getPassivesmokingplaces() == null ? other.getPassivesmokingplaces() == null : this.getPassivesmokingplaces().equals(other.getPassivesmokingplaces()))
            && (this.getSmokingage() == null ? other.getSmokingage() == null : this.getSmokingage().equals(other.getSmokingage()))
            && (this.getQuitsmokingage() == null ? other.getQuitsmokingage() == null : this.getQuitsmokingage().equals(other.getQuitsmokingage()))
            && (this.getSmokingnum() == null ? other.getSmokingnum() == null : this.getSmokingnum().equals(other.getSmokingnum()))
            && (this.getTumorsfamilyhistory() == null ? other.getTumorsfamilyhistory() == null : this.getTumorsfamilyhistory().equals(other.getTumorsfamilyhistory()))
            && (this.getRelationshipwithpatient() == null ? other.getRelationshipwithpatient() == null : this.getRelationshipwithpatient().equals(other.getRelationshipwithpatient()))
            && (this.getTumorfamilyhistorytype() == null ? other.getTumorfamilyhistorytype() == null : this.getTumorfamilyhistorytype().equals(other.getTumorfamilyhistorytype()))
            && (this.getFirstsymptomsdate() == null ? other.getFirstsymptomsdate() == null : this.getFirstsymptomsdate().equals(other.getFirstsymptomsdate()))
            && (this.getFirstvisitdate() == null ? other.getFirstvisitdate() == null : this.getFirstvisitdate().equals(other.getFirstvisitdate()))
            && (this.getTumortreatmenthospital() == null ? other.getTumortreatmenthospital() == null : this.getTumortreatmenthospital().equals(other.getTumortreatmenthospital()))
            && (this.getFirstoperationhospital() == null ? other.getFirstoperationhospital() == null : this.getFirstoperationhospital().equals(other.getFirstoperationhospital()))
            && (this.getFirstoperationdate() == null ? other.getFirstoperationdate() == null : this.getFirstoperationdate().equals(other.getFirstoperationdate()))
            && (this.getFirstoperationtype() == null ? other.getFirstoperationtype() == null : this.getFirstoperationtype().equals(other.getFirstoperationtype()))
            && (this.getReportcardno() == null ? other.getReportcardno() == null : this.getReportcardno().equals(other.getReportcardno()))
            && (this.getNextunverifiedresidencereasons() == null ? other.getNextunverifiedresidencereasons() == null : this.getNextunverifiedresidencereasons().equals(other.getNextunverifiedresidencereasons()))
            && (this.getIsmetastasis() == null ? other.getIsmetastasis() == null : this.getIsmetastasis().equals(other.getIsmetastasis()))
            && (this.getMetastasissite() == null ? other.getMetastasissite() == null : this.getMetastasissite().equals(other.getMetastasissite()))
            && (this.getIsrecurrence() == null ? other.getIsrecurrence() == null : this.getIsrecurrence().equals(other.getIsrecurrence()))
            && (this.getRecurrencenumber() == null ? other.getRecurrencenumber() == null : this.getRecurrencenumber().equals(other.getRecurrencenumber()))
            && (this.getRecurrencedate() == null ? other.getRecurrencedate() == null : this.getRecurrencedate().equals(other.getRecurrencedate()))
            && (this.getTherapeuticmodalities() == null ? other.getTherapeuticmodalities() == null : this.getTherapeuticmodalities().equals(other.getTherapeuticmodalities()))
            && (this.getPatientstatus() == null ? other.getPatientstatus() == null : this.getPatientstatus().equals(other.getPatientstatus()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getIssmoking() == null ? other.getIssmoking() == null : this.getIssmoking().equals(other.getIssmoking()))
            && (this.getGuidancecontents() == null ? other.getGuidancecontents() == null : this.getGuidancecontents().equals(other.getGuidancecontents()))
            && (this.getKarnofsky() == null ? other.getKarnofsky() == null : this.getKarnofsky().equals(other.getKarnofsky()))
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
        result = prime * result + ((getIsresidenceverification() == null) ? 0 : getIsresidenceverification().hashCode());
        result = prime * result + ((getUnverifiedresidencereasons() == null) ? 0 : getUnverifiedresidencereasons().hashCode());
        result = prime * result + ((getPassivesmokingplaces() == null) ? 0 : getPassivesmokingplaces().hashCode());
        result = prime * result + ((getSmokingage() == null) ? 0 : getSmokingage().hashCode());
        result = prime * result + ((getQuitsmokingage() == null) ? 0 : getQuitsmokingage().hashCode());
        result = prime * result + ((getSmokingnum() == null) ? 0 : getSmokingnum().hashCode());
        result = prime * result + ((getTumorsfamilyhistory() == null) ? 0 : getTumorsfamilyhistory().hashCode());
        result = prime * result + ((getRelationshipwithpatient() == null) ? 0 : getRelationshipwithpatient().hashCode());
        result = prime * result + ((getTumorfamilyhistorytype() == null) ? 0 : getTumorfamilyhistorytype().hashCode());
        result = prime * result + ((getFirstsymptomsdate() == null) ? 0 : getFirstsymptomsdate().hashCode());
        result = prime * result + ((getFirstvisitdate() == null) ? 0 : getFirstvisitdate().hashCode());
        result = prime * result + ((getTumortreatmenthospital() == null) ? 0 : getTumortreatmenthospital().hashCode());
        result = prime * result + ((getFirstoperationhospital() == null) ? 0 : getFirstoperationhospital().hashCode());
        result = prime * result + ((getFirstoperationdate() == null) ? 0 : getFirstoperationdate().hashCode());
        result = prime * result + ((getFirstoperationtype() == null) ? 0 : getFirstoperationtype().hashCode());
        result = prime * result + ((getReportcardno() == null) ? 0 : getReportcardno().hashCode());
        result = prime * result + ((getNextunverifiedresidencereasons() == null) ? 0 : getNextunverifiedresidencereasons().hashCode());
        result = prime * result + ((getIsmetastasis() == null) ? 0 : getIsmetastasis().hashCode());
        result = prime * result + ((getMetastasissite() == null) ? 0 : getMetastasissite().hashCode());
        result = prime * result + ((getIsrecurrence() == null) ? 0 : getIsrecurrence().hashCode());
        result = prime * result + ((getRecurrencenumber() == null) ? 0 : getRecurrencenumber().hashCode());
        result = prime * result + ((getRecurrencedate() == null) ? 0 : getRecurrencedate().hashCode());
        result = prime * result + ((getTherapeuticmodalities() == null) ? 0 : getTherapeuticmodalities().hashCode());
        result = prime * result + ((getPatientstatus() == null) ? 0 : getPatientstatus().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getIssmoking() == null) ? 0 : getIssmoking().hashCode());
        result = prime * result + ((getGuidancecontents() == null) ? 0 : getGuidancecontents().hashCode());
        result = prime * result + ((getKarnofsky() == null) ? 0 : getKarnofsky().hashCode());
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
        sb.append(", isresidenceverification=").append(isresidenceverification);
        sb.append(", unverifiedresidencereasons=").append(unverifiedresidencereasons);
        sb.append(", passivesmokingplaces=").append(passivesmokingplaces);
        sb.append(", smokingage=").append(smokingage);
        sb.append(", quitsmokingage=").append(quitsmokingage);
        sb.append(", smokingnum=").append(smokingnum);
        sb.append(", tumorsfamilyhistory=").append(tumorsfamilyhistory);
        sb.append(", relationshipwithpatient=").append(relationshipwithpatient);
        sb.append(", tumorfamilyhistorytype=").append(tumorfamilyhistorytype);
        sb.append(", firstsymptomsdate=").append(firstsymptomsdate);
        sb.append(", firstvisitdate=").append(firstvisitdate);
        sb.append(", tumortreatmenthospital=").append(tumortreatmenthospital);
        sb.append(", firstoperationhospital=").append(firstoperationhospital);
        sb.append(", firstoperationdate=").append(firstoperationdate);
        sb.append(", firstoperationtype=").append(firstoperationtype);
        sb.append(", reportcardno=").append(reportcardno);
        sb.append(", nextunverifiedresidencereasons=").append(nextunverifiedresidencereasons);
        sb.append(", ismetastasis=").append(ismetastasis);
        sb.append(", metastasissite=").append(metastasissite);
        sb.append(", isrecurrence=").append(isrecurrence);
        sb.append(", recurrencenumber=").append(recurrencenumber);
        sb.append(", recurrencedate=").append(recurrencedate);
        sb.append(", therapeuticmodalities=").append(therapeuticmodalities);
        sb.append(", patientstatus=").append(patientstatus);
        sb.append(", weight=").append(weight);
        sb.append(", issmoking=").append(issmoking);
        sb.append(", guidancecontents=").append(guidancecontents);
        sb.append(", karnofsky=").append(karnofsky);
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