package com.senla.task.bookstore.util;

import java.time.LocalDate;

import com.senla.task.bookstore.model.Book;
import com.senla.training.FileWorker;
import com.senla.training.TextFileWorker;

public class BookFileUtil implements FileUtil<Book>{

	/** The Constant TEST_FILE. */
	private static final String TEST_FILE = "example.txt";
	
	/** The file worker. */
	private final FileWorker fileWorker;
	
	/**
	 * Instantiates a new man file util.
	 */
	public BookFileUtil() {
		fileWorker = new TextFileWorker(TEST_FILE);
	}

	/* (non-Javadoc)
	 * @see com.senla.training.example.FileUtil#readFromFile()
	 */
	@Override
	public Book[] readFromFile() {
		final String[] lines = fileWorker.readFromFile();
		
		if (lines == null || lines.length == 0) {
			throw new IllegalArgumentException();
		}
		
		final Book[] result = new Book[lines.length];
		
		for (int i = 0; i < lines.length; i++) {
			result[i] = fromLine(lines[i]);
		}
		
		return result;
	}

	/* (non-Javadoc)
	 * @see com.senla.training.example.FileUtil#writeToFile(java.lang.Object[])
	 */
	@Override
	public void writeToFile(final Book[] values) {
		if (values == null || values.length == 0) {
			throw new IllegalArgumentException();
		}
		final String[] lines = new String[values.length];
		for (int i = 0; i < values.length; i++) {
			lines[i] = toLine(values[i]);
		}
		fileWorker.writeToFile(lines);
	}

	/* (non-Javadoc)
	 * @see com.senla.training.example.FileUtil#toLine(java.lang.Object)
	 */
	@Override
	public String toLine(final Book book) {
		if (book == null) {
			throw new IllegalArgumentException();
		}

		final String[] array = new String[] { 
				//String.valueOf(book.getTitle()), 
				book.getTitle(), 
				book.getAuthor(), 
				String.valueOf(book.getPrice()),
				
			};
		return String.join(";", array);
	}

	/* (non-Javadoc)
	 * @see com.senla.training.example.FileUtil#fromLine(java.lang.String)
	 */
	@Override
	public Book fromLine(final String line) {
		if (line == null || line.isEmpty()) {
			throw new IllegalArgumentException();
		}
		final String[] parts = line.split(";");

		final Book result = new Book(
				parts[0], parts[1],
				Integer.valueOf(parts[2]), 
				LocalDate.parse(parts[3]),
				Boolean.valueOf(parts[4])
				
			);
		return result;
	}
	

}
