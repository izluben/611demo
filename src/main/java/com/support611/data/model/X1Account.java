/* ===========================================================================
 * Copyright (c) 2018 Comcast Corp. All rights reserved.
 * ===========================================================================
 *
 * Author: Stanislav Menshykov
 * Created: 01/19/2018  2:52 PM
 */
package com.support611.data.model;

public class X1Account {
    private long id;
    private String accountNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof X1Account)) return false;

        X1Account x1Account = (X1Account) o;

        return accountNumber != null ? accountNumber.equals(x1Account.accountNumber) : x1Account.accountNumber == null;
    }

    @Override
    public int hashCode() {
        return accountNumber != null ? accountNumber.hashCode() : 0;
    }
}
