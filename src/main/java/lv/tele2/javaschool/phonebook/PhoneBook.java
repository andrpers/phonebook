package lv.tele2.javaschool.phonebook;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrpers on 07.03.2017.
 */
public class PhoneBook {
    private List<Record> recordList=new ArrayList<>();
    @Command
    public void create(String name, String phone, String email){
        Record r=new Record(name,phone,email);
       // r.setName(name);
       // r.setPhone(phone);
       // r.setEmail(email);
        recordList.add(r);
    }
    @Command
    public List<Record> list(){
        return recordList;
    }
}
