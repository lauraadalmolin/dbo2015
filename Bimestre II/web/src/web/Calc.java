package web;

import spark.*;

public class Calc implements Route {

	@Override
	public Object handle(Request req, Response resp) throws Exception {
		// TODO Auto-generated method stub
		int x = Integer.parseInt(req.params("x"));
		int y = Integer.parseInt(req.params("y"));
		return "" + (x + y);
		
		
	}
	
	
}
