package com.briup.bean;

import java.io.Serializable;

public class SProductWithBLOBs extends SProduct implements Serializable {
    private String parameter;

    private String introduction;

    private String wraplist;

    private static final long serialVersionUID = 1L;

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter == null ? null : parameter.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getWraplist() {
        return wraplist;
    }

    public void setWraplist(String wraplist) {
        this.wraplist = wraplist == null ? null : wraplist.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", parameter=").append(parameter);
        sb.append(", introduction=").append(introduction);
        sb.append(", wraplist=").append(wraplist);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}