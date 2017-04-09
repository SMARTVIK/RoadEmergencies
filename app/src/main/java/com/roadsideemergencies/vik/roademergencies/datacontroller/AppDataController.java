package com.roadsideemergencies.vik.roademergencies.datacontroller;

import com.roadsideemergencies.vik.roademergencies.models.PlaceDetailsModel;
import com.roadsideemergencies.vik.roademergencies.models.User;

/**
 * Created by vik on 8/4/17.
 */

public class AppDataController {




    private static AppDataController appDataController;
    private PlaceDetailsModel.ResultBean placeData;
    private User currentUser;


    private AppDataController(){

    }

    public static AppDataController getInstance() {

        if(appDataController==null){
            appDataController = new AppDataController();
        }

        return appDataController;
    }

    public void setPlaceData(PlaceDetailsModel.ResultBean placeData) {
        this.placeData = placeData;
    }

    public PlaceDetailsModel.ResultBean getPlaceData() {
        return placeData;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public User getCurrentUser() {
        return currentUser;
    }
}
