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
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class ColorToBinary {

	
	public static void main(String[] args) throws IOException {
		
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		String file = "C:/Users/Devashish/Desktop/op.jpg";
		Mat src = Imgcodecs.imread(file);
		Mat dst = new Mat();
		Imgproc.threshold(src, dst, 200,500, Imgproc.THRESH_BINARY);
		MatOfByte matOfByte = new MatOfByte();
		Imgcodecs.imencode(".jpg", dst, matOfByte);
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
