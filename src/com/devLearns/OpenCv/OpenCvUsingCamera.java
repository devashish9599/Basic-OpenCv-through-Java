package com.devLearns.OpenCv;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;

public class OpenCvUsingCamera {
	
	public static void main(String[] args) {
		
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		VideoCapture capture = new VideoCapture(0);
		
		Mat mat = new Mat();
		capture.read(mat);
		
		if (capture.isOpened()) {
			
			if(capture.read(mat)) {
				BufferedImage image = new BufferedImage(mat.width(), mat.height(),BufferedImage.TYPE_3BYTE_BGR);
				WritableRaster raster = image.getRaster();
	            DataBufferByte dataBuffer = (DataBufferByte) raster.getDataBuffer();
	            byte[] data = dataBuffer.getData();
	            mat.get(0, 0, data);
	            JFrame frame = new JFrame();
	        	frame.getContentPane().add(new JLabel(new ImageIcon(image)));
	        			
	        			frame.pack();
	        			frame.setVisible(true);
	        			System.out.println("image Captured...");
	        	
			}
		}
		
	}

}
