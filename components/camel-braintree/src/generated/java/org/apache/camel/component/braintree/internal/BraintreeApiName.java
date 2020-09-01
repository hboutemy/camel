
/*
 * Camel ApiName Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree.internal;

import org.apache.camel.support.component.ApiName;

/**
 * Camel {@link ApiName} Enumeration for Component Braintree
 */
public enum BraintreeApiName implements ApiName {

    ADDON("addOn"),

    ADDRESS("address"),

    CLIENTTOKEN("clientToken"),

    CREDITCARDVERIFICATION("creditCardVerification"),

    CUSTOMER("customer"),

    DISCOUNT("discount"),

    DISPUTE("dispute"),

    DOCUMENTUPLOAD("documentUpload"),

    MERCHANTACCOUNT("merchantAccount"),

    PAYMENTMETHOD("paymentMethod"),

    PAYMENTMETHODNONCE("paymentMethodNonce"),

    PLAN("plan"),

    REPORT("report"),

    SETTLEMENTBATCHSUMMARY("settlementBatchSummary"),

    SUBSCRIPTION("subscription"),

    TRANSACTION("transaction"),

    WEBHOOKNOTIFICATION("webhookNotification");


    private static final BraintreeApiName[] VALUES = values();
    
    private final String name;

    private BraintreeApiName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static BraintreeApiName fromValue(String value) throws IllegalArgumentException {
        for (int i = 0; i < VALUES.length; i++) {
            if (VALUES[i].name.equals(value)) {
                return VALUES[i];
            }
        }
        throw new IllegalArgumentException("Invalid value " + value);
    }
}
