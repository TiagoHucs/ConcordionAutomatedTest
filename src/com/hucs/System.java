package com.hucs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.concordion.api.MultiValueResult;

import tests.Result;

public class System {

	public String getGreeting(String userName) {

		return "Ola " + userName + "!";

	}

	public String getGreetingSr(String userName) {

		return "Ola Senhor " + userName + "!";

	}

	public Double soma(Double n1, Double n2) {
		return n1 + n2;

	}

	public Result splitObject(String userName) {
	      Result result = new Result();
	      String[] words = userName.split(" ");
	      result.setPrimeiroNome(words[0]);
	      result.setUltimoNome(words[1]);
	      return result;
	}

	public Map<String, String> splitMap(String userName) {
	      Map<String, String> result = new HashMap<String, String>();
	      String[] words = userName.split(" ");
	      result.put("primeiroNome", words[0]);
	      result.put("ultimoNome", words[1]);
	      return result;
	}
	
	   public MultiValueResult splitMultiValue(String userName){  
		      MultiValueResult result = new MultiValueResult();
		      String[] words = userName.split(" ");   
		      result.with("primeiroNome", words[0]).with("ultimoNome", words[1]);       
		      return result;
		   }
	   
	   private Set<String> users = new HashSet<String>();
	   public void addUser(String username) {
		      users.add(username);
		   }
	   
	   public Iterable<String> search(String searchString) {
		      SortedSet<String> matches = new TreeSet<String>();
		      for (String username : users) {
		         if (username.contains(searchString)) {
		            matches.add(username);
		         }
		      }
		      return matches;
		   }
}
