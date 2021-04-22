/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Account.Account;
import userInterface.LabAssistantRole.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class LabAssistantRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new LabAssistantWorkAreaJPanel(userProcessContainer, account, organization, business);
    }
    
}
