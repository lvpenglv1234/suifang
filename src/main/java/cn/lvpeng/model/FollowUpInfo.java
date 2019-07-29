package cn.lvpeng.model;

import java.io.Serializable;
import java.util.Date;

public class FollowUpInfo implements Serializable {
    private Integer followupid;

    private String userno;

    private String managementstatus;

    private Short followupmode;

    private Date nextfollowuptime;

    private String advise;

    private Date followuptime;

    private String jurisdictionalagency;

    private Date createtime;

    private String lastmodifieruser;

    private Date lastmodificationtime;

    private Boolean isdeleted;

    private Date deletedtime;

    private static final long serialVersionUID = 1L;

    public Integer getFollowupid() {
        return followupid;
    }

    public void setFollowupid(Integer followupid) {
        this.followupid = followupid;
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    public String getManagementstatus() {
        return managementstatus;
    }

    public void setManagementstatus(String managementstatus) {
        this.managementstatus = managementstatus == null ? null : managementstatus.trim();
    }

    public Short getFollowupmode() {
        return followupmode;
    }

    public void setFollowupmode(Short followupmode) {
        this.followupmode = followupmode;
    }

    public Date getNextfollowuptime() {
        return nextfollowuptime;
    }

    public void setNextfollowuptime(Date nextfollowuptime) {
        this.nextfollowuptime = nextfollowuptime;
    }

    public String getAdvise() {
        return advise;
    }

    public void setAdvise(String advise) {
        this.advise = advise == null ? null : advise.trim();
    }

    public Date getFollowuptime() {
        return followuptime;
    }

    public void setFollowuptime(Date followuptime) {
        this.followuptime = followuptime;
    }

    public String getJurisdictionalagency() {
        return jurisdictionalagency;
    }

    public void setJurisdictionalagency(String jurisdictionalagency) {
        this.jurisdictionalagency = jurisdictionalagency == null ? null : jurisdictionalagency.trim();
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
        FollowUpInfo other = (FollowUpInfo) that;
        return (this.getFollowupid() == null ? other.getFollowupid() == null : this.getFollowupid().equals(other.getFollowupid()))
            && (this.getUserno() == null ? other.getUserno() == null : this.getUserno().equals(other.getUserno()))
            && (this.getManagementstatus() == null ? other.getManagementstatus() == null : this.getManagementstatus().equals(other.getManagementstatus()))
            && (this.getFollowupmode() == null ? other.getFollowupmode() == null : this.getFollowupmode().equals(other.getFollowupmode()))
            && (this.getNextfollowuptime() == null ? other.getNextfollowuptime() == null : this.getNextfollowuptime().equals(other.getNextfollowuptime()))
            && (this.getAdvise() == null ? other.getAdvise() == null : this.getAdvise().equals(other.getAdvise()))
            && (this.getFollowuptime() == null ? other.getFollowuptime() == null : this.getFollowuptime().equals(other.getFollowuptime()))
            && (this.getJurisdictionalagency() == null ? other.getJurisdictionalagency() == null : this.getJurisdictionalagency().equals(other.getJurisdictionalagency()))
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
        result = prime * result + ((getFollowupid() == null) ? 0 : getFollowupid().hashCode());
        result = prime * result + ((getUserno() == null) ? 0 : getUserno().hashCode());
        result = prime * result + ((getManagementstatus() == null) ? 0 : getManagementstatus().hashCode());
        result = prime * result + ((getFollowupmode() == null) ? 0 : getFollowupmode().hashCode());
        result = prime * result + ((getNextfollowuptime() == null) ? 0 : getNextfollowuptime().hashCode());
        result = prime * result + ((getAdvise() == null) ? 0 : getAdvise().hashCode());
        result = prime * result + ((getFollowuptime() == null) ? 0 : getFollowuptime().hashCode());
        result = prime * result + ((getJurisdictionalagency() == null) ? 0 : getJurisdictionalagency().hashCode());
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
        sb.append(", followupid=").append(followupid);
        sb.append(", userno=").append(userno);
        sb.append(", managementstatus=").append(managementstatus);
        sb.append(", followupmode=").append(followupmode);
        sb.append(", nextfollowuptime=").append(nextfollowuptime);
        sb.append(", advise=").append(advise);
        sb.append(", followuptime=").append(followuptime);
        sb.append(", jurisdictionalagency=").append(jurisdictionalagency);
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