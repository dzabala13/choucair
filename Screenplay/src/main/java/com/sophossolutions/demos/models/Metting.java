package com.sophossolutions.demos.models;

public class Metting {


    String meetingName;
    String meetingNumber;
    String Location;
    String Latitud;
    String Longitude;
    String Address;
    String nameBusinnesUnit;
    String title;
    String identityNo;
    String firstName;
    String lastName;
    String Email;
    String starDateMeeting;
    String endDateMeeting;
    String starDateTimeMeeting;
    String endDateTimeMeeting;

    public Metting(String meetingName, String meetingNumber, String location, String latitud, String longitude, String address, String nameBusinnesUnit, String title, String identityNo, String firstName, String lastName, String email, String starDateMeeting, String endDateMeeting, String starDateTimeMeeting, String endDateTimeMeeting) {
        this.meetingName = meetingName;
        this.meetingNumber = meetingNumber;
        Location = location;
        Latitud = latitud;
        Longitude = longitude;
        Address = address;
        this.nameBusinnesUnit = nameBusinnesUnit;
        this.title = title;
        this.identityNo = identityNo;
        this.firstName = firstName;
        this.lastName = lastName;
        Email = email;
        this.starDateMeeting = starDateMeeting;
        this.endDateMeeting = endDateMeeting;
        this.starDateTimeMeeting = starDateTimeMeeting;
        this.endDateTimeMeeting = endDateTimeMeeting;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    public String getMeetingNumber() {
        return meetingNumber;
    }

    public void setMeetingNumber(String meetingNumber) {
        this.meetingNumber = meetingNumber;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getLatitud() {
        return Latitud;
    }

    public void setLatitud(String latitud) {
        Latitud = latitud;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getNameBusinnesUnit() {
        return nameBusinnesUnit;
    }

    public void setNameBusinnesUnit(String nameBusinnesUnit) {
        this.nameBusinnesUnit = nameBusinnesUnit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getStarDateMeeting() {
        return starDateMeeting;
    }

    public void setStarDateMeeting(String starDateMeeting) {
        this.starDateMeeting = starDateMeeting;
    }

    public String getEndDateMeeting() {
        return endDateMeeting;
    }

    public void setEndDateMeeting(String endDateMeeting) {
        this.endDateMeeting = endDateMeeting;
    }

    public String getStarDateTimeMeeting() {
        return starDateTimeMeeting;
    }

    public void setStarDateTimeMeeting(String starDateTimeMeeting) {
        this.starDateTimeMeeting = starDateTimeMeeting;
    }

    public String getEndDateTimeMeeting() {
        return endDateTimeMeeting;
    }

    public void setEndDateTimeMeeting(String endDateTimeMeeting) {
        this.endDateTimeMeeting = endDateTimeMeeting;
    }
}
