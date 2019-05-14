package com.lottery.api.bean;

import java.util.ArrayList;
import java.util.List;

public class ForeignInterfaceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ForeignInterfaceExample() {
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

    /**
     * foreign_interface 2019-05-14
     */
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

        public Criteria andNameEnIsNull() {
            addCriterion("name_en is null");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNotNull() {
            addCriterion("name_en is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnEqualTo(String value) {
            addCriterion("name_en =", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotEqualTo(String value) {
            addCriterion("name_en <>", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThan(String value) {
            addCriterion("name_en >", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("name_en >=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThan(String value) {
            addCriterion("name_en <", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThanOrEqualTo(String value) {
            addCriterion("name_en <=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLike(String value) {
            addCriterion("name_en like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotLike(String value) {
            addCriterion("name_en not like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnIn(List<String> values) {
            addCriterion("name_en in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotIn(List<String> values) {
            addCriterion("name_en not in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnBetween(String value1, String value2) {
            addCriterion("name_en between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotBetween(String value1, String value2) {
            addCriterion("name_en not between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameZhIsNull() {
            addCriterion("name_zh is null");
            return (Criteria) this;
        }

        public Criteria andNameZhIsNotNull() {
            addCriterion("name_zh is not null");
            return (Criteria) this;
        }

        public Criteria andNameZhEqualTo(String value) {
            addCriterion("name_zh =", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotEqualTo(String value) {
            addCriterion("name_zh <>", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhGreaterThan(String value) {
            addCriterion("name_zh >", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhGreaterThanOrEqualTo(String value) {
            addCriterion("name_zh >=", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhLessThan(String value) {
            addCriterion("name_zh <", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhLessThanOrEqualTo(String value) {
            addCriterion("name_zh <=", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhLike(String value) {
            addCriterion("name_zh like", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotLike(String value) {
            addCriterion("name_zh not like", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhIn(List<String> values) {
            addCriterion("name_zh in", values, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotIn(List<String> values) {
            addCriterion("name_zh not in", values, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhBetween(String value1, String value2) {
            addCriterion("name_zh between", value1, value2, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotBetween(String value1, String value2) {
            addCriterion("name_zh not between", value1, value2, "nameZh");
            return (Criteria) this;
        }

        public Criteria andRequestUrlIsNull() {
            addCriterion("request_url is null");
            return (Criteria) this;
        }

        public Criteria andRequestUrlIsNotNull() {
            addCriterion("request_url is not null");
            return (Criteria) this;
        }

        public Criteria andRequestUrlEqualTo(String value) {
            addCriterion("request_url =", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotEqualTo(String value) {
            addCriterion("request_url <>", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlGreaterThan(String value) {
            addCriterion("request_url >", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlGreaterThanOrEqualTo(String value) {
            addCriterion("request_url >=", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlLessThan(String value) {
            addCriterion("request_url <", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlLessThanOrEqualTo(String value) {
            addCriterion("request_url <=", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlLike(String value) {
            addCriterion("request_url like", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotLike(String value) {
            addCriterion("request_url not like", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlIn(List<String> values) {
            addCriterion("request_url in", values, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotIn(List<String> values) {
            addCriterion("request_url not in", values, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlBetween(String value1, String value2) {
            addCriterion("request_url between", value1, value2, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotBetween(String value1, String value2) {
            addCriterion("request_url not between", value1, value2, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderIsNull() {
            addCriterion("request_header is null");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderIsNotNull() {
            addCriterion("request_header is not null");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderEqualTo(String value) {
            addCriterion("request_header =", value, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderNotEqualTo(String value) {
            addCriterion("request_header <>", value, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderGreaterThan(String value) {
            addCriterion("request_header >", value, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderGreaterThanOrEqualTo(String value) {
            addCriterion("request_header >=", value, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderLessThan(String value) {
            addCriterion("request_header <", value, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderLessThanOrEqualTo(String value) {
            addCriterion("request_header <=", value, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderLike(String value) {
            addCriterion("request_header like", value, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderNotLike(String value) {
            addCriterion("request_header not like", value, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderIn(List<String> values) {
            addCriterion("request_header in", values, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderNotIn(List<String> values) {
            addCriterion("request_header not in", values, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderBetween(String value1, String value2) {
            addCriterion("request_header between", value1, value2, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestHeaderNotBetween(String value1, String value2) {
            addCriterion("request_header not between", value1, value2, "requestHeader");
            return (Criteria) this;
        }

        public Criteria andRequestParametersIsNull() {
            addCriterion("request_parameters is null");
            return (Criteria) this;
        }

        public Criteria andRequestParametersIsNotNull() {
            addCriterion("request_parameters is not null");
            return (Criteria) this;
        }

        public Criteria andRequestParametersEqualTo(String value) {
            addCriterion("request_parameters =", value, "requestParameters");
            return (Criteria) this;
        }

        public Criteria andRequestParametersNotEqualTo(String value) {
            addCriterion("request_parameters <>", value, "requestParameters");
            return (Criteria) this;
        }

        public Criteria andRequestParametersGreaterThan(String value) {
            addCriterion("request_parameters >", value, "requestParameters");
            return (Criteria) this;
        }

        public Criteria andRequestParametersGreaterThanOrEqualTo(String value) {
            addCriterion("request_parameters >=", value, "requestParameters");
            return (Criteria) this;
        }

        public Criteria andRequestParametersLessThan(String value) {
            addCriterion("request_parameters <", value, "requestParameters");
            return (Criteria) this;
        }

        public Criteria andRequestParametersLessThanOrEqualTo(String value) {
            addCriterion("request_parameters <=", value, "requestParameters");
            return (Criteria) this;
        }

        public Criteria andRequestParametersLike(String value) {
            addCriterion("request_parameters like", value, "requestParameters");
            return (Criteria) this;
        }

        public Criteria andRequestParametersNotLike(String value) {
            addCriterion("request_parameters not like", value, "requestParameters");
            return (Criteria) this;
        }

        public Criteria andRequestParametersIn(List<String> values) {
            addCriterion("request_parameters in", values, "requestParameters");
            return (Criteria) this;
        }

        public Criteria andRequestParametersNotIn(List<String> values) {
            addCriterion("request_parameters not in", values, "requestParameters");
            return (Criteria) this;
        }

        public Criteria andRequestParametersBetween(String value1, String value2) {
            addCriterion("request_parameters between", value1, value2, "requestParameters");
            return (Criteria) this;
        }

        public Criteria andRequestParametersNotBetween(String value1, String value2) {
            addCriterion("request_parameters not between", value1, value2, "requestParameters");
            return (Criteria) this;
        }

        public Criteria andLocalUrlIsNull() {
            addCriterion("local_url is null");
            return (Criteria) this;
        }

        public Criteria andLocalUrlIsNotNull() {
            addCriterion("local_url is not null");
            return (Criteria) this;
        }

        public Criteria andLocalUrlEqualTo(String value) {
            addCriterion("local_url =", value, "localUrl");
            return (Criteria) this;
        }

        public Criteria andLocalUrlNotEqualTo(String value) {
            addCriterion("local_url <>", value, "localUrl");
            return (Criteria) this;
        }

        public Criteria andLocalUrlGreaterThan(String value) {
            addCriterion("local_url >", value, "localUrl");
            return (Criteria) this;
        }

        public Criteria andLocalUrlGreaterThanOrEqualTo(String value) {
            addCriterion("local_url >=", value, "localUrl");
            return (Criteria) this;
        }

        public Criteria andLocalUrlLessThan(String value) {
            addCriterion("local_url <", value, "localUrl");
            return (Criteria) this;
        }

        public Criteria andLocalUrlLessThanOrEqualTo(String value) {
            addCriterion("local_url <=", value, "localUrl");
            return (Criteria) this;
        }

        public Criteria andLocalUrlLike(String value) {
            addCriterion("local_url like", value, "localUrl");
            return (Criteria) this;
        }

        public Criteria andLocalUrlNotLike(String value) {
            addCriterion("local_url not like", value, "localUrl");
            return (Criteria) this;
        }

        public Criteria andLocalUrlIn(List<String> values) {
            addCriterion("local_url in", values, "localUrl");
            return (Criteria) this;
        }

        public Criteria andLocalUrlNotIn(List<String> values) {
            addCriterion("local_url not in", values, "localUrl");
            return (Criteria) this;
        }

        public Criteria andLocalUrlBetween(String value1, String value2) {
            addCriterion("local_url between", value1, value2, "localUrl");
            return (Criteria) this;
        }

        public Criteria andLocalUrlNotBetween(String value1, String value2) {
            addCriterion("local_url not between", value1, value2, "localUrl");
            return (Criteria) this;
        }

        public Criteria andCheckUrlIsNull() {
            addCriterion("check_url is null");
            return (Criteria) this;
        }

        public Criteria andCheckUrlIsNotNull() {
            addCriterion("check_url is not null");
            return (Criteria) this;
        }

        public Criteria andCheckUrlEqualTo(String value) {
            addCriterion("check_url =", value, "checkUrl");
            return (Criteria) this;
        }

        public Criteria andCheckUrlNotEqualTo(String value) {
            addCriterion("check_url <>", value, "checkUrl");
            return (Criteria) this;
        }

        public Criteria andCheckUrlGreaterThan(String value) {
            addCriterion("check_url >", value, "checkUrl");
            return (Criteria) this;
        }

        public Criteria andCheckUrlGreaterThanOrEqualTo(String value) {
            addCriterion("check_url >=", value, "checkUrl");
            return (Criteria) this;
        }

        public Criteria andCheckUrlLessThan(String value) {
            addCriterion("check_url <", value, "checkUrl");
            return (Criteria) this;
        }

        public Criteria andCheckUrlLessThanOrEqualTo(String value) {
            addCriterion("check_url <=", value, "checkUrl");
            return (Criteria) this;
        }

        public Criteria andCheckUrlLike(String value) {
            addCriterion("check_url like", value, "checkUrl");
            return (Criteria) this;
        }

        public Criteria andCheckUrlNotLike(String value) {
            addCriterion("check_url not like", value, "checkUrl");
            return (Criteria) this;
        }

        public Criteria andCheckUrlIn(List<String> values) {
            addCriterion("check_url in", values, "checkUrl");
            return (Criteria) this;
        }

        public Criteria andCheckUrlNotIn(List<String> values) {
            addCriterion("check_url not in", values, "checkUrl");
            return (Criteria) this;
        }

        public Criteria andCheckUrlBetween(String value1, String value2) {
            addCriterion("check_url between", value1, value2, "checkUrl");
            return (Criteria) this;
        }

        public Criteria andCheckUrlNotBetween(String value1, String value2) {
            addCriterion("check_url not between", value1, value2, "checkUrl");
            return (Criteria) this;
        }
    }

    /**
     * foreign_interface
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * foreign_interface 2019-05-14
     */
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