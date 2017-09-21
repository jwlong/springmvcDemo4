package com.dataStructure.partice;

import com.dxfjyygy.beans.Notification;

import java.util.*;

/**
 * Created by longjinwen on 20/09/2017.
 */
public class ListChnage {
    public static void main(String[] args) {
        List<Notification> list = initData();
        for(Notification notification :list){
            System.out.println(notification.getEmail());
        }
        reRangeList(list);
    }
    public static List<Notification> initData(){
        List<Notification> list = new ArrayList<Notification>();
        Notification notification = new Notification();
        notification.setPkId(1);
        notification.setEmail("mail1");
        list.add(notification);

        Notification notification2 = new Notification();
        notification2.setPkId(2);
        notification2.setEmail("mail"+2);
        list.add(notification2);

        Notification notification3 = new Notification();
        notification3.setPkId(2);
        notification3.setEmail("mail"+3);
        list.add(notification3);


        Notification notification4 = new Notification();
        notification4.setPkId(3);
        notification4.setEmail("mail"+4);
        list.add(notification4);

        Notification notification5 = new Notification();
        notification5.setPkId(3);
        notification5.setEmail("mail"+5);
        list.add(notification5);

        Notification notification6 = new Notification();
        notification6.setPkId(3);
        notification6.setEmail("mail"+6);
        list.add(notification6);
        return list;
    }

    public static  List<Notification> reRangeList(List<Notification> oldList){
        List<Notification> newList = new ArrayList<Notification>();
        long oldPkId = 0;
        int count = 0;
        String senders = "";
        List<String> mailList = new ArrayList<String>();
        List<Notification>  list1 = new ArrayList<Notification>();
        String tmp = "";
        Map<Object,Object> map = new HashMap<Object,Object>();
        List<String> testList = new ArrayList<String>();
        for(Notification notification :oldList){
            if(oldPkId == notification.getPkId()){
                String tmpMail = map.get(oldPkId).toString()+","+notification.getEmail();
                map.put(oldPkId,tmpMail);
            }else{
                oldPkId = notification.getPkId();
                map.put(oldPkId,notification.getEmail());
            }

        }
        long oldPkId2 = 0;
        for(Notification notification:oldList ){
            String mail = map.get(notification.getPkId()).toString();
            notification.setEmail(mail);
            if(oldPkId2 != notification.getPkId()){
                list1.add(notification);
                oldPkId2 = notification.getPkId();
            }

        }
        System.out.println(map);

        return list1;
    }
}
