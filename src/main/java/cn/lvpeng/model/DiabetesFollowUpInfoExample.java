package cn.lvpeng.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiabetesFollowUpInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiabetesFollowUpInfoExample() {
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

        public Criteria andRegularactivitiesIsNull() {
            addCriterion("regularActivities is null");
            return (Criteria) this;
        }

        public Criteria andRegularactivitiesIsNotNull() {
            addCriterion("regularActivities is not null");
            return (Criteria) this;
        }

        public Criteria andRegularactivitiesEqualTo(String value) {
            addCriterion("regularActivities =", value, "regularactivities");
            return (Criteria) this;
        }

        public Criteria andRegularactivitiesNotEqualTo(String value) {
            addCriterion("regularActivities <>", value, "regularactivities");
            return (Criteria) this;
        }

        public Criteria andRegularactivitiesGreaterThan(String value) {
            addCriterion("regularActivities >", value, "regularactivities");
            return (Criteria) this;
        }

        public Criteria andRegularactivitiesGreaterThanOrEqualTo(String value) {
            addCriterion("regularActivities >=", value, "regularactivities");
            return (Criteria) this;
        }

        public Criteria andRegularactivitiesLessThan(String value) {
            addCriterion("regularActivities <", value, "regularactivities");
            return (Criteria) this;
        }

        public Criteria andRegularactivitiesLessThanOrEqualTo(String value) {
            addCriterion("regularActivities <=", value, "regularactivities");
            return (Criteria) this;
        }

        public Criteria andRegularactivitiesLike(String value) {
            addCriterion("regularActivities like", value, "regularactivities");
            return (Criteria) this;
        }

        public Criteria andRegularactivitiesNotLike(String value) {
            addCriterion("regularActivities not like", value, "regularactivities");
            return (Criteria) this;
        }

        public Criteria andRegularactivitiesIn(List<String> values) {
            addCriterion("regularActivities in", values, "regularactivities");
            return (Criteria) this;
        }

        public Criteria andRegularactivitiesNotIn(List<String> values) {
            addCriterion("regularActivities not in", values, "regularactivities");
            return (Criteria) this;
        }

        public Criteria andRegularactivitiesBetween(String value1, String value2) {
            addCriterion("regularActivities between", value1, value2, "regularactivities");
            return (Criteria) this;
        }

        public Criteria andRegularactivitiesNotBetween(String value1, String value2) {
            addCriterion("regularActivities not between", value1, value2, "regularactivities");
            return (Criteria) this;
        }

        public Criteria andActivityfrequencyIsNull() {
            addCriterion("activityFrequency is null");
            return (Criteria) this;
        }

        public Criteria andActivityfrequencyIsNotNull() {
            addCriterion("activityFrequency is not null");
            return (Criteria) this;
        }

        public Criteria andActivityfrequencyEqualTo(String value) {
            addCriterion("activityFrequency =", value, "activityfrequency");
            return (Criteria) this;
        }

        public Criteria andActivityfrequencyNotEqualTo(String value) {
            addCriterion("activityFrequency <>", value, "activityfrequency");
            return (Criteria) this;
        }

        public Criteria andActivityfrequencyGreaterThan(String value) {
            addCriterion("activityFrequency >", value, "activityfrequency");
            return (Criteria) this;
        }

        public Criteria andActivityfrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("activityFrequency >=", value, "activityfrequency");
            return (Criteria) this;
        }

        public Criteria andActivityfrequencyLessThan(String value) {
            addCriterion("activityFrequency <", value, "activityfrequency");
            return (Criteria) this;
        }

        public Criteria andActivityfrequencyLessThanOrEqualTo(String value) {
            addCriterion("activityFrequency <=", value, "activityfrequency");
            return (Criteria) this;
        }

        public Criteria andActivityfrequencyLike(String value) {
            addCriterion("activityFrequency like", value, "activityfrequency");
            return (Criteria) this;
        }

        public Criteria andActivityfrequencyNotLike(String value) {
            addCriterion("activityFrequency not like", value, "activityfrequency");
            return (Criteria) this;
        }

        public Criteria andActivityfrequencyIn(List<String> values) {
            addCriterion("activityFrequency in", values, "activityfrequency");
            return (Criteria) this;
        }

        public Criteria andActivityfrequencyNotIn(List<String> values) {
            addCriterion("activityFrequency not in", values, "activityfrequency");
            return (Criteria) this;
        }

        public Criteria andActivityfrequencyBetween(String value1, String value2) {
            addCriterion("activityFrequency between", value1, value2, "activityfrequency");
            return (Criteria) this;
        }

        public Criteria andActivityfrequencyNotBetween(String value1, String value2) {
            addCriterion("activityFrequency not between", value1, value2, "activityfrequency");
            return (Criteria) this;
        }

        public Criteria andEachdurationIsNull() {
            addCriterion("eachDuration is null");
            return (Criteria) this;
        }

        public Criteria andEachdurationIsNotNull() {
            addCriterion("eachDuration is not null");
            return (Criteria) this;
        }

        public Criteria andEachdurationEqualTo(String value) {
            addCriterion("eachDuration =", value, "eachduration");
            return (Criteria) this;
        }

        public Criteria andEachdurationNotEqualTo(String value) {
            addCriterion("eachDuration <>", value, "eachduration");
            return (Criteria) this;
        }

        public Criteria andEachdurationGreaterThan(String value) {
            addCriterion("eachDuration >", value, "eachduration");
            return (Criteria) this;
        }

        public Criteria andEachdurationGreaterThanOrEqualTo(String value) {
            addCriterion("eachDuration >=", value, "eachduration");
            return (Criteria) this;
        }

        public Criteria andEachdurationLessThan(String value) {
            addCriterion("eachDuration <", value, "eachduration");
            return (Criteria) this;
        }

        public Criteria andEachdurationLessThanOrEqualTo(String value) {
            addCriterion("eachDuration <=", value, "eachduration");
            return (Criteria) this;
        }

        public Criteria andEachdurationLike(String value) {
            addCriterion("eachDuration like", value, "eachduration");
            return (Criteria) this;
        }

        public Criteria andEachdurationNotLike(String value) {
            addCriterion("eachDuration not like", value, "eachduration");
            return (Criteria) this;
        }

        public Criteria andEachdurationIn(List<String> values) {
            addCriterion("eachDuration in", values, "eachduration");
            return (Criteria) this;
        }

        public Criteria andEachdurationNotIn(List<String> values) {
            addCriterion("eachDuration not in", values, "eachduration");
            return (Criteria) this;
        }

        public Criteria andEachdurationBetween(String value1, String value2) {
            addCriterion("eachDuration between", value1, value2, "eachduration");
            return (Criteria) this;
        }

        public Criteria andEachdurationNotBetween(String value1, String value2) {
            addCriterion("eachDuration not between", value1, value2, "eachduration");
            return (Criteria) this;
        }

        public Criteria andDietarystatusIsNull() {
            addCriterion("dietaryStatus is null");
            return (Criteria) this;
        }

        public Criteria andDietarystatusIsNotNull() {
            addCriterion("dietaryStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDietarystatusEqualTo(String value) {
            addCriterion("dietaryStatus =", value, "dietarystatus");
            return (Criteria) this;
        }

        public Criteria andDietarystatusNotEqualTo(String value) {
            addCriterion("dietaryStatus <>", value, "dietarystatus");
            return (Criteria) this;
        }

        public Criteria andDietarystatusGreaterThan(String value) {
            addCriterion("dietaryStatus >", value, "dietarystatus");
            return (Criteria) this;
        }

        public Criteria andDietarystatusGreaterThanOrEqualTo(String value) {
            addCriterion("dietaryStatus >=", value, "dietarystatus");
            return (Criteria) this;
        }

        public Criteria andDietarystatusLessThan(String value) {
            addCriterion("dietaryStatus <", value, "dietarystatus");
            return (Criteria) this;
        }

        public Criteria andDietarystatusLessThanOrEqualTo(String value) {
            addCriterion("dietaryStatus <=", value, "dietarystatus");
            return (Criteria) this;
        }

        public Criteria andDietarystatusLike(String value) {
            addCriterion("dietaryStatus like", value, "dietarystatus");
            return (Criteria) this;
        }

        public Criteria andDietarystatusNotLike(String value) {
            addCriterion("dietaryStatus not like", value, "dietarystatus");
            return (Criteria) this;
        }

        public Criteria andDietarystatusIn(List<String> values) {
            addCriterion("dietaryStatus in", values, "dietarystatus");
            return (Criteria) this;
        }

        public Criteria andDietarystatusNotIn(List<String> values) {
            addCriterion("dietaryStatus not in", values, "dietarystatus");
            return (Criteria) this;
        }

        public Criteria andDietarystatusBetween(String value1, String value2) {
            addCriterion("dietaryStatus between", value1, value2, "dietarystatus");
            return (Criteria) this;
        }

        public Criteria andDietarystatusNotBetween(String value1, String value2) {
            addCriterion("dietaryStatus not between", value1, value2, "dietarystatus");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomsIsNull() {
            addCriterion("diabetesSymptoms is null");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomsIsNotNull() {
            addCriterion("diabetesSymptoms is not null");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomsEqualTo(Short value) {
            addCriterion("diabetesSymptoms =", value, "diabetessymptoms");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomsNotEqualTo(Short value) {
            addCriterion("diabetesSymptoms <>", value, "diabetessymptoms");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomsGreaterThan(Short value) {
            addCriterion("diabetesSymptoms >", value, "diabetessymptoms");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomsGreaterThanOrEqualTo(Short value) {
            addCriterion("diabetesSymptoms >=", value, "diabetessymptoms");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomsLessThan(Short value) {
            addCriterion("diabetesSymptoms <", value, "diabetessymptoms");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomsLessThanOrEqualTo(Short value) {
            addCriterion("diabetesSymptoms <=", value, "diabetessymptoms");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomsIn(List<Short> values) {
            addCriterion("diabetesSymptoms in", values, "diabetessymptoms");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomsNotIn(List<Short> values) {
            addCriterion("diabetesSymptoms not in", values, "diabetessymptoms");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomsBetween(Short value1, Short value2) {
            addCriterion("diabetesSymptoms between", value1, value2, "diabetessymptoms");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomsNotBetween(Short value1, Short value2) {
            addCriterion("diabetesSymptoms not between", value1, value2, "diabetessymptoms");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomssupplementIsNull() {
            addCriterion("diabetesSymptomsSupplement is null");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomssupplementIsNotNull() {
            addCriterion("diabetesSymptomsSupplement is not null");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomssupplementEqualTo(String value) {
            addCriterion("diabetesSymptomsSupplement =", value, "diabetessymptomssupplement");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomssupplementNotEqualTo(String value) {
            addCriterion("diabetesSymptomsSupplement <>", value, "diabetessymptomssupplement");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomssupplementGreaterThan(String value) {
            addCriterion("diabetesSymptomsSupplement >", value, "diabetessymptomssupplement");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomssupplementGreaterThanOrEqualTo(String value) {
            addCriterion("diabetesSymptomsSupplement >=", value, "diabetessymptomssupplement");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomssupplementLessThan(String value) {
            addCriterion("diabetesSymptomsSupplement <", value, "diabetessymptomssupplement");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomssupplementLessThanOrEqualTo(String value) {
            addCriterion("diabetesSymptomsSupplement <=", value, "diabetessymptomssupplement");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomssupplementLike(String value) {
            addCriterion("diabetesSymptomsSupplement like", value, "diabetessymptomssupplement");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomssupplementNotLike(String value) {
            addCriterion("diabetesSymptomsSupplement not like", value, "diabetessymptomssupplement");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomssupplementIn(List<String> values) {
            addCriterion("diabetesSymptomsSupplement in", values, "diabetessymptomssupplement");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomssupplementNotIn(List<String> values) {
            addCriterion("diabetesSymptomsSupplement not in", values, "diabetessymptomssupplement");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomssupplementBetween(String value1, String value2) {
            addCriterion("diabetesSymptomsSupplement between", value1, value2, "diabetessymptomssupplement");
            return (Criteria) this;
        }

        public Criteria andDiabetessymptomssupplementNotBetween(String value1, String value2) {
            addCriterion("diabetesSymptomsSupplement not between", value1, value2, "diabetessymptomssupplement");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicreactionIsNull() {
            addCriterion("hypoglycemicReaction is null");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicreactionIsNotNull() {
            addCriterion("hypoglycemicReaction is not null");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicreactionEqualTo(Short value) {
            addCriterion("hypoglycemicReaction =", value, "hypoglycemicreaction");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicreactionNotEqualTo(Short value) {
            addCriterion("hypoglycemicReaction <>", value, "hypoglycemicreaction");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicreactionGreaterThan(Short value) {
            addCriterion("hypoglycemicReaction >", value, "hypoglycemicreaction");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicreactionGreaterThanOrEqualTo(Short value) {
            addCriterion("hypoglycemicReaction >=", value, "hypoglycemicreaction");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicreactionLessThan(Short value) {
            addCriterion("hypoglycemicReaction <", value, "hypoglycemicreaction");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicreactionLessThanOrEqualTo(Short value) {
            addCriterion("hypoglycemicReaction <=", value, "hypoglycemicreaction");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicreactionIn(List<Short> values) {
            addCriterion("hypoglycemicReaction in", values, "hypoglycemicreaction");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicreactionNotIn(List<Short> values) {
            addCriterion("hypoglycemicReaction not in", values, "hypoglycemicreaction");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicreactionBetween(Short value1, Short value2) {
            addCriterion("hypoglycemicReaction between", value1, value2, "hypoglycemicreaction");
            return (Criteria) this;
        }

        public Criteria andHypoglycemicreactionNotBetween(Short value1, Short value2) {
            addCriterion("hypoglycemicReaction not between", value1, value2, "hypoglycemicreaction");
            return (Criteria) this;
        }

        public Criteria andSystolicpressureIsNull() {
            addCriterion("systolicPressure is null");
            return (Criteria) this;
        }

        public Criteria andSystolicpressureIsNotNull() {
            addCriterion("systolicPressure is not null");
            return (Criteria) this;
        }

        public Criteria andSystolicpressureEqualTo(Short value) {
            addCriterion("systolicPressure =", value, "systolicpressure");
            return (Criteria) this;
        }

        public Criteria andSystolicpressureNotEqualTo(Short value) {
            addCriterion("systolicPressure <>", value, "systolicpressure");
            return (Criteria) this;
        }

        public Criteria andSystolicpressureGreaterThan(Short value) {
            addCriterion("systolicPressure >", value, "systolicpressure");
            return (Criteria) this;
        }

        public Criteria andSystolicpressureGreaterThanOrEqualTo(Short value) {
            addCriterion("systolicPressure >=", value, "systolicpressure");
            return (Criteria) this;
        }

        public Criteria andSystolicpressureLessThan(Short value) {
            addCriterion("systolicPressure <", value, "systolicpressure");
            return (Criteria) this;
        }

        public Criteria andSystolicpressureLessThanOrEqualTo(Short value) {
            addCriterion("systolicPressure <=", value, "systolicpressure");
            return (Criteria) this;
        }

        public Criteria andSystolicpressureIn(List<Short> values) {
            addCriterion("systolicPressure in", values, "systolicpressure");
            return (Criteria) this;
        }

        public Criteria andSystolicpressureNotIn(List<Short> values) {
            addCriterion("systolicPressure not in", values, "systolicpressure");
            return (Criteria) this;
        }

        public Criteria andSystolicpressureBetween(Short value1, Short value2) {
            addCriterion("systolicPressure between", value1, value2, "systolicpressure");
            return (Criteria) this;
        }

        public Criteria andSystolicpressureNotBetween(Short value1, Short value2) {
            addCriterion("systolicPressure not between", value1, value2, "systolicpressure");
            return (Criteria) this;
        }

        public Criteria andDiastolicpressureIsNull() {
            addCriterion("diastolicPressure is null");
            return (Criteria) this;
        }

        public Criteria andDiastolicpressureIsNotNull() {
            addCriterion("diastolicPressure is not null");
            return (Criteria) this;
        }

        public Criteria andDiastolicpressureEqualTo(Short value) {
            addCriterion("diastolicPressure =", value, "diastolicpressure");
            return (Criteria) this;
        }

        public Criteria andDiastolicpressureNotEqualTo(Short value) {
            addCriterion("diastolicPressure <>", value, "diastolicpressure");
            return (Criteria) this;
        }

        public Criteria andDiastolicpressureGreaterThan(Short value) {
            addCriterion("diastolicPressure >", value, "diastolicpressure");
            return (Criteria) this;
        }

        public Criteria andDiastolicpressureGreaterThanOrEqualTo(Short value) {
            addCriterion("diastolicPressure >=", value, "diastolicpressure");
            return (Criteria) this;
        }

        public Criteria andDiastolicpressureLessThan(Short value) {
            addCriterion("diastolicPressure <", value, "diastolicpressure");
            return (Criteria) this;
        }

        public Criteria andDiastolicpressureLessThanOrEqualTo(Short value) {
            addCriterion("diastolicPressure <=", value, "diastolicpressure");
            return (Criteria) this;
        }

        public Criteria andDiastolicpressureIn(List<Short> values) {
            addCriterion("diastolicPressure in", values, "diastolicpressure");
            return (Criteria) this;
        }

        public Criteria andDiastolicpressureNotIn(List<Short> values) {
            addCriterion("diastolicPressure not in", values, "diastolicpressure");
            return (Criteria) this;
        }

        public Criteria andDiastolicpressureBetween(Short value1, Short value2) {
            addCriterion("diastolicPressure between", value1, value2, "diastolicpressure");
            return (Criteria) this;
        }

        public Criteria andDiastolicpressureNotBetween(Short value1, Short value2) {
            addCriterion("diastolicPressure not between", value1, value2, "diastolicpressure");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(BigDecimal value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(BigDecimal value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(BigDecimal value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(BigDecimal value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<BigDecimal> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<BigDecimal> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("height not between", value1, value2, "height");
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

        public Criteria andTargetweightIsNull() {
            addCriterion("targetWeight is null");
            return (Criteria) this;
        }

        public Criteria andTargetweightIsNotNull() {
            addCriterion("targetWeight is not null");
            return (Criteria) this;
        }

        public Criteria andTargetweightEqualTo(BigDecimal value) {
            addCriterion("targetWeight =", value, "targetweight");
            return (Criteria) this;
        }

        public Criteria andTargetweightNotEqualTo(BigDecimal value) {
            addCriterion("targetWeight <>", value, "targetweight");
            return (Criteria) this;
        }

        public Criteria andTargetweightGreaterThan(BigDecimal value) {
            addCriterion("targetWeight >", value, "targetweight");
            return (Criteria) this;
        }

        public Criteria andTargetweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("targetWeight >=", value, "targetweight");
            return (Criteria) this;
        }

        public Criteria andTargetweightLessThan(BigDecimal value) {
            addCriterion("targetWeight <", value, "targetweight");
            return (Criteria) this;
        }

        public Criteria andTargetweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("targetWeight <=", value, "targetweight");
            return (Criteria) this;
        }

        public Criteria andTargetweightIn(List<BigDecimal> values) {
            addCriterion("targetWeight in", values, "targetweight");
            return (Criteria) this;
        }

        public Criteria andTargetweightNotIn(List<BigDecimal> values) {
            addCriterion("targetWeight not in", values, "targetweight");
            return (Criteria) this;
        }

        public Criteria andTargetweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("targetWeight between", value1, value2, "targetweight");
            return (Criteria) this;
        }

        public Criteria andTargetweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("targetWeight not between", value1, value2, "targetweight");
            return (Criteria) this;
        }

        public Criteria andConstitutionalindexIsNull() {
            addCriterion("constitutionalIndex is null");
            return (Criteria) this;
        }

        public Criteria andConstitutionalindexIsNotNull() {
            addCriterion("constitutionalIndex is not null");
            return (Criteria) this;
        }

        public Criteria andConstitutionalindexEqualTo(BigDecimal value) {
            addCriterion("constitutionalIndex =", value, "constitutionalindex");
            return (Criteria) this;
        }

        public Criteria andConstitutionalindexNotEqualTo(BigDecimal value) {
            addCriterion("constitutionalIndex <>", value, "constitutionalindex");
            return (Criteria) this;
        }

        public Criteria andConstitutionalindexGreaterThan(BigDecimal value) {
            addCriterion("constitutionalIndex >", value, "constitutionalindex");
            return (Criteria) this;
        }

        public Criteria andConstitutionalindexGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("constitutionalIndex >=", value, "constitutionalindex");
            return (Criteria) this;
        }

        public Criteria andConstitutionalindexLessThan(BigDecimal value) {
            addCriterion("constitutionalIndex <", value, "constitutionalindex");
            return (Criteria) this;
        }

        public Criteria andConstitutionalindexLessThanOrEqualTo(BigDecimal value) {
            addCriterion("constitutionalIndex <=", value, "constitutionalindex");
            return (Criteria) this;
        }

        public Criteria andConstitutionalindexIn(List<BigDecimal> values) {
            addCriterion("constitutionalIndex in", values, "constitutionalindex");
            return (Criteria) this;
        }

        public Criteria andConstitutionalindexNotIn(List<BigDecimal> values) {
            addCriterion("constitutionalIndex not in", values, "constitutionalindex");
            return (Criteria) this;
        }

        public Criteria andConstitutionalindexBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("constitutionalIndex between", value1, value2, "constitutionalindex");
            return (Criteria) this;
        }

        public Criteria andConstitutionalindexNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("constitutionalIndex not between", value1, value2, "constitutionalindex");
            return (Criteria) this;
        }

        public Criteria andTargetconstitutionalindexIsNull() {
            addCriterion("targetConstitutionalIndex is null");
            return (Criteria) this;
        }

        public Criteria andTargetconstitutionalindexIsNotNull() {
            addCriterion("targetConstitutionalIndex is not null");
            return (Criteria) this;
        }

        public Criteria andTargetconstitutionalindexEqualTo(BigDecimal value) {
            addCriterion("targetConstitutionalIndex =", value, "targetconstitutionalindex");
            return (Criteria) this;
        }

        public Criteria andTargetconstitutionalindexNotEqualTo(BigDecimal value) {
            addCriterion("targetConstitutionalIndex <>", value, "targetconstitutionalindex");
            return (Criteria) this;
        }

        public Criteria andTargetconstitutionalindexGreaterThan(BigDecimal value) {
            addCriterion("targetConstitutionalIndex >", value, "targetconstitutionalindex");
            return (Criteria) this;
        }

        public Criteria andTargetconstitutionalindexGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("targetConstitutionalIndex >=", value, "targetconstitutionalindex");
            return (Criteria) this;
        }

        public Criteria andTargetconstitutionalindexLessThan(BigDecimal value) {
            addCriterion("targetConstitutionalIndex <", value, "targetconstitutionalindex");
            return (Criteria) this;
        }

        public Criteria andTargetconstitutionalindexLessThanOrEqualTo(BigDecimal value) {
            addCriterion("targetConstitutionalIndex <=", value, "targetconstitutionalindex");
            return (Criteria) this;
        }

        public Criteria andTargetconstitutionalindexIn(List<BigDecimal> values) {
            addCriterion("targetConstitutionalIndex in", values, "targetconstitutionalindex");
            return (Criteria) this;
        }

        public Criteria andTargetconstitutionalindexNotIn(List<BigDecimal> values) {
            addCriterion("targetConstitutionalIndex not in", values, "targetconstitutionalindex");
            return (Criteria) this;
        }

        public Criteria andTargetconstitutionalindexBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("targetConstitutionalIndex between", value1, value2, "targetconstitutionalindex");
            return (Criteria) this;
        }

        public Criteria andTargetconstitutionalindexNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("targetConstitutionalIndex not between", value1, value2, "targetconstitutionalindex");
            return (Criteria) this;
        }

        public Criteria andFootdorsalarteryIsNull() {
            addCriterion("footDorsalArtery is null");
            return (Criteria) this;
        }

        public Criteria andFootdorsalarteryIsNotNull() {
            addCriterion("footDorsalArtery is not null");
            return (Criteria) this;
        }

        public Criteria andFootdorsalarteryEqualTo(Short value) {
            addCriterion("footDorsalArtery =", value, "footdorsalartery");
            return (Criteria) this;
        }

        public Criteria andFootdorsalarteryNotEqualTo(Short value) {
            addCriterion("footDorsalArtery <>", value, "footdorsalartery");
            return (Criteria) this;
        }

        public Criteria andFootdorsalarteryGreaterThan(Short value) {
            addCriterion("footDorsalArtery >", value, "footdorsalartery");
            return (Criteria) this;
        }

        public Criteria andFootdorsalarteryGreaterThanOrEqualTo(Short value) {
            addCriterion("footDorsalArtery >=", value, "footdorsalartery");
            return (Criteria) this;
        }

        public Criteria andFootdorsalarteryLessThan(Short value) {
            addCriterion("footDorsalArtery <", value, "footdorsalartery");
            return (Criteria) this;
        }

        public Criteria andFootdorsalarteryLessThanOrEqualTo(Short value) {
            addCriterion("footDorsalArtery <=", value, "footdorsalartery");
            return (Criteria) this;
        }

        public Criteria andFootdorsalarteryIn(List<Short> values) {
            addCriterion("footDorsalArtery in", values, "footdorsalartery");
            return (Criteria) this;
        }

        public Criteria andFootdorsalarteryNotIn(List<Short> values) {
            addCriterion("footDorsalArtery not in", values, "footdorsalartery");
            return (Criteria) this;
        }

        public Criteria andFootdorsalarteryBetween(Short value1, Short value2) {
            addCriterion("footDorsalArtery between", value1, value2, "footdorsalartery");
            return (Criteria) this;
        }

        public Criteria andFootdorsalarteryNotBetween(Short value1, Short value2) {
            addCriterion("footDorsalArtery not between", value1, value2, "footdorsalartery");
            return (Criteria) this;
        }

        public Criteria andOthersignsIsNull() {
            addCriterion("otherSigns is null");
            return (Criteria) this;
        }

        public Criteria andOthersignsIsNotNull() {
            addCriterion("otherSigns is not null");
            return (Criteria) this;
        }

        public Criteria andOthersignsEqualTo(String value) {
            addCriterion("otherSigns =", value, "othersigns");
            return (Criteria) this;
        }

        public Criteria andOthersignsNotEqualTo(String value) {
            addCriterion("otherSigns <>", value, "othersigns");
            return (Criteria) this;
        }

        public Criteria andOthersignsGreaterThan(String value) {
            addCriterion("otherSigns >", value, "othersigns");
            return (Criteria) this;
        }

        public Criteria andOthersignsGreaterThanOrEqualTo(String value) {
            addCriterion("otherSigns >=", value, "othersigns");
            return (Criteria) this;
        }

        public Criteria andOthersignsLessThan(String value) {
            addCriterion("otherSigns <", value, "othersigns");
            return (Criteria) this;
        }

        public Criteria andOthersignsLessThanOrEqualTo(String value) {
            addCriterion("otherSigns <=", value, "othersigns");
            return (Criteria) this;
        }

        public Criteria andOthersignsLike(String value) {
            addCriterion("otherSigns like", value, "othersigns");
            return (Criteria) this;
        }

        public Criteria andOthersignsNotLike(String value) {
            addCriterion("otherSigns not like", value, "othersigns");
            return (Criteria) this;
        }

        public Criteria andOthersignsIn(List<String> values) {
            addCriterion("otherSigns in", values, "othersigns");
            return (Criteria) this;
        }

        public Criteria andOthersignsNotIn(List<String> values) {
            addCriterion("otherSigns not in", values, "othersigns");
            return (Criteria) this;
        }

        public Criteria andOthersignsBetween(String value1, String value2) {
            addCriterion("otherSigns between", value1, value2, "othersigns");
            return (Criteria) this;
        }

        public Criteria andOthersignsNotBetween(String value1, String value2) {
            addCriterion("otherSigns not between", value1, value2, "othersigns");
            return (Criteria) this;
        }

        public Criteria andDailysmokingIsNull() {
            addCriterion("dailySmoking is null");
            return (Criteria) this;
        }

        public Criteria andDailysmokingIsNotNull() {
            addCriterion("dailySmoking is not null");
            return (Criteria) this;
        }

        public Criteria andDailysmokingEqualTo(Short value) {
            addCriterion("dailySmoking =", value, "dailysmoking");
            return (Criteria) this;
        }

        public Criteria andDailysmokingNotEqualTo(Short value) {
            addCriterion("dailySmoking <>", value, "dailysmoking");
            return (Criteria) this;
        }

        public Criteria andDailysmokingGreaterThan(Short value) {
            addCriterion("dailySmoking >", value, "dailysmoking");
            return (Criteria) this;
        }

        public Criteria andDailysmokingGreaterThanOrEqualTo(Short value) {
            addCriterion("dailySmoking >=", value, "dailysmoking");
            return (Criteria) this;
        }

        public Criteria andDailysmokingLessThan(Short value) {
            addCriterion("dailySmoking <", value, "dailysmoking");
            return (Criteria) this;
        }

        public Criteria andDailysmokingLessThanOrEqualTo(Short value) {
            addCriterion("dailySmoking <=", value, "dailysmoking");
            return (Criteria) this;
        }

        public Criteria andDailysmokingIn(List<Short> values) {
            addCriterion("dailySmoking in", values, "dailysmoking");
            return (Criteria) this;
        }

        public Criteria andDailysmokingNotIn(List<Short> values) {
            addCriterion("dailySmoking not in", values, "dailysmoking");
            return (Criteria) this;
        }

        public Criteria andDailysmokingBetween(Short value1, Short value2) {
            addCriterion("dailySmoking between", value1, value2, "dailysmoking");
            return (Criteria) this;
        }

        public Criteria andDailysmokingNotBetween(Short value1, Short value2) {
            addCriterion("dailySmoking not between", value1, value2, "dailysmoking");
            return (Criteria) this;
        }

        public Criteria andTargetdailysmokingIsNull() {
            addCriterion("targetDailySmoking is null");
            return (Criteria) this;
        }

        public Criteria andTargetdailysmokingIsNotNull() {
            addCriterion("targetDailySmoking is not null");
            return (Criteria) this;
        }

        public Criteria andTargetdailysmokingEqualTo(Short value) {
            addCriterion("targetDailySmoking =", value, "targetdailysmoking");
            return (Criteria) this;
        }

        public Criteria andTargetdailysmokingNotEqualTo(Short value) {
            addCriterion("targetDailySmoking <>", value, "targetdailysmoking");
            return (Criteria) this;
        }

        public Criteria andTargetdailysmokingGreaterThan(Short value) {
            addCriterion("targetDailySmoking >", value, "targetdailysmoking");
            return (Criteria) this;
        }

        public Criteria andTargetdailysmokingGreaterThanOrEqualTo(Short value) {
            addCriterion("targetDailySmoking >=", value, "targetdailysmoking");
            return (Criteria) this;
        }

        public Criteria andTargetdailysmokingLessThan(Short value) {
            addCriterion("targetDailySmoking <", value, "targetdailysmoking");
            return (Criteria) this;
        }

        public Criteria andTargetdailysmokingLessThanOrEqualTo(Short value) {
            addCriterion("targetDailySmoking <=", value, "targetdailysmoking");
            return (Criteria) this;
        }

        public Criteria andTargetdailysmokingIn(List<Short> values) {
            addCriterion("targetDailySmoking in", values, "targetdailysmoking");
            return (Criteria) this;
        }

        public Criteria andTargetdailysmokingNotIn(List<Short> values) {
            addCriterion("targetDailySmoking not in", values, "targetdailysmoking");
            return (Criteria) this;
        }

        public Criteria andTargetdailysmokingBetween(Short value1, Short value2) {
            addCriterion("targetDailySmoking between", value1, value2, "targetdailysmoking");
            return (Criteria) this;
        }

        public Criteria andTargetdailysmokingNotBetween(Short value1, Short value2) {
            addCriterion("targetDailySmoking not between", value1, value2, "targetdailysmoking");
            return (Criteria) this;
        }

        public Criteria andDailyalcoholIsNull() {
            addCriterion("dailyAlcohol is null");
            return (Criteria) this;
        }

        public Criteria andDailyalcoholIsNotNull() {
            addCriterion("dailyAlcohol is not null");
            return (Criteria) this;
        }

        public Criteria andDailyalcoholEqualTo(Short value) {
            addCriterion("dailyAlcohol =", value, "dailyalcohol");
            return (Criteria) this;
        }

        public Criteria andDailyalcoholNotEqualTo(Short value) {
            addCriterion("dailyAlcohol <>", value, "dailyalcohol");
            return (Criteria) this;
        }

        public Criteria andDailyalcoholGreaterThan(Short value) {
            addCriterion("dailyAlcohol >", value, "dailyalcohol");
            return (Criteria) this;
        }

        public Criteria andDailyalcoholGreaterThanOrEqualTo(Short value) {
            addCriterion("dailyAlcohol >=", value, "dailyalcohol");
            return (Criteria) this;
        }

        public Criteria andDailyalcoholLessThan(Short value) {
            addCriterion("dailyAlcohol <", value, "dailyalcohol");
            return (Criteria) this;
        }

        public Criteria andDailyalcoholLessThanOrEqualTo(Short value) {
            addCriterion("dailyAlcohol <=", value, "dailyalcohol");
            return (Criteria) this;
        }

        public Criteria andDailyalcoholIn(List<Short> values) {
            addCriterion("dailyAlcohol in", values, "dailyalcohol");
            return (Criteria) this;
        }

        public Criteria andDailyalcoholNotIn(List<Short> values) {
            addCriterion("dailyAlcohol not in", values, "dailyalcohol");
            return (Criteria) this;
        }

        public Criteria andDailyalcoholBetween(Short value1, Short value2) {
            addCriterion("dailyAlcohol between", value1, value2, "dailyalcohol");
            return (Criteria) this;
        }

        public Criteria andDailyalcoholNotBetween(Short value1, Short value2) {
            addCriterion("dailyAlcohol not between", value1, value2, "dailyalcohol");
            return (Criteria) this;
        }

        public Criteria andTargetdailyalcoholIsNull() {
            addCriterion("targetDailyAlcohol is null");
            return (Criteria) this;
        }

        public Criteria andTargetdailyalcoholIsNotNull() {
            addCriterion("targetDailyAlcohol is not null");
            return (Criteria) this;
        }

        public Criteria andTargetdailyalcoholEqualTo(Short value) {
            addCriterion("targetDailyAlcohol =", value, "targetdailyalcohol");
            return (Criteria) this;
        }

        public Criteria andTargetdailyalcoholNotEqualTo(Short value) {
            addCriterion("targetDailyAlcohol <>", value, "targetdailyalcohol");
            return (Criteria) this;
        }

        public Criteria andTargetdailyalcoholGreaterThan(Short value) {
            addCriterion("targetDailyAlcohol >", value, "targetdailyalcohol");
            return (Criteria) this;
        }

        public Criteria andTargetdailyalcoholGreaterThanOrEqualTo(Short value) {
            addCriterion("targetDailyAlcohol >=", value, "targetdailyalcohol");
            return (Criteria) this;
        }

        public Criteria andTargetdailyalcoholLessThan(Short value) {
            addCriterion("targetDailyAlcohol <", value, "targetdailyalcohol");
            return (Criteria) this;
        }

        public Criteria andTargetdailyalcoholLessThanOrEqualTo(Short value) {
            addCriterion("targetDailyAlcohol <=", value, "targetdailyalcohol");
            return (Criteria) this;
        }

        public Criteria andTargetdailyalcoholIn(List<Short> values) {
            addCriterion("targetDailyAlcohol in", values, "targetdailyalcohol");
            return (Criteria) this;
        }

        public Criteria andTargetdailyalcoholNotIn(List<Short> values) {
            addCriterion("targetDailyAlcohol not in", values, "targetdailyalcohol");
            return (Criteria) this;
        }

        public Criteria andTargetdailyalcoholBetween(Short value1, Short value2) {
            addCriterion("targetDailyAlcohol between", value1, value2, "targetdailyalcohol");
            return (Criteria) this;
        }

        public Criteria andTargetdailyalcoholNotBetween(Short value1, Short value2) {
            addCriterion("targetDailyAlcohol not between", value1, value2, "targetdailyalcohol");
            return (Criteria) this;
        }

        public Criteria andWeeklyexercisesnumberIsNull() {
            addCriterion("weeklyExercisesNumber is null");
            return (Criteria) this;
        }

        public Criteria andWeeklyexercisesnumberIsNotNull() {
            addCriterion("weeklyExercisesNumber is not null");
            return (Criteria) this;
        }

        public Criteria andWeeklyexercisesnumberEqualTo(Short value) {
            addCriterion("weeklyExercisesNumber =", value, "weeklyexercisesnumber");
            return (Criteria) this;
        }

        public Criteria andWeeklyexercisesnumberNotEqualTo(Short value) {
            addCriterion("weeklyExercisesNumber <>", value, "weeklyexercisesnumber");
            return (Criteria) this;
        }

        public Criteria andWeeklyexercisesnumberGreaterThan(Short value) {
            addCriterion("weeklyExercisesNumber >", value, "weeklyexercisesnumber");
            return (Criteria) this;
        }

        public Criteria andWeeklyexercisesnumberGreaterThanOrEqualTo(Short value) {
            addCriterion("weeklyExercisesNumber >=", value, "weeklyexercisesnumber");
            return (Criteria) this;
        }

        public Criteria andWeeklyexercisesnumberLessThan(Short value) {
            addCriterion("weeklyExercisesNumber <", value, "weeklyexercisesnumber");
            return (Criteria) this;
        }

        public Criteria andWeeklyexercisesnumberLessThanOrEqualTo(Short value) {
            addCriterion("weeklyExercisesNumber <=", value, "weeklyexercisesnumber");
            return (Criteria) this;
        }

        public Criteria andWeeklyexercisesnumberIn(List<Short> values) {
            addCriterion("weeklyExercisesNumber in", values, "weeklyexercisesnumber");
            return (Criteria) this;
        }

        public Criteria andWeeklyexercisesnumberNotIn(List<Short> values) {
            addCriterion("weeklyExercisesNumber not in", values, "weeklyexercisesnumber");
            return (Criteria) this;
        }

        public Criteria andWeeklyexercisesnumberBetween(Short value1, Short value2) {
            addCriterion("weeklyExercisesNumber between", value1, value2, "weeklyexercisesnumber");
            return (Criteria) this;
        }

        public Criteria andWeeklyexercisesnumberNotBetween(Short value1, Short value2) {
            addCriterion("weeklyExercisesNumber not between", value1, value2, "weeklyexercisesnumber");
            return (Criteria) this;
        }

        public Criteria andTargetweeklyexercisesnumberIsNull() {
            addCriterion("targetWeeklyExercisesNumber is null");
            return (Criteria) this;
        }

        public Criteria andTargetweeklyexercisesnumberIsNotNull() {
            addCriterion("targetWeeklyExercisesNumber is not null");
            return (Criteria) this;
        }

        public Criteria andTargetweeklyexercisesnumberEqualTo(Short value) {
            addCriterion("targetWeeklyExercisesNumber =", value, "targetweeklyexercisesnumber");
            return (Criteria) this;
        }

        public Criteria andTargetweeklyexercisesnumberNotEqualTo(Short value) {
            addCriterion("targetWeeklyExercisesNumber <>", value, "targetweeklyexercisesnumber");
            return (Criteria) this;
        }

        public Criteria andTargetweeklyexercisesnumberGreaterThan(Short value) {
            addCriterion("targetWeeklyExercisesNumber >", value, "targetweeklyexercisesnumber");
            return (Criteria) this;
        }

        public Criteria andTargetweeklyexercisesnumberGreaterThanOrEqualTo(Short value) {
            addCriterion("targetWeeklyExercisesNumber >=", value, "targetweeklyexercisesnumber");
            return (Criteria) this;
        }

        public Criteria andTargetweeklyexercisesnumberLessThan(Short value) {
            addCriterion("targetWeeklyExercisesNumber <", value, "targetweeklyexercisesnumber");
            return (Criteria) this;
        }

        public Criteria andTargetweeklyexercisesnumberLessThanOrEqualTo(Short value) {
            addCriterion("targetWeeklyExercisesNumber <=", value, "targetweeklyexercisesnumber");
            return (Criteria) this;
        }

        public Criteria andTargetweeklyexercisesnumberIn(List<Short> values) {
            addCriterion("targetWeeklyExercisesNumber in", values, "targetweeklyexercisesnumber");
            return (Criteria) this;
        }

        public Criteria andTargetweeklyexercisesnumberNotIn(List<Short> values) {
            addCriterion("targetWeeklyExercisesNumber not in", values, "targetweeklyexercisesnumber");
            return (Criteria) this;
        }

        public Criteria andTargetweeklyexercisesnumberBetween(Short value1, Short value2) {
            addCriterion("targetWeeklyExercisesNumber between", value1, value2, "targetweeklyexercisesnumber");
            return (Criteria) this;
        }

        public Criteria andTargetweeklyexercisesnumberNotBetween(Short value1, Short value2) {
            addCriterion("targetWeeklyExercisesNumber not between", value1, value2, "targetweeklyexercisesnumber");
            return (Criteria) this;
        }

        public Criteria andExercisedurationIsNull() {
            addCriterion("exerciseDuration is null");
            return (Criteria) this;
        }

        public Criteria andExercisedurationIsNotNull() {
            addCriterion("exerciseDuration is not null");
            return (Criteria) this;
        }

        public Criteria andExercisedurationEqualTo(Short value) {
            addCriterion("exerciseDuration =", value, "exerciseduration");
            return (Criteria) this;
        }

        public Criteria andExercisedurationNotEqualTo(Short value) {
            addCriterion("exerciseDuration <>", value, "exerciseduration");
            return (Criteria) this;
        }

        public Criteria andExercisedurationGreaterThan(Short value) {
            addCriterion("exerciseDuration >", value, "exerciseduration");
            return (Criteria) this;
        }

        public Criteria andExercisedurationGreaterThanOrEqualTo(Short value) {
            addCriterion("exerciseDuration >=", value, "exerciseduration");
            return (Criteria) this;
        }

        public Criteria andExercisedurationLessThan(Short value) {
            addCriterion("exerciseDuration <", value, "exerciseduration");
            return (Criteria) this;
        }

        public Criteria andExercisedurationLessThanOrEqualTo(Short value) {
            addCriterion("exerciseDuration <=", value, "exerciseduration");
            return (Criteria) this;
        }

        public Criteria andExercisedurationIn(List<Short> values) {
            addCriterion("exerciseDuration in", values, "exerciseduration");
            return (Criteria) this;
        }

        public Criteria andExercisedurationNotIn(List<Short> values) {
            addCriterion("exerciseDuration not in", values, "exerciseduration");
            return (Criteria) this;
        }

        public Criteria andExercisedurationBetween(Short value1, Short value2) {
            addCriterion("exerciseDuration between", value1, value2, "exerciseduration");
            return (Criteria) this;
        }

        public Criteria andExercisedurationNotBetween(Short value1, Short value2) {
            addCriterion("exerciseDuration not between", value1, value2, "exerciseduration");
            return (Criteria) this;
        }

        public Criteria andTargetexercisedurationIsNull() {
            addCriterion("targetExerciseDuration is null");
            return (Criteria) this;
        }

        public Criteria andTargetexercisedurationIsNotNull() {
            addCriterion("targetExerciseDuration is not null");
            return (Criteria) this;
        }

        public Criteria andTargetexercisedurationEqualTo(Short value) {
            addCriterion("targetExerciseDuration =", value, "targetexerciseduration");
            return (Criteria) this;
        }

        public Criteria andTargetexercisedurationNotEqualTo(Short value) {
            addCriterion("targetExerciseDuration <>", value, "targetexerciseduration");
            return (Criteria) this;
        }

        public Criteria andTargetexercisedurationGreaterThan(Short value) {
            addCriterion("targetExerciseDuration >", value, "targetexerciseduration");
            return (Criteria) this;
        }

        public Criteria andTargetexercisedurationGreaterThanOrEqualTo(Short value) {
            addCriterion("targetExerciseDuration >=", value, "targetexerciseduration");
            return (Criteria) this;
        }

        public Criteria andTargetexercisedurationLessThan(Short value) {
            addCriterion("targetExerciseDuration <", value, "targetexerciseduration");
            return (Criteria) this;
        }

        public Criteria andTargetexercisedurationLessThanOrEqualTo(Short value) {
            addCriterion("targetExerciseDuration <=", value, "targetexerciseduration");
            return (Criteria) this;
        }

        public Criteria andTargetexercisedurationIn(List<Short> values) {
            addCriterion("targetExerciseDuration in", values, "targetexerciseduration");
            return (Criteria) this;
        }

        public Criteria andTargetexercisedurationNotIn(List<Short> values) {
            addCriterion("targetExerciseDuration not in", values, "targetexerciseduration");
            return (Criteria) this;
        }

        public Criteria andTargetexercisedurationBetween(Short value1, Short value2) {
            addCriterion("targetExerciseDuration between", value1, value2, "targetexerciseduration");
            return (Criteria) this;
        }

        public Criteria andTargetexercisedurationNotBetween(Short value1, Short value2) {
            addCriterion("targetExerciseDuration not between", value1, value2, "targetexerciseduration");
            return (Criteria) this;
        }

        public Criteria andSaltuptakeIsNull() {
            addCriterion("saltUptake is null");
            return (Criteria) this;
        }

        public Criteria andSaltuptakeIsNotNull() {
            addCriterion("saltUptake is not null");
            return (Criteria) this;
        }

        public Criteria andSaltuptakeEqualTo(Short value) {
            addCriterion("saltUptake =", value, "saltuptake");
            return (Criteria) this;
        }

        public Criteria andSaltuptakeNotEqualTo(Short value) {
            addCriterion("saltUptake <>", value, "saltuptake");
            return (Criteria) this;
        }

        public Criteria andSaltuptakeGreaterThan(Short value) {
            addCriterion("saltUptake >", value, "saltuptake");
            return (Criteria) this;
        }

        public Criteria andSaltuptakeGreaterThanOrEqualTo(Short value) {
            addCriterion("saltUptake >=", value, "saltuptake");
            return (Criteria) this;
        }

        public Criteria andSaltuptakeLessThan(Short value) {
            addCriterion("saltUptake <", value, "saltuptake");
            return (Criteria) this;
        }

        public Criteria andSaltuptakeLessThanOrEqualTo(Short value) {
            addCriterion("saltUptake <=", value, "saltuptake");
            return (Criteria) this;
        }

        public Criteria andSaltuptakeIn(List<Short> values) {
            addCriterion("saltUptake in", values, "saltuptake");
            return (Criteria) this;
        }

        public Criteria andSaltuptakeNotIn(List<Short> values) {
            addCriterion("saltUptake not in", values, "saltuptake");
            return (Criteria) this;
        }

        public Criteria andSaltuptakeBetween(Short value1, Short value2) {
            addCriterion("saltUptake between", value1, value2, "saltuptake");
            return (Criteria) this;
        }

        public Criteria andSaltuptakeNotBetween(Short value1, Short value2) {
            addCriterion("saltUptake not between", value1, value2, "saltuptake");
            return (Criteria) this;
        }

        public Criteria andTargetsaltuptakeIsNull() {
            addCriterion("targetSaltUptake is null");
            return (Criteria) this;
        }

        public Criteria andTargetsaltuptakeIsNotNull() {
            addCriterion("targetSaltUptake is not null");
            return (Criteria) this;
        }

        public Criteria andTargetsaltuptakeEqualTo(Short value) {
            addCriterion("targetSaltUptake =", value, "targetsaltuptake");
            return (Criteria) this;
        }

        public Criteria andTargetsaltuptakeNotEqualTo(Short value) {
            addCriterion("targetSaltUptake <>", value, "targetsaltuptake");
            return (Criteria) this;
        }

        public Criteria andTargetsaltuptakeGreaterThan(Short value) {
            addCriterion("targetSaltUptake >", value, "targetsaltuptake");
            return (Criteria) this;
        }

        public Criteria andTargetsaltuptakeGreaterThanOrEqualTo(Short value) {
            addCriterion("targetSaltUptake >=", value, "targetsaltuptake");
            return (Criteria) this;
        }

        public Criteria andTargetsaltuptakeLessThan(Short value) {
            addCriterion("targetSaltUptake <", value, "targetsaltuptake");
            return (Criteria) this;
        }

        public Criteria andTargetsaltuptakeLessThanOrEqualTo(Short value) {
            addCriterion("targetSaltUptake <=", value, "targetsaltuptake");
            return (Criteria) this;
        }

        public Criteria andTargetsaltuptakeIn(List<Short> values) {
            addCriterion("targetSaltUptake in", values, "targetsaltuptake");
            return (Criteria) this;
        }

        public Criteria andTargetsaltuptakeNotIn(List<Short> values) {
            addCriterion("targetSaltUptake not in", values, "targetsaltuptake");
            return (Criteria) this;
        }

        public Criteria andTargetsaltuptakeBetween(Short value1, Short value2) {
            addCriterion("targetSaltUptake between", value1, value2, "targetsaltuptake");
            return (Criteria) this;
        }

        public Criteria andTargetsaltuptakeNotBetween(Short value1, Short value2) {
            addCriterion("targetSaltUptake not between", value1, value2, "targetsaltuptake");
            return (Criteria) this;
        }

        public Criteria andPsychologicaladjustmentIsNull() {
            addCriterion("psychologicalAdjustment is null");
            return (Criteria) this;
        }

        public Criteria andPsychologicaladjustmentIsNotNull() {
            addCriterion("psychologicalAdjustment is not null");
            return (Criteria) this;
        }

        public Criteria andPsychologicaladjustmentEqualTo(Short value) {
            addCriterion("psychologicalAdjustment =", value, "psychologicaladjustment");
            return (Criteria) this;
        }

        public Criteria andPsychologicaladjustmentNotEqualTo(Short value) {
            addCriterion("psychologicalAdjustment <>", value, "psychologicaladjustment");
            return (Criteria) this;
        }

        public Criteria andPsychologicaladjustmentGreaterThan(Short value) {
            addCriterion("psychologicalAdjustment >", value, "psychologicaladjustment");
            return (Criteria) this;
        }

        public Criteria andPsychologicaladjustmentGreaterThanOrEqualTo(Short value) {
            addCriterion("psychologicalAdjustment >=", value, "psychologicaladjustment");
            return (Criteria) this;
        }

        public Criteria andPsychologicaladjustmentLessThan(Short value) {
            addCriterion("psychologicalAdjustment <", value, "psychologicaladjustment");
            return (Criteria) this;
        }

        public Criteria andPsychologicaladjustmentLessThanOrEqualTo(Short value) {
            addCriterion("psychologicalAdjustment <=", value, "psychologicaladjustment");
            return (Criteria) this;
        }

        public Criteria andPsychologicaladjustmentIn(List<Short> values) {
            addCriterion("psychologicalAdjustment in", values, "psychologicaladjustment");
            return (Criteria) this;
        }

        public Criteria andPsychologicaladjustmentNotIn(List<Short> values) {
            addCriterion("psychologicalAdjustment not in", values, "psychologicaladjustment");
            return (Criteria) this;
        }

        public Criteria andPsychologicaladjustmentBetween(Short value1, Short value2) {
            addCriterion("psychologicalAdjustment between", value1, value2, "psychologicaladjustment");
            return (Criteria) this;
        }

        public Criteria andPsychologicaladjustmentNotBetween(Short value1, Short value2) {
            addCriterion("psychologicalAdjustment not between", value1, value2, "psychologicaladjustment");
            return (Criteria) this;
        }

        public Criteria andCompliancebehaviorIsNull() {
            addCriterion("complianceBehavior is null");
            return (Criteria) this;
        }

        public Criteria andCompliancebehaviorIsNotNull() {
            addCriterion("complianceBehavior is not null");
            return (Criteria) this;
        }

        public Criteria andCompliancebehaviorEqualTo(Short value) {
            addCriterion("complianceBehavior =", value, "compliancebehavior");
            return (Criteria) this;
        }

        public Criteria andCompliancebehaviorNotEqualTo(Short value) {
            addCriterion("complianceBehavior <>", value, "compliancebehavior");
            return (Criteria) this;
        }

        public Criteria andCompliancebehaviorGreaterThan(Short value) {
            addCriterion("complianceBehavior >", value, "compliancebehavior");
            return (Criteria) this;
        }

        public Criteria andCompliancebehaviorGreaterThanOrEqualTo(Short value) {
            addCriterion("complianceBehavior >=", value, "compliancebehavior");
            return (Criteria) this;
        }

        public Criteria andCompliancebehaviorLessThan(Short value) {
            addCriterion("complianceBehavior <", value, "compliancebehavior");
            return (Criteria) this;
        }

        public Criteria andCompliancebehaviorLessThanOrEqualTo(Short value) {
            addCriterion("complianceBehavior <=", value, "compliancebehavior");
            return (Criteria) this;
        }

        public Criteria andCompliancebehaviorIn(List<Short> values) {
            addCriterion("complianceBehavior in", values, "compliancebehavior");
            return (Criteria) this;
        }

        public Criteria andCompliancebehaviorNotIn(List<Short> values) {
            addCriterion("complianceBehavior not in", values, "compliancebehavior");
            return (Criteria) this;
        }

        public Criteria andCompliancebehaviorBetween(Short value1, Short value2) {
            addCriterion("complianceBehavior between", value1, value2, "compliancebehavior");
            return (Criteria) this;
        }

        public Criteria andCompliancebehaviorNotBetween(Short value1, Short value2) {
            addCriterion("complianceBehavior not between", value1, value2, "compliancebehavior");
            return (Criteria) this;
        }

        public Criteria andFastingbloodsugarIsNull() {
            addCriterion("fastingBloodSugar is null");
            return (Criteria) this;
        }

        public Criteria andFastingbloodsugarIsNotNull() {
            addCriterion("fastingBloodSugar is not null");
            return (Criteria) this;
        }

        public Criteria andFastingbloodsugarEqualTo(BigDecimal value) {
            addCriterion("fastingBloodSugar =", value, "fastingbloodsugar");
            return (Criteria) this;
        }

        public Criteria andFastingbloodsugarNotEqualTo(BigDecimal value) {
            addCriterion("fastingBloodSugar <>", value, "fastingbloodsugar");
            return (Criteria) this;
        }

        public Criteria andFastingbloodsugarGreaterThan(BigDecimal value) {
            addCriterion("fastingBloodSugar >", value, "fastingbloodsugar");
            return (Criteria) this;
        }

        public Criteria andFastingbloodsugarGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fastingBloodSugar >=", value, "fastingbloodsugar");
            return (Criteria) this;
        }

        public Criteria andFastingbloodsugarLessThan(BigDecimal value) {
            addCriterion("fastingBloodSugar <", value, "fastingbloodsugar");
            return (Criteria) this;
        }

        public Criteria andFastingbloodsugarLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fastingBloodSugar <=", value, "fastingbloodsugar");
            return (Criteria) this;
        }

        public Criteria andFastingbloodsugarIn(List<BigDecimal> values) {
            addCriterion("fastingBloodSugar in", values, "fastingbloodsugar");
            return (Criteria) this;
        }

        public Criteria andFastingbloodsugarNotIn(List<BigDecimal> values) {
            addCriterion("fastingBloodSugar not in", values, "fastingbloodsugar");
            return (Criteria) this;
        }

        public Criteria andFastingbloodsugarBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fastingBloodSugar between", value1, value2, "fastingbloodsugar");
            return (Criteria) this;
        }

        public Criteria andFastingbloodsugarNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fastingBloodSugar not between", value1, value2, "fastingbloodsugar");
            return (Criteria) this;
        }

        public Criteria andGlycosylatedhemoglobinIsNull() {
            addCriterion("glycosylatedHemoglobin is null");
            return (Criteria) this;
        }

        public Criteria andGlycosylatedhemoglobinIsNotNull() {
            addCriterion("glycosylatedHemoglobin is not null");
            return (Criteria) this;
        }

        public Criteria andGlycosylatedhemoglobinEqualTo(BigDecimal value) {
            addCriterion("glycosylatedHemoglobin =", value, "glycosylatedhemoglobin");
            return (Criteria) this;
        }

        public Criteria andGlycosylatedhemoglobinNotEqualTo(BigDecimal value) {
            addCriterion("glycosylatedHemoglobin <>", value, "glycosylatedhemoglobin");
            return (Criteria) this;
        }

        public Criteria andGlycosylatedhemoglobinGreaterThan(BigDecimal value) {
            addCriterion("glycosylatedHemoglobin >", value, "glycosylatedhemoglobin");
            return (Criteria) this;
        }

        public Criteria andGlycosylatedhemoglobinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("glycosylatedHemoglobin >=", value, "glycosylatedhemoglobin");
            return (Criteria) this;
        }

        public Criteria andGlycosylatedhemoglobinLessThan(BigDecimal value) {
            addCriterion("glycosylatedHemoglobin <", value, "glycosylatedhemoglobin");
            return (Criteria) this;
        }

        public Criteria andGlycosylatedhemoglobinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("glycosylatedHemoglobin <=", value, "glycosylatedhemoglobin");
            return (Criteria) this;
        }

        public Criteria andGlycosylatedhemoglobinIn(List<BigDecimal> values) {
            addCriterion("glycosylatedHemoglobin in", values, "glycosylatedhemoglobin");
            return (Criteria) this;
        }

        public Criteria andGlycosylatedhemoglobinNotIn(List<BigDecimal> values) {
            addCriterion("glycosylatedHemoglobin not in", values, "glycosylatedhemoglobin");
            return (Criteria) this;
        }

        public Criteria andGlycosylatedhemoglobinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("glycosylatedHemoglobin between", value1, value2, "glycosylatedhemoglobin");
            return (Criteria) this;
        }

        public Criteria andGlycosylatedhemoglobinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("glycosylatedHemoglobin not between", value1, value2, "glycosylatedhemoglobin");
            return (Criteria) this;
        }

        public Criteria andInspectiondateIsNull() {
            addCriterion("inspectionDate is null");
            return (Criteria) this;
        }

        public Criteria andInspectiondateIsNotNull() {
            addCriterion("inspectionDate is not null");
            return (Criteria) this;
        }

        public Criteria andInspectiondateEqualTo(Date value) {
            addCriterion("inspectionDate =", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateNotEqualTo(Date value) {
            addCriterion("inspectionDate <>", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateGreaterThan(Date value) {
            addCriterion("inspectionDate >", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateGreaterThanOrEqualTo(Date value) {
            addCriterion("inspectionDate >=", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateLessThan(Date value) {
            addCriterion("inspectionDate <", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateLessThanOrEqualTo(Date value) {
            addCriterion("inspectionDate <=", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateIn(List<Date> values) {
            addCriterion("inspectionDate in", values, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateNotIn(List<Date> values) {
            addCriterion("inspectionDate not in", values, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateBetween(Date value1, Date value2) {
            addCriterion("inspectionDate between", value1, value2, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateNotBetween(Date value1, Date value2) {
            addCriterion("inspectionDate not between", value1, value2, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andSupplementaryexaminationIsNull() {
            addCriterion("supplementaryExamination is null");
            return (Criteria) this;
        }

        public Criteria andSupplementaryexaminationIsNotNull() {
            addCriterion("supplementaryExamination is not null");
            return (Criteria) this;
        }

        public Criteria andSupplementaryexaminationEqualTo(BigDecimal value) {
            addCriterion("supplementaryExamination =", value, "supplementaryexamination");
            return (Criteria) this;
        }

        public Criteria andSupplementaryexaminationNotEqualTo(BigDecimal value) {
            addCriterion("supplementaryExamination <>", value, "supplementaryexamination");
            return (Criteria) this;
        }

        public Criteria andSupplementaryexaminationGreaterThan(BigDecimal value) {
            addCriterion("supplementaryExamination >", value, "supplementaryexamination");
            return (Criteria) this;
        }

        public Criteria andSupplementaryexaminationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("supplementaryExamination >=", value, "supplementaryexamination");
            return (Criteria) this;
        }

        public Criteria andSupplementaryexaminationLessThan(BigDecimal value) {
            addCriterion("supplementaryExamination <", value, "supplementaryexamination");
            return (Criteria) this;
        }

        public Criteria andSupplementaryexaminationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("supplementaryExamination <=", value, "supplementaryexamination");
            return (Criteria) this;
        }

        public Criteria andSupplementaryexaminationIn(List<BigDecimal> values) {
            addCriterion("supplementaryExamination in", values, "supplementaryexamination");
            return (Criteria) this;
        }

        public Criteria andSupplementaryexaminationNotIn(List<BigDecimal> values) {
            addCriterion("supplementaryExamination not in", values, "supplementaryexamination");
            return (Criteria) this;
        }

        public Criteria andSupplementaryexaminationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supplementaryExamination between", value1, value2, "supplementaryexamination");
            return (Criteria) this;
        }

        public Criteria andSupplementaryexaminationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("supplementaryExamination not between", value1, value2, "supplementaryexamination");
            return (Criteria) this;
        }

        public Criteria andMedicationcomplianceIsNull() {
            addCriterion("medicationCompliance is null");
            return (Criteria) this;
        }

        public Criteria andMedicationcomplianceIsNotNull() {
            addCriterion("medicationCompliance is not null");
            return (Criteria) this;
        }

        public Criteria andMedicationcomplianceEqualTo(Short value) {
            addCriterion("medicationCompliance =", value, "medicationcompliance");
            return (Criteria) this;
        }

        public Criteria andMedicationcomplianceNotEqualTo(Short value) {
            addCriterion("medicationCompliance <>", value, "medicationcompliance");
            return (Criteria) this;
        }

        public Criteria andMedicationcomplianceGreaterThan(Short value) {
            addCriterion("medicationCompliance >", value, "medicationcompliance");
            return (Criteria) this;
        }

        public Criteria andMedicationcomplianceGreaterThanOrEqualTo(Short value) {
            addCriterion("medicationCompliance >=", value, "medicationcompliance");
            return (Criteria) this;
        }

        public Criteria andMedicationcomplianceLessThan(Short value) {
            addCriterion("medicationCompliance <", value, "medicationcompliance");
            return (Criteria) this;
        }

        public Criteria andMedicationcomplianceLessThanOrEqualTo(Short value) {
            addCriterion("medicationCompliance <=", value, "medicationcompliance");
            return (Criteria) this;
        }

        public Criteria andMedicationcomplianceIn(List<Short> values) {
            addCriterion("medicationCompliance in", values, "medicationcompliance");
            return (Criteria) this;
        }

        public Criteria andMedicationcomplianceNotIn(List<Short> values) {
            addCriterion("medicationCompliance not in", values, "medicationcompliance");
            return (Criteria) this;
        }

        public Criteria andMedicationcomplianceBetween(Short value1, Short value2) {
            addCriterion("medicationCompliance between", value1, value2, "medicationcompliance");
            return (Criteria) this;
        }

        public Criteria andMedicationcomplianceNotBetween(Short value1, Short value2) {
            addCriterion("medicationCompliance not between", value1, value2, "medicationcompliance");
            return (Criteria) this;
        }

        public Criteria andAdversedrugreactionsIsNull() {
            addCriterion("adverseDrugReactions is null");
            return (Criteria) this;
        }

        public Criteria andAdversedrugreactionsIsNotNull() {
            addCriterion("adverseDrugReactions is not null");
            return (Criteria) this;
        }

        public Criteria andAdversedrugreactionsEqualTo(Short value) {
            addCriterion("adverseDrugReactions =", value, "adversedrugreactions");
            return (Criteria) this;
        }

        public Criteria andAdversedrugreactionsNotEqualTo(Short value) {
            addCriterion("adverseDrugReactions <>", value, "adversedrugreactions");
            return (Criteria) this;
        }

        public Criteria andAdversedrugreactionsGreaterThan(Short value) {
            addCriterion("adverseDrugReactions >", value, "adversedrugreactions");
            return (Criteria) this;
        }

        public Criteria andAdversedrugreactionsGreaterThanOrEqualTo(Short value) {
            addCriterion("adverseDrugReactions >=", value, "adversedrugreactions");
            return (Criteria) this;
        }

        public Criteria andAdversedrugreactionsLessThan(Short value) {
            addCriterion("adverseDrugReactions <", value, "adversedrugreactions");
            return (Criteria) this;
        }

        public Criteria andAdversedrugreactionsLessThanOrEqualTo(Short value) {
            addCriterion("adverseDrugReactions <=", value, "adversedrugreactions");
            return (Criteria) this;
        }

        public Criteria andAdversedrugreactionsIn(List<Short> values) {
            addCriterion("adverseDrugReactions in", values, "adversedrugreactions");
            return (Criteria) this;
        }

        public Criteria andAdversedrugreactionsNotIn(List<Short> values) {
            addCriterion("adverseDrugReactions not in", values, "adversedrugreactions");
            return (Criteria) this;
        }

        public Criteria andAdversedrugreactionsBetween(Short value1, Short value2) {
            addCriterion("adverseDrugReactions between", value1, value2, "adversedrugreactions");
            return (Criteria) this;
        }

        public Criteria andAdversedrugreactionsNotBetween(Short value1, Short value2) {
            addCriterion("adverseDrugReactions not between", value1, value2, "adversedrugreactions");
            return (Criteria) this;
        }

        public Criteria andDiabetesmedicinesinfoIsNull() {
            addCriterion("diabetesMedicinesInfo is null");
            return (Criteria) this;
        }

        public Criteria andDiabetesmedicinesinfoIsNotNull() {
            addCriterion("diabetesMedicinesInfo is not null");
            return (Criteria) this;
        }

        public Criteria andDiabetesmedicinesinfoEqualTo(String value) {
            addCriterion("diabetesMedicinesInfo =", value, "diabetesmedicinesinfo");
            return (Criteria) this;
        }

        public Criteria andDiabetesmedicinesinfoNotEqualTo(String value) {
            addCriterion("diabetesMedicinesInfo <>", value, "diabetesmedicinesinfo");
            return (Criteria) this;
        }

        public Criteria andDiabetesmedicinesinfoGreaterThan(String value) {
            addCriterion("diabetesMedicinesInfo >", value, "diabetesmedicinesinfo");
            return (Criteria) this;
        }

        public Criteria andDiabetesmedicinesinfoGreaterThanOrEqualTo(String value) {
            addCriterion("diabetesMedicinesInfo >=", value, "diabetesmedicinesinfo");
            return (Criteria) this;
        }

        public Criteria andDiabetesmedicinesinfoLessThan(String value) {
            addCriterion("diabetesMedicinesInfo <", value, "diabetesmedicinesinfo");
            return (Criteria) this;
        }

        public Criteria andDiabetesmedicinesinfoLessThanOrEqualTo(String value) {
            addCriterion("diabetesMedicinesInfo <=", value, "diabetesmedicinesinfo");
            return (Criteria) this;
        }

        public Criteria andDiabetesmedicinesinfoLike(String value) {
            addCriterion("diabetesMedicinesInfo like", value, "diabetesmedicinesinfo");
            return (Criteria) this;
        }

        public Criteria andDiabetesmedicinesinfoNotLike(String value) {
            addCriterion("diabetesMedicinesInfo not like", value, "diabetesmedicinesinfo");
            return (Criteria) this;
        }

        public Criteria andDiabetesmedicinesinfoIn(List<String> values) {
            addCriterion("diabetesMedicinesInfo in", values, "diabetesmedicinesinfo");
            return (Criteria) this;
        }

        public Criteria andDiabetesmedicinesinfoNotIn(List<String> values) {
            addCriterion("diabetesMedicinesInfo not in", values, "diabetesmedicinesinfo");
            return (Criteria) this;
        }

        public Criteria andDiabetesmedicinesinfoBetween(String value1, String value2) {
            addCriterion("diabetesMedicinesInfo between", value1, value2, "diabetesmedicinesinfo");
            return (Criteria) this;
        }

        public Criteria andDiabetesmedicinesinfoNotBetween(String value1, String value2) {
            addCriterion("diabetesMedicinesInfo not between", value1, value2, "diabetesmedicinesinfo");
            return (Criteria) this;
        }

        public Criteria andDrugnameIsNull() {
            addCriterion("drugName is null");
            return (Criteria) this;
        }

        public Criteria andDrugnameIsNotNull() {
            addCriterion("drugName is not null");
            return (Criteria) this;
        }

        public Criteria andDrugnameEqualTo(String value) {
            addCriterion("drugName =", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameNotEqualTo(String value) {
            addCriterion("drugName <>", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameGreaterThan(String value) {
            addCriterion("drugName >", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameGreaterThanOrEqualTo(String value) {
            addCriterion("drugName >=", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameLessThan(String value) {
            addCriterion("drugName <", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameLessThanOrEqualTo(String value) {
            addCriterion("drugName <=", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameLike(String value) {
            addCriterion("drugName like", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameNotLike(String value) {
            addCriterion("drugName not like", value, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameIn(List<String> values) {
            addCriterion("drugName in", values, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameNotIn(List<String> values) {
            addCriterion("drugName not in", values, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameBetween(String value1, String value2) {
            addCriterion("drugName between", value1, value2, "drugname");
            return (Criteria) this;
        }

        public Criteria andDrugnameNotBetween(String value1, String value2) {
            addCriterion("drugName not between", value1, value2, "drugname");
            return (Criteria) this;
        }

        public Criteria andEachdoseIsNull() {
            addCriterion("eachDose is null");
            return (Criteria) this;
        }

        public Criteria andEachdoseIsNotNull() {
            addCriterion("eachDose is not null");
            return (Criteria) this;
        }

        public Criteria andEachdoseEqualTo(BigDecimal value) {
            addCriterion("eachDose =", value, "eachdose");
            return (Criteria) this;
        }

        public Criteria andEachdoseNotEqualTo(BigDecimal value) {
            addCriterion("eachDose <>", value, "eachdose");
            return (Criteria) this;
        }

        public Criteria andEachdoseGreaterThan(BigDecimal value) {
            addCriterion("eachDose >", value, "eachdose");
            return (Criteria) this;
        }

        public Criteria andEachdoseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("eachDose >=", value, "eachdose");
            return (Criteria) this;
        }

        public Criteria andEachdoseLessThan(BigDecimal value) {
            addCriterion("eachDose <", value, "eachdose");
            return (Criteria) this;
        }

        public Criteria andEachdoseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("eachDose <=", value, "eachdose");
            return (Criteria) this;
        }

        public Criteria andEachdoseIn(List<BigDecimal> values) {
            addCriterion("eachDose in", values, "eachdose");
            return (Criteria) this;
        }

        public Criteria andEachdoseNotIn(List<BigDecimal> values) {
            addCriterion("eachDose not in", values, "eachdose");
            return (Criteria) this;
        }

        public Criteria andEachdoseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("eachDose between", value1, value2, "eachdose");
            return (Criteria) this;
        }

        public Criteria andEachdoseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("eachDose not between", value1, value2, "eachdose");
            return (Criteria) this;
        }

        public Criteria andDoseunitIsNull() {
            addCriterion("doseUnit is null");
            return (Criteria) this;
        }

        public Criteria andDoseunitIsNotNull() {
            addCriterion("doseUnit is not null");
            return (Criteria) this;
        }

        public Criteria andDoseunitEqualTo(String value) {
            addCriterion("doseUnit =", value, "doseunit");
            return (Criteria) this;
        }

        public Criteria andDoseunitNotEqualTo(String value) {
            addCriterion("doseUnit <>", value, "doseunit");
            return (Criteria) this;
        }

        public Criteria andDoseunitGreaterThan(String value) {
            addCriterion("doseUnit >", value, "doseunit");
            return (Criteria) this;
        }

        public Criteria andDoseunitGreaterThanOrEqualTo(String value) {
            addCriterion("doseUnit >=", value, "doseunit");
            return (Criteria) this;
        }

        public Criteria andDoseunitLessThan(String value) {
            addCriterion("doseUnit <", value, "doseunit");
            return (Criteria) this;
        }

        public Criteria andDoseunitLessThanOrEqualTo(String value) {
            addCriterion("doseUnit <=", value, "doseunit");
            return (Criteria) this;
        }

        public Criteria andDoseunitLike(String value) {
            addCriterion("doseUnit like", value, "doseunit");
            return (Criteria) this;
        }

        public Criteria andDoseunitNotLike(String value) {
            addCriterion("doseUnit not like", value, "doseunit");
            return (Criteria) this;
        }

        public Criteria andDoseunitIn(List<String> values) {
            addCriterion("doseUnit in", values, "doseunit");
            return (Criteria) this;
        }

        public Criteria andDoseunitNotIn(List<String> values) {
            addCriterion("doseUnit not in", values, "doseunit");
            return (Criteria) this;
        }

        public Criteria andDoseunitBetween(String value1, String value2) {
            addCriterion("doseUnit between", value1, value2, "doseunit");
            return (Criteria) this;
        }

        public Criteria andDoseunitNotBetween(String value1, String value2) {
            addCriterion("doseUnit not between", value1, value2, "doseunit");
            return (Criteria) this;
        }

        public Criteria andInsulinperdoseIsNull() {
            addCriterion("insulinPerDose is null");
            return (Criteria) this;
        }

        public Criteria andInsulinperdoseIsNotNull() {
            addCriterion("insulinPerDose is not null");
            return (Criteria) this;
        }

        public Criteria andInsulinperdoseEqualTo(BigDecimal value) {
            addCriterion("insulinPerDose =", value, "insulinperdose");
            return (Criteria) this;
        }

        public Criteria andInsulinperdoseNotEqualTo(BigDecimal value) {
            addCriterion("insulinPerDose <>", value, "insulinperdose");
            return (Criteria) this;
        }

        public Criteria andInsulinperdoseGreaterThan(BigDecimal value) {
            addCriterion("insulinPerDose >", value, "insulinperdose");
            return (Criteria) this;
        }

        public Criteria andInsulinperdoseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insulinPerDose >=", value, "insulinperdose");
            return (Criteria) this;
        }

        public Criteria andInsulinperdoseLessThan(BigDecimal value) {
            addCriterion("insulinPerDose <", value, "insulinperdose");
            return (Criteria) this;
        }

        public Criteria andInsulinperdoseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insulinPerDose <=", value, "insulinperdose");
            return (Criteria) this;
        }

        public Criteria andInsulinperdoseIn(List<BigDecimal> values) {
            addCriterion("insulinPerDose in", values, "insulinperdose");
            return (Criteria) this;
        }

        public Criteria andInsulinperdoseNotIn(List<BigDecimal> values) {
            addCriterion("insulinPerDose not in", values, "insulinperdose");
            return (Criteria) this;
        }

        public Criteria andInsulinperdoseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insulinPerDose between", value1, value2, "insulinperdose");
            return (Criteria) this;
        }

        public Criteria andInsulinperdoseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insulinPerDose not between", value1, value2, "insulinperdose");
            return (Criteria) this;
        }

        public Criteria andInsulindoseunitIsNull() {
            addCriterion("insulinDoseUnit is null");
            return (Criteria) this;
        }

        public Criteria andInsulindoseunitIsNotNull() {
            addCriterion("insulinDoseUnit is not null");
            return (Criteria) this;
        }

        public Criteria andInsulindoseunitEqualTo(String value) {
            addCriterion("insulinDoseUnit =", value, "insulindoseunit");
            return (Criteria) this;
        }

        public Criteria andInsulindoseunitNotEqualTo(String value) {
            addCriterion("insulinDoseUnit <>", value, "insulindoseunit");
            return (Criteria) this;
        }

        public Criteria andInsulindoseunitGreaterThan(String value) {
            addCriterion("insulinDoseUnit >", value, "insulindoseunit");
            return (Criteria) this;
        }

        public Criteria andInsulindoseunitGreaterThanOrEqualTo(String value) {
            addCriterion("insulinDoseUnit >=", value, "insulindoseunit");
            return (Criteria) this;
        }

        public Criteria andInsulindoseunitLessThan(String value) {
            addCriterion("insulinDoseUnit <", value, "insulindoseunit");
            return (Criteria) this;
        }

        public Criteria andInsulindoseunitLessThanOrEqualTo(String value) {
            addCriterion("insulinDoseUnit <=", value, "insulindoseunit");
            return (Criteria) this;
        }

        public Criteria andInsulindoseunitLike(String value) {
            addCriterion("insulinDoseUnit like", value, "insulindoseunit");
            return (Criteria) this;
        }

        public Criteria andInsulindoseunitNotLike(String value) {
            addCriterion("insulinDoseUnit not like", value, "insulindoseunit");
            return (Criteria) this;
        }

        public Criteria andInsulindoseunitIn(List<String> values) {
            addCriterion("insulinDoseUnit in", values, "insulindoseunit");
            return (Criteria) this;
        }

        public Criteria andInsulindoseunitNotIn(List<String> values) {
            addCriterion("insulinDoseUnit not in", values, "insulindoseunit");
            return (Criteria) this;
        }

        public Criteria andInsulindoseunitBetween(String value1, String value2) {
            addCriterion("insulinDoseUnit between", value1, value2, "insulindoseunit");
            return (Criteria) this;
        }

        public Criteria andInsulindoseunitNotBetween(String value1, String value2) {
            addCriterion("insulinDoseUnit not between", value1, value2, "insulindoseunit");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypeIsNull() {
            addCriterion("diabetesFollowUpType is null");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypeIsNotNull() {
            addCriterion("diabetesFollowUpType is not null");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypeEqualTo(Short value) {
            addCriterion("diabetesFollowUpType =", value, "diabetesfollowuptype");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypeNotEqualTo(Short value) {
            addCriterion("diabetesFollowUpType <>", value, "diabetesfollowuptype");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypeGreaterThan(Short value) {
            addCriterion("diabetesFollowUpType >", value, "diabetesfollowuptype");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypeGreaterThanOrEqualTo(Short value) {
            addCriterion("diabetesFollowUpType >=", value, "diabetesfollowuptype");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypeLessThan(Short value) {
            addCriterion("diabetesFollowUpType <", value, "diabetesfollowuptype");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypeLessThanOrEqualTo(Short value) {
            addCriterion("diabetesFollowUpType <=", value, "diabetesfollowuptype");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypeIn(List<Short> values) {
            addCriterion("diabetesFollowUpType in", values, "diabetesfollowuptype");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypeNotIn(List<Short> values) {
            addCriterion("diabetesFollowUpType not in", values, "diabetesfollowuptype");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypeBetween(Short value1, Short value2) {
            addCriterion("diabetesFollowUpType between", value1, value2, "diabetesfollowuptype");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypeNotBetween(Short value1, Short value2) {
            addCriterion("diabetesFollowUpType not between", value1, value2, "diabetesfollowuptype");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypesupplementIsNull() {
            addCriterion("diabetesFollowUpTypeSupplement is null");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypesupplementIsNotNull() {
            addCriterion("diabetesFollowUpTypeSupplement is not null");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypesupplementEqualTo(Short value) {
            addCriterion("diabetesFollowUpTypeSupplement =", value, "diabetesfollowuptypesupplement");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypesupplementNotEqualTo(Short value) {
            addCriterion("diabetesFollowUpTypeSupplement <>", value, "diabetesfollowuptypesupplement");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypesupplementGreaterThan(Short value) {
            addCriterion("diabetesFollowUpTypeSupplement >", value, "diabetesfollowuptypesupplement");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypesupplementGreaterThanOrEqualTo(Short value) {
            addCriterion("diabetesFollowUpTypeSupplement >=", value, "diabetesfollowuptypesupplement");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypesupplementLessThan(Short value) {
            addCriterion("diabetesFollowUpTypeSupplement <", value, "diabetesfollowuptypesupplement");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypesupplementLessThanOrEqualTo(Short value) {
            addCriterion("diabetesFollowUpTypeSupplement <=", value, "diabetesfollowuptypesupplement");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypesupplementIn(List<Short> values) {
            addCriterion("diabetesFollowUpTypeSupplement in", values, "diabetesfollowuptypesupplement");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypesupplementNotIn(List<Short> values) {
            addCriterion("diabetesFollowUpTypeSupplement not in", values, "diabetesfollowuptypesupplement");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypesupplementBetween(Short value1, Short value2) {
            addCriterion("diabetesFollowUpTypeSupplement between", value1, value2, "diabetesfollowuptypesupplement");
            return (Criteria) this;
        }

        public Criteria andDiabetesfollowuptypesupplementNotBetween(Short value1, Short value2) {
            addCriterion("diabetesFollowUpTypeSupplement not between", value1, value2, "diabetesfollowuptypesupplement");
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