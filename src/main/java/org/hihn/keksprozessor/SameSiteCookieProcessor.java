package org.hihn.keksprozessor;

import org.apache.tomcat.util.http.Rfc6265CookieProcessor;

import javax.servlet.http.Cookie;

public class SameSiteCookieProcessor extends Rfc6265CookieProcessor {

    public enum SAME_SITE {
        STRICT,
        LAX,
        NONE
    }

    @Override
    public String generateHeader(Cookie cookie) {
        return super.generateHeader(cookie) + "; SameSite=" + SAME_SITE.STRICT;
    }
}
