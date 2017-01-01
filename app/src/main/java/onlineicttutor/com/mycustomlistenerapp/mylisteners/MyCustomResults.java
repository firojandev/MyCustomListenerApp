package onlineicttutor.com.mycustomlistenerapp.mylisteners;

import onlineicttutor.com.mycustomlistenerapp.model.Users;

/**
 * Created by HP on 1/1/2017.
 */

public class MyCustomResults {

    private MyCustomListener myCustomListener =null;

    public void setCustomListener(MyCustomListener listener) {
        this.myCustomListener = listener;
        populateData();
    }

    public void populateData(){

       //Do code here...
        //connect with network, push url, get data and decode here
        //push it to you object

        //Sample data here;
        Users nUser=new Users();
        nUser.setId("1");
        nUser.setName("Altaf Hoshain Firoj");

        if(myCustomListener !=null){
           myCustomListener.onCallback(nUser);
        }

    }

}
