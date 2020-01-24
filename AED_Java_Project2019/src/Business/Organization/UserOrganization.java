/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.MasterSchedule;
import Business.Role.LabAssistantRole;
import Business.Role.Role;
import Business.Role.UserRole;
import java.util.ArrayList;

/**
 *
 * @author kiran
 */
public class UserOrganization extends Organization {
   public UserOrganization() {
        super(Organization.Type.User.getValue());
        System.out.println("USER ORGANIZATION");
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new UserRole());
        return roles;
    }
     
    
}
