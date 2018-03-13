package com.litesuits.orm.db.enums;

public enum Strategy {
    ROLLBACK(" ROLLBACK "),
    ABORT(" ABORT "),
    FAIL(" FAIL "),
    IGNORE(" IGNORE "),
    REPLACE(" REPLACE ");

    public String sql;

    Strategy(String sql) {
        this.sql = sql;
    }

    public String getSql() {
        return sql;
    }
}