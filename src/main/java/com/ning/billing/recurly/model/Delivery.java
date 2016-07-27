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
 * Class that represents Delivery details in the Recurly API.
 */
@XmlRootElement(name = "delivery")
public class Delivery extends RecurlyObject {

    /**
     * An enum representing the different
     * delivery methods
     */
    public enum Method {
        EMAIL("email"),
        POST("post");

        private final String type;

        private Method(final String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    @XmlElement(name = "address")
    private Address address;

    @XmlElement(name = "method")
    private Method method;

    @XmlElement(name = "email_address")
    private String emailAddress;

    @XmlElement(name = "first_name")
    private String firstName;

    @XmlElement(name = "last_name")
    private String lastName;

    @XmlElement(name = "gifter_name")
    private String gifterName;

    @XmlElement(name = "personal_message")
    private String personalMessage;

    @XmlElement(name = "deliver_at")
    private DateTime deliverAt;

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(final Object emailAddress) {
        this.emailAddress = stringOrNull(emailAddress);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final Object firstName) {
        this.firstName = stringOrNull(firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final Object lastName) {
        this.lastName = stringOrNull(lastName);
    }

    public String getGifterName() {
        return gifterName;
    }

    public void setGifterName(final Object gifterName) {
        this.gifterName= stringOrNull(gifterName);
    }

    public String getPersonalMessage() { return personalMessage; }

    public void setPersonalMessage(final Object personalMessage) {
        this.personalMessage = stringOrNull(personalMessage);
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(final String method) {
        this.method = Method.valueOf(method.toUpperCase());
    }

    public DateTime getDeliverAt() {
        return deliverAt;
    }

    public void setDeliverAt(final Object deliverAt) {
        this.deliverAt = dateTimeOrNull(deliverAt);
    }
}
