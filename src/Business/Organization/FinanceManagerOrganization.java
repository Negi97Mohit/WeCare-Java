/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PFinancialRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author HYY
 */
public class FinanceManagerOrganization extends Organization{
  public FinanceManagerOrganization() {
        super(Organization.Type.FinanceManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PFinancialRole());
        return roles;
    }    
}
