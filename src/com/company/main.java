package com.company;

import java.io.FileInputStream;

public class main {
    //write your code here
    public static void main(String[] args) {
        SolarSystem FactorX=new SolarSystem();
        FactorX.sun="1";
        FactorX.moon="4";
        FactorX.planet="2";
        FactorX.stars="10000";

        //adding feature to our sun
        FeatureSun Xfact=new FeatureSun();
        Xfact.color="Green";
        Xfact.radius="100000000km";
        Xfact.heat="301451245452454kj";

    }
}


