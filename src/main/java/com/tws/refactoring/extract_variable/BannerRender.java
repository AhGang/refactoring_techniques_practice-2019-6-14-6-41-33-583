package com.tws.refactoring.extract_variable;

public class BannerRender {
    public String renderBanner(String platform, String browser) {
        boolean isIEOnMac = (platform.toUpperCase().indexOf("MAC") > -1) && (browser.toUpperCase().indexOf("IE") > -1);
        if (isIEOnMac) {
            return "IE on Mac?";
        }
        return "banner";
    }
}
