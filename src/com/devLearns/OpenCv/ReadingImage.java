package com.devLearns.OpenCv;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class ReadingImage {

public static void main(String[] args) {
	
	System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	
	Imgcodecs imgcodecs = new Imgcodecs();
	
	String file = "C:/Users/Devashish/Desktop/op.jpg";
	
	Mat matrix = imgcodecs.imread(file);
	
	System.out.println("image loaded....");
	
	
	
	
}

}
