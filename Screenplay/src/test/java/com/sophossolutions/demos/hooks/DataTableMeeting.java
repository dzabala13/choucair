package com.sophossolutions.demos.hooks;

import com.sophossolutions.demos.models.Metting;
import com.sophossolutions.demos.models.UserStarSharp;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTableMeeting {

    @DataTableType
    public Metting transformToMeetingStarSharp (Map<String, String> data){
        return new Metting( data.get("meetingName"),
                            data.get("meetingNumber"),
                            data.get("Location"),
                            data.get("Latitud"),
                            data.get("Longitude"),
                            data.get("Address"),
                            data.get("nameBusinnesUnit"),
                            data.get("title"),
                            data.get("identityNo"),
                            data.get("firstName"),
                            data.get("lastName"),
                            data.get("Email"),
                            data.get("starDateMeeting"),
                            data.get("endDateMeeting"),
                            data.get("starDateTimeMeeting"),
                            data.get("endDateTimeMeeting"));
    }
}
