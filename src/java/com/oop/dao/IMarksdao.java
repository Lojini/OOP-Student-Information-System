/**
 *
 * @author Pavidha Lojini
 */
package com.oop.dao;

import com.oop.model.Marks;
import java.util.ArrayList;


/**
 * Contract for the implementation of Marks Data Access Object
 */
public interface IMarksdao {


	/**
	 * Add Marks for marks table
         * @param marks 
	 */
	public void addMarks(Marks marks);


	/**
	 * Get all list of marks
	 * 
	 * @return ArrayList<Marks>
	 */
	public ArrayList<Marks> ListMarks();
	
	/**
	 * Update existing marks of a student
	 * @param marks
	 */
	public void UpdateMarks(Marks marks);

	/**
	 * Remove existing marks of a student
	 * 
	 * @param StudentId
	 */
	public void DeleteMarks(String StudentId);

}
 

