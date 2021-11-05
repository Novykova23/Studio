package com.company.person;

public final class Customer extends Person {
    private static String givenName;
    private static String familyName;

    public Customer() {
        super(givenName);
    }

    public Customer(String mr, String proper) {
        this();
    }

    @Override
    public String getGivenName() {
        return super.getGivenName();
    }

    public static void setGivenName(String givenName) {
        Customer.givenName = givenName;
    }

    @Override
    public String getFamilyName() {
        return super.getFamilyName();
    }

    public static void setFamilyName(String familyName) {
        Customer.familyName = familyName;
    }

    @Override
    public long getAge() {
        return super.getAge();
    }
}

