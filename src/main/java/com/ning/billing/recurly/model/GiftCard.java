/*
 * Copyright 2010-2014 Ning, Inc.
 * Copyright 2014-2015 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.billing.recurly.model;

import org.joda.time.DateTime;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Class that represents a gift card in the Recurly API.
 */
@XmlRootElement(name = "gift_card")
public class GiftCard extends RecurlyObject {

    @XmlElement(name = "product_code")
    private String productCode;

    @XmlElement(name = "currency")
    private String currency;

    @XmlElement(name = "id")
    private Long id;

    @XmlElement(name = "redemption_code")
    private String redemptionCode;

    @XmlElement(name = "unit_amount_in_cents")
    private Integer unitAmountInCents;

    @XmlElement(name = "balance_in_cents")
    private Integer balanceInCents;

    @XmlElement(name = "gifter_account")
    private Account gifterAccount;

    @XmlElement(name = "delivery")
    private Delivery delivery;

    @XmlElement(name = "created_at")
    private DateTime createdAt;

    @XmlElement(name = "updated_at")
    private DateTime updatedAt;

    @XmlElement(name = "redeemed_at")
    private DateTime redeemedAt;

    @XmlElement(name = "delivered_at")
    private DateTime deliveredAt;

    @XmlElement(name = "canceled_at")
    private DateTime canceledAt;

    public Long getId() {
        return id;
    }

    public void setId(final Object id) { this.id = longOrNull(id); }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(final Object productCode) {
        this.productCode = stringOrNull(productCode);
    }

    public String getRedemptionCode() {
        return redemptionCode;
    }

    public void setRedemptionCode(final Object redemptionCode) {
        this.redemptionCode = stringOrNull(redemptionCode);
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(final Object currency) {
        this.currency = stringOrNull(currency);
    }

    public Delivery getDelivery() { return delivery; }

    public void setDelivery(final Delivery delivery) {
        this.delivery = delivery;
    }

    public Account getGifterAccount() { return gifterAccount; }

    public void setGifterAccount(final Account gifterAccount) {
        this.gifterAccount = gifterAccount;
    }

    public Integer getUnitAmountInCents() { return unitAmountInCents; }

    public void setUnitAmountInCents(final Object unitAmountInCents) {
        this.unitAmountInCents = integerOrNull(unitAmountInCents);
    }

    public Integer getBalanceInCents() { return balanceInCents; }

    public void setBalanceInCents(final Object balanceInCents) {
        this.balanceInCents = integerOrNull(balanceInCents);
    }

    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(final Object createdAt) {
        this.createdAt = dateTimeOrNull(createdAt);
    }

    public DateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(final Object updatedAt) {
        this.updatedAt = dateTimeOrNull(updatedAt);
    }

    public DateTime getRedeemedAt() {
        return redeemedAt;
    }

    public void setRedeemedAt(final Object redeemedAt) {
        this.redeemedAt = dateTimeOrNull(redeemedAt);
    }

    public DateTime getDeliveredAt() {
        return deliveredAt;
    }

    public void setDeliveredAt(final Object deliveredAt) {
        this.deliveredAt = dateTimeOrNull(deliveredAt);
    }

    public DateTime getCanceledAt() {
        return canceledAt;
    }

    public void setCanceledAt(final Object canceledAt) {
        this.canceledAt = dateTimeOrNull(canceledAt);
    }

}
