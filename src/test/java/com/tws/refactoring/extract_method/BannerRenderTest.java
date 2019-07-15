package com.tws.refactoring.extract_method;

import com.tws.refactoring.extract_variable.BannerRender;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BannerRenderTest {
    @Test
    public void should_get_banner_render_when_give_MAC_and_IE() {
        //Given
        BannerRender bannerRender = new BannerRender();
        //When
        String result =  bannerRender.renderBanner("MAC","IE");
        //Then
        assertEquals("IE on Mac?",result);
    }
    @Test
    public void should_get_banner_render_when_give_windows_and_IE() {
        //Given
        BannerRender bannerRender = new BannerRender();
        //When
        String result =  bannerRender.renderBanner("WINDOWS","IE");
        //Then
        assertEquals("banner",result);
    }
    @Test
    public void should_get_banner_render_when_give_MAC_and_CHROME() {
        //Given
        BannerRender bannerRender = new BannerRender();
        //When
        String result =  bannerRender.renderBanner("MAC","CHROME");
        //Then
        assertEquals("banner",result);
    }
    @Test
    public void should_get_banner_render_when_give_WINDOWS_and_CHROME() {
        //Given
        BannerRender bannerRender = new BannerRender();
        //When
        String result =  bannerRender.renderBanner("WINDOWS","CHROME");
        //Then
        assertEquals("banner",result);
    }
}
