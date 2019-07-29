package cn.lvpeng.model;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    private Integer userid;

    private String idtype;

    private String idno;

    private String name;

    private Short gender;

    private Date birthday;

    private String nation;

    private Short permanentresidencetype;

    private String telephone;

    private String contacts;

    private String contactsphone;

    private Short educationdegree;

    private Short occupation;

    private String address;

    private String workunit;

    private Short maritalstatus;

    private String status;

    private String createuserid;

    private Date createtime;

    private String lastmodifieruserid;

    private Date lastmodificationtime;

    private Boolean isdeleted;

    private Date deletedtime;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype == null ? null : idtype.trim();
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getGender() {
        return gender;
    }

    public void setGender(Short gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public Short getPermanentresidencetype() {
        return permanentresidencetype;
    }

    public void setPermanentresidencetype(Short permanentresidencetype) {
        this.permanentresidencetype = permanentresidencetype;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getContactsphone() {
        return contactsphone;
    }

    public void setContactsphone(String contactsphone) {
        this.contactsphone = contactsphone == null ? null : contactsphone.trim();
    }

    public Short getEducationdegree() {
        return educationdegree;
    }

    public void setEducationdegree(Short educationdegree) {
        this.educationdegree = educationdegree;
    }

    public Short getOccupation() {
        return occupation;
    }

    public void setOccupation(Short occupation) {
        this.occupation = occupation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getWorkunit() {
        return workunit;
    }

    public void setWorkunit(String workunit) {
        this.workunit = workunit == null ? null : workunit.trim();
    }

    public Short getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(Short maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getLastmodifieruserid() {
        return lastmodifieruserid;
    }

    public void setLastmodifieruserid(String lastmodifieruserid) {
        this.lastmodifieruserid = lastmodifieruserid == null ? null : lastmodifieruserid.trim();
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
        UserInfo other = (UserInfo) that;
        return (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getIdtype() == null ? other.getIdtype() == null : this.getIdtype().equals(other.getIdtype()))
            && (this.getIdno() == null ? other.getIdno() == null : this.getIdno().equals(other.getIdno()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getNation() == null ? other.getNation() == null : this.getNation().equals(other.getNation()))
            && (this.getPermanentresidencetype() == null ? other.getPermanentresidencetype() == null : this.getPermanentresidencetype().equals(other.getPermanentresidencetype()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getContacts() == null ? other.getContacts() == null : this.getContacts().equals(other.getContacts()))
            && (this.getContactsphone() == null ? other.getContactsphone() == null : this.getContactsphone().equals(other.getContactsphone()))
            && (this.getEducationdegree() == null ? other.getEducationdegree() == null : this.getEducationdegree().equals(other.getEducationdegree()))
            && (this.getOccupation() == null ? other.getOccupation() == null : this.getOccupation().equals(other.getOccupation()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getWorkunit() == null ? other.getWorkunit() == null : this.getWorkunit().equals(other.getWorkunit()))
            && (this.getMaritalstatus() == null ? other.getMaritalstatus() == null : this.getMaritalstatus().equals(other.getMaritalstatus()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateuserid() == null ? other.getCreateuserid() == null : this.getCreateuserid().equals(other.getCreateuserid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getLastmodifieruserid() == null ? other.getLastmodifieruserid() == null : this.getLastmodifieruserid().equals(other.getLastmodifieruserid()))
            && (this.getLastmodificationtime() == null ? other.getLastmodificationtime() == null : this.getLastmodificationtime().equals(other.getLastmodificationtime()))
            && (this.getIsdeleted() == null ? other.getIsdeleted() == null : this.getIsdeleted().equals(other.getIsdeleted()))
            && (this.getDeletedtime() == null ? other.getDeletedtime() == null : this.getDeletedtime().equals(other.getDeletedtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getIdtype() == null) ? 0 : getIdtype().hashCode());
        result = prime * result + ((getIdno() == null) ? 0 : getIdno().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());
        result = prime * result + ((getPermanentresidencetype() == null) ? 0 : getPermanentresidencetype().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getContacts() == null) ? 0 : getContacts().hashCode());
        result = prime * result + ((getContactsphone() == null) ? 0 : getContactsphone().hashCode());
        result = prime * result + ((getEducationdegree() == null) ? 0 : getEducationdegree().hashCode());
        result = prime * result + ((getOccupation() == null) ? 0 : getOccupation().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getWorkunit() == null) ? 0 : getWorkunit().hashCode());
        result = prime * result + ((getMaritalstatus() == null) ? 0 : getMaritalstatus().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateuserid() == null) ? 0 : getCreateuserid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifieruserid() == null) ? 0 : getLastmodifieruserid().hashCode());
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
        sb.append(", userid=").append(userid);
        sb.append(", idtype=").append(idtype);
        sb.append(", idno=").append(idno);
        sb.append(", name=").append(name);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", nation=").append(nation);
        sb.append(", permanentresidencetype=").append(permanentresidencetype);
        sb.append(", telephone=").append(telephone);
        sb.append(", contacts=").append(contacts);
        sb.append(", contactsphone=").append(contactsphone);
        sb.append(", educationdegree=").append(educationdegree);
        sb.append(", occupation=").append(occupation);
        sb.append(", address=").append(address);
        sb.append(", workunit=").append(workunit);
        sb.append(", maritalstatus=").append(maritalstatus);
        sb.append(", status=").append(status);
        sb.append(", createuserid=").append(createuserid);
        sb.append(", createtime=").append(createtime);
        sb.append(", lastmodifieruserid=").append(lastmodifieruserid);
        sb.append(", lastmodificationtime=").append(lastmodificationtime);
        sb.append(", isdeleted=").append(isdeleted);
        sb.append(", deletedtime=").append(deletedtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}