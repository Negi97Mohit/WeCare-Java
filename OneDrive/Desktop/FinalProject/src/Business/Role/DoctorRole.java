/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Account.Account;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import javax.swing.JPanel;
import userInterface.DoctorWorkArea.PatientTestRequestJPanel;
/**
 *
 * @author raunak
 */
public class DoctorRole extends Role{

       @Override
    public JPanel createWorkArea(JPanel rightPanel, Account account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PatientTestRequestJPanel(rightPanel, enterprise,account, business);
    }
    
    
}
