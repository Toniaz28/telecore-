package com.telecore.scratch;

import com.telecore.subscriber.model.Subscriber;

public class SubscriberDemo {
    public static void main(String[] args) {
        Subscriber s1 = new Subscriber();
        Subscriber s2 = new Subscriber();
        Subscriber s3 = new Subscriber();


        s1.firstName = "Chiamaka";
        s1.lastName = "Okeke";
        s1.msisdn = "08165721569";
        s1.imsi = "2346028165721569";
        s1.status = "REGISTERED";




        s2.firstName = "Tina";
        s2.lastName = "Kunle";
        s2.msisdn = "08035721869";
        s2.imsi = "0236028165721569";
        s2.status = "VALID";

        s3.firstName = "Abidemi";
        s3.lastName = "Babs";
        s3.msisdn = "671033706864";
        s3.imsi = "6403578190724569";
        s3.status = "ACTIVE";


    System.out.println(s1.describe());
    System.out.println(s2.describe());
    System.out.println(s3.describe());
    }
}
