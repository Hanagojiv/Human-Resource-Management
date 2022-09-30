/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empmodel;

import java.util.ArrayList;

/**
 *
 * @author vivekhanagoji
 */
public class EmpHistory {
    
    private ArrayList<Employee> history;
    
    public EmpHistory(){
        this.history = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    
    public Employee addNewEmp(){
        
        Employee newEmp = new Employee();
        history.add(newEmp);
        return newEmp;
    }
     
    public void deleteEmployee(Employee em ){
        history.remove(em);
    }
    
}
