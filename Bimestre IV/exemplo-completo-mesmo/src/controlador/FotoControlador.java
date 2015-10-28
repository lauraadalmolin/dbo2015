package controlador;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.MultipartConfigElement;
import javax.servlet.http.Part;

import spark.Request;
import spark.Response;
import spark.Route;


public class FotoControlador implements Route {

	@Override
	public Object handle(Request req, Response res) throws Exception {
		String id = UUID.randomUUID().toString();
		System.out.println(id);
		MultipartConfigElement multipart = new MultipartConfigElement("/tmp");
		req.raw().setAttribute("org.eclipse.multipartConfig", multipart);
		Part file = req.raw().getPart("foto");
		if (file.getContentType().equals("image/jpeg")) {
			InputStream input = file.getInputStream();
			FileOutputStream output = new FileOutputStream("bin/pub/" + id + ".jpg");
			int b = 0;
			while ((b = input.read()) >= 0) {
				output.write(b);
			}
			input.close();
			output.close();
			return "Foto enviada com sucesso!";
		}
	
		return "Envie um arquivo jpeg.";
	}


}
