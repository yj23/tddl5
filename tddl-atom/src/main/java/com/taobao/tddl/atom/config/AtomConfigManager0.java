package com.taobao.tddl.atom.config;

import com.taobao.tddl.atom.common.TAtomConstants;
import com.taobao.tddl.common.exception.TddlException;
import com.taobao.tddl.config.ConfigDataListener;

/**
 * 配置管理中心，zookeeper的实现
 * Created by Eason on 16/3/21.
 */
public class AtomConfigManager0 implements DbConfManager {

    private final String                            globalConfigDataId;
    private final String                            appConfigDataId;
    private final String                            unitName;

    private final String                            dbKey;
    private final String                            appName;

    public AtomConfigManager0(String dbKey, String appName, String unitName) {
        this.dbKey = dbKey;
        this.appName = appName;
        this.unitName = unitName;
        globalConfigDataId = TAtomConstants.getGlobalDataId(dbKey);
        this.appConfigDataId = TAtomConstants.getAppDataId(appName, dbKey);

        init();
    }

    private void init() {

    }

    @Override
    public String getGlobalDbConf() {
        return null;
    }

    @Override
    public String getAppDbDbConf() {
        return null;
    }

    @Override
    public void registerGlobalDbConfListener(ConfigDataListener Listener) {

    }

    @Override
    public void registerAppDbConfListener(ConfigDataListener Listener) {

    }

    @Override
    public void stopDbConfManager() throws TddlException {

    }
}
