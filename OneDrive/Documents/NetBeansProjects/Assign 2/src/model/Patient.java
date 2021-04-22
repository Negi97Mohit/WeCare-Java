


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author negis
 */
import com.sun.source.tree.BreakTree;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Patient {
    
    //Variabels USed

    private static String[] ages={"New Born","Infant","Toddler","Pre Schooler", "School Age","Adolescent"};      //Age group for display
    private static int age_grp;  //User input of age group
    private static String name;
    private static int count=0;
    private static ArrayList<String> choice_values=new ArrayList<String>();
    private static ArrayList<String> hist_val=new ArrayList<String>();
    
    //Main function    
    public static void main(String[] args) throws InterruptedException {
        Scanner input=new Scanner(System.in);
        outer:{
        for(;;){
            System.out.println("Select the Options:");
            System.out.println("1.Start a new entry");
            System.out.println("2.View Patient History");
            System.out.println("3.Exit");
            int choice=input.nextInt();
            if(choice==1){
                choice_values=isPatientNormal();
            }
            else if(choice==2)
                history(choice_values);
            else if(choice==3){
                System.out.println("Thank you for Using JAVA");
                break outer;
            }
                else
                System.out.println("Enter a valid input");
        }
        }
    }
    
    //Used for vital signs verification
    public static ArrayList<String> isPatientNormal() throws InterruptedException{
        //input for user input
        Scanner input=new Scanner(System.in);
        ArrayList<String> strlist=new ArrayList<String>();

        //Getting personal information
        count=count+1;
        System.out.println("Enter the patients name:");
        name=input.nextLine();
        strlist.add(String.valueOf(count));
        strlist.add(name);
        //Finding the Age grp     
        System.out.println("-------------------------------------------------------");
        System.out.printf("         Select %s's age group\n",name);
        System.out.println("-------------------------------------------------------");
        for(int i=0;i<ages.length;i++)
            System.out.printf("                %d.%s\n",i+1,ages[i]);
        do{
            System.out.println("Enter a valid value"); 
            age_grp=input.nextInt();
        }
        while(age_grp<=0 || age_grp>6);
        System.out.println("**********************************");   
        System.out.printf("     Your age group is:%s\n",ages[age_grp-1]);
        System.out.println("**********************************");
        VitalSigns vital=new VitalSigns(); //Initializying the objects from the cls VitalSigns
        strlist.add(String.valueOf(vital.weight_kg(age_grp)));//Calling weight_kg methods from VitalSigns
        strlist.add(String.valueOf(vital.respiratory_rate(age_grp)));//Calling respiratory_rate methods from VitalSigns
        strlist.add(String.valueOf(vital.heart_rate(age_grp)));//Calling heart_rate methods from VitalSigns
        strlist.add(String.valueOf(vital.bld_press(age_grp)));//Calling bld_press methods from VitalSigns        
        vital.health_check(age_grp);//Calling health_check for final report
        System.out.println("The array list is"+strlist);
        return strlist;
        
    }
    
    //Vital Signs History Functions
    public static void history(ArrayList<String> choice_view){
          int count=1;
          hist_val.addAll(choice_view);
          System.out.println("Sr.No.         Name         Age group         Respiratory Rate         Heart Rate         Blood Pressure  ");
          for(int i=0;i<choice_values.size();i++){
              if(count%6==0)
                  System.out.printf("     %s           %s              %s                       %s                      %s                     %s\n",choice_view.get(i-5),choice_view.get(i-4),choice_view.get(i-3),choice_view.get(i-2),choice_view.get(i-1),choice_view.get(i));
              count=count+1;
          }
      }
}
