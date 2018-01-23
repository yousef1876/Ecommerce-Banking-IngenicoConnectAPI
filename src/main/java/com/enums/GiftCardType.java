package com.enums;

public enum GiftCardType {


    CelebrateFall("Celebrate_Fall"),Grandparents("Grandparents"),Independence("Independence"),
    Anniversary("Anniversary"),Birthday("Birthday"),Congratulations("Congratulations"),AprilFoolsDay("AprilFoolsDay"),
    FathersDay("FathersDay"),Graduation("Graduation "),Holiday("Holiday"),SeasonsGreeting("SeasonsGreeting"),Passover("Passover"),
    Kwanzaa("Kwanzaa"),Halloween("Halloween"),MothersDay("MothersDay"),NewYearsDay("NewYearsDay"),BossesDay("BossesDay"),
    StPatricksDay("StPatricksDay"),SweetestDay("SweetestDay"),Christmas("Christmas"),BabyShower("BabyShower"),ThanksGiving("ThanksGiving"),
    Other("Other"),ValentinesDay("ValentinesDay"),Wedding("Wedding"),SecretarysDay("SecretarysDay"),ChineseNewYear("ChineseNewYear"),Hanukkah("Hanukkah");

    private String url;

    GiftCardType(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
