/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name);
            
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.User){
            enterprise=new UserEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Police){
            enterprise=new PoliceDepartment(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.OrganBank){
            enterprise=new OrganBankEnterprise(name);
            enterpriseList.add(enterprise);
        }
         else if(type==Enterprise.EnterpriseType.BloodBank){
            enterprise=new BloodBankEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.ResearchLab){
            enterprise=new ResearchLabEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Mortuary){
            enterprise=new MortuaryEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Pharma){
            enterprise=new PharmaEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
}
