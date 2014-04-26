package com.github.webdriverextensions.site;

import com.github.webdriverextensions.generator.annotations.Generate;

@Generate(name = "site")
public class WebDriverExtensionSite extends AbstractSite {

    public final String url = "file://" + getClass().getResource("/html/model-test.html").getPath();

    @Override
    public void open() {
        open(url);
    }

    @Override
    public void assertIsOpen() throws AssertionError {
        examplesPage.assertIsOpen();
    }
}
