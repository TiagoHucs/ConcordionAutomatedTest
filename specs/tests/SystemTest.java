package tests;
import java.util.Map;

import org.concordion.api.MultiValueResult;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import com.hucs.System;

@RunWith(ConcordionRunner.class)
public class SystemTest {
	
   System system = new System();
   
   public String getGreeting(String userName){

      return system.getGreeting(userName);
      
   }
   
   public String getGreetingSr(String userName){

	      return system.getGreetingSr(userName);
	      
	   }
   
   public Double soma(Double n1, Double n2){
	      return system.soma(n1, n2);
	   }
   
   public Result splitObject(String userName){
	      return system.splitObject(userName);
	   }  
   
   public Map<String, String> splitMap(String userName){
	      return system.splitMap(userName);
	   }  
   
   public MultiValueResult splitMultiValue(String userName){
	      return system.splitMultiValue(userName);
	   } 
   public void addUser(String username) {
	      system.addUser(username);
	   }
	   public Iterable<String> search(String searchString) {
	      return system.search(searchString);
	   }   
   
}