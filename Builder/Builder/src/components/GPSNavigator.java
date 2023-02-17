package components;

public class GPSNavigator {
    private String route;

    public GPSNavigator(){
        this.route = "Maksimir Park, Zagreb, Grad Zagreb to Dolac Market, Zagreb, Grad Zagreb";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute(){
        return route;
    }
}
