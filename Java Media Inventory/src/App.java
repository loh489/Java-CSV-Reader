public class App {
    public static void main(String[] args) throws Exception {
    Driver appDriver = new Driver("project1dataset.csv", new Manager());

    appDriver.printData();

    }
}