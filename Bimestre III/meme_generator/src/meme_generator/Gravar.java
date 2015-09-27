package meme_generator;


 
import java.awt.Font;  
import java.awt.Graphics;  
import java.awt.image.BufferedImage;  
import java.io.File;  
import java.io.IOException;  
  
import javax.imageio.ImageIO;  
		  
		public class Gravar {  
		  
		    public void writeImage(String[] text) throws IOException {  
		    	
		    	BufferedImage bf = ImageIO.read(new File("meme.jpg")); 
		        Graphics graph = bf.getGraphics();  
		        Font font = new Font("Trebuchet MS", Font.PLAIN, 18);  
		        graph.setFont(font);  
		        
		        graph.drawString(text[0], 25, 22 );
		        graph.drawString(text[1], 220, 150);
		        graph.drawString(text[2], 11, 370);
		       
		  
		        try {  
		            ImageIO.write(bf, "jpg", new File("meme_2.jpg"));  
		        } catch (IOException e) {  
		            // TODO Auto-generated catch block  
		            e.printStackTrace();  
		        }  
		    }  
		  
		    public static void main(String[] args) throws IOException {  
		        String[] text = { "MEU FILHO ESTÁ JOGANDO ONLINE", "ME SOLTA", "QUE EU PRECISO MANDAR ELE PAUSAR"};  
		        Gravar t2c = new Gravar();  
		        t2c.writeImage(text);  
		  
		        System.exit(0);  
		    }  
	
}
