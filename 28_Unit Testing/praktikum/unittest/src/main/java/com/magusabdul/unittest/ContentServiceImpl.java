package com.magusabdul.unittest;

public class ContentServiceImpl implements ContentService{

    @Override
    public String generateFormalName(String name, Boolean isMale) {
        // TODO Auto-generated method stub
        if (isMale.equals(true)) {
            return "Pak" + name ;
        } else {
            return "Bu" + name;
        }
    }
    
}
