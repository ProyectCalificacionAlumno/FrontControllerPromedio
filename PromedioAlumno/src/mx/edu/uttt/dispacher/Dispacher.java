/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.dispacher;

import mx.edu.uttt.ejecutor.Login;
import mx.edu.uttt.vistas.Teacher_View;

/**
 *
 * @author omarp
 */
public class Dispacher {
    
     
   private Teacher_View teacherView;
   private Login LoginView;
   
   public Dispacher(){
      teacherView = new Teacher_View();
      LoginView = new Login();
   }

   public void dispatch(String request){
      if(request.equalsIgnoreCase("maestro")){
         teacherView.show();
      }
      else{
         LoginView.show();
      }	
   }
}
