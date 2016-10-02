package marcus.sampleApps.CarRentals;

import java.util.ArrayList;
import java.util.List;

import marcus.sampleApps.Model.CarDetailsDAO;
import marcus.sampleApps.Model.DBConnections;
import marcus.sampleApps.presentation.AppData;
import marcus.sampleApps.presentation.HomePage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App application = new App();
        
        application.createAndDisplayGui();
    }
    
    private ArrayList<CarDetailsDAO> getAllCars(){
    	DBConnections connection = new DBConnections();
    	return connection.getAllCars();
    }
    
    private void createAndDisplayGui(){
    	AppData data = new AppData();
    	data.setCarDetailList(getAllCars());
    	HomePage gui = new HomePage(data);
    	gui.displayApp();
    }
    
}
