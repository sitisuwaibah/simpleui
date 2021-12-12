package com.example.jee;

public class MyStudent<MyPart> extends Myself implements MyVehicle {
    public String MyMatricNo;
    public String MyProgramCode;
    public String MyPart;
    public String Intake;
    public String MyCampus;


    public MyStudent(String myName, String myContact, String myAge, String myHobbies, String myMatricNo,
                     String myProgramCode, String myPart, String myCampus, String intake)
    {

        super(myName, myContact, myAge, myHobbies);
        MyMatricNo = myMatricNo;
        MyProgramCode = myProgramCode;
        MyPart = myPart;
        Intake = intake;
        MyCampus = myCampus;

    }


    public String getMyMatricNo() {
        return MyMatricNo;
    }

    public void setMyMatricNo(String myMatricNo) {
        MyMatricNo = myMatricNo;
    }

    public String getMyPart() {
        return MyPart;
    }

    public void setMyPart(String myPart) {
        MyPart = myPart;
    }

    public String getMyProgramCode() {
        return MyProgramCode;
    }

    public void setMyProgramCode(String myProgramCode) {
        MyProgramCode = myProgramCode;
    }

    public String getIntake() {
        return Intake;
    }

    public void setIntake(String intake) {
        Intake = intake;
    }

    public String getMyCampus() {
        return MyCampus;
    }

    public void setMyCampus(String myCampus) {
        MyCampus = myCampus;
    }





    public String PrintInfo()
    {
        String info ="";
        info += "<h2>" + "Vehicle Type    : " + MyVehicleType + "</h2>";
        info += "<h2>" + "Vehicle Brand   : " + MyVehicleBrand + "</h2>";
        info += "<h2>" + "Vehicle ID      : " + MyVehicleID + "</h2>";
        System.out.println(info);
        return info;
        /*System.out.println("\nName :" + super.MyName + "\nMy Contact :" + super.MyContact + "\nAge :" + super.MyAge + "\nHobbies :" + super.MyHobbies +
                "\nMatric No :" + MyMatricNo + "\nProgramme Code :" + MyProgramCode + "\nPart :" + MyPart + "\nSemester Intake :" + Intake + "\nCampus :" + MyCampus +
                "\nVehicle Type : " + MyVehicleType + "\nVehicle Brand :" + MyVehicleBrand + "\nVehicle ID : " + MyVehicleID);*/

    }

}