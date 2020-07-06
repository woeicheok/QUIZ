/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUIZ;

/**
 *
 * @author Eric Cheok
 */
public class Animal {
    
   String name;

   
      //Constructor method assigns values to the corresponding fields
      public void Animal(String name)
      {
         this.name = name;
      }
      
//Methods
	public void setName(String newName)
	{
		this.name = newName;
	}
        
	public String getName()
	{
		return name;
	}    
        
        public void introduceYourself()
        {
               System.out.println("Morr. I am an animal");
        }   
}

