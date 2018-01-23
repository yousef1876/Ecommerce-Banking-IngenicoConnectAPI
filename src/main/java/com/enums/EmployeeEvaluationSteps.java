package com.enums;

public enum EmployeeEvaluationSteps {

    FirstHalf("1"),
    GenerateLeads("GenerateLeads"),
    CustomerRetention("CustomerRetention"),
    WebsiteBrand("WebsiteBrand"),
    SEOTraffic("SEOTraffic"),
    SecondHalf("2"),
    InsertObjective("InsertObjective"),
    InsertObjective_1("InsertObjective"),
    InsertObjective_2("InsertObjective"),
    OTHERASSESSMENT("3"),
    PlanningAndProblemSolving("SolvingProblems"),
    Productivity("productivity"),
    CommunicationSkills("CommunicationSkills"),
    TeamWork("TeamWork"),
    ManagementSkills("ManagementSkills"),
    EmployeeSelfAssessment("4"),

    PerformanceCompetences("Improvements"),
    AreaOfGrowthOfImprovement("Improvements"),

    AssessmentManagementSkills("5"),
    PerformanceManagement("PerformanceManagement"),
    EmployeeDevelopment("EmployeeDevelopment"),
    ResourceUtilization("ResourceUtilization"),
    LeaderShips("LeaderShips");



    private String url;

    EmployeeEvaluationSteps(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }


}
