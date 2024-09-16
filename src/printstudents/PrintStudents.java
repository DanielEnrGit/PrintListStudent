/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudents;

/**
 *
 * @author enriq
 */
public class PrintStudents {

    /**
     * @param args the command line arguments
     */
    //monday
    public static void main(String[] args) {
        // TODO code application logic here
        //print 3 students name,sid using array of objects
        Student[] list = new Student [2]; //size of array of objects
        
        Student s1 = new Student();
        s1.setName("peter");
        s1.setId(1);
        Student s2 = new Student();
        s2.setName("john");
        s1.setId(2);
        Student s3 = new Student();
        s3.setName("james");
        s3.setId(3);
        //s1 - name sid - not in array - save objects
        list[0]=s1;
        list[1]=s2;
        list[2]=s3; //saved objects in array
        //print
        for (int i=0;i<list.length;i++) {
            System.out.println(list[i].getName()+" "+list[i].getId());
        }
    }
    
}
