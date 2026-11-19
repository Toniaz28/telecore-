package com.telecore.subscriber.model;

public class Subscriber {
   public String firstName;
    public String lastName;
    public String msisdn;
    public String imsi;
    public String status;


    public String describe() {
        return "firstName:" + " " + firstName +  " " + "lastName: " + " " +
                lastName + " " + "Number: " + " " + msisdn + " " + "imsi: " + imsi + " " + "status: " + " " + status;
    }
}

