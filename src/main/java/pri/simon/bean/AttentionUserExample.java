package pri.simon.bean;

import java.util.ArrayList;
import java.util.List;

public class AttentionUserExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table attention_user
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table attention_user
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table attention_user
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention_user
     *
     * @mbg.generated
     */
    public AttentionUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention_user
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention_user
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention_user
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention_user
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention_user
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention_user
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention_user
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention_user
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention_user
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attention_user
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table attention_user
     *
     * @mbg.generated
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserTagIdIsNull() {
            addCriterion("user_tag_id is null");
            return (Criteria) this;
        }

        public Criteria andUserTagIdIsNotNull() {
            addCriterion("user_tag_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserTagIdEqualTo(Integer value) {
            addCriterion("user_tag_id =", value, "userTagId");
            return (Criteria) this;
        }

        public Criteria andUserTagIdNotEqualTo(Integer value) {
            addCriterion("user_tag_id <>", value, "userTagId");
            return (Criteria) this;
        }

        public Criteria andUserTagIdGreaterThan(Integer value) {
            addCriterion("user_tag_id >", value, "userTagId");
            return (Criteria) this;
        }

        public Criteria andUserTagIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_tag_id >=", value, "userTagId");
            return (Criteria) this;
        }

        public Criteria andUserTagIdLessThan(Integer value) {
            addCriterion("user_tag_id <", value, "userTagId");
            return (Criteria) this;
        }

        public Criteria andUserTagIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_tag_id <=", value, "userTagId");
            return (Criteria) this;
        }

        public Criteria andUserTagIdIn(List<Integer> values) {
            addCriterion("user_tag_id in", values, "userTagId");
            return (Criteria) this;
        }

        public Criteria andUserTagIdNotIn(List<Integer> values) {
            addCriterion("user_tag_id not in", values, "userTagId");
            return (Criteria) this;
        }

        public Criteria andUserTagIdBetween(Integer value1, Integer value2) {
            addCriterion("user_tag_id between", value1, value2, "userTagId");
            return (Criteria) this;
        }

        public Criteria andUserTagIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_tag_id not between", value1, value2, "userTagId");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdIsNull() {
            addCriterion("attention_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdIsNotNull() {
            addCriterion("attention_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdEqualTo(Integer value) {
            addCriterion("attention_user_id =", value, "attentionUserId");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdNotEqualTo(Integer value) {
            addCriterion("attention_user_id <>", value, "attentionUserId");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdGreaterThan(Integer value) {
            addCriterion("attention_user_id >", value, "attentionUserId");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attention_user_id >=", value, "attentionUserId");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdLessThan(Integer value) {
            addCriterion("attention_user_id <", value, "attentionUserId");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("attention_user_id <=", value, "attentionUserId");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdIn(List<Integer> values) {
            addCriterion("attention_user_id in", values, "attentionUserId");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdNotIn(List<Integer> values) {
            addCriterion("attention_user_id not in", values, "attentionUserId");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdBetween(Integer value1, Integer value2) {
            addCriterion("attention_user_id between", value1, value2, "attentionUserId");
            return (Criteria) this;
        }

        public Criteria andAttentionUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("attention_user_id not between", value1, value2, "attentionUserId");
            return (Criteria) this;
        }

        public Criteria andIfAttentionIsNull() {
            addCriterion("if_attention is null");
            return (Criteria) this;
        }

        public Criteria andIfAttentionIsNotNull() {
            addCriterion("if_attention is not null");
            return (Criteria) this;
        }

        public Criteria andIfAttentionEqualTo(Integer value) {
            addCriterion("if_attention =", value, "ifAttention");
            return (Criteria) this;
        }

        public Criteria andIfAttentionNotEqualTo(Integer value) {
            addCriterion("if_attention <>", value, "ifAttention");
            return (Criteria) this;
        }

        public Criteria andIfAttentionGreaterThan(Integer value) {
            addCriterion("if_attention >", value, "ifAttention");
            return (Criteria) this;
        }

        public Criteria andIfAttentionGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_attention >=", value, "ifAttention");
            return (Criteria) this;
        }

        public Criteria andIfAttentionLessThan(Integer value) {
            addCriterion("if_attention <", value, "ifAttention");
            return (Criteria) this;
        }

        public Criteria andIfAttentionLessThanOrEqualTo(Integer value) {
            addCriterion("if_attention <=", value, "ifAttention");
            return (Criteria) this;
        }

        public Criteria andIfAttentionIn(List<Integer> values) {
            addCriterion("if_attention in", values, "ifAttention");
            return (Criteria) this;
        }

        public Criteria andIfAttentionNotIn(List<Integer> values) {
            addCriterion("if_attention not in", values, "ifAttention");
            return (Criteria) this;
        }

        public Criteria andIfAttentionBetween(Integer value1, Integer value2) {
            addCriterion("if_attention between", value1, value2, "ifAttention");
            return (Criteria) this;
        }

        public Criteria andIfAttentionNotBetween(Integer value1, Integer value2) {
            addCriterion("if_attention not between", value1, value2, "ifAttention");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table attention_user
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table attention_user
     *
     * @mbg.generated
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