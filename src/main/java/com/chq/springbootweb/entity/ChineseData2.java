package com.chq.springbootweb.entity;

/**
 * @Auther: thinkpad
 * @Date: 2019/4/29 14:25
 * @Description:
 */
public class ChineseData2 {
    private Integer id;
    private String chinese;
    private String hex;

    public ChineseData2() {
    }

    public ChineseData2(Integer id, String chinese, String hex) {
        this.id = id;
        this.chinese = chinese;
        this.hex = hex;
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

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

}
