package com.ycq.ddshop.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillExample() {
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

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBnameIsNull() {
            addCriterion("bname is null");
            return (Criteria) this;
        }

        public Criteria andBnameIsNotNull() {
            addCriterion("bname is not null");
            return (Criteria) this;
        }

        public Criteria andBnameEqualTo(String value) {
            addCriterion("bname =", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotEqualTo(String value) {
            addCriterion("bname <>", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThan(String value) {
            addCriterion("bname >", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThanOrEqualTo(String value) {
            addCriterion("bname >=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThan(String value) {
            addCriterion("bname <", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThanOrEqualTo(String value) {
            addCriterion("bname <=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLike(String value) {
            addCriterion("bname like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotLike(String value) {
            addCriterion("bname not like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameIn(List<String> values) {
            addCriterion("bname in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotIn(List<String> values) {
            addCriterion("bname not in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameBetween(String value1, String value2) {
            addCriterion("bname between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotBetween(String value1, String value2) {
            addCriterion("bname not between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBnumberIsNull() {
            addCriterion("bnumber is null");
            return (Criteria) this;
        }

        public Criteria andBnumberIsNotNull() {
            addCriterion("bnumber is not null");
            return (Criteria) this;
        }

        public Criteria andBnumberEqualTo(Integer value) {
            addCriterion("bnumber =", value, "bnumber");
            return (Criteria) this;
        }

        public Criteria andBnumberNotEqualTo(Integer value) {
            addCriterion("bnumber <>", value, "bnumber");
            return (Criteria) this;
        }

        public Criteria andBnumberGreaterThan(Integer value) {
            addCriterion("bnumber >", value, "bnumber");
            return (Criteria) this;
        }

        public Criteria andBnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("bnumber >=", value, "bnumber");
            return (Criteria) this;
        }

        public Criteria andBnumberLessThan(Integer value) {
            addCriterion("bnumber <", value, "bnumber");
            return (Criteria) this;
        }

        public Criteria andBnumberLessThanOrEqualTo(Integer value) {
            addCriterion("bnumber <=", value, "bnumber");
            return (Criteria) this;
        }

        public Criteria andBnumberIn(List<Integer> values) {
            addCriterion("bnumber in", values, "bnumber");
            return (Criteria) this;
        }

        public Criteria andBnumberNotIn(List<Integer> values) {
            addCriterion("bnumber not in", values, "bnumber");
            return (Criteria) this;
        }

        public Criteria andBnumberBetween(Integer value1, Integer value2) {
            addCriterion("bnumber between", value1, value2, "bnumber");
            return (Criteria) this;
        }

        public Criteria andBnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("bnumber not between", value1, value2, "bnumber");
            return (Criteria) this;
        }

        public Criteria andBmoneyIsNull() {
            addCriterion("bmoney is null");
            return (Criteria) this;
        }

        public Criteria andBmoneyIsNotNull() {
            addCriterion("bmoney is not null");
            return (Criteria) this;
        }

        public Criteria andBmoneyEqualTo(String value) {
            addCriterion("bmoney =", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyNotEqualTo(String value) {
            addCriterion("bmoney <>", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyGreaterThan(String value) {
            addCriterion("bmoney >", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("bmoney >=", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyLessThan(String value) {
            addCriterion("bmoney <", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyLessThanOrEqualTo(String value) {
            addCriterion("bmoney <=", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyLike(String value) {
            addCriterion("bmoney like", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyNotLike(String value) {
            addCriterion("bmoney not like", value, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyIn(List<String> values) {
            addCriterion("bmoney in", values, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyNotIn(List<String> values) {
            addCriterion("bmoney not in", values, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyBetween(String value1, String value2) {
            addCriterion("bmoney between", value1, value2, "bmoney");
            return (Criteria) this;
        }

        public Criteria andBmoneyNotBetween(String value1, String value2) {
            addCriterion("bmoney not between", value1, value2, "bmoney");
            return (Criteria) this;
        }

        public Criteria andPayIsNull() {
            addCriterion("pay is null");
            return (Criteria) this;
        }

        public Criteria andPayIsNotNull() {
            addCriterion("pay is not null");
            return (Criteria) this;
        }

        public Criteria andPayEqualTo(Integer value) {
            addCriterion("pay =", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotEqualTo(Integer value) {
            addCriterion("pay <>", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThan(Integer value) {
            addCriterion("pay >", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay >=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThan(Integer value) {
            addCriterion("pay <", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThanOrEqualTo(Integer value) {
            addCriterion("pay <=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayIn(List<Integer> values) {
            addCriterion("pay in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotIn(List<Integer> values) {
            addCriterion("pay not in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayBetween(Integer value1, Integer value2) {
            addCriterion("pay between", value1, value2, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotBetween(Integer value1, Integer value2) {
            addCriterion("pay not between", value1, value2, "pay");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("Supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("Supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("Supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("Supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("Supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("Supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("Supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("Supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("Supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("Supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("Supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("Supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("Supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("Supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andDescribIsNull() {
            addCriterion("describ is null");
            return (Criteria) this;
        }

        public Criteria andDescribIsNotNull() {
            addCriterion("describ is not null");
            return (Criteria) this;
        }

        public Criteria andDescribEqualTo(String value) {
            addCriterion("describ =", value, "describ");
            return (Criteria) this;
        }

        public Criteria andDescribNotEqualTo(String value) {
            addCriterion("describ <>", value, "describ");
            return (Criteria) this;
        }

        public Criteria andDescribGreaterThan(String value) {
            addCriterion("describ >", value, "describ");
            return (Criteria) this;
        }

        public Criteria andDescribGreaterThanOrEqualTo(String value) {
            addCriterion("describ >=", value, "describ");
            return (Criteria) this;
        }

        public Criteria andDescribLessThan(String value) {
            addCriterion("describ <", value, "describ");
            return (Criteria) this;
        }

        public Criteria andDescribLessThanOrEqualTo(String value) {
            addCriterion("describ <=", value, "describ");
            return (Criteria) this;
        }

        public Criteria andDescribLike(String value) {
            addCriterion("describ like", value, "describ");
            return (Criteria) this;
        }

        public Criteria andDescribNotLike(String value) {
            addCriterion("describ not like", value, "describ");
            return (Criteria) this;
        }

        public Criteria andDescribIn(List<String> values) {
            addCriterion("describ in", values, "describ");
            return (Criteria) this;
        }

        public Criteria andDescribNotIn(List<String> values) {
            addCriterion("describ not in", values, "describ");
            return (Criteria) this;
        }

        public Criteria andDescribBetween(String value1, String value2) {
            addCriterion("describ between", value1, value2, "describ");
            return (Criteria) this;
        }

        public Criteria andDescribNotBetween(String value1, String value2) {
            addCriterion("describ not between", value1, value2, "describ");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
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