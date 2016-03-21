package com.taobao.config.zookeeper;

import com.taobao.tddl.common.utils.extension.Activate;
import com.taobao.tddl.config.ConfigDataListener;
import com.taobao.tddl.config.impl.UnitConfigDataHandler;

import java.util.List;
import java.util.concurrent.Executor;

/**
 * Created by Eason on 16/3/21.
 */
@Activate(name = "zookeeper", order = 2)
public class ZookeeperConfigDataHandler extends UnitConfigDataHandler {
    @Override
    public String getData(long timeout, String strategy) {
        return null;
    }

    @Override
    public String getNullableData(long timeout, String strategy) {
        return null;
    }

    @Override
    public void addListener(ConfigDataListener configDataListener, Executor executor) {

    }

    @Override
    public void addListeners(List<ConfigDataListener> configDataListenerList, Executor executor) {

    }
}
