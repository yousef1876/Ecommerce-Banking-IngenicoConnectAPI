package com.enums;


public enum TransitionRole {

    TransitionTeamLeader("TransitionTeamLeader"),
    ProjectLeader("ProjectLeader"),
    TransitionSpecialist("TransitionSpecialist"),
    ProjectTeam("ProjectTeam"),
    DatabaseAdministrator("DatabaseAdministrator"),
    SystemNetworking("SystemNetworking"),
    ProductionSupport("ProductionSupport"),
    DesktopSupport("DesktopSupport"),
    HELPDesk("HELPDesk"),
    PlatformSupport("PlatformSupport"),
    ProjectDevelopment("ProjectDevelopment");

    private String url;

    TransitionRole(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }



}
