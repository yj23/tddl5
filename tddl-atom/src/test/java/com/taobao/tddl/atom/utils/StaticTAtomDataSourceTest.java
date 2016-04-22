package com.taobao.tddl.atom.utils;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.taobao.tddl.atom.StaticTAtomDataSource;

public class StaticTAtomDataSourceTest {

    @Test
    public void createStaticTAtomDataSource() throws Exception {
        StaticTAtomDataSource dataSource = new StaticTAtomDataSource();
        dataSource.setIp("172.16.1.72");
        dataSource.setPort("3306");
        dataSource.setDbName("test");
        dataSource.setDbType("mysql");
        dataSource.setUserName("root");
        dataSource.setPasswd("pmj8wd24rspM");
        dataSource.setMinPoolSize(1);
        dataSource.setMaxPoolSize(2);
        // 初始化
        dataSource.init();
        JdbcTemplate jtp = new JdbcTemplate();
        jtp.setDataSource(dataSource);
        int actual = jtp.queryForInt("select 1 from dual");
        Assert.assertEquals(actual, 1);
        dataSource.destroyDataSource();
    }
}
