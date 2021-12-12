package com.example.jee;

public class MyFamily extends Myself implements MyVehicle
{
    public String MyDad;
    public String MyMom;
    public String MySiblings;

    public MyFamily(String myName, String myContact, String myAge, String myHobbies, String myDad, String myMom, String mySiblings)
    {
        super(myName,myContact,myAge, myHobbies);
        MyDad = myDad;
        MyMom = myMom;
        MySiblings = mySiblings;
    }

    public String getMyDad()
    {
        return MyDad;
    }

    public void setMyDad(String myDad)
    {
        MyDad = myDad;
    }

    public String getMyMom()
    {
        return MyMom;
    }

    public void setMyMom(String myMom)
    {
        MyMom = myMom;
    }

    public String getMySiblings()
    {
        return MySiblings;
    }

    public void setMySiblings(String mySiblings)
    {
        MySiblings = mySiblings;
    }


//    public String PrintInfo()
//    {
//        String info = "";
//        info += "<h2>" + "Vehicle Type      : " + MyVehicleType + "</h2>";
//        info += "<h2>" + "Vehicle Brand     : " + MyVehicleBrand + "</h2>";
//        info += "<h2>" + "Vehicle ID        : " + MyVehicleID + "</h2>";
//        System.out.println(info);
//        return info;
//        /*System.out.println("\nName :" +MyName + "\nMy Contact :" +MyContact + "\nAge :"+MyAge );
//        return null;*/
//    }

}

