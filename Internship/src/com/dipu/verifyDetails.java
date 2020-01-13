package com.dipu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class verifyDetails
{	
		String name;
		String cvv;
		
		public verifyDetails(String name, String cvv)
		{
			this.name = name;
			this.cvv= cvv;
		}
		
		public boolean verifyName()
		{
			if(name.length()==0)
				return false;
			
			Pattern pattern = Pattern.compile("^[a-zA-Z\\s]*$");
			Matcher matcher = pattern.matcher(name);
			return matcher.matches();
		}
		
		
		public boolean verifyCvv()
		{
			
			if(cvv.length()==3 && Integer.parseInt(cvv)>=10) 
			{
				Pattern pattern = Pattern.compile("^[0-9]{3}$");
				Matcher matcher = pattern.matcher(cvv);
				return matcher.matches();
			}
			else
			{
				return false;
			}
		}	
}
