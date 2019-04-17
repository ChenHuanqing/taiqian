package com.chq.springbootweb.entity;

/**
 * @Auther: thinkpad
 * @Date: 2019/2/26 14:09
 * @Description:
 */
public class ChineseData {

    private Integer id;
    private String chinese;
    private String hex1;
    private String hex2;
    private String hex3;
    private String hex4;

    public ChineseData() {
    }

    public ChineseData(Integer id, String chinese, String hex1, String hex2, String hex3, String hex4) {
        this.id = id;
        this.chinese = chinese;
        this.hex1 = hex1;
        this.hex2 = hex2;
        this.hex3 = hex3;
        this.hex4 = hex4;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public String getHex1() {
        return hex1;
    }

    public void setHex1(String hex1) {
        this.hex1 = hex1;
    }

    public String getHex2() {
        return hex2;
    }

    public void setHex2(String hex2) {
        this.hex2 = hex2;
    }

    public String getHex3() {
        return hex3;
    }

    public void setHex3(String hex3) {
        this.hex3 = hex3;
    }

    public String getHex4() {
        return hex4;
    }

    public void setHex4(String hex4) {
        this.hex4 = hex4;
    }
}
