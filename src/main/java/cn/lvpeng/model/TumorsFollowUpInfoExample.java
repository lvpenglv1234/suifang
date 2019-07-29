package cn.lvpeng.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TumorsFollowUpInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TumorsFollowUpInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andDetailidIsNull() {
            addCriterion("detailID is null");
            return (Criteria) this;
        }

        public Criteria andDetailidIsNotNull() {
            addCriterion("detailID is not null");
            return (Criteria) this;
        }

        public Criteria andDetailidEqualTo(Integer value) {
            addCriterion("detailID =", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotEqualTo(Integer value) {
            addCriterion("detailID <>", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidGreaterThan(Integer value) {
            addCriterion("detailID >", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("detailID >=", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidLessThan(Integer value) {
            addCriterion("detailID <", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidLessThanOrEqualTo(Integer value) {
            addCriterion("detailID <=", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidIn(List<Integer> values) {
            addCriterion("detailID in", values, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotIn(List<Integer> values) {
            addCriterion("detailID not in", values, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidBetween(Integer value1, Integer value2) {
            addCriterion("detailID between", value1, value2, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotBetween(Integer value1, Integer value2) {
            addCriterion("detailID not between", value1, value2, "detailid");
            return (Criteria) this;
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

        public Criteria andIsresidenceverificationIsNull() {
            addCriterion("isResidenceVerification is null");
            return (Criteria) this;
        }

        public Criteria andIsresidenceverificationIsNotNull() {
            addCriterion("isResidenceVerification is not null");
            return (Criteria) this;
        }

        public Criteria andIsresidenceverificationEqualTo(Boolean value) {
            addCriterion("isResidenceVerification =", value, "isresidenceverification");
            return (Criteria) this;
        }

        public Criteria andIsresidenceverificationNotEqualTo(Boolean value) {
            addCriterion("isResidenceVerification <>", value, "isresidenceverification");
            return (Criteria) this;
        }

        public Criteria andIsresidenceverificationGreaterThan(Boolean value) {
            addCriterion("isResidenceVerification >", value, "isresidenceverification");
            return (Criteria) this;
        }

        public Criteria andIsresidenceverificationGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isResidenceVerification >=", value, "isresidenceverification");
            return (Criteria) this;
        }

        public Criteria andIsresidenceverificationLessThan(Boolean value) {
            addCriterion("isResidenceVerification <", value, "isresidenceverification");
            return (Criteria) this;
        }

        public Criteria andIsresidenceverificationLessThanOrEqualTo(Boolean value) {
            addCriterion("isResidenceVerification <=", value, "isresidenceverification");
            return (Criteria) this;
        }

        public Criteria andIsresidenceverificationIn(List<Boolean> values) {
            addCriterion("isResidenceVerification in", values, "isresidenceverification");
            return (Criteria) this;
        }

        public Criteria andIsresidenceverificationNotIn(List<Boolean> values) {
            addCriterion("isResidenceVerification not in", values, "isresidenceverification");
            return (Criteria) this;
        }

        public Criteria andIsresidenceverificationBetween(Boolean value1, Boolean value2) {
            addCriterion("isResidenceVerification between", value1, value2, "isresidenceverification");
            return (Criteria) this;
        }

        public Criteria andIsresidenceverificationNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isResidenceVerification not between", value1, value2, "isresidenceverification");
            return (Criteria) this;
        }

        public Criteria andUnverifiedresidencereasonsIsNull() {
            addCriterion("unverifiedResidenceReasons is null");
            return (Criteria) this;
        }

        public Criteria andUnverifiedresidencereasonsIsNotNull() {
            addCriterion("unverifiedResidenceReasons is not null");
            return (Criteria) this;
        }

        public Criteria andUnverifiedresidencereasonsEqualTo(String value) {
            addCriterion("unverifiedResidenceReasons =", value, "unverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andUnverifiedresidencereasonsNotEqualTo(String value) {
            addCriterion("unverifiedResidenceReasons <>", value, "unverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andUnverifiedresidencereasonsGreaterThan(String value) {
            addCriterion("unverifiedResidenceReasons >", value, "unverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andUnverifiedresidencereasonsGreaterThanOrEqualTo(String value) {
            addCriterion("unverifiedResidenceReasons >=", value, "unverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andUnverifiedresidencereasonsLessThan(String value) {
            addCriterion("unverifiedResidenceReasons <", value, "unverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andUnverifiedresidencereasonsLessThanOrEqualTo(String value) {
            addCriterion("unverifiedResidenceReasons <=", value, "unverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andUnverifiedresidencereasonsLike(String value) {
            addCriterion("unverifiedResidenceReasons like", value, "unverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andUnverifiedresidencereasonsNotLike(String value) {
            addCriterion("unverifiedResidenceReasons not like", value, "unverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andUnverifiedresidencereasonsIn(List<String> values) {
            addCriterion("unverifiedResidenceReasons in", values, "unverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andUnverifiedresidencereasonsNotIn(List<String> values) {
            addCriterion("unverifiedResidenceReasons not in", values, "unverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andUnverifiedresidencereasonsBetween(String value1, String value2) {
            addCriterion("unverifiedResidenceReasons between", value1, value2, "unverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andUnverifiedresidencereasonsNotBetween(String value1, String value2) {
            addCriterion("unverifiedResidenceReasons not between", value1, value2, "unverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andPassivesmokingplacesIsNull() {
            addCriterion("passiveSmokingPlaces is null");
            return (Criteria) this;
        }

        public Criteria andPassivesmokingplacesIsNotNull() {
            addCriterion("passiveSmokingPlaces is not null");
            return (Criteria) this;
        }

        public Criteria andPassivesmokingplacesEqualTo(String value) {
            addCriterion("passiveSmokingPlaces =", value, "passivesmokingplaces");
            return (Criteria) this;
        }

        public Criteria andPassivesmokingplacesNotEqualTo(String value) {
            addCriterion("passiveSmokingPlaces <>", value, "passivesmokingplaces");
            return (Criteria) this;
        }

        public Criteria andPassivesmokingplacesGreaterThan(String value) {
            addCriterion("passiveSmokingPlaces >", value, "passivesmokingplaces");
            return (Criteria) this;
        }

        public Criteria andPassivesmokingplacesGreaterThanOrEqualTo(String value) {
            addCriterion("passiveSmokingPlaces >=", value, "passivesmokingplaces");
            return (Criteria) this;
        }

        public Criteria andPassivesmokingplacesLessThan(String value) {
            addCriterion("passiveSmokingPlaces <", value, "passivesmokingplaces");
            return (Criteria) this;
        }

        public Criteria andPassivesmokingplacesLessThanOrEqualTo(String value) {
            addCriterion("passiveSmokingPlaces <=", value, "passivesmokingplaces");
            return (Criteria) this;
        }

        public Criteria andPassivesmokingplacesLike(String value) {
            addCriterion("passiveSmokingPlaces like", value, "passivesmokingplaces");
            return (Criteria) this;
        }

        public Criteria andPassivesmokingplacesNotLike(String value) {
            addCriterion("passiveSmokingPlaces not like", value, "passivesmokingplaces");
            return (Criteria) this;
        }

        public Criteria andPassivesmokingplacesIn(List<String> values) {
            addCriterion("passiveSmokingPlaces in", values, "passivesmokingplaces");
            return (Criteria) this;
        }

        public Criteria andPassivesmokingplacesNotIn(List<String> values) {
            addCriterion("passiveSmokingPlaces not in", values, "passivesmokingplaces");
            return (Criteria) this;
        }

        public Criteria andPassivesmokingplacesBetween(String value1, String value2) {
            addCriterion("passiveSmokingPlaces between", value1, value2, "passivesmokingplaces");
            return (Criteria) this;
        }

        public Criteria andPassivesmokingplacesNotBetween(String value1, String value2) {
            addCriterion("passiveSmokingPlaces not between", value1, value2, "passivesmokingplaces");
            return (Criteria) this;
        }

        public Criteria andSmokingageIsNull() {
            addCriterion("smokingAge is null");
            return (Criteria) this;
        }

        public Criteria andSmokingageIsNotNull() {
            addCriterion("smokingAge is not null");
            return (Criteria) this;
        }

        public Criteria andSmokingageEqualTo(Short value) {
            addCriterion("smokingAge =", value, "smokingage");
            return (Criteria) this;
        }

        public Criteria andSmokingageNotEqualTo(Short value) {
            addCriterion("smokingAge <>", value, "smokingage");
            return (Criteria) this;
        }

        public Criteria andSmokingageGreaterThan(Short value) {
            addCriterion("smokingAge >", value, "smokingage");
            return (Criteria) this;
        }

        public Criteria andSmokingageGreaterThanOrEqualTo(Short value) {
            addCriterion("smokingAge >=", value, "smokingage");
            return (Criteria) this;
        }

        public Criteria andSmokingageLessThan(Short value) {
            addCriterion("smokingAge <", value, "smokingage");
            return (Criteria) this;
        }

        public Criteria andSmokingageLessThanOrEqualTo(Short value) {
            addCriterion("smokingAge <=", value, "smokingage");
            return (Criteria) this;
        }

        public Criteria andSmokingageIn(List<Short> values) {
            addCriterion("smokingAge in", values, "smokingage");
            return (Criteria) this;
        }

        public Criteria andSmokingageNotIn(List<Short> values) {
            addCriterion("smokingAge not in", values, "smokingage");
            return (Criteria) this;
        }

        public Criteria andSmokingageBetween(Short value1, Short value2) {
            addCriterion("smokingAge between", value1, value2, "smokingage");
            return (Criteria) this;
        }

        public Criteria andSmokingageNotBetween(Short value1, Short value2) {
            addCriterion("smokingAge not between", value1, value2, "smokingage");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageIsNull() {
            addCriterion("quitSmokingAge is null");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageIsNotNull() {
            addCriterion("quitSmokingAge is not null");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageEqualTo(Short value) {
            addCriterion("quitSmokingAge =", value, "quitsmokingage");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageNotEqualTo(Short value) {
            addCriterion("quitSmokingAge <>", value, "quitsmokingage");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageGreaterThan(Short value) {
            addCriterion("quitSmokingAge >", value, "quitsmokingage");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageGreaterThanOrEqualTo(Short value) {
            addCriterion("quitSmokingAge >=", value, "quitsmokingage");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageLessThan(Short value) {
            addCriterion("quitSmokingAge <", value, "quitsmokingage");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageLessThanOrEqualTo(Short value) {
            addCriterion("quitSmokingAge <=", value, "quitsmokingage");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageIn(List<Short> values) {
            addCriterion("quitSmokingAge in", values, "quitsmokingage");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageNotIn(List<Short> values) {
            addCriterion("quitSmokingAge not in", values, "quitsmokingage");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageBetween(Short value1, Short value2) {
            addCriterion("quitSmokingAge between", value1, value2, "quitsmokingage");
            return (Criteria) this;
        }

        public Criteria andQuitsmokingageNotBetween(Short value1, Short value2) {
            addCriterion("quitSmokingAge not between", value1, value2, "quitsmokingage");
            return (Criteria) this;
        }

        public Criteria andSmokingnumIsNull() {
            addCriterion("smokingNum is null");
            return (Criteria) this;
        }

        public Criteria andSmokingnumIsNotNull() {
            addCriterion("smokingNum is not null");
            return (Criteria) this;
        }

        public Criteria andSmokingnumEqualTo(Short value) {
            addCriterion("smokingNum =", value, "smokingnum");
            return (Criteria) this;
        }

        public Criteria andSmokingnumNotEqualTo(Short value) {
            addCriterion("smokingNum <>", value, "smokingnum");
            return (Criteria) this;
        }

        public Criteria andSmokingnumGreaterThan(Short value) {
            addCriterion("smokingNum >", value, "smokingnum");
            return (Criteria) this;
        }

        public Criteria andSmokingnumGreaterThanOrEqualTo(Short value) {
            addCriterion("smokingNum >=", value, "smokingnum");
            return (Criteria) this;
        }

        public Criteria andSmokingnumLessThan(Short value) {
            addCriterion("smokingNum <", value, "smokingnum");
            return (Criteria) this;
        }

        public Criteria andSmokingnumLessThanOrEqualTo(Short value) {
            addCriterion("smokingNum <=", value, "smokingnum");
            return (Criteria) this;
        }

        public Criteria andSmokingnumIn(List<Short> values) {
            addCriterion("smokingNum in", values, "smokingnum");
            return (Criteria) this;
        }

        public Criteria andSmokingnumNotIn(List<Short> values) {
            addCriterion("smokingNum not in", values, "smokingnum");
            return (Criteria) this;
        }

        public Criteria andSmokingnumBetween(Short value1, Short value2) {
            addCriterion("smokingNum between", value1, value2, "smokingnum");
            return (Criteria) this;
        }

        public Criteria andSmokingnumNotBetween(Short value1, Short value2) {
            addCriterion("smokingNum not between", value1, value2, "smokingnum");
            return (Criteria) this;
        }

        public Criteria andTumorsfamilyhistoryIsNull() {
            addCriterion("tumorsFamilyHistory is null");
            return (Criteria) this;
        }

        public Criteria andTumorsfamilyhistoryIsNotNull() {
            addCriterion("tumorsFamilyHistory is not null");
            return (Criteria) this;
        }

        public Criteria andTumorsfamilyhistoryEqualTo(String value) {
            addCriterion("tumorsFamilyHistory =", value, "tumorsfamilyhistory");
            return (Criteria) this;
        }

        public Criteria andTumorsfamilyhistoryNotEqualTo(String value) {
            addCriterion("tumorsFamilyHistory <>", value, "tumorsfamilyhistory");
            return (Criteria) this;
        }

        public Criteria andTumorsfamilyhistoryGreaterThan(String value) {
            addCriterion("tumorsFamilyHistory >", value, "tumorsfamilyhistory");
            return (Criteria) this;
        }

        public Criteria andTumorsfamilyhistoryGreaterThanOrEqualTo(String value) {
            addCriterion("tumorsFamilyHistory >=", value, "tumorsfamilyhistory");
            return (Criteria) this;
        }

        public Criteria andTumorsfamilyhistoryLessThan(String value) {
            addCriterion("tumorsFamilyHistory <", value, "tumorsfamilyhistory");
            return (Criteria) this;
        }

        public Criteria andTumorsfamilyhistoryLessThanOrEqualTo(String value) {
            addCriterion("tumorsFamilyHistory <=", value, "tumorsfamilyhistory");
            return (Criteria) this;
        }

        public Criteria andTumorsfamilyhistoryLike(String value) {
            addCriterion("tumorsFamilyHistory like", value, "tumorsfamilyhistory");
            return (Criteria) this;
        }

        public Criteria andTumorsfamilyhistoryNotLike(String value) {
            addCriterion("tumorsFamilyHistory not like", value, "tumorsfamilyhistory");
            return (Criteria) this;
        }

        public Criteria andTumorsfamilyhistoryIn(List<String> values) {
            addCriterion("tumorsFamilyHistory in", values, "tumorsfamilyhistory");
            return (Criteria) this;
        }

        public Criteria andTumorsfamilyhistoryNotIn(List<String> values) {
            addCriterion("tumorsFamilyHistory not in", values, "tumorsfamilyhistory");
            return (Criteria) this;
        }

        public Criteria andTumorsfamilyhistoryBetween(String value1, String value2) {
            addCriterion("tumorsFamilyHistory between", value1, value2, "tumorsfamilyhistory");
            return (Criteria) this;
        }

        public Criteria andTumorsfamilyhistoryNotBetween(String value1, String value2) {
            addCriterion("tumorsFamilyHistory not between", value1, value2, "tumorsfamilyhistory");
            return (Criteria) this;
        }

        public Criteria andRelationshipwithpatientIsNull() {
            addCriterion("relationshipWithPatient is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipwithpatientIsNotNull() {
            addCriterion("relationshipWithPatient is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipwithpatientEqualTo(String value) {
            addCriterion("relationshipWithPatient =", value, "relationshipwithpatient");
            return (Criteria) this;
        }

        public Criteria andRelationshipwithpatientNotEqualTo(String value) {
            addCriterion("relationshipWithPatient <>", value, "relationshipwithpatient");
            return (Criteria) this;
        }

        public Criteria andRelationshipwithpatientGreaterThan(String value) {
            addCriterion("relationshipWithPatient >", value, "relationshipwithpatient");
            return (Criteria) this;
        }

        public Criteria andRelationshipwithpatientGreaterThanOrEqualTo(String value) {
            addCriterion("relationshipWithPatient >=", value, "relationshipwithpatient");
            return (Criteria) this;
        }

        public Criteria andRelationshipwithpatientLessThan(String value) {
            addCriterion("relationshipWithPatient <", value, "relationshipwithpatient");
            return (Criteria) this;
        }

        public Criteria andRelationshipwithpatientLessThanOrEqualTo(String value) {
            addCriterion("relationshipWithPatient <=", value, "relationshipwithpatient");
            return (Criteria) this;
        }

        public Criteria andRelationshipwithpatientLike(String value) {
            addCriterion("relationshipWithPatient like", value, "relationshipwithpatient");
            return (Criteria) this;
        }

        public Criteria andRelationshipwithpatientNotLike(String value) {
            addCriterion("relationshipWithPatient not like", value, "relationshipwithpatient");
            return (Criteria) this;
        }

        public Criteria andRelationshipwithpatientIn(List<String> values) {
            addCriterion("relationshipWithPatient in", values, "relationshipwithpatient");
            return (Criteria) this;
        }

        public Criteria andRelationshipwithpatientNotIn(List<String> values) {
            addCriterion("relationshipWithPatient not in", values, "relationshipwithpatient");
            return (Criteria) this;
        }

        public Criteria andRelationshipwithpatientBetween(String value1, String value2) {
            addCriterion("relationshipWithPatient between", value1, value2, "relationshipwithpatient");
            return (Criteria) this;
        }

        public Criteria andRelationshipwithpatientNotBetween(String value1, String value2) {
            addCriterion("relationshipWithPatient not between", value1, value2, "relationshipwithpatient");
            return (Criteria) this;
        }

        public Criteria andTumorfamilyhistorytypeIsNull() {
            addCriterion("tumorFamilyHistoryType is null");
            return (Criteria) this;
        }

        public Criteria andTumorfamilyhistorytypeIsNotNull() {
            addCriterion("tumorFamilyHistoryType is not null");
            return (Criteria) this;
        }

        public Criteria andTumorfamilyhistorytypeEqualTo(String value) {
            addCriterion("tumorFamilyHistoryType =", value, "tumorfamilyhistorytype");
            return (Criteria) this;
        }

        public Criteria andTumorfamilyhistorytypeNotEqualTo(String value) {
            addCriterion("tumorFamilyHistoryType <>", value, "tumorfamilyhistorytype");
            return (Criteria) this;
        }

        public Criteria andTumorfamilyhistorytypeGreaterThan(String value) {
            addCriterion("tumorFamilyHistoryType >", value, "tumorfamilyhistorytype");
            return (Criteria) this;
        }

        public Criteria andTumorfamilyhistorytypeGreaterThanOrEqualTo(String value) {
            addCriterion("tumorFamilyHistoryType >=", value, "tumorfamilyhistorytype");
            return (Criteria) this;
        }

        public Criteria andTumorfamilyhistorytypeLessThan(String value) {
            addCriterion("tumorFamilyHistoryType <", value, "tumorfamilyhistorytype");
            return (Criteria) this;
        }

        public Criteria andTumorfamilyhistorytypeLessThanOrEqualTo(String value) {
            addCriterion("tumorFamilyHistoryType <=", value, "tumorfamilyhistorytype");
            return (Criteria) this;
        }

        public Criteria andTumorfamilyhistorytypeLike(String value) {
            addCriterion("tumorFamilyHistoryType like", value, "tumorfamilyhistorytype");
            return (Criteria) this;
        }

        public Criteria andTumorfamilyhistorytypeNotLike(String value) {
            addCriterion("tumorFamilyHistoryType not like", value, "tumorfamilyhistorytype");
            return (Criteria) this;
        }

        public Criteria andTumorfamilyhistorytypeIn(List<String> values) {
            addCriterion("tumorFamilyHistoryType in", values, "tumorfamilyhistorytype");
            return (Criteria) this;
        }

        public Criteria andTumorfamilyhistorytypeNotIn(List<String> values) {
            addCriterion("tumorFamilyHistoryType not in", values, "tumorfamilyhistorytype");
            return (Criteria) this;
        }

        public Criteria andTumorfamilyhistorytypeBetween(String value1, String value2) {
            addCriterion("tumorFamilyHistoryType between", value1, value2, "tumorfamilyhistorytype");
            return (Criteria) this;
        }

        public Criteria andTumorfamilyhistorytypeNotBetween(String value1, String value2) {
            addCriterion("tumorFamilyHistoryType not between", value1, value2, "tumorfamilyhistorytype");
            return (Criteria) this;
        }

        public Criteria andFirstsymptomsdateIsNull() {
            addCriterion("firstSymptomsDate is null");
            return (Criteria) this;
        }

        public Criteria andFirstsymptomsdateIsNotNull() {
            addCriterion("firstSymptomsDate is not null");
            return (Criteria) this;
        }

        public Criteria andFirstsymptomsdateEqualTo(Date value) {
            addCriterionForJDBCDate("firstSymptomsDate =", value, "firstsymptomsdate");
            return (Criteria) this;
        }

        public Criteria andFirstsymptomsdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("firstSymptomsDate <>", value, "firstsymptomsdate");
            return (Criteria) this;
        }

        public Criteria andFirstsymptomsdateGreaterThan(Date value) {
            addCriterionForJDBCDate("firstSymptomsDate >", value, "firstsymptomsdate");
            return (Criteria) this;
        }

        public Criteria andFirstsymptomsdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("firstSymptomsDate >=", value, "firstsymptomsdate");
            return (Criteria) this;
        }

        public Criteria andFirstsymptomsdateLessThan(Date value) {
            addCriterionForJDBCDate("firstSymptomsDate <", value, "firstsymptomsdate");
            return (Criteria) this;
        }

        public Criteria andFirstsymptomsdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("firstSymptomsDate <=", value, "firstsymptomsdate");
            return (Criteria) this;
        }

        public Criteria andFirstsymptomsdateIn(List<Date> values) {
            addCriterionForJDBCDate("firstSymptomsDate in", values, "firstsymptomsdate");
            return (Criteria) this;
        }

        public Criteria andFirstsymptomsdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("firstSymptomsDate not in", values, "firstsymptomsdate");
            return (Criteria) this;
        }

        public Criteria andFirstsymptomsdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("firstSymptomsDate between", value1, value2, "firstsymptomsdate");
            return (Criteria) this;
        }

        public Criteria andFirstsymptomsdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("firstSymptomsDate not between", value1, value2, "firstsymptomsdate");
            return (Criteria) this;
        }

        public Criteria andFirstvisitdateIsNull() {
            addCriterion("firstVisitDate is null");
            return (Criteria) this;
        }

        public Criteria andFirstvisitdateIsNotNull() {
            addCriterion("firstVisitDate is not null");
            return (Criteria) this;
        }

        public Criteria andFirstvisitdateEqualTo(Date value) {
            addCriterionForJDBCDate("firstVisitDate =", value, "firstvisitdate");
            return (Criteria) this;
        }

        public Criteria andFirstvisitdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("firstVisitDate <>", value, "firstvisitdate");
            return (Criteria) this;
        }

        public Criteria andFirstvisitdateGreaterThan(Date value) {
            addCriterionForJDBCDate("firstVisitDate >", value, "firstvisitdate");
            return (Criteria) this;
        }

        public Criteria andFirstvisitdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("firstVisitDate >=", value, "firstvisitdate");
            return (Criteria) this;
        }

        public Criteria andFirstvisitdateLessThan(Date value) {
            addCriterionForJDBCDate("firstVisitDate <", value, "firstvisitdate");
            return (Criteria) this;
        }

        public Criteria andFirstvisitdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("firstVisitDate <=", value, "firstvisitdate");
            return (Criteria) this;
        }

        public Criteria andFirstvisitdateIn(List<Date> values) {
            addCriterionForJDBCDate("firstVisitDate in", values, "firstvisitdate");
            return (Criteria) this;
        }

        public Criteria andFirstvisitdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("firstVisitDate not in", values, "firstvisitdate");
            return (Criteria) this;
        }

        public Criteria andFirstvisitdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("firstVisitDate between", value1, value2, "firstvisitdate");
            return (Criteria) this;
        }

        public Criteria andFirstvisitdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("firstVisitDate not between", value1, value2, "firstvisitdate");
            return (Criteria) this;
        }

        public Criteria andTumortreatmenthospitalIsNull() {
            addCriterion("tumorTreatmentHospital is null");
            return (Criteria) this;
        }

        public Criteria andTumortreatmenthospitalIsNotNull() {
            addCriterion("tumorTreatmentHospital is not null");
            return (Criteria) this;
        }

        public Criteria andTumortreatmenthospitalEqualTo(String value) {
            addCriterion("tumorTreatmentHospital =", value, "tumortreatmenthospital");
            return (Criteria) this;
        }

        public Criteria andTumortreatmenthospitalNotEqualTo(String value) {
            addCriterion("tumorTreatmentHospital <>", value, "tumortreatmenthospital");
            return (Criteria) this;
        }

        public Criteria andTumortreatmenthospitalGreaterThan(String value) {
            addCriterion("tumorTreatmentHospital >", value, "tumortreatmenthospital");
            return (Criteria) this;
        }

        public Criteria andTumortreatmenthospitalGreaterThanOrEqualTo(String value) {
            addCriterion("tumorTreatmentHospital >=", value, "tumortreatmenthospital");
            return (Criteria) this;
        }

        public Criteria andTumortreatmenthospitalLessThan(String value) {
            addCriterion("tumorTreatmentHospital <", value, "tumortreatmenthospital");
            return (Criteria) this;
        }

        public Criteria andTumortreatmenthospitalLessThanOrEqualTo(String value) {
            addCriterion("tumorTreatmentHospital <=", value, "tumortreatmenthospital");
            return (Criteria) this;
        }

        public Criteria andTumortreatmenthospitalLike(String value) {
            addCriterion("tumorTreatmentHospital like", value, "tumortreatmenthospital");
            return (Criteria) this;
        }

        public Criteria andTumortreatmenthospitalNotLike(String value) {
            addCriterion("tumorTreatmentHospital not like", value, "tumortreatmenthospital");
            return (Criteria) this;
        }

        public Criteria andTumortreatmenthospitalIn(List<String> values) {
            addCriterion("tumorTreatmentHospital in", values, "tumortreatmenthospital");
            return (Criteria) this;
        }

        public Criteria andTumortreatmenthospitalNotIn(List<String> values) {
            addCriterion("tumorTreatmentHospital not in", values, "tumortreatmenthospital");
            return (Criteria) this;
        }

        public Criteria andTumortreatmenthospitalBetween(String value1, String value2) {
            addCriterion("tumorTreatmentHospital between", value1, value2, "tumortreatmenthospital");
            return (Criteria) this;
        }

        public Criteria andTumortreatmenthospitalNotBetween(String value1, String value2) {
            addCriterion("tumorTreatmentHospital not between", value1, value2, "tumortreatmenthospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalIsNull() {
            addCriterion("firstOperationHospital is null");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalIsNotNull() {
            addCriterion("firstOperationHospital is not null");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalEqualTo(String value) {
            addCriterion("firstOperationHospital =", value, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalNotEqualTo(String value) {
            addCriterion("firstOperationHospital <>", value, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalGreaterThan(String value) {
            addCriterion("firstOperationHospital >", value, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalGreaterThanOrEqualTo(String value) {
            addCriterion("firstOperationHospital >=", value, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalLessThan(String value) {
            addCriterion("firstOperationHospital <", value, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalLessThanOrEqualTo(String value) {
            addCriterion("firstOperationHospital <=", value, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalLike(String value) {
            addCriterion("firstOperationHospital like", value, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalNotLike(String value) {
            addCriterion("firstOperationHospital not like", value, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalIn(List<String> values) {
            addCriterion("firstOperationHospital in", values, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalNotIn(List<String> values) {
            addCriterion("firstOperationHospital not in", values, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalBetween(String value1, String value2) {
            addCriterion("firstOperationHospital between", value1, value2, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationhospitalNotBetween(String value1, String value2) {
            addCriterion("firstOperationHospital not between", value1, value2, "firstoperationhospital");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateIsNull() {
            addCriterion("firstOperationDate is null");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateIsNotNull() {
            addCriterion("firstOperationDate is not null");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateEqualTo(Date value) {
            addCriterionForJDBCDate("firstOperationDate =", value, "firstoperationdate");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("firstOperationDate <>", value, "firstoperationdate");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateGreaterThan(Date value) {
            addCriterionForJDBCDate("firstOperationDate >", value, "firstoperationdate");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("firstOperationDate >=", value, "firstoperationdate");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateLessThan(Date value) {
            addCriterionForJDBCDate("firstOperationDate <", value, "firstoperationdate");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("firstOperationDate <=", value, "firstoperationdate");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateIn(List<Date> values) {
            addCriterionForJDBCDate("firstOperationDate in", values, "firstoperationdate");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("firstOperationDate not in", values, "firstoperationdate");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("firstOperationDate between", value1, value2, "firstoperationdate");
            return (Criteria) this;
        }

        public Criteria andFirstoperationdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("firstOperationDate not between", value1, value2, "firstoperationdate");
            return (Criteria) this;
        }

        public Criteria andFirstoperationtypeIsNull() {
            addCriterion("firstOperationType is null");
            return (Criteria) this;
        }

        public Criteria andFirstoperationtypeIsNotNull() {
            addCriterion("firstOperationType is not null");
            return (Criteria) this;
        }

        public Criteria andFirstoperationtypeEqualTo(String value) {
            addCriterion("firstOperationType =", value, "firstoperationtype");
            return (Criteria) this;
        }

        public Criteria andFirstoperationtypeNotEqualTo(String value) {
            addCriterion("firstOperationType <>", value, "firstoperationtype");
            return (Criteria) this;
        }

        public Criteria andFirstoperationtypeGreaterThan(String value) {
            addCriterion("firstOperationType >", value, "firstoperationtype");
            return (Criteria) this;
        }

        public Criteria andFirstoperationtypeGreaterThanOrEqualTo(String value) {
            addCriterion("firstOperationType >=", value, "firstoperationtype");
            return (Criteria) this;
        }

        public Criteria andFirstoperationtypeLessThan(String value) {
            addCriterion("firstOperationType <", value, "firstoperationtype");
            return (Criteria) this;
        }

        public Criteria andFirstoperationtypeLessThanOrEqualTo(String value) {
            addCriterion("firstOperationType <=", value, "firstoperationtype");
            return (Criteria) this;
        }

        public Criteria andFirstoperationtypeLike(String value) {
            addCriterion("firstOperationType like", value, "firstoperationtype");
            return (Criteria) this;
        }

        public Criteria andFirstoperationtypeNotLike(String value) {
            addCriterion("firstOperationType not like", value, "firstoperationtype");
            return (Criteria) this;
        }

        public Criteria andFirstoperationtypeIn(List<String> values) {
            addCriterion("firstOperationType in", values, "firstoperationtype");
            return (Criteria) this;
        }

        public Criteria andFirstoperationtypeNotIn(List<String> values) {
            addCriterion("firstOperationType not in", values, "firstoperationtype");
            return (Criteria) this;
        }

        public Criteria andFirstoperationtypeBetween(String value1, String value2) {
            addCriterion("firstOperationType between", value1, value2, "firstoperationtype");
            return (Criteria) this;
        }

        public Criteria andFirstoperationtypeNotBetween(String value1, String value2) {
            addCriterion("firstOperationType not between", value1, value2, "firstoperationtype");
            return (Criteria) this;
        }

        public Criteria andReportcardnoIsNull() {
            addCriterion("reportCardNo is null");
            return (Criteria) this;
        }

        public Criteria andReportcardnoIsNotNull() {
            addCriterion("reportCardNo is not null");
            return (Criteria) this;
        }

        public Criteria andReportcardnoEqualTo(String value) {
            addCriterion("reportCardNo =", value, "reportcardno");
            return (Criteria) this;
        }

        public Criteria andReportcardnoNotEqualTo(String value) {
            addCriterion("reportCardNo <>", value, "reportcardno");
            return (Criteria) this;
        }

        public Criteria andReportcardnoGreaterThan(String value) {
            addCriterion("reportCardNo >", value, "reportcardno");
            return (Criteria) this;
        }

        public Criteria andReportcardnoGreaterThanOrEqualTo(String value) {
            addCriterion("reportCardNo >=", value, "reportcardno");
            return (Criteria) this;
        }

        public Criteria andReportcardnoLessThan(String value) {
            addCriterion("reportCardNo <", value, "reportcardno");
            return (Criteria) this;
        }

        public Criteria andReportcardnoLessThanOrEqualTo(String value) {
            addCriterion("reportCardNo <=", value, "reportcardno");
            return (Criteria) this;
        }

        public Criteria andReportcardnoLike(String value) {
            addCriterion("reportCardNo like", value, "reportcardno");
            return (Criteria) this;
        }

        public Criteria andReportcardnoNotLike(String value) {
            addCriterion("reportCardNo not like", value, "reportcardno");
            return (Criteria) this;
        }

        public Criteria andReportcardnoIn(List<String> values) {
            addCriterion("reportCardNo in", values, "reportcardno");
            return (Criteria) this;
        }

        public Criteria andReportcardnoNotIn(List<String> values) {
            addCriterion("reportCardNo not in", values, "reportcardno");
            return (Criteria) this;
        }

        public Criteria andReportcardnoBetween(String value1, String value2) {
            addCriterion("reportCardNo between", value1, value2, "reportcardno");
            return (Criteria) this;
        }

        public Criteria andReportcardnoNotBetween(String value1, String value2) {
            addCriterion("reportCardNo not between", value1, value2, "reportcardno");
            return (Criteria) this;
        }

        public Criteria andNextunverifiedresidencereasonsIsNull() {
            addCriterion("nextUnverifiedResidenceReasons is null");
            return (Criteria) this;
        }

        public Criteria andNextunverifiedresidencereasonsIsNotNull() {
            addCriterion("nextUnverifiedResidenceReasons is not null");
            return (Criteria) this;
        }

        public Criteria andNextunverifiedresidencereasonsEqualTo(String value) {
            addCriterion("nextUnverifiedResidenceReasons =", value, "nextunverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andNextunverifiedresidencereasonsNotEqualTo(String value) {
            addCriterion("nextUnverifiedResidenceReasons <>", value, "nextunverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andNextunverifiedresidencereasonsGreaterThan(String value) {
            addCriterion("nextUnverifiedResidenceReasons >", value, "nextunverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andNextunverifiedresidencereasonsGreaterThanOrEqualTo(String value) {
            addCriterion("nextUnverifiedResidenceReasons >=", value, "nextunverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andNextunverifiedresidencereasonsLessThan(String value) {
            addCriterion("nextUnverifiedResidenceReasons <", value, "nextunverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andNextunverifiedresidencereasonsLessThanOrEqualTo(String value) {
            addCriterion("nextUnverifiedResidenceReasons <=", value, "nextunverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andNextunverifiedresidencereasonsLike(String value) {
            addCriterion("nextUnverifiedResidenceReasons like", value, "nextunverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andNextunverifiedresidencereasonsNotLike(String value) {
            addCriterion("nextUnverifiedResidenceReasons not like", value, "nextunverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andNextunverifiedresidencereasonsIn(List<String> values) {
            addCriterion("nextUnverifiedResidenceReasons in", values, "nextunverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andNextunverifiedresidencereasonsNotIn(List<String> values) {
            addCriterion("nextUnverifiedResidenceReasons not in", values, "nextunverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andNextunverifiedresidencereasonsBetween(String value1, String value2) {
            addCriterion("nextUnverifiedResidenceReasons between", value1, value2, "nextunverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andNextunverifiedresidencereasonsNotBetween(String value1, String value2) {
            addCriterion("nextUnverifiedResidenceReasons not between", value1, value2, "nextunverifiedresidencereasons");
            return (Criteria) this;
        }

        public Criteria andIsmetastasisIsNull() {
            addCriterion("isMetastasis is null");
            return (Criteria) this;
        }

        public Criteria andIsmetastasisIsNotNull() {
            addCriterion("isMetastasis is not null");
            return (Criteria) this;
        }

        public Criteria andIsmetastasisEqualTo(Boolean value) {
            addCriterion("isMetastasis =", value, "ismetastasis");
            return (Criteria) this;
        }

        public Criteria andIsmetastasisNotEqualTo(Boolean value) {
            addCriterion("isMetastasis <>", value, "ismetastasis");
            return (Criteria) this;
        }

        public Criteria andIsmetastasisGreaterThan(Boolean value) {
            addCriterion("isMetastasis >", value, "ismetastasis");
            return (Criteria) this;
        }

        public Criteria andIsmetastasisGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isMetastasis >=", value, "ismetastasis");
            return (Criteria) this;
        }

        public Criteria andIsmetastasisLessThan(Boolean value) {
            addCriterion("isMetastasis <", value, "ismetastasis");
            return (Criteria) this;
        }

        public Criteria andIsmetastasisLessThanOrEqualTo(Boolean value) {
            addCriterion("isMetastasis <=", value, "ismetastasis");
            return (Criteria) this;
        }

        public Criteria andIsmetastasisIn(List<Boolean> values) {
            addCriterion("isMetastasis in", values, "ismetastasis");
            return (Criteria) this;
        }

        public Criteria andIsmetastasisNotIn(List<Boolean> values) {
            addCriterion("isMetastasis not in", values, "ismetastasis");
            return (Criteria) this;
        }

        public Criteria andIsmetastasisBetween(Boolean value1, Boolean value2) {
            addCriterion("isMetastasis between", value1, value2, "ismetastasis");
            return (Criteria) this;
        }

        public Criteria andIsmetastasisNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isMetastasis not between", value1, value2, "ismetastasis");
            return (Criteria) this;
        }

        public Criteria andMetastasissiteIsNull() {
            addCriterion("metastasisSite is null");
            return (Criteria) this;
        }

        public Criteria andMetastasissiteIsNotNull() {
            addCriterion("metastasisSite is not null");
            return (Criteria) this;
        }

        public Criteria andMetastasissiteEqualTo(String value) {
            addCriterion("metastasisSite =", value, "metastasissite");
            return (Criteria) this;
        }

        public Criteria andMetastasissiteNotEqualTo(String value) {
            addCriterion("metastasisSite <>", value, "metastasissite");
            return (Criteria) this;
        }

        public Criteria andMetastasissiteGreaterThan(String value) {
            addCriterion("metastasisSite >", value, "metastasissite");
            return (Criteria) this;
        }

        public Criteria andMetastasissiteGreaterThanOrEqualTo(String value) {
            addCriterion("metastasisSite >=", value, "metastasissite");
            return (Criteria) this;
        }

        public Criteria andMetastasissiteLessThan(String value) {
            addCriterion("metastasisSite <", value, "metastasissite");
            return (Criteria) this;
        }

        public Criteria andMetastasissiteLessThanOrEqualTo(String value) {
            addCriterion("metastasisSite <=", value, "metastasissite");
            return (Criteria) this;
        }

        public Criteria andMetastasissiteLike(String value) {
            addCriterion("metastasisSite like", value, "metastasissite");
            return (Criteria) this;
        }

        public Criteria andMetastasissiteNotLike(String value) {
            addCriterion("metastasisSite not like", value, "metastasissite");
            return (Criteria) this;
        }

        public Criteria andMetastasissiteIn(List<String> values) {
            addCriterion("metastasisSite in", values, "metastasissite");
            return (Criteria) this;
        }

        public Criteria andMetastasissiteNotIn(List<String> values) {
            addCriterion("metastasisSite not in", values, "metastasissite");
            return (Criteria) this;
        }

        public Criteria andMetastasissiteBetween(String value1, String value2) {
            addCriterion("metastasisSite between", value1, value2, "metastasissite");
            return (Criteria) this;
        }

        public Criteria andMetastasissiteNotBetween(String value1, String value2) {
            addCriterion("metastasisSite not between", value1, value2, "metastasissite");
            return (Criteria) this;
        }

        public Criteria andIsrecurrenceIsNull() {
            addCriterion("isRecurrence is null");
            return (Criteria) this;
        }

        public Criteria andIsrecurrenceIsNotNull() {
            addCriterion("isRecurrence is not null");
            return (Criteria) this;
        }

        public Criteria andIsrecurrenceEqualTo(Boolean value) {
            addCriterion("isRecurrence =", value, "isrecurrence");
            return (Criteria) this;
        }

        public Criteria andIsrecurrenceNotEqualTo(Boolean value) {
            addCriterion("isRecurrence <>", value, "isrecurrence");
            return (Criteria) this;
        }

        public Criteria andIsrecurrenceGreaterThan(Boolean value) {
            addCriterion("isRecurrence >", value, "isrecurrence");
            return (Criteria) this;
        }

        public Criteria andIsrecurrenceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isRecurrence >=", value, "isrecurrence");
            return (Criteria) this;
        }

        public Criteria andIsrecurrenceLessThan(Boolean value) {
            addCriterion("isRecurrence <", value, "isrecurrence");
            return (Criteria) this;
        }

        public Criteria andIsrecurrenceLessThanOrEqualTo(Boolean value) {
            addCriterion("isRecurrence <=", value, "isrecurrence");
            return (Criteria) this;
        }

        public Criteria andIsrecurrenceIn(List<Boolean> values) {
            addCriterion("isRecurrence in", values, "isrecurrence");
            return (Criteria) this;
        }

        public Criteria andIsrecurrenceNotIn(List<Boolean> values) {
            addCriterion("isRecurrence not in", values, "isrecurrence");
            return (Criteria) this;
        }

        public Criteria andIsrecurrenceBetween(Boolean value1, Boolean value2) {
            addCriterion("isRecurrence between", value1, value2, "isrecurrence");
            return (Criteria) this;
        }

        public Criteria andIsrecurrenceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isRecurrence not between", value1, value2, "isrecurrence");
            return (Criteria) this;
        }

        public Criteria andRecurrencenumberIsNull() {
            addCriterion("recurrenceNumber is null");
            return (Criteria) this;
        }

        public Criteria andRecurrencenumberIsNotNull() {
            addCriterion("recurrenceNumber is not null");
            return (Criteria) this;
        }

        public Criteria andRecurrencenumberEqualTo(Short value) {
            addCriterion("recurrenceNumber =", value, "recurrencenumber");
            return (Criteria) this;
        }

        public Criteria andRecurrencenumberNotEqualTo(Short value) {
            addCriterion("recurrenceNumber <>", value, "recurrencenumber");
            return (Criteria) this;
        }

        public Criteria andRecurrencenumberGreaterThan(Short value) {
            addCriterion("recurrenceNumber >", value, "recurrencenumber");
            return (Criteria) this;
        }

        public Criteria andRecurrencenumberGreaterThanOrEqualTo(Short value) {
            addCriterion("recurrenceNumber >=", value, "recurrencenumber");
            return (Criteria) this;
        }

        public Criteria andRecurrencenumberLessThan(Short value) {
            addCriterion("recurrenceNumber <", value, "recurrencenumber");
            return (Criteria) this;
        }

        public Criteria andRecurrencenumberLessThanOrEqualTo(Short value) {
            addCriterion("recurrenceNumber <=", value, "recurrencenumber");
            return (Criteria) this;
        }

        public Criteria andRecurrencenumberIn(List<Short> values) {
            addCriterion("recurrenceNumber in", values, "recurrencenumber");
            return (Criteria) this;
        }

        public Criteria andRecurrencenumberNotIn(List<Short> values) {
            addCriterion("recurrenceNumber not in", values, "recurrencenumber");
            return (Criteria) this;
        }

        public Criteria andRecurrencenumberBetween(Short value1, Short value2) {
            addCriterion("recurrenceNumber between", value1, value2, "recurrencenumber");
            return (Criteria) this;
        }

        public Criteria andRecurrencenumberNotBetween(Short value1, Short value2) {
            addCriterion("recurrenceNumber not between", value1, value2, "recurrencenumber");
            return (Criteria) this;
        }

        public Criteria andRecurrencedateIsNull() {
            addCriterion("recurrenceDate is null");
            return (Criteria) this;
        }

        public Criteria andRecurrencedateIsNotNull() {
            addCriterion("recurrenceDate is not null");
            return (Criteria) this;
        }

        public Criteria andRecurrencedateEqualTo(Date value) {
            addCriterionForJDBCDate("recurrenceDate =", value, "recurrencedate");
            return (Criteria) this;
        }

        public Criteria andRecurrencedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("recurrenceDate <>", value, "recurrencedate");
            return (Criteria) this;
        }

        public Criteria andRecurrencedateGreaterThan(Date value) {
            addCriterionForJDBCDate("recurrenceDate >", value, "recurrencedate");
            return (Criteria) this;
        }

        public Criteria andRecurrencedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("recurrenceDate >=", value, "recurrencedate");
            return (Criteria) this;
        }

        public Criteria andRecurrencedateLessThan(Date value) {
            addCriterionForJDBCDate("recurrenceDate <", value, "recurrencedate");
            return (Criteria) this;
        }

        public Criteria andRecurrencedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("recurrenceDate <=", value, "recurrencedate");
            return (Criteria) this;
        }

        public Criteria andRecurrencedateIn(List<Date> values) {
            addCriterionForJDBCDate("recurrenceDate in", values, "recurrencedate");
            return (Criteria) this;
        }

        public Criteria andRecurrencedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("recurrenceDate not in", values, "recurrencedate");
            return (Criteria) this;
        }

        public Criteria andRecurrencedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("recurrenceDate between", value1, value2, "recurrencedate");
            return (Criteria) this;
        }

        public Criteria andRecurrencedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("recurrenceDate not between", value1, value2, "recurrencedate");
            return (Criteria) this;
        }

        public Criteria andTherapeuticmodalitiesIsNull() {
            addCriterion("therapeuticModalities is null");
            return (Criteria) this;
        }

        public Criteria andTherapeuticmodalitiesIsNotNull() {
            addCriterion("therapeuticModalities is not null");
            return (Criteria) this;
        }

        public Criteria andTherapeuticmodalitiesEqualTo(String value) {
            addCriterion("therapeuticModalities =", value, "therapeuticmodalities");
            return (Criteria) this;
        }

        public Criteria andTherapeuticmodalitiesNotEqualTo(String value) {
            addCriterion("therapeuticModalities <>", value, "therapeuticmodalities");
            return (Criteria) this;
        }

        public Criteria andTherapeuticmodalitiesGreaterThan(String value) {
            addCriterion("therapeuticModalities >", value, "therapeuticmodalities");
            return (Criteria) this;
        }

        public Criteria andTherapeuticmodalitiesGreaterThanOrEqualTo(String value) {
            addCriterion("therapeuticModalities >=", value, "therapeuticmodalities");
            return (Criteria) this;
        }

        public Criteria andTherapeuticmodalitiesLessThan(String value) {
            addCriterion("therapeuticModalities <", value, "therapeuticmodalities");
            return (Criteria) this;
        }

        public Criteria andTherapeuticmodalitiesLessThanOrEqualTo(String value) {
            addCriterion("therapeuticModalities <=", value, "therapeuticmodalities");
            return (Criteria) this;
        }

        public Criteria andTherapeuticmodalitiesLike(String value) {
            addCriterion("therapeuticModalities like", value, "therapeuticmodalities");
            return (Criteria) this;
        }

        public Criteria andTherapeuticmodalitiesNotLike(String value) {
            addCriterion("therapeuticModalities not like", value, "therapeuticmodalities");
            return (Criteria) this;
        }

        public Criteria andTherapeuticmodalitiesIn(List<String> values) {
            addCriterion("therapeuticModalities in", values, "therapeuticmodalities");
            return (Criteria) this;
        }

        public Criteria andTherapeuticmodalitiesNotIn(List<String> values) {
            addCriterion("therapeuticModalities not in", values, "therapeuticmodalities");
            return (Criteria) this;
        }

        public Criteria andTherapeuticmodalitiesBetween(String value1, String value2) {
            addCriterion("therapeuticModalities between", value1, value2, "therapeuticmodalities");
            return (Criteria) this;
        }

        public Criteria andTherapeuticmodalitiesNotBetween(String value1, String value2) {
            addCriterion("therapeuticModalities not between", value1, value2, "therapeuticmodalities");
            return (Criteria) this;
        }

        public Criteria andPatientstatusIsNull() {
            addCriterion("patientStatus is null");
            return (Criteria) this;
        }

        public Criteria andPatientstatusIsNotNull() {
            addCriterion("patientStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPatientstatusEqualTo(String value) {
            addCriterion("patientStatus =", value, "patientstatus");
            return (Criteria) this;
        }

        public Criteria andPatientstatusNotEqualTo(String value) {
            addCriterion("patientStatus <>", value, "patientstatus");
            return (Criteria) this;
        }

        public Criteria andPatientstatusGreaterThan(String value) {
            addCriterion("patientStatus >", value, "patientstatus");
            return (Criteria) this;
        }

        public Criteria andPatientstatusGreaterThanOrEqualTo(String value) {
            addCriterion("patientStatus >=", value, "patientstatus");
            return (Criteria) this;
        }

        public Criteria andPatientstatusLessThan(String value) {
            addCriterion("patientStatus <", value, "patientstatus");
            return (Criteria) this;
        }

        public Criteria andPatientstatusLessThanOrEqualTo(String value) {
            addCriterion("patientStatus <=", value, "patientstatus");
            return (Criteria) this;
        }

        public Criteria andPatientstatusLike(String value) {
            addCriterion("patientStatus like", value, "patientstatus");
            return (Criteria) this;
        }

        public Criteria andPatientstatusNotLike(String value) {
            addCriterion("patientStatus not like", value, "patientstatus");
            return (Criteria) this;
        }

        public Criteria andPatientstatusIn(List<String> values) {
            addCriterion("patientStatus in", values, "patientstatus");
            return (Criteria) this;
        }

        public Criteria andPatientstatusNotIn(List<String> values) {
            addCriterion("patientStatus not in", values, "patientstatus");
            return (Criteria) this;
        }

        public Criteria andPatientstatusBetween(String value1, String value2) {
            addCriterion("patientStatus between", value1, value2, "patientstatus");
            return (Criteria) this;
        }

        public Criteria andPatientstatusNotBetween(String value1, String value2) {
            addCriterion("patientStatus not between", value1, value2, "patientstatus");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andIssmokingIsNull() {
            addCriterion("isSmoking is null");
            return (Criteria) this;
        }

        public Criteria andIssmokingIsNotNull() {
            addCriterion("isSmoking is not null");
            return (Criteria) this;
        }

        public Criteria andIssmokingEqualTo(Boolean value) {
            addCriterion("isSmoking =", value, "issmoking");
            return (Criteria) this;
        }

        public Criteria andIssmokingNotEqualTo(Boolean value) {
            addCriterion("isSmoking <>", value, "issmoking");
            return (Criteria) this;
        }

        public Criteria andIssmokingGreaterThan(Boolean value) {
            addCriterion("isSmoking >", value, "issmoking");
            return (Criteria) this;
        }

        public Criteria andIssmokingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isSmoking >=", value, "issmoking");
            return (Criteria) this;
        }

        public Criteria andIssmokingLessThan(Boolean value) {
            addCriterion("isSmoking <", value, "issmoking");
            return (Criteria) this;
        }

        public Criteria andIssmokingLessThanOrEqualTo(Boolean value) {
            addCriterion("isSmoking <=", value, "issmoking");
            return (Criteria) this;
        }

        public Criteria andIssmokingIn(List<Boolean> values) {
            addCriterion("isSmoking in", values, "issmoking");
            return (Criteria) this;
        }

        public Criteria andIssmokingNotIn(List<Boolean> values) {
            addCriterion("isSmoking not in", values, "issmoking");
            return (Criteria) this;
        }

        public Criteria andIssmokingBetween(Boolean value1, Boolean value2) {
            addCriterion("isSmoking between", value1, value2, "issmoking");
            return (Criteria) this;
        }

        public Criteria andIssmokingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isSmoking not between", value1, value2, "issmoking");
            return (Criteria) this;
        }

        public Criteria andGuidancecontentsIsNull() {
            addCriterion("guidanceContents is null");
            return (Criteria) this;
        }

        public Criteria andGuidancecontentsIsNotNull() {
            addCriterion("guidanceContents is not null");
            return (Criteria) this;
        }

        public Criteria andGuidancecontentsEqualTo(String value) {
            addCriterion("guidanceContents =", value, "guidancecontents");
            return (Criteria) this;
        }

        public Criteria andGuidancecontentsNotEqualTo(String value) {
            addCriterion("guidanceContents <>", value, "guidancecontents");
            return (Criteria) this;
        }

        public Criteria andGuidancecontentsGreaterThan(String value) {
            addCriterion("guidanceContents >", value, "guidancecontents");
            return (Criteria) this;
        }

        public Criteria andGuidancecontentsGreaterThanOrEqualTo(String value) {
            addCriterion("guidanceContents >=", value, "guidancecontents");
            return (Criteria) this;
        }

        public Criteria andGuidancecontentsLessThan(String value) {
            addCriterion("guidanceContents <", value, "guidancecontents");
            return (Criteria) this;
        }

        public Criteria andGuidancecontentsLessThanOrEqualTo(String value) {
            addCriterion("guidanceContents <=", value, "guidancecontents");
            return (Criteria) this;
        }

        public Criteria andGuidancecontentsLike(String value) {
            addCriterion("guidanceContents like", value, "guidancecontents");
            return (Criteria) this;
        }

        public Criteria andGuidancecontentsNotLike(String value) {
            addCriterion("guidanceContents not like", value, "guidancecontents");
            return (Criteria) this;
        }

        public Criteria andGuidancecontentsIn(List<String> values) {
            addCriterion("guidanceContents in", values, "guidancecontents");
            return (Criteria) this;
        }

        public Criteria andGuidancecontentsNotIn(List<String> values) {
            addCriterion("guidanceContents not in", values, "guidancecontents");
            return (Criteria) this;
        }

        public Criteria andGuidancecontentsBetween(String value1, String value2) {
            addCriterion("guidanceContents between", value1, value2, "guidancecontents");
            return (Criteria) this;
        }

        public Criteria andGuidancecontentsNotBetween(String value1, String value2) {
            addCriterion("guidanceContents not between", value1, value2, "guidancecontents");
            return (Criteria) this;
        }

        public Criteria andKarnofskyIsNull() {
            addCriterion("karnofsky is null");
            return (Criteria) this;
        }

        public Criteria andKarnofskyIsNotNull() {
            addCriterion("karnofsky is not null");
            return (Criteria) this;
        }

        public Criteria andKarnofskyEqualTo(Integer value) {
            addCriterion("karnofsky =", value, "karnofsky");
            return (Criteria) this;
        }

        public Criteria andKarnofskyNotEqualTo(Integer value) {
            addCriterion("karnofsky <>", value, "karnofsky");
            return (Criteria) this;
        }

        public Criteria andKarnofskyGreaterThan(Integer value) {
            addCriterion("karnofsky >", value, "karnofsky");
            return (Criteria) this;
        }

        public Criteria andKarnofskyGreaterThanOrEqualTo(Integer value) {
            addCriterion("karnofsky >=", value, "karnofsky");
            return (Criteria) this;
        }

        public Criteria andKarnofskyLessThan(Integer value) {
            addCriterion("karnofsky <", value, "karnofsky");
            return (Criteria) this;
        }

        public Criteria andKarnofskyLessThanOrEqualTo(Integer value) {
            addCriterion("karnofsky <=", value, "karnofsky");
            return (Criteria) this;
        }

        public Criteria andKarnofskyIn(List<Integer> values) {
            addCriterion("karnofsky in", values, "karnofsky");
            return (Criteria) this;
        }

        public Criteria andKarnofskyNotIn(List<Integer> values) {
            addCriterion("karnofsky not in", values, "karnofsky");
            return (Criteria) this;
        }

        public Criteria andKarnofskyBetween(Integer value1, Integer value2) {
            addCriterion("karnofsky between", value1, value2, "karnofsky");
            return (Criteria) this;
        }

        public Criteria andKarnofskyNotBetween(Integer value1, Integer value2) {
            addCriterion("karnofsky not between", value1, value2, "karnofsky");
            return (Criteria) this;
        }

        public Criteria andReferralagencyIsNull() {
            addCriterion("referralAgency is null");
            return (Criteria) this;
        }

        public Criteria andReferralagencyIsNotNull() {
            addCriterion("referralAgency is not null");
            return (Criteria) this;
        }

        public Criteria andReferralagencyEqualTo(String value) {
            addCriterion("referralAgency =", value, "referralagency");
            return (Criteria) this;
        }

        public Criteria andReferralagencyNotEqualTo(String value) {
            addCriterion("referralAgency <>", value, "referralagency");
            return (Criteria) this;
        }

        public Criteria andReferralagencyGreaterThan(String value) {
            addCriterion("referralAgency >", value, "referralagency");
            return (Criteria) this;
        }

        public Criteria andReferralagencyGreaterThanOrEqualTo(String value) {
            addCriterion("referralAgency >=", value, "referralagency");
            return (Criteria) this;
        }

        public Criteria andReferralagencyLessThan(String value) {
            addCriterion("referralAgency <", value, "referralagency");
            return (Criteria) this;
        }

        public Criteria andReferralagencyLessThanOrEqualTo(String value) {
            addCriterion("referralAgency <=", value, "referralagency");
            return (Criteria) this;
        }

        public Criteria andReferralagencyLike(String value) {
            addCriterion("referralAgency like", value, "referralagency");
            return (Criteria) this;
        }

        public Criteria andReferralagencyNotLike(String value) {
            addCriterion("referralAgency not like", value, "referralagency");
            return (Criteria) this;
        }

        public Criteria andReferralagencyIn(List<String> values) {
            addCriterion("referralAgency in", values, "referralagency");
            return (Criteria) this;
        }

        public Criteria andReferralagencyNotIn(List<String> values) {
            addCriterion("referralAgency not in", values, "referralagency");
            return (Criteria) this;
        }

        public Criteria andReferralagencyBetween(String value1, String value2) {
            addCriterion("referralAgency between", value1, value2, "referralagency");
            return (Criteria) this;
        }

        public Criteria andReferralagencyNotBetween(String value1, String value2) {
            addCriterion("referralAgency not between", value1, value2, "referralagency");
            return (Criteria) this;
        }

        public Criteria andReferralcausesIsNull() {
            addCriterion("referralCauses is null");
            return (Criteria) this;
        }

        public Criteria andReferralcausesIsNotNull() {
            addCriterion("referralCauses is not null");
            return (Criteria) this;
        }

        public Criteria andReferralcausesEqualTo(String value) {
            addCriterion("referralCauses =", value, "referralcauses");
            return (Criteria) this;
        }

        public Criteria andReferralcausesNotEqualTo(String value) {
            addCriterion("referralCauses <>", value, "referralcauses");
            return (Criteria) this;
        }

        public Criteria andReferralcausesGreaterThan(String value) {
            addCriterion("referralCauses >", value, "referralcauses");
            return (Criteria) this;
        }

        public Criteria andReferralcausesGreaterThanOrEqualTo(String value) {
            addCriterion("referralCauses >=", value, "referralcauses");
            return (Criteria) this;
        }

        public Criteria andReferralcausesLessThan(String value) {
            addCriterion("referralCauses <", value, "referralcauses");
            return (Criteria) this;
        }

        public Criteria andReferralcausesLessThanOrEqualTo(String value) {
            addCriterion("referralCauses <=", value, "referralcauses");
            return (Criteria) this;
        }

        public Criteria andReferralcausesLike(String value) {
            addCriterion("referralCauses like", value, "referralcauses");
            return (Criteria) this;
        }

        public Criteria andReferralcausesNotLike(String value) {
            addCriterion("referralCauses not like", value, "referralcauses");
            return (Criteria) this;
        }

        public Criteria andReferralcausesIn(List<String> values) {
            addCriterion("referralCauses in", values, "referralcauses");
            return (Criteria) this;
        }

        public Criteria andReferralcausesNotIn(List<String> values) {
            addCriterion("referralCauses not in", values, "referralcauses");
            return (Criteria) this;
        }

        public Criteria andReferralcausesBetween(String value1, String value2) {
            addCriterion("referralCauses between", value1, value2, "referralcauses");
            return (Criteria) this;
        }

        public Criteria andReferralcausesNotBetween(String value1, String value2) {
            addCriterion("referralCauses not between", value1, value2, "referralcauses");
            return (Criteria) this;
        }

        public Criteria andTurnoverIsNull() {
            addCriterion("turnover is null");
            return (Criteria) this;
        }

        public Criteria andTurnoverIsNotNull() {
            addCriterion("turnover is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoverEqualTo(Short value) {
            addCriterion("turnover =", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotEqualTo(Short value) {
            addCriterion("turnover <>", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverGreaterThan(Short value) {
            addCriterion("turnover >", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverGreaterThanOrEqualTo(Short value) {
            addCriterion("turnover >=", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverLessThan(Short value) {
            addCriterion("turnover <", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverLessThanOrEqualTo(Short value) {
            addCriterion("turnover <=", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverIn(List<Short> values) {
            addCriterion("turnover in", values, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotIn(List<Short> values) {
            addCriterion("turnover not in", values, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverBetween(Short value1, Short value2) {
            addCriterion("turnover between", value1, value2, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotBetween(Short value1, Short value2) {
            addCriterion("turnover not between", value1, value2, "turnover");
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