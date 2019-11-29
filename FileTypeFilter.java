package project;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.*;
import java.text.NumberFormat;

import javax.swing.filechooser.*;

public class FileTypeFilter extends FileFilter{
	
	private final String extension;
	private final String description;

	public FileTypeFilter(String extension,String description) {
		this.extension = extension;
		this.description = description;
		
	}

	@Override
	public boolean accept(File file) {
		if(file.isDirectory()) {
			return true;
		}
		return file.getName().endsWith(extension);
	}

	@Override
	public String getDescription() {
		return description + String.format(" (*%s)", extension);
	}

}
