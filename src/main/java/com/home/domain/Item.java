package com.home.domain;

import java.io.Serializable;

public class Item implements Serializable {
    private Long itemid;

    private String itemname;

    private String itemdesc;

    private String itemimageaddr;

    private static final long serialVersionUID = 1L;

    public Long getItemid() {
        return itemid;
    }

    public void setItemid(Long itemid) {
        this.itemid = itemid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public String getItemdesc() {
        return itemdesc;
    }

    public void setItemdesc(String itemdesc) {
        this.itemdesc = itemdesc == null ? null : itemdesc.trim();
    }

    public String getItemimageaddr() {
        return itemimageaddr;
    }

    public void setItemimageaddr(String itemimageaddr) {
        this.itemimageaddr = itemimageaddr == null ? null : itemimageaddr.trim();
    }
}