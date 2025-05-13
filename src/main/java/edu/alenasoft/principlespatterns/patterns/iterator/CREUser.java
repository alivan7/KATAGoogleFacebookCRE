package edu.alenasoft.principlespatterns.patterns.iterator;

import java.util.*;

public class CREUser {
    private int id;
    private UserData userData;

    public  Map<Integer, UserData> getCREinfo() {
        Map<Integer,UserData> mapUser = new HashMap<>();
            mapUser.put(1,new UserData("usuario1","direccion1",20.0));
            mapUser.put(2,new UserData("usuario2","direccion2",10.5));
            mapUser.put(3,new UserData("usuario3","direccion3",10.5));
        return mapUser;
    }
}
