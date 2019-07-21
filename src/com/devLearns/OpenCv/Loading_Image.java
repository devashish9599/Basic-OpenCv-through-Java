package com.devLearns.OpenCv;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Loading_Image {

	public static void main(String[] args) throws IOException {
		
		File input = new File("C:/Users/Devashish/Desktop/openCvdata/apple.jpg");
		
		BufferedImage image = ImageIO.read(input);
		
		File output = new File("C:/Users/Devashish/Desktop/op.jpg");
		
		ImageIO.write(image, "jpg", output);
		
		System.out.println("Image saved");
		System.out.println(image);
	}
}
