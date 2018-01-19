/* ===========================================================================
 * Copyright (c) 2018 Comcast Corp. All rights reserved.
 * ===========================================================================
 *
 * Author: Stanislav Menshykov
 * Created: 01/19/2018  2:38 PM
 */
package com.support611.data.model;

import java.util.List;

public class UserAccount {
    private long id;
    private String name;
    private List<X1Account> x1Accounts;
    private String vipStatus;
    private String supportDeskId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<X1Account> getX1Accounts() {
        return x1Accounts;
    }

    public void setX1Accounts(List<X1Account> x1Accounts) {
        this.x1Accounts = x1Accounts;
    }

    public String getVipStatus() {
        return vipStatus;
    }

    public void setVipStatus(String vipStatus) {
        this.vipStatus = vipStatus;
    }

    public String getSupportDeskId() {
        return supportDeskId;
    }

    public void setSupportDeskId(String supportDeskId) {
        this.supportDeskId = supportDeskId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserAccount)) return false;

        UserAccount that = (UserAccount) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (x1Accounts != null ? !x1Accounts.equals(that.x1Accounts) : that.x1Accounts != null) return false;
        if (vipStatus != null ? !vipStatus.equals(that.vipStatus) : that.vipStatus != null) return false;
        return supportDeskId != null ? supportDeskId.equals(that.supportDeskId) : that.supportDeskId == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (x1Accounts != null ? x1Accounts.hashCode() : 0);
        result = 31 * result + (vipStatus != null ? vipStatus.hashCode() : 0);
        result = 31 * result + (supportDeskId != null ? supportDeskId.hashCode() : 0);
        return result;
    }
}
