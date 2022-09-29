package com.stefan.demo.apis;

public class Words {

    String lang, greet;

    public Words(String lang, String greet) {
        this.lang = lang;
        this.greet = greet;
    }

    public String getGreet() {
        return greet;
    }

    public void setGreet(String greet) {
        this.greet = greet;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
