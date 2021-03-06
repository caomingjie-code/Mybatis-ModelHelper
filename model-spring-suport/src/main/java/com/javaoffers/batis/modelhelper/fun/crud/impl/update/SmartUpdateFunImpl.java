package com.javaoffers.batis.modelhelper.fun.crud.impl.update;

import com.javaoffers.batis.modelhelper.core.LinkedConditions;
import com.javaoffers.batis.modelhelper.fun.Condition;
import com.javaoffers.batis.modelhelper.fun.GetterFun;
import com.javaoffers.batis.modelhelper.fun.condition.ColValueCondition;
import com.javaoffers.batis.modelhelper.fun.condition.WhereConditionMark;
import com.javaoffers.batis.modelhelper.fun.condition.update.UpdateAllColValueCondition;
import com.javaoffers.batis.modelhelper.fun.condition.update.UpdateColValueCondition;
import com.javaoffers.batis.modelhelper.fun.condition.update.UpdateCondtionMark;
import com.javaoffers.batis.modelhelper.fun.crud.WhereModifyFun;
import com.javaoffers.batis.modelhelper.fun.crud.update.*;
import com.javaoffers.batis.modelhelper.utils.TableHelper;

import java.util.Collection;

/**
 * @author create by cmj on 2022-06-29
 */
public class SmartUpdateFunImpl<M, C extends GetterFun<M, Object>, V> implements SmartUpdateFun<M,C,V> {

    private Class<M> mClass;

    private String tableName;
    /**
     * 存放 查询字段
     */
    private LinkedConditions<Condition> conditions = new LinkedConditions<>();

    /**
     * 是否忽略null值，如果是null则不进行更新. true: update null.
     */
    private boolean isUpdateNull = true;

    /**
     * true : update null
     * @param value
     * @return
     */
    private boolean isUpdateNull(V value){
        if(!isUpdateNull){
            return value != null;
        }
        return true;
    }

    public SmartUpdateFunImpl(Class<M> mClass, boolean isUpdateNull) {
        this.mClass = mClass;
        this.isUpdateNull = isUpdateNull;
        this.tableName = TableHelper.getTableName(mClass);
        this.conditions.add(new UpdateCondtionMark(mClass));
    }

    public SmartUpdateFunImpl(Class<M> mClass,LinkedConditions<Condition> conditions, boolean isUpdateNull) {
        this.mClass = mClass;
        this.isUpdateNull = isUpdateNull;
        this.conditions = conditions;
        this.tableName = TableHelper.getTableName(mClass);
        this.conditions.add(new UpdateCondtionMark(mClass));
    }

    @Override
    public OneUpdateFun<M, C, V> col(C col, V value) {
        if(isUpdateNull(value)){
            this.conditions.add(new UpdateColValueCondition(col,value));
        }
        return this;
    }

    @Override
    public OneUpdateFun<M, C, V> col(boolean condition, C col, V value) {
        if(condition){
            col(col,value);
        }
        return this;
    }

    @Override
    public WhereModifyFun<M, V> where() {
        return new WhereModifyFunImpl<M, V>(conditions, mClass);
    }

    @Override
    public PrepareWhereModifyFun<M, C, V> colAll(M model) {
        this.conditions.add(new UpdateAllColValueCondition(isUpdateNull, mClass, model));
        return new PrepareWhereModifyFunImpl<M,C,V>(conditions, mClass);
    }

    @Override
    public PrepareWhereModifyFun<M, C, V> colAll(boolean condition, M model) {
        if(condition){
            colAll(model);
        }
        return new PrepareWhereModifyFunImpl<M,C,V>(conditions, mClass);
    }
}
