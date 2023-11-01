package web.factoryBrowser;


public class FactoryBrowser {
    public static Ibrowser make(String type){
        Ibrowser browser;
        switch (type.toLowerCase()){
            case "chrome":
                browser = new Chrome();
                break;
            case "firefox":
                browser = new Firefox();
                break;
            default:
                browser = new Edge();
                break;
        }
        return browser;
    }
}

