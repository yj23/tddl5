package com.taobao.config.zookeeper;

import com.taobao.tddl.common.exception.TddlException;
import com.taobao.tddl.common.utils.extension.Activate;
import com.taobao.tddl.config.impl.holder.AbstractConfigDataHolder;

import java.util.List;
import java.util.Map;

/**
 * Created by Eason on 16/3/21.
 */
@Activate(name = "zookeeper", order = 2)
public class ZookeeperConfigHolder extends AbstractConfigDataHolder {

    @Override
    public String getData(String dataId) {
        return super.getData(dataId);
    }

    @Override
    public Map<String, String> getData(List<String> dataIds) {
        return super.getData(dataIds);
    }

    @Override
    protected Map<String, String> queryAndHold(List<String> dataIds, String unitName) {
        return super.queryAndHold(dataIds, unitName);
    }

    @Override
    public void init() throws TddlException {

    }
}
