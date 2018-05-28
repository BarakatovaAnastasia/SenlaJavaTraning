package com.senla.training;

/**
 * The Interface FileWorker.
 * 
 * @author Sergei Yakimchik (SENLA)
 * @date 09/02/2014
 */
public interface FileWorker {
	
	/**
	 * Read from file.
	 *
	 * @return the string[]
	 */
	String[] readFromFile();
	
	/**
	 * Write to file.
	 *
	 * @param values the values
	 */
	void writeToFile(final String[] values);

}
