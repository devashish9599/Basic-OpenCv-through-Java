package com.devLearns.OpenCv;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class DrawCircle {

public static void main(String[] args) throws IOException {
	
	System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	
	String file = "C:/Users/Devashish/Desktop/bab.jpg";
	Mat matrix = Imgcodecs.imread(file);
	
	Imgproc.circle(matrix, new Point(190,80), 100, new Scalar(0,0,255),10);
	
	MatOfByte matOfByte = new MatOfByte();
	Imgcodecs.imencode(".jpg", matrix, matOfByte);
	byte[] byteArray = matOfByte.toArray();
	InputStream in = new ByteArrayInputStream(byteArray);
	BufferedImage buf = ImageIO.read(in);
	JFrame frame = new JFrame();
	frame.getContentPane().add(new JLabel(new ImageIcon(buf)));
			
			frame.pack();
			frame.setVisible(true);
			System.out.println("image Loaded...");
	
	
}
}
