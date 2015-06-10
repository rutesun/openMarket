package com.intellicode.openMarket.vo;

import java.util.List;

/**
 * Created by rutes_000 on 2015-06-10.
 */
public class StatusList extends Status {
    private List<?> results;

    public StatusList(String status) {
        super(status);
    }

    public StatusList(String status, List<?> results) {
        super(status);
        this.results = results;
    }

    public List<?> getResults() {
        return results;
    }

    public StatusList setResults(List<?> results) {
        this.results = results;
        return this;
    }
}
