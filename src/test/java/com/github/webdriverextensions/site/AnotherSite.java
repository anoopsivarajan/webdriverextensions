package com.github.webdriverextensions.site;

import com.github.webdriverextensions.generator.annotations.Generate;

@Generate
public class AnotherSite extends AbstractAnotherSite {

    public final String url = "file://" + getClass().getResource("/html/model-test.html").getPath();

    @Override
    public void open() {
        open(url);
    }

    @Override
    public void assertIsOpen() throws AssertionError {
        examplesPage2.assertIsOpen();
    }
}
