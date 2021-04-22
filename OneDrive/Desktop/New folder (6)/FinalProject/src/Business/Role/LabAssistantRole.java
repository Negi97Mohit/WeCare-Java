/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Account.Account;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import userInterface.LabAssistantRole.LabWorkAreaJPanel;
import javax.swing.JPanel;


/**
 *
 * @author raunak
 */
public class LabAssistantRole extends Role {
 @Override
    public JPanel createWorkArea(JPanel rightPanel, Account account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new LabWorkAreaJPanel(rightPanel, account, enterprise, business);
    }
    
}
