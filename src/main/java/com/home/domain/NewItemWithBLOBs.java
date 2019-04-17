package com.home.domain;

import java.io.Serializable;

public class NewItemWithBLOBs extends NewItem implements Serializable {
    private String newitemdesc;

    private String zhuyaoguige;

    private String kehujiazhi;

    private String yingyonglingyu;

    private String gaishu;

    private String ruanjianzhichi;

    private String fpgaxiangguan;

    private String xiangguanchanpin;

    private String yingyonganli;

    private String dinghuoxinxi;

    private static final long serialVersionUID = 1L;

    public String getNewitemdesc() {
        return newitemdesc;
    }

    public void setNewitemdesc(String newitemdesc) {
        this.newitemdesc = newitemdesc;
    }

    public String getZhuyaoguige() {
        return zhuyaoguige;
    }

    public void setZhuyaoguige(String zhuyaoguige) {
        this.zhuyaoguige = zhuyaoguige;
    }

    public String getKehujiazhi() {
        return kehujiazhi;
    }

    public void setKehujiazhi(String kehujiazhi) {
        this.kehujiazhi = kehujiazhi;
    }

    public String getYingyonglingyu() {
        return yingyonglingyu;
    }

    public void setYingyonglingyu(String yingyonglingyu) {
        this.yingyonglingyu = yingyonglingyu;
    }

    public String getGaishu() {
        return gaishu;
    }

    public void setGaishu(String gaishu) {
        this.gaishu = gaishu;
    }

    public String getRuanjianzhichi() {
        return ruanjianzhichi;
    }

    public void setRuanjianzhichi(String ruanjianzhichi) {
        this.ruanjianzhichi = ruanjianzhichi;
    }

    public String getFpgaxiangguan() {
        return fpgaxiangguan;
    }

    public void setFpgaxiangguan(String fpgaxiangguan) {
        this.fpgaxiangguan = fpgaxiangguan;
    }

    public String getXiangguanchanpin() {
        return xiangguanchanpin;
    }

    public void setXiangguanchanpin(String xiangguanchanpin) {
        this.xiangguanchanpin = xiangguanchanpin;
    }

    public String getYingyonganli() {
        return yingyonganli;
    }

    public void setYingyonganli(String yingyonganli) {
        this.yingyonganli = yingyonganli;
    }

    public String getDinghuoxinxi() {
        return dinghuoxinxi;
    }

    public void setDinghuoxinxi(String dinghuoxinxi) {
        this.dinghuoxinxi = dinghuoxinxi;
    }
}