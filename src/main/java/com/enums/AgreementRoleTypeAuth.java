package com.enums;

public enum AgreementRoleTypeAuth {

    Sales("Sales"),
    Purchase("purchase"),
    Product("product"),Employment("employment"),
    Bill_To_Customer("Bill_To_Customer"),
    Bulk_Customer("Bill_To_Customer"),
    End_User_Customer("End_User_Customer"),
    Placing_Customer("Placing_Customer"),
    Ship_To_Customer("Ship_To_Customer"),
    Account("Account"),
    Account_Lead("Account_Lead"),
    Accountant_Addressee("Accountant_Addressee"),
    Administrator_Affiliate("Administrator_Affiliate"),
    Agent_Approval("Agent_Approval"),
    Association("Association"),
    Automated_Agent("Automated_Agent"),
    Bill_From_Vendor("Bill_From_Vendor"),
    Blind_Copy("Blind_Copy"),
    Buyer_Calendar("Buyer_Calendar"),
    Calendar_Attendee(""),
    Calendar_Delegate("Calendar_Delegate"),
    Calendar_Host("Calendar_Host"),
    Calendar_Member("Calendar_Member"),
    Calendar_Organizer("Calendar_Organizer"),
    Calendar_Owner("Calendar_Owner"),
    Carbon_Copy("Carbon_Copy"),
    Carrier_Cashier("Carrier_Cashier"),
    Client("Client"),
    Client_Analyst("Client_Analyst"),
    Client_Billing("Client_Billing"),
    Client_Manager("Client_Manager"),
    Communication_Participant("Communication_Participant"),
    Competitor_Consumer("Competitor_Consumer"),
    Contact("Contact"),
    Content_Administrator("Content_Administrator"),
    Content_Author("Content_Author"),
    Content_Editor("Content_Editor"),
    Content_Guest("Content_Guest"),
    Content_Member("Content_Member"),
    Content_Publisher("Content_Publisher"),
    Content_User("Content_User"),
    Contractor_Customer("Contractor_Customer"),
    Department("Department"),
    Distribution_Channel("Distribution_Channel"),
    Distributor_Division("Distributor_Division"),
    Email_Administrator("Email_Administrator"),
    Employee("Employee"),
    Family_Member("Family_Member"),
    Fixed_Asset_Main_Assignee("Fixed_Asset_Main_Assignee"),
    Hosting_Server("Hosting_Server"),
    Household("Household"),
    ISP("ISP"),
    Image_Approval("Image_Approval"),
    Internal_Organization("Internal_Organization"),
    Lead("Lead"),
    Limit_ed_Administrator("Limit_ed_Administrator"),
    Maintenance_Manager("Maintenance_Manager"),
            Supervisor("Supervisor"),
    Maintenance_Supplier("Maintenance_Supplier"),

    Service_Maintenance_Worker("Service_Maintenance_Worker"),
    Manager_Manufacturer("Manager_Manufacturer"),
    Organization("Organization"),
    Organization_Unit("Organization_Unit"),
    Originator("Originator");

    private final String name;

    private AgreementRoleTypeAuth(String value) {
        this.name = value;
    }

    public String value() {
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }
}
