package com.bridgelabz.hotel_reservation_system.EmployeePayRole;

import java.io.File;

public class FileUtils {
	
	public static boolean deleteFiles(File contentsToDelete) {
		File[] allContents = contentsToDelete.listFiles();
		if(allContents != null) {
			for(File file:allContents) {
				deleteFiles(file);
			}
		}
		return contentsToDelete.delete();
	}

}