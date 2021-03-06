package com.example.real.app;

import android.app.Application;

import com.example.real.models.Note;

import java.util.concurrent.atomic.AtomicInteger;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;

public class MyAplication extends Application {
    public static AtomicInteger BoardID = new AtomicInteger();
    public static AtomicInteger NoteID= new AtomicInteger();


    @Override
    public void onCreate() {
        super
    }

    private <T extends RealmObject> AtomicInteger getIdByTable(Realm realm, Class<T> anyClass){
        RealmResults<T> results = realm.where(anyClass).findAll();
        return(results.size()>0) ? new AtomicInteger(results.max("id").intValue()):null;

    }

}
