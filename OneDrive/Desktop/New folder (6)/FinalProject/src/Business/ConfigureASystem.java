package Business;

import Business.Account.Account;
import Business.Employee.Employee;
import Business.Enterprise.AwarenessCampEnterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Role.SystemAdminRole;   
/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        AwarenessCampEnterprise awarenessCampEnterprise=new AwarenessCampEnterprise("NGO");
        DoctorOrganization doctorOrganization=new DoctorOrganization();
        Network network = system.createAndAddNetwork();
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        
        Account ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
