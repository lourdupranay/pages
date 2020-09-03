package org.dell.kube.pages;

public class Page {

    public long id;
    public String businessName;
    public long categoryId;
    public String address;
    public String contactNumber;

    public Page(String businessName, String address, long categoryId, String contactNumber) {
        this.businessName=businessName;
        this.address=address;
        this.categoryId=categoryId;
        this.contactNumber=contactNumber;
    }

    public Page(long pageId, String businessName, String address, long categoryId, String contactNumber) {
        this.id = pageId;
        this.businessName=businessName;
        this.address=address;
        this.categoryId=categoryId;
        this.contactNumber=contactNumber;
    }

    public Page() {    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
