package com.imooc.o2o.util;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

public class ImageUtil {
	

	public static void main(String[] args) throws IOException {
		
		String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();

		Thumbnails.of(new File("/Users/menglanwen/Desktop/1.jpg")).size(200, 200)
		.watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath + "/watermark.jpg")), 0.25f)
		.outputQuality(0.8f).toFile("/Users/menglanwen/Desktop/xiaohuangrennew.jpg");

	}
}