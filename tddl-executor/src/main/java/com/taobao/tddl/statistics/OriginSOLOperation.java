package com.taobao.tddl.statistics;

import java.text.MessageFormat;

public class OriginSOLOperation extends AbstractSQLOperation {

    String                            sql;

    public final static MessageFormat message = new MessageFormat("Execute sql on {0}, sql is: {1}, params is: {2}");

    @Override
    public String getOperationString() {

        return message.format(new String[] { sql });

    }

    public OriginSOLOperation(String sql){
        super();
        this.sql = sql;
    }

    @Override
    public String getSqlOrResult() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    @Override
    public String getOperationType() {
        return "Origin SQL";
    }

}
