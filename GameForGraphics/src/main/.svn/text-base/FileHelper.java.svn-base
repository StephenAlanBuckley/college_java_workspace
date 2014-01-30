package main;

import java.applet.AudioClip;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JApplet;

public class FileHelper {

	public static InputStream getFileInputStream(String name) {
		File f = new File(name);
		if (f.exists()) {
			try {
				return new FileInputStream(f);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		} else {
			try {
				/*
				if (f.createNewFile()) {
					//f.deleteOnExit();
					f.mkdirs();
					System.out.println("New file created:  " + f.getPath());
				}
				*/
				InputStream is = Thread.currentThread().getContextClassLoader()
						.getResourceAsStream(name);
				/*
				BufferedInputStream bis = new BufferedInputStream(is);
				OutputStream os = new BufferedOutputStream(
						new FileOutputStream(f));

				byte[] data = new byte[1024];
				int count = 0;
				while ((count = bis.read(data)) != -1) {
					os.write(data, 0, count);
				}

				bis.close();
				is.close();
				os.close();
				System.out.println("Created: " + f.getPath());
				*/
				return is;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("The File " + f.getPath() + " does not exist");
			}
			System.out.println("This shouldn't happen.......");
			return null;
		}
	}
	
	public static AudioClip getAudioClip(String filename) {
		URL url = Thread.currentThread().getContextClassLoader().getResource("Sounds/" + filename);		
		AudioClip clip;
		if (url == null) {
			try {
				clip = JApplet.newAudioClip(new URL("file:Sounds/" + filename));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				clip = null;
				System.out.println("Couldn't open sound file: " + filename);
			}
		} else {
			clip = JApplet.newAudioClip(url);
		}
		return clip;
	}
}
