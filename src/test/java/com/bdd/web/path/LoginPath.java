package com.bdd.web.path;

public class LoginPath {
    public static String txt_FirstName                         = "//*[@id=\"customer.firstName\"]";
    public static String txt_LastName                         = "//*[@id=\"customer.lastName\"]";
    public static String txt_Address                         = "//*[@id=\"customer.address.street\"]";
    public static String txt_City                         = "//*[@id=\"customer.address.city\"]";
    public static String txt_State                         = "//*[@id=\"customer.address.state\"]";
    public static String txt_ZipCode                         = "//*[@id=\"customer.address.zipCode\"]";
    public static String txt_Phone                         = "//*[@id=\"customer.phoneNumber\"]";
    public static String txt_Ssn                         = "//*[@id=\"customer.ssn\"]";
    public static String txt_Username                         = "//*[@id=\"customer.username\"]";
    public static String txt_Password                         = "//*[@id=\"customer.password\"]";
    public static String txt_Confirm                         = "//*[@id=\"repeatedPassword\"]";
    public static String btn_Register                       = "//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input";
    public static String btn_Registrar                       = "//*[@id=\"loginPanel\"]/p[2]/a";

    public static String txt_Username2                         = "//*[@id=\"loginPanel\"]/form/div[1]/input";
    public static String txt_Password2                         = "//*[@id=\"loginPanel\"]/form/div[2]/input";
    public static String btn_Ingresar                       = "//*[@id=\"loginPanel\"]/form/div[3]/input";
}
