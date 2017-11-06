package com.ycq.ddshop.pojo.po;

public class Provider {
    private Integer pid;

    private String providername;

    private String providerdesc;

    private String contacts;

    private String phone;

    private String adress;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getProvidername() {
        return providername;
    }

    public void setProvidername(String providername) {
        this.providername = providername == null ? null : providername.trim();
    }

    public String getProviderdesc() {
        return providerdesc;
    }

    public void setProviderdesc(String providerdesc) {
        this.providerdesc = providerdesc == null ? null : providerdesc.trim();
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }
}