package util;

public class Utils {

    /**
     * Classe para setar o Driver
     */
    protected static void setDriverByOS(){
        String driverPath = "src/test/resources/drivers/";
        if(System.getProperty("os.name").contains("Windows")){
            driverPath = driverPath + "/windows/chromedriver.exe";
        }else{
            driverPath = driverPath + "/linux/chromedriver";
        }
        System.setProperty("webdriver.chrome.driver", driverPath);
    }

}
