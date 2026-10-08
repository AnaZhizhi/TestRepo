package Task30Sept;

public class TestRunner {
    void main() {
        ConfigUtils.getDefaultBrowser();
        BaseTest baseTest = new BaseTest();
        baseTest.calculateTimeout(30);
        LoginTest loginTest = new LoginTest();
        loginTest.calculateTimeout(70);
    }
}
