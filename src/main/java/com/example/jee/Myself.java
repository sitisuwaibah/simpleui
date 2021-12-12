package com.example.jee;

public class Myself implements MyVehicle
{
    public String MyName;
    public String MyContact;
    public String MyAge;
    public String MyHobbies;

    public Myself(String myName, String myContact, String myAge, String myHobbies)
    {
        MyName = myName;
        MyContact = myContact;
        MyAge = myAge;
        MyHobbies = myHobbies;
    }

    public String getMyName() {
        return MyName;
    }

    public void setMyName(String myName) {
        MyName = myName;
    }

    public String getMyContact() {
        return MyContact;
    }

    public void setMyContact(String myContact) {
        MyContact = myContact;
    }

    public String getMyAge() {return MyAge;}

    public void setMyAge(String myAge) {
        MyAge = myAge;
    }

    public String getMyHobbies() {
        return MyHobbies;
    }

    public void setMyHobbies(String myHobbies) {
        MyHobbies = myHobbies;
    }

//        public String PrintInfo()
//        {
//            String info = "";
//            info += "<h2>" + "Vehicle Type    : " + MyVehicleType + "</h2>";
//            info += "<h2>" + "Vehicle Brand   : " + MyVehicleBrand + "</h2>";
//            info += "<h2>" + "Vehicle ID      : " + MyVehicleID + "</h2>";
//            System.out.println(info);
//            return info;
//        /*System.out.println("\nName :" +MyName + "\nMy Contact :" +MyContact + "\nAge :"+MyAge );
//        return null;*/
//        }
    }
