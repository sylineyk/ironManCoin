package com.titan.dao.bean;

import java.util.ArrayList;
import java.util.List;

public class XvgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XvgExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPriceBtcIsNull() {
            addCriterion("price_btc is null");
            return (Criteria) this;
        }

        public Criteria andPriceBtcIsNotNull() {
            addCriterion("price_btc is not null");
            return (Criteria) this;
        }

        public Criteria andPriceBtcEqualTo(String value) {
            addCriterion("price_btc =", value, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceBtcNotEqualTo(String value) {
            addCriterion("price_btc <>", value, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceBtcGreaterThan(String value) {
            addCriterion("price_btc >", value, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceBtcGreaterThanOrEqualTo(String value) {
            addCriterion("price_btc >=", value, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceBtcLessThan(String value) {
            addCriterion("price_btc <", value, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceBtcLessThanOrEqualTo(String value) {
            addCriterion("price_btc <=", value, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceBtcLike(String value) {
            addCriterion("price_btc like", value, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceBtcNotLike(String value) {
            addCriterion("price_btc not like", value, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceBtcIn(List<String> values) {
            addCriterion("price_btc in", values, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceBtcNotIn(List<String> values) {
            addCriterion("price_btc not in", values, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceBtcBetween(String value1, String value2) {
            addCriterion("price_btc between", value1, value2, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceBtcNotBetween(String value1, String value2) {
            addCriterion("price_btc not between", value1, value2, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceRmbIsNull() {
            addCriterion("price_rmb is null");
            return (Criteria) this;
        }

        public Criteria andPriceRmbIsNotNull() {
            addCriterion("price_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andPriceRmbEqualTo(String value) {
            addCriterion("price_rmb =", value, "priceRmb");
            return (Criteria) this;
        }

        public Criteria andPriceRmbNotEqualTo(String value) {
            addCriterion("price_rmb <>", value, "priceRmb");
            return (Criteria) this;
        }

        public Criteria andPriceRmbGreaterThan(String value) {
            addCriterion("price_rmb >", value, "priceRmb");
            return (Criteria) this;
        }

        public Criteria andPriceRmbGreaterThanOrEqualTo(String value) {
            addCriterion("price_rmb >=", value, "priceRmb");
            return (Criteria) this;
        }

        public Criteria andPriceRmbLessThan(String value) {
            addCriterion("price_rmb <", value, "priceRmb");
            return (Criteria) this;
        }

        public Criteria andPriceRmbLessThanOrEqualTo(String value) {
            addCriterion("price_rmb <=", value, "priceRmb");
            return (Criteria) this;
        }

        public Criteria andPriceRmbLike(String value) {
            addCriterion("price_rmb like", value, "priceRmb");
            return (Criteria) this;
        }

        public Criteria andPriceRmbNotLike(String value) {
            addCriterion("price_rmb not like", value, "priceRmb");
            return (Criteria) this;
        }

        public Criteria andPriceRmbIn(List<String> values) {
            addCriterion("price_rmb in", values, "priceRmb");
            return (Criteria) this;
        }

        public Criteria andPriceRmbNotIn(List<String> values) {
            addCriterion("price_rmb not in", values, "priceRmb");
            return (Criteria) this;
        }

        public Criteria andPriceRmbBetween(String value1, String value2) {
            addCriterion("price_rmb between", value1, value2, "priceRmb");
            return (Criteria) this;
        }

        public Criteria andPriceRmbNotBetween(String value1, String value2) {
            addCriterion("price_rmb not between", value1, value2, "priceRmb");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(String value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(String value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(String value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(String value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(String value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLike(String value) {
            addCriterion("quantity like", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotLike(String value) {
            addCriterion("quantity not like", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<String> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<String> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(String value1, String value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(String value1, String value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
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

        public Criteria andTimeEqualTo(Long value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Long value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Long value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Long value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Long value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Long> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Long> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Long value1, Long value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Long value1, Long value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("trade_type is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("trade_type is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(String value) {
            addCriterion("trade_type =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(String value) {
            addCriterion("trade_type <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(String value) {
            addCriterion("trade_type >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("trade_type >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(String value) {
            addCriterion("trade_type <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(String value) {
            addCriterion("trade_type <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLike(String value) {
            addCriterion("trade_type like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotLike(String value) {
            addCriterion("trade_type not like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<String> values) {
            addCriterion("trade_type in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<String> values) {
            addCriterion("trade_type not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(String value1, String value2) {
            addCriterion("trade_type between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(String value1, String value2) {
            addCriterion("trade_type not between", value1, value2, "tradeType");
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