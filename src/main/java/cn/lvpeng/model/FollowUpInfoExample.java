package cn.lvpeng.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FollowUpInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FollowUpInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFollowupidIsNull() {
            addCriterion("followUpID is null");
            return (Criteria) this;
        }

        public Criteria andFollowupidIsNotNull() {
            addCriterion("followUpID is not null");
            return (Criteria) this;
        }

        public Criteria andFollowupidEqualTo(Integer value) {
            addCriterion("followUpID =", value, "followupid");
            return (Criteria) this;
        }

        public Criteria andFollowupidNotEqualTo(Integer value) {
            addCriterion("followUpID <>", value, "followupid");
            return (Criteria) this;
        }

        public Criteria andFollowupidGreaterThan(Integer value) {
            addCriterion("followUpID >", value, "followupid");
            return (Criteria) this;
        }

        public Criteria andFollowupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("followUpID >=", value, "followupid");
            return (Criteria) this;
        }

        public Criteria andFollowupidLessThan(Integer value) {
            addCriterion("followUpID <", value, "followupid");
            return (Criteria) this;
        }

        public Criteria andFollowupidLessThanOrEqualTo(Integer value) {
            addCriterion("followUpID <=", value, "followupid");
            return (Criteria) this;
        }

        public Criteria andFollowupidIn(List<Integer> values) {
            addCriterion("followUpID in", values, "followupid");
            return (Criteria) this;
        }

        public Criteria andFollowupidNotIn(List<Integer> values) {
            addCriterion("followUpID not in", values, "followupid");
            return (Criteria) this;
        }

        public Criteria andFollowupidBetween(Integer value1, Integer value2) {
            addCriterion("followUpID between", value1, value2, "followupid");
            return (Criteria) this;
        }

        public Criteria andFollowupidNotBetween(Integer value1, Integer value2) {
            addCriterion("followUpID not between", value1, value2, "followupid");
            return (Criteria) this;
        }

        public Criteria andUsernoIsNull() {
            addCriterion("userNo is null");
            return (Criteria) this;
        }

        public Criteria andUsernoIsNotNull() {
            addCriterion("userNo is not null");
            return (Criteria) this;
        }

        public Criteria andUsernoEqualTo(String value) {
            addCriterion("userNo =", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoNotEqualTo(String value) {
            addCriterion("userNo <>", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoGreaterThan(String value) {
            addCriterion("userNo >", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoGreaterThanOrEqualTo(String value) {
            addCriterion("userNo >=", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoLessThan(String value) {
            addCriterion("userNo <", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoLessThanOrEqualTo(String value) {
            addCriterion("userNo <=", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoLike(String value) {
            addCriterion("userNo like", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoNotLike(String value) {
            addCriterion("userNo not like", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoIn(List<String> values) {
            addCriterion("userNo in", values, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoNotIn(List<String> values) {
            addCriterion("userNo not in", values, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoBetween(String value1, String value2) {
            addCriterion("userNo between", value1, value2, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoNotBetween(String value1, String value2) {
            addCriterion("userNo not between", value1, value2, "userno");
            return (Criteria) this;
        }

        public Criteria andManagementstatusIsNull() {
            addCriterion("managementStatus is null");
            return (Criteria) this;
        }

        public Criteria andManagementstatusIsNotNull() {
            addCriterion("managementStatus is not null");
            return (Criteria) this;
        }

        public Criteria andManagementstatusEqualTo(String value) {
            addCriterion("managementStatus =", value, "managementstatus");
            return (Criteria) this;
        }

        public Criteria andManagementstatusNotEqualTo(String value) {
            addCriterion("managementStatus <>", value, "managementstatus");
            return (Criteria) this;
        }

        public Criteria andManagementstatusGreaterThan(String value) {
            addCriterion("managementStatus >", value, "managementstatus");
            return (Criteria) this;
        }

        public Criteria andManagementstatusGreaterThanOrEqualTo(String value) {
            addCriterion("managementStatus >=", value, "managementstatus");
            return (Criteria) this;
        }

        public Criteria andManagementstatusLessThan(String value) {
            addCriterion("managementStatus <", value, "managementstatus");
            return (Criteria) this;
        }

        public Criteria andManagementstatusLessThanOrEqualTo(String value) {
            addCriterion("managementStatus <=", value, "managementstatus");
            return (Criteria) this;
        }

        public Criteria andManagementstatusLike(String value) {
            addCriterion("managementStatus like", value, "managementstatus");
            return (Criteria) this;
        }

        public Criteria andManagementstatusNotLike(String value) {
            addCriterion("managementStatus not like", value, "managementstatus");
            return (Criteria) this;
        }

        public Criteria andManagementstatusIn(List<String> values) {
            addCriterion("managementStatus in", values, "managementstatus");
            return (Criteria) this;
        }

        public Criteria andManagementstatusNotIn(List<String> values) {
            addCriterion("managementStatus not in", values, "managementstatus");
            return (Criteria) this;
        }

        public Criteria andManagementstatusBetween(String value1, String value2) {
            addCriterion("managementStatus between", value1, value2, "managementstatus");
            return (Criteria) this;
        }

        public Criteria andManagementstatusNotBetween(String value1, String value2) {
            addCriterion("managementStatus not between", value1, value2, "managementstatus");
            return (Criteria) this;
        }

        public Criteria andFollowupmodeIsNull() {
            addCriterion("followUpMode is null");
            return (Criteria) this;
        }

        public Criteria andFollowupmodeIsNotNull() {
            addCriterion("followUpMode is not null");
            return (Criteria) this;
        }

        public Criteria andFollowupmodeEqualTo(Short value) {
            addCriterion("followUpMode =", value, "followupmode");
            return (Criteria) this;
        }

        public Criteria andFollowupmodeNotEqualTo(Short value) {
            addCriterion("followUpMode <>", value, "followupmode");
            return (Criteria) this;
        }

        public Criteria andFollowupmodeGreaterThan(Short value) {
            addCriterion("followUpMode >", value, "followupmode");
            return (Criteria) this;
        }

        public Criteria andFollowupmodeGreaterThanOrEqualTo(Short value) {
            addCriterion("followUpMode >=", value, "followupmode");
            return (Criteria) this;
        }

        public Criteria andFollowupmodeLessThan(Short value) {
            addCriterion("followUpMode <", value, "followupmode");
            return (Criteria) this;
        }

        public Criteria andFollowupmodeLessThanOrEqualTo(Short value) {
            addCriterion("followUpMode <=", value, "followupmode");
            return (Criteria) this;
        }

        public Criteria andFollowupmodeIn(List<Short> values) {
            addCriterion("followUpMode in", values, "followupmode");
            return (Criteria) this;
        }

        public Criteria andFollowupmodeNotIn(List<Short> values) {
            addCriterion("followUpMode not in", values, "followupmode");
            return (Criteria) this;
        }

        public Criteria andFollowupmodeBetween(Short value1, Short value2) {
            addCriterion("followUpMode between", value1, value2, "followupmode");
            return (Criteria) this;
        }

        public Criteria andFollowupmodeNotBetween(Short value1, Short value2) {
            addCriterion("followUpMode not between", value1, value2, "followupmode");
            return (Criteria) this;
        }

        public Criteria andNextfollowuptimeIsNull() {
            addCriterion("nextFollowUpTime is null");
            return (Criteria) this;
        }

        public Criteria andNextfollowuptimeIsNotNull() {
            addCriterion("nextFollowUpTime is not null");
            return (Criteria) this;
        }

        public Criteria andNextfollowuptimeEqualTo(Date value) {
            addCriterion("nextFollowUpTime =", value, "nextfollowuptime");
            return (Criteria) this;
        }

        public Criteria andNextfollowuptimeNotEqualTo(Date value) {
            addCriterion("nextFollowUpTime <>", value, "nextfollowuptime");
            return (Criteria) this;
        }

        public Criteria andNextfollowuptimeGreaterThan(Date value) {
            addCriterion("nextFollowUpTime >", value, "nextfollowuptime");
            return (Criteria) this;
        }

        public Criteria andNextfollowuptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("nextFollowUpTime >=", value, "nextfollowuptime");
            return (Criteria) this;
        }

        public Criteria andNextfollowuptimeLessThan(Date value) {
            addCriterion("nextFollowUpTime <", value, "nextfollowuptime");
            return (Criteria) this;
        }

        public Criteria andNextfollowuptimeLessThanOrEqualTo(Date value) {
            addCriterion("nextFollowUpTime <=", value, "nextfollowuptime");
            return (Criteria) this;
        }

        public Criteria andNextfollowuptimeIn(List<Date> values) {
            addCriterion("nextFollowUpTime in", values, "nextfollowuptime");
            return (Criteria) this;
        }

        public Criteria andNextfollowuptimeNotIn(List<Date> values) {
            addCriterion("nextFollowUpTime not in", values, "nextfollowuptime");
            return (Criteria) this;
        }

        public Criteria andNextfollowuptimeBetween(Date value1, Date value2) {
            addCriterion("nextFollowUpTime between", value1, value2, "nextfollowuptime");
            return (Criteria) this;
        }

        public Criteria andNextfollowuptimeNotBetween(Date value1, Date value2) {
            addCriterion("nextFollowUpTime not between", value1, value2, "nextfollowuptime");
            return (Criteria) this;
        }

        public Criteria andAdviseIsNull() {
            addCriterion("advise is null");
            return (Criteria) this;
        }

        public Criteria andAdviseIsNotNull() {
            addCriterion("advise is not null");
            return (Criteria) this;
        }

        public Criteria andAdviseEqualTo(String value) {
            addCriterion("advise =", value, "advise");
            return (Criteria) this;
        }

        public Criteria andAdviseNotEqualTo(String value) {
            addCriterion("advise <>", value, "advise");
            return (Criteria) this;
        }

        public Criteria andAdviseGreaterThan(String value) {
            addCriterion("advise >", value, "advise");
            return (Criteria) this;
        }

        public Criteria andAdviseGreaterThanOrEqualTo(String value) {
            addCriterion("advise >=", value, "advise");
            return (Criteria) this;
        }

        public Criteria andAdviseLessThan(String value) {
            addCriterion("advise <", value, "advise");
            return (Criteria) this;
        }

        public Criteria andAdviseLessThanOrEqualTo(String value) {
            addCriterion("advise <=", value, "advise");
            return (Criteria) this;
        }

        public Criteria andAdviseLike(String value) {
            addCriterion("advise like", value, "advise");
            return (Criteria) this;
        }

        public Criteria andAdviseNotLike(String value) {
            addCriterion("advise not like", value, "advise");
            return (Criteria) this;
        }

        public Criteria andAdviseIn(List<String> values) {
            addCriterion("advise in", values, "advise");
            return (Criteria) this;
        }

        public Criteria andAdviseNotIn(List<String> values) {
            addCriterion("advise not in", values, "advise");
            return (Criteria) this;
        }

        public Criteria andAdviseBetween(String value1, String value2) {
            addCriterion("advise between", value1, value2, "advise");
            return (Criteria) this;
        }

        public Criteria andAdviseNotBetween(String value1, String value2) {
            addCriterion("advise not between", value1, value2, "advise");
            return (Criteria) this;
        }

        public Criteria andFollowuptimeIsNull() {
            addCriterion("followUpTime is null");
            return (Criteria) this;
        }

        public Criteria andFollowuptimeIsNotNull() {
            addCriterion("followUpTime is not null");
            return (Criteria) this;
        }

        public Criteria andFollowuptimeEqualTo(Date value) {
            addCriterion("followUpTime =", value, "followuptime");
            return (Criteria) this;
        }

        public Criteria andFollowuptimeNotEqualTo(Date value) {
            addCriterion("followUpTime <>", value, "followuptime");
            return (Criteria) this;
        }

        public Criteria andFollowuptimeGreaterThan(Date value) {
            addCriterion("followUpTime >", value, "followuptime");
            return (Criteria) this;
        }

        public Criteria andFollowuptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("followUpTime >=", value, "followuptime");
            return (Criteria) this;
        }

        public Criteria andFollowuptimeLessThan(Date value) {
            addCriterion("followUpTime <", value, "followuptime");
            return (Criteria) this;
        }

        public Criteria andFollowuptimeLessThanOrEqualTo(Date value) {
            addCriterion("followUpTime <=", value, "followuptime");
            return (Criteria) this;
        }

        public Criteria andFollowuptimeIn(List<Date> values) {
            addCriterion("followUpTime in", values, "followuptime");
            return (Criteria) this;
        }

        public Criteria andFollowuptimeNotIn(List<Date> values) {
            addCriterion("followUpTime not in", values, "followuptime");
            return (Criteria) this;
        }

        public Criteria andFollowuptimeBetween(Date value1, Date value2) {
            addCriterion("followUpTime between", value1, value2, "followuptime");
            return (Criteria) this;
        }

        public Criteria andFollowuptimeNotBetween(Date value1, Date value2) {
            addCriterion("followUpTime not between", value1, value2, "followuptime");
            return (Criteria) this;
        }

        public Criteria andJurisdictionalagencyIsNull() {
            addCriterion("jurisdictionalAgency is null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionalagencyIsNotNull() {
            addCriterion("jurisdictionalAgency is not null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionalagencyEqualTo(String value) {
            addCriterion("jurisdictionalAgency =", value, "jurisdictionalagency");
            return (Criteria) this;
        }

        public Criteria andJurisdictionalagencyNotEqualTo(String value) {
            addCriterion("jurisdictionalAgency <>", value, "jurisdictionalagency");
            return (Criteria) this;
        }

        public Criteria andJurisdictionalagencyGreaterThan(String value) {
            addCriterion("jurisdictionalAgency >", value, "jurisdictionalagency");
            return (Criteria) this;
        }

        public Criteria andJurisdictionalagencyGreaterThanOrEqualTo(String value) {
            addCriterion("jurisdictionalAgency >=", value, "jurisdictionalagency");
            return (Criteria) this;
        }

        public Criteria andJurisdictionalagencyLessThan(String value) {
            addCriterion("jurisdictionalAgency <", value, "jurisdictionalagency");
            return (Criteria) this;
        }

        public Criteria andJurisdictionalagencyLessThanOrEqualTo(String value) {
            addCriterion("jurisdictionalAgency <=", value, "jurisdictionalagency");
            return (Criteria) this;
        }

        public Criteria andJurisdictionalagencyLike(String value) {
            addCriterion("jurisdictionalAgency like", value, "jurisdictionalagency");
            return (Criteria) this;
        }

        public Criteria andJurisdictionalagencyNotLike(String value) {
            addCriterion("jurisdictionalAgency not like", value, "jurisdictionalagency");
            return (Criteria) this;
        }

        public Criteria andJurisdictionalagencyIn(List<String> values) {
            addCriterion("jurisdictionalAgency in", values, "jurisdictionalagency");
            return (Criteria) this;
        }

        public Criteria andJurisdictionalagencyNotIn(List<String> values) {
            addCriterion("jurisdictionalAgency not in", values, "jurisdictionalagency");
            return (Criteria) this;
        }

        public Criteria andJurisdictionalagencyBetween(String value1, String value2) {
            addCriterion("jurisdictionalAgency between", value1, value2, "jurisdictionalagency");
            return (Criteria) this;
        }

        public Criteria andJurisdictionalagencyNotBetween(String value1, String value2) {
            addCriterion("jurisdictionalAgency not between", value1, value2, "jurisdictionalagency");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruserIsNull() {
            addCriterion("lastModifierUser is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruserIsNotNull() {
            addCriterion("lastModifierUser is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruserEqualTo(String value) {
            addCriterion("lastModifierUser =", value, "lastmodifieruser");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruserNotEqualTo(String value) {
            addCriterion("lastModifierUser <>", value, "lastmodifieruser");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruserGreaterThan(String value) {
            addCriterion("lastModifierUser >", value, "lastmodifieruser");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruserGreaterThanOrEqualTo(String value) {
            addCriterion("lastModifierUser >=", value, "lastmodifieruser");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruserLessThan(String value) {
            addCriterion("lastModifierUser <", value, "lastmodifieruser");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruserLessThanOrEqualTo(String value) {
            addCriterion("lastModifierUser <=", value, "lastmodifieruser");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruserLike(String value) {
            addCriterion("lastModifierUser like", value, "lastmodifieruser");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruserNotLike(String value) {
            addCriterion("lastModifierUser not like", value, "lastmodifieruser");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruserIn(List<String> values) {
            addCriterion("lastModifierUser in", values, "lastmodifieruser");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruserNotIn(List<String> values) {
            addCriterion("lastModifierUser not in", values, "lastmodifieruser");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruserBetween(String value1, String value2) {
            addCriterion("lastModifierUser between", value1, value2, "lastmodifieruser");
            return (Criteria) this;
        }

        public Criteria andLastmodifieruserNotBetween(String value1, String value2) {
            addCriterion("lastModifierUser not between", value1, value2, "lastmodifieruser");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeIsNull() {
            addCriterion("lastModificationTime is null");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeIsNotNull() {
            addCriterion("lastModificationTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeEqualTo(Date value) {
            addCriterion("lastModificationTime =", value, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeNotEqualTo(Date value) {
            addCriterion("lastModificationTime <>", value, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeGreaterThan(Date value) {
            addCriterion("lastModificationTime >", value, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastModificationTime >=", value, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeLessThan(Date value) {
            addCriterion("lastModificationTime <", value, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeLessThanOrEqualTo(Date value) {
            addCriterion("lastModificationTime <=", value, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeIn(List<Date> values) {
            addCriterion("lastModificationTime in", values, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeNotIn(List<Date> values) {
            addCriterion("lastModificationTime not in", values, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeBetween(Date value1, Date value2) {
            addCriterion("lastModificationTime between", value1, value2, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andLastmodificationtimeNotBetween(Date value1, Date value2) {
            addCriterion("lastModificationTime not between", value1, value2, "lastmodificationtime");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNull() {
            addCriterion("isDeleted is null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNotNull() {
            addCriterion("isDeleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedEqualTo(Boolean value) {
            addCriterion("isDeleted =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(Boolean value) {
            addCriterion("isDeleted <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(Boolean value) {
            addCriterion("isDeleted >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isDeleted >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(Boolean value) {
            addCriterion("isDeleted <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("isDeleted <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<Boolean> values) {
            addCriterion("isDeleted in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<Boolean> values) {
            addCriterion("isDeleted not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("isDeleted between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isDeleted not between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeIsNull() {
            addCriterion("deletedTime is null");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeIsNotNull() {
            addCriterion("deletedTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeEqualTo(Date value) {
            addCriterion("deletedTime =", value, "deletedtime");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeNotEqualTo(Date value) {
            addCriterion("deletedTime <>", value, "deletedtime");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeGreaterThan(Date value) {
            addCriterion("deletedTime >", value, "deletedtime");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deletedTime >=", value, "deletedtime");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeLessThan(Date value) {
            addCriterion("deletedTime <", value, "deletedtime");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeLessThanOrEqualTo(Date value) {
            addCriterion("deletedTime <=", value, "deletedtime");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeIn(List<Date> values) {
            addCriterion("deletedTime in", values, "deletedtime");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeNotIn(List<Date> values) {
            addCriterion("deletedTime not in", values, "deletedtime");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeBetween(Date value1, Date value2) {
            addCriterion("deletedTime between", value1, value2, "deletedtime");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeNotBetween(Date value1, Date value2) {
            addCriterion("deletedTime not between", value1, value2, "deletedtime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}