package app;

import factory.BaseCreator;
import factory.HtmlCreator;
import factory.WindowsCreator;

public class Application {

    private static BaseCreator creator;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void runBusinessLogic() {

        creator.RenderWindow();
    }

    static void configure() {

        if (System.getProperty("os.name").toLowerCase().contains("windows")){

            creator = new WindowsCreator();
        } else {

            creator = new HtmlCreator();
        }
    }
}
