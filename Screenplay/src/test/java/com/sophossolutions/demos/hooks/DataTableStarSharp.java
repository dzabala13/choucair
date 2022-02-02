package com.sophossolutions.demos.hooks;

import com.sophossolutions.demos.models.UserStarSharp;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTableStarSharp {

    @DataTableType
    public UserStarSharp transformToUserStarSharp (Map<String, String> data){
        return new UserStarSharp(data.get("user"), data.get("password"));

    }
}
